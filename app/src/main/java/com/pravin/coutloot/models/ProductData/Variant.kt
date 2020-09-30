package com.pravin.coutloot.models.ProductData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.pravin.coutloot.models.ProductData.PriceDetails

class Variant {
    @SerializedName("default")
    @Expose
    var default: Int? = null

    @SerializedName("sku")
    @Expose
    var sku: String? = null

    @SerializedName("variantName")
    @Expose
    var variantName: String? = null

    @SerializedName("priceDetails")
    @Expose
    var priceDetails: PriceDetails? = null

    @SerializedName("quantity")
    @Expose
    var quantity: Int? = null

}