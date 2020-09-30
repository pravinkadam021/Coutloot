package com.pravin.coutloot.models.ProductDetailData

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

    @SerializedName("productAttributes")
    @Expose
    var productAttributes: List<ProductAttribute>? = null

    @SerializedName("variants")
    @Expose
    var variants: List<Variant>? =
        null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("imageRating")
    @Expose
    var imageRating: Int? = null

    @SerializedName("productUrl")
    @Expose
    var productUrl: String? = null

    @SerializedName("varientUrl")
    @Expose
    var varientUrl: String? = null

}