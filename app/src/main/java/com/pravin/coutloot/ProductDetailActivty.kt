package com.pravin.coutloot

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.pravin.coutloot.adapters.MoreColorsAdapter
import com.pravin.coutloot.adapters.ProdSpectsAdapter
import com.pravin.coutloot.adapters.StringListAdapter
import com.pravin.coutloot.models.ProductDetailData.ProductDetailData
import com.pravin.sportsinteractive.retrofit.GetApiData
import com.pravin.sportsinteractive.retrofit.ServiceBuilder
import kotlinx.android.synthetic.main.activity_product_detail_activty.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProductDetailActivty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail_activty)
        callAPI()
    }

    private fun callAPI() {
        pb_product.visibility=VISIBLE
        rl_product.visibility=GONE
        val request = ServiceBuilder.buildService(GetApiData::class.java)
        val url = "http://dev-gtw1.coutloot.com:20038/product/details"
        val call = request.getProductDetailData(url)
        call.enqueue(object : Callback<ProductDetailData> {
            override fun onResponse(call: Call<ProductDetailData>, response: Response<ProductDetailData>) {
                if (response.isSuccessful) {
                    pb_product.visibility= GONE
                    rl_product.visibility= VISIBLE
                    renderResponse(response)
                }
            }

            override fun onFailure(call: Call<ProductDetailData>, t: Throwable) {
                Toast.makeText(this@ProductDetailActivty, "${t.message}", Toast.LENGTH_SHORT).show()
                Log.d("jefnek", t.message)
            }
        })

    }

    private fun renderResponse(response: Response<ProductDetailData>) {
        Glide.with(this@ProductDetailActivty)
            .load(response.body()?.product?.images?.mainImages?.get(0)).into(iv_product)
        tv_listed_price.text =
            "₹" + response.body()?.product?.details?.variants?.get(0)?.priceDetails?.labelPrice.toString()
        tv_label_price.text =
            "(" + response.body()?.product?.details?.variants?.get(0)?.priceDetails?.listedPrice.toString() + ")"
        tv_label_price?.setPaintFlags(tv_label_price!!.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
        tv_discount.text =
            response.body()?.product?.details?.variants?.get(0)?.priceDetails?.percentOff.toString() + "% OFF"
        tv_product_name.text = response.body()?.product?.details?.title
        tv_offer_text.text =
            response.body()?.product?.details?.variants?.get(0)?.negotiated?.offerText
        rv_more_colors.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ProductDetailActivty,LinearLayoutManager.HORIZONTAL,false)
            adapter = response.body()?.product?.moreColors.let { MoreColorsAdapter(it) }
        }
        rv_prod_spec.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ProductDetailActivty,LinearLayoutManager.VERTICAL,false)
            adapter = response.body()?.product?.details?.productAttributes.let { ProdSpectsAdapter(it) }
        }
        tv_description.text=response.body()?.product?.details?.description
        rv_delivery_details.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ProductDetailActivty,LinearLayoutManager.VERTICAL,false)
            adapter = response.body()?.product?.terms.let { StringListAdapter(it) }
        }
        rv_available_offers.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ProductDetailActivty,LinearLayoutManager.VERTICAL,false)
            adapter = response.body()?.product?.availableOffers.let { StringListAdapter(it) }
        }

        Glide.with(this@ProductDetailActivty)
            .load(response.body()?.product?.sellerDetails?.profilePic).into(iv_seller_profile)
        tv_seller_name.text=response.body()?.product?.sellerDetails?.name
        tv_seller_location.text=response.body()?.product?.sellerDetails?.city

        val ratings : Float = response.body()?.product?.details?.imageRating?.toFloat()!!
        rate?.setStar(ratings)
        tv_rate.text=response.body()?.product?.details?.imageRating.toString()+"/5"

        ll_back.setOnClickListener{finish()}
        tv_add_to_cart.setOnClickListener{
            Toast.makeText(this@ProductDetailActivty, "Added to cart..", Toast.LENGTH_SHORT).show();
        }



    }
}
