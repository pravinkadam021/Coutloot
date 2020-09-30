package com.pravin.coutloot.models.ProductDetailData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProductDetailData {
    @SerializedName("success")
    @Expose
    var success: Int? = null

    @SerializedName("session")
    @Expose
    var session: String? = null

    @SerializedName("product")
    @Expose
    var product: Product? = null

}