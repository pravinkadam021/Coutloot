package com.pravin.coutloot.models.ProductDetailData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Category {
    @SerializedName("categoryId")
    @Expose
    var categoryId: Long? = null

    @SerializedName("categoryName")
    @Expose
    var categoryName: String? = null

    @SerializedName("categoryString")
    @Expose
    var categoryString: String? = null

}