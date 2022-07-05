package com.example.producto2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.producto2.client.RetrofitClient;
import com.example.producto2.clients.RetrofitClients;
import com.example.producto2.entity.Message;
import com.example.producto2.entitys.Messages;
import com.example.producto2.service.RetrofitApiService;
import com.example.producto2.services.RetrofitApiServices;

import java.util.Random;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private Button mButtons;
    private RetrofitApiService apiService;
    private RetrofitApiServices apiServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initVal();
        initViews();
        initVals();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                getMessage(random.nextInt(30));
            }
        });
        mButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                getMessages(random.nextInt(30));
            }
        });
    }

    private void initView(){
        mTextView=findViewById(R.id.messageTextView);
        mButton=findViewById(R.id.mbutton);
    }
    private void initViews(){
        mTextView=findViewById(R.id.messageTextView);
        mButtons=findViewById(R.id.mbuttons);
    }

    private void initVal(){
        apiService = RetrofitClient.getApiService();
    }
    private void initVals(){
        apiServices = RetrofitClients.getApiServices();
    }

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
    private void getMessages(int id){
        apiServices.getMessagesIds(id).enqueue(new Callback<Messages>() {
            @Override
            public void onResponse(Call<Messages> call, Response<Messages> response) {
                Messages messages = response.body();
                mTextView.setText(messages.toString());
            }

            @Override
            public void onFailure(Call<Messages> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }
}