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
import java.sql.DataTruncation


class StringListAdapter(private val list: List<String>?) :
    RecyclerView.Adapter<StringListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        var itemview = inflater.inflate(R.layout.icon_string_list, parent, false)
        return ViewHolder(
            itemview,
            parent
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data: String? = list?.get(position)
        holder.bind(data)

    }

    override fun getItemCount(): Int = list!!.size

    class ViewHolder(itemview: View, parent: ViewGroup) :
        RecyclerView.ViewHolder(itemview) {
        private var tv_text: TextView? = null
        var mContext: Context = parent.context

        init {
            tv_text = itemView.findViewById(R.id.tv_text)

        }

        fun bind(data: String?) {
            tv_text?.text = data

        }

    }

}


