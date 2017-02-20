package com.example.irwancannady.segalatester;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MasRobby {


    @GET("contohjson")
    Call<Models> getData();

    @FormUrlEncoded
    @POST("tester/masrobby")
    void masukinData(@Field("nama") String nama);

}
