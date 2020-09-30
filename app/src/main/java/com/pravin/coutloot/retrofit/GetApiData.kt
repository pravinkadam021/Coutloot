package com.pravin.sportsinteractive.retrofit

import com.pravin.coutloot.models.ProductData.ProductData
import com.pravin.coutloot.models.ProductDetailData.ProductDetailData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url


interface GetApiData {
    @GET
    fun getData(@Url url: String): Call<ProductData>

    @GET
    fun getProductDetailData(@Url url: String): Call<ProductDetailData>



}