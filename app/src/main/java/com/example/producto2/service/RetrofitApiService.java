package com.example.producto2.service;
import com.example.producto2.entity.Message;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitApiService {
    @GET("quotes/{id}")
    Call<Message> getMessageId(@Path("id")int id);
    @GET("quotes/")
    Call<List<Message>> getMessageUserId(@Query("id") int id);

}
