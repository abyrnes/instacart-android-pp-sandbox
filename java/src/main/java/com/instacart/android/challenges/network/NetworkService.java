package com.instacart.android.challenges.network;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://boiling-dusk-12902.herokuapp.com/")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    final NetworkApi api = retrofit.create(NetworkApi.class);
}
