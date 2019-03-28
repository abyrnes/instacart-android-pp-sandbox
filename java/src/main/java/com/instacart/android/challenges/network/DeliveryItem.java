package com.instacart.android.challenges.network;

import com.google.gson.annotations.SerializedName;

public class DeliveryItem {
    @SerializedName("id")
    Long id;
    @SerializedName("name")
    String name;
    @SerializedName("imageUrl")
    String imageUrl;
    @SerializedName("count")
    Integer count;
}
