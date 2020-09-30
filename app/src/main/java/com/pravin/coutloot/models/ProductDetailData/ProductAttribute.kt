package com.pravin.coutloot.models.ProductDetailData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ProductAttribute {
    @SerializedName("key")
    @Expose
    var key: String? = null

    @SerializedName("value")
    @Expose
    var value: String? = null

}