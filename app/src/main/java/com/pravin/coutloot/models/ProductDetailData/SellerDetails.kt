package com.pravin.coutloot.models.ProductDetailData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SellerDetails {
    @SerializedName("userId")
    @Expose
    var userId: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("profilePic")
    @Expose
    var profilePic: String? = null

    @SerializedName("city")
    @Expose
    var city: String? = null

}