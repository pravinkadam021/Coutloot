package com.pravin.coutloot.models.ProductDetailData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Images {
    @SerializedName("mainImages")
    @Expose
    var mainImages: List<String>? = null

    @SerializedName("submittedImages")
    @Expose
    var submittedImages: List<String>? = null

    @SerializedName("thumbImages")
    @Expose
    var thumbImages: List<String>? = null

}