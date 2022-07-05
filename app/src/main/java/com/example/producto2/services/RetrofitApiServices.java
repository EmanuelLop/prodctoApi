package com.example.producto2.services;

import com.example.producto2.entitys.Messages;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitApiServices {
    @GET("products/{id}")
    Call<Messages> getMessagesIds(@Path("id")int id);
    @GET("products")
    Call<List<Messages>>getMessagesUsersIds(@Query("id")int id);
}
