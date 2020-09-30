package com.pravin.coutloot.models.ProductData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Images {
    @SerializedName("mainImages")
    @Expose
    var mainImages: List<String>? = null

    @SerializedName("thumbImages")
    @Expose
    var thumbImages: List<String>? = null

}