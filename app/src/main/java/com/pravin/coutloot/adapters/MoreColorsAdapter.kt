package com.pravin.coutloot.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pravin.coutloot.R
import com.pravin.coutloot.models.ProductDetailData.MoreColor
import kotlinx.android.synthetic.main.activity_product_detail_activty.*
import uz.jamshid.library.ExactRatingBar


class MoreColorsAdapter(private val list: List<MoreColor>?) :
    RecyclerView.Adapter<MoreColorsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var itemview = inflater.inflate(R.layout.icon_more_color, parent, false)
        return ViewHolder(
            itemview,
            parent
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val morecolor: MoreColor = list?.get(position) ?: MoreColor()
        holder.bind(morecolor)

    }

    override fun getItemCount(): Int = list!!.size

    class ViewHolder(itemview: View, parent: ViewGroup) :
        RecyclerView.ViewHolder(itemview) {
        private var iv_more_color: ImageView? = null
        private var tv_price: TextView? = null
        var mContext: Context = parent.context

        init {
            iv_more_color = itemView.findViewById(R.id.iv_more_color)
            tv_price = itemView.findViewById(R.id.tv_price)
        }

        fun bind(morecolor: MoreColor) {
            tv_price?.text = morecolor.price.toString()
            iv_more_color?.let {
                Glide.with(mContext)
                    .load(morecolor.displayImage).into(it)
            }

        }

    }

}


