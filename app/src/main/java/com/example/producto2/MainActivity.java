package com.example.producto2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.producto2.client.RetrofitClient;
import com.example.producto2.entity.Datos;
import com.example.producto2.entity.Message;
import com.example.producto2.service.RetrofitApiService;

import java.util.List;
import java.util.Random;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private RetrofitApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initVal();


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                getMessage(random.nextInt(82970));
            }
        });
    }

    private void initView(){
        mTextView=findViewById(R.id.messageTextView);
        mButton=findViewById(R.id.mbutton);
    }
    private void initVal(){apiService = RetrofitClient.getApiService();}
    private void getMessage(int id){
        apiService.getMessageId(id).enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                Message message = response.body();
                mTextView.setText(message.toString());
            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }
    /*private void getDatos(int id){
        apiService.getDatosById(id).enqueue(new Callback<List<Datos>>() {
            @Override
            public void onResponse(Call<List<Datos>> call, Response<List<Datos>> response) {
                List<Datos> datos = response.body();
                mTextView.setText(datos.toString());
            }

            @Override
            public void onFailure(Call<List<Datos>> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }*/
}