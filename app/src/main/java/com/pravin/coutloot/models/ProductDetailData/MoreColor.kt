package com.pravin.coutloot.models.ProductDetailData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MoreColor {
    @SerializedName("productId")
    @Expose
    var productId: Int? = null

    @SerializedName("displayImage")
    @Expose
    var displayImage: String? = null

    @SerializedName("price")
    @Expose
    var price: Int? = null

}