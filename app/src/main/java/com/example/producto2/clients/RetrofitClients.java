package com.example.producto2.clients;

import com.example.producto2.services.RetrofitApiServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClients {
    private static final String URL_BASE = "https://dummyjson.com/";
    private static Retrofit retrofits;

    public static RetrofitApiServices getApiServices(){
        if (retrofits == null){
            retrofits = new Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofits.create(RetrofitApiServices.class);
    }
}
