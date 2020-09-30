package com.pravin.coutloot.models.ProductData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoggedInUser {
    @SerializedName("inCart")
    @Expose
    var inCart: Int? = null

    @SerializedName("inWishlist")
    @Expose
    var inWishlist: Int? = null

    @SerializedName("isFollowing")
    @Expose
    var isFollowing: Int? = null

}