package com.pravin.coutloot.adapters

import android.content.Context
import android.content.Intent
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pravin.coutloot.ProductDetailActivty
import com.pravin.coutloot.R
import com.pravin.coutloot.models.ProductData.Product
import uz.jamshid.library.ExactRatingBar


class ProductAdapter(private val list: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var itemview = inflater.inflate(R.layout.icon_product, parent, false)
        return ViewHolder(
            itemview,
            parent
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product: Product = list[position]
        holder.bind(product)

    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(itemview: View, parent: ViewGroup) :
        RecyclerView.ViewHolder(itemview) {
        private var tv_product_name: TextView? = null
        private var iv_product: ImageView? = null
        private var tv_listed_price: TextView? = null
        private var tv_label_price: TextView? = null
        private var tv_discount: TextView? = null
        private var rate: ExactRatingBar? = null
        private var container: RelativeLayout? = null
        var mContext: Context = parent.context

        init {
            tv_product_name = itemView.findViewById(R.id.tv_product_name)
            iv_product = itemView.findViewById(R.id.iv_product)
            tv_listed_price = itemView.findViewById(R.id.tv_listed_price)
            tv_label_price = itemView.findViewById(R.id.tv_label_price)
            tv_discount = itemView.findViewById(R.id.tv_discount)
            rate = itemView.findViewById<ExactRatingBar>(R.id.rate)
            container = itemView.findViewById(R.id.container)
        }

        fun bind(product: Product) {
            tv_product_name?.text = product.details?.title
            tv_listed_price?.text = "₹ "+product.details?.variants?.get(0)?.priceDetails?.listedPrice.toString()
            tv_label_price?.text = "("+product.details?.variants?.get(0)?.priceDetails?.labelPrice.toString()+")"
            tv_label_price?.setPaintFlags(tv_label_price!!.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
            tv_discount?.text = product.details?.variants?.get(0)?.priceDetails?.percentOff.toString()+"% OFF"
            val ratings : Float = product.productRating?.toFloat()!!
            rate?.setStar(ratings)


            iv_product?.let {
                Glide.with(mContext).load(product.images?.thumbImages?.get(0))
                    .into(
                        it
                    )
            }

            container?.setOnClickListener{
                mContext.startActivity(Intent(mContext,ProductDetailActivty::class.java))
            }

        }

    }

}


