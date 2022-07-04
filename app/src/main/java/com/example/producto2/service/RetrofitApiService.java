package com.example.producto2.service;
import com.example.producto2.entity.Datos;
import com.example.producto2.entity.Message;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitApiService {
    @GET("comics/{code}?ts=1&apikey=3ab3583b7139782bffd5845774f23d91&hash=8f81fa427bee7329a679b983019252f8")
    Call<Message> getMessageId(@Path("code")int id);
    @GET("comics?ts=1&apikey=3ab3583b7139782bffd5845774f23d91&hash=8f81fa427bee7329a679b983019252f8")
    Call<List<Message>> getMessagesUserId(@Query("code") int id);
    @GET("comics")
    Call<List<Datos>> getDatosById(@Query("code") int id);
}
