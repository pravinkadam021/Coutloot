package com.pravin.coutloot.models.ProductDetailData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Negotiated {
    @SerializedName("price")
    @Expose
    var price: Int? = null

    @SerializedName("percentOff")
    @Expose
    var percentOff: Int? = null

    @SerializedName("offerText")
    @Expose
    var offerText: String? = null

    @SerializedName("endTime")
    @Expose
    var endTime: String? = null

}