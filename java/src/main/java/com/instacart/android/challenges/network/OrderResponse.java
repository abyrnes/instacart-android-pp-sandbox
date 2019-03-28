package com.instacart.android.challenges.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderResponse {
    @SerializedName("items")
    List<DeliveryItem> items;
}
