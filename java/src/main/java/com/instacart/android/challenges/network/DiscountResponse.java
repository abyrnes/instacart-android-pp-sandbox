package com.instacart.android.challenges.network;

import com.google.gson.annotations.SerializedName;

public class DiscountResponse {
    @SerializedName("id")
    Long id;

    @SerializedName("price")
    String price;

    @SerializedName("discount")
    String discount;
}
