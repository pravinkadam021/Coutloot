package com.pravin.coutloot.models.ProductData

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Product {
    @SerializedName("productId")
    @Expose
    var productId: Int? = null

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

    @SerializedName("productCount")
    @Expose
    var productCount: Int? = null

    @SerializedName("varientCount")
    @Expose
    var varientCount: Int? = null

    @SerializedName("collection")
    @Expose
    var collection: List<Any>? = null

    @SerializedName("listedOn")
    @Expose
    var listedOn: String? = null

    @SerializedName("liveOn")
    @Expose
    var liveOn: String? = null

    @SerializedName("serviceType")
    @Expose
    var serviceType: String? = null

    @SerializedName("uplodedBy")
    @Expose
    var uplodedBy: String? = null

    @SerializedName("offer")
    @Expose
    var offer: Int? = null

    @SerializedName("loggedInUser")
    @Expose
    var loggedInUser: LoggedInUser? = null

    @SerializedName("productRating")
    @Expose
    var productRating: Double? = null

}