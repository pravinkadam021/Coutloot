package com.pravin.coutloot.models.ProductData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Details {
    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("condition")
    @Expose
    var condition: String? = null

    @SerializedName("brand")
    @Expose
    var brand: String? = null

    @SerializedName("variantAttribute")
    @Expose
    var variantAttribute: String? = null

    @SerializedName("variants")
    @Expose
    var variants: List<Variant>? = null

    @SerializedName("imageRating")
    @Expose
    var imageRating: Int? = null

    @SerializedName("assured")
    @Expose
    var assured: Int? = null

    @SerializedName("crossBorder")
    @Expose
    var crossBorder: Int? = null

    @SerializedName("meetAndBuy")
    @Expose
    var meetAndBuy: Int? = null

    @SerializedName("productUrl")
    @Expose
    var productUrl: String? = null

    @SerializedName("productSlug")
    @Expose
    var productSlug: String? = null

}