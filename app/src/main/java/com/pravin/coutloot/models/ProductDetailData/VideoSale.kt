package com.pravin.coutloot.models.ProductDetailData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class VideoSale {
    @SerializedName("status")
    @Expose
    var status: Int? = null

    @SerializedName("videoSaleId")
    @Expose
    var videoSaleId: String? = null

}