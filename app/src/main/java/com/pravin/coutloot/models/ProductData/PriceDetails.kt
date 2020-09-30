package com.pravin.coutloot.models.ProductData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PriceDetails {
    @SerializedName("labelPrice")
    @Expose
    var labelPrice: Int? = null

    @SerializedName("listedPrice")
    @Expose
    var listedPrice: Int? = null

    @SerializedName("percentOff")
    @Expose
    var percentOff: Int? = null

    @SerializedName("commision")
    @Expose
    var commision: Int? = null

    @SerializedName("userEarning")
    @Expose
    var userEarning: Int? = null

}