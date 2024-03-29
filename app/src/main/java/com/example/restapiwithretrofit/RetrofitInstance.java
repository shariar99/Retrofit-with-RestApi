package com.example.restapiwithretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofit;
    private static final String BASEFUL = "https://fakestoreapi.com/";


    public static Retrofit getRetrofit() {
        if (retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BASEFUL)
                    .addConverterFactory(GsonConverterFactory.
                            create()).build();
        }
        return retrofit;
    }
}
