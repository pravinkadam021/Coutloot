package com.pravin.coutloot.models.ProductDetailData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Product {
    @SerializedName("productId")
    @Expose
    var productId: Int? = null

    @SerializedName("productType")
    @Expose
    var productType: String? = null

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("quantity")
    @Expose
    var quantity: Int? = null

    @SerializedName("sellerDetails")
    @Expose
    var sellerDetails: SellerDetails? = null

    @SerializedName("images")
    @Expose
    var images: Images? = null

    @SerializedName("details")
    @Expose
    var details: Details? = null

    @SerializedName("category")
    @Expose
    var category: Category? = null

    @SerializedName("assured")
    @Expose
    var assured: Int? = null

    @SerializedName("crossBorder")
    @Expose
    var crossBorder: Int? = null

    @SerializedName("videoSale")
    @Expose
    var videoSale: VideoSale? = null

    @SerializedName("moreColors")
    @Expose
    lateinit var moreColors: List<MoreColor>

    @SerializedName("footer")
    @Expose
    var footer: List<String>? = null

    @SerializedName("availableOffers")
    @Expose
    var availableOffers: List<String>? = null

    @SerializedName("terms")
    @Expose
    var terms: List<String>? = null

}