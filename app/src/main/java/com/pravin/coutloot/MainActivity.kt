package com.pravin.coutloot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.pravin.coutloot.adapters.ProductAdapter
import com.pravin.coutloot.models.ProductData.ProductData
import com.pravin.sportsinteractive.retrofit.GetApiData
import com.pravin.sportsinteractive.retrofit.ServiceBuilder
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        callAPI()
    }
    private fun callAPI() {
        rv_products.visibility=GONE
        pb_products.visibility= VISIBLE
        val request = ServiceBuilder.buildService(GetApiData::class.java)
        val url = "http://dev-gtw1.coutloot.com:20038/product/list"
        val call = request.getData(url)

        call.enqueue(object : Callback<ProductData> {

            override fun onResponse(call: Call<ProductData>, response: Response<ProductData>) {
                if (response.isSuccessful) {
                    rv_products.visibility= VISIBLE
                    pb_products.visibility= GONE
                    tv_category.text=response.body()?.pageTitle
                    rv_products.apply {
                        setHasFixedSize(true)
                        layoutManager = GridLayoutManager(this@MainActivity,2)
                        adapter = response.body()?.products?.let { ProductAdapter(it) }
                    }
                }
            }

            override fun onFailure(call: Call<ProductData>, t: Throwable) {

                Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })

    }
}
