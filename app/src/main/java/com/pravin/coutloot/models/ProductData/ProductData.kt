package com.pravin.coutloot.models.ProductData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.pravin.coutloot.models.ProductData.Product

class ProductData {
    @SerializedName("success")
    @Expose
    var success: Int? = null

    @SerializedName("currentPage")
    @Expose
    var currentPage: Int? = null

    @SerializedName("nextPage")
    @Expose
    var nextPage: Int? = null

    @SerializedName("pageTitle")
    @Expose
    var pageTitle: String? = null

    @SerializedName("breadcrumbs")
    @Expose
    var breadcrumbs: String? = null

    @SerializedName("noPages")
    @Expose
    var noPages: Int? = null

    @SerializedName("products")
    @Expose
    lateinit var products: List<Product>

}