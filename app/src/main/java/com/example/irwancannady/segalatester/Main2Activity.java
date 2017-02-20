package com.example.irwancannady.segalatester;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main2Activity extends AppCompatActivity {

    private  TextView txt_id;
    private  TextView txt_nama;
    private  TextView txt_email;
    private  TextView txt_alamat;
    private  TextView txt_status;
    private Model models;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_id = (TextView) findViewById(R.id.txt_id);
        txt_nama = (TextView) findViewById(R.id.txt_nama);
        txt_email = (TextView) findViewById(R.id.txt_email);
        txt_alamat =(TextView) findViewById(R.id.txt_alamat);
        txt_status = (TextView) findViewById(R.id.txt_status);

        getDatanya();
    }

    private void getDatanya(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.teknorial.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MasRobby masRobby = retrofit.create(MasRobby.class);
        Call<Models> call = masRobby.getData();
        call.enqueue(new Callback<Models>() {
            @Override
            public void onResponse(Call<Models> call, Response<Models> response) {

                try {
                    String id = response.body().getAdmin().getId().toString();
                    String nama = response.body().getAdmin().getNama();
                    String email = response.body().getAdmin().getEmail();
                    String alamat = response.body().getAdmin().getAlamat();
                    String status = response.body().getAdmin().getStatus();

                    txt_id.setText("ID" + id);
                    txt_nama.setText("nama" + nama);
                    txt_email.setText(email);
                    txt_alamat.setText(alamat);
                    txt_status.setText(status);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<Models> call, Throwable t) {

            }
        });

    }
}
