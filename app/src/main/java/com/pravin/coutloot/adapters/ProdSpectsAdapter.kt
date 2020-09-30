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
import com.pravin.coutloot.models.ProductDetailData.ProductAttribute
import kotlinx.android.synthetic.main.activity_product_detail_activty.*
import uz.jamshid.library.ExactRatingBar


class ProdSpectsAdapter(private val list: List<ProductAttribute>?) :
    RecyclerView.Adapter<ProdSpectsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var itemview = inflater.inflate(R.layout.icon_product_attribute, parent, false)
        return ViewHolder(
            itemview,
            parent
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data: ProductAttribute = list?.get(position) ?: ProductAttribute()
        holder.bind(data)

    }

    override fun getItemCount(): Int = list!!.size

    class ViewHolder(itemview: View, parent: ViewGroup) :
        RecyclerView.ViewHolder(itemview) {
        private var tv_key: TextView? = null
        private var tv_value: TextView? = null
        var mContext: Context = parent.context

        init {
            tv_key = itemView.findViewById(R.id.tv_key)
            tv_value = itemView.findViewById(R.id.tv_value)
        }

        fun bind(data: ProductAttribute) {
            tv_key?.text = data.key
            tv_value?.text = ": "+data.value


        }

    }

}


