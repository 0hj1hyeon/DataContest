package com.example.service;

import com.example.model.Disabled;
import com.example.model.Member;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/join")
    Call<Void> registerUser(@Body Member member);

    @POST("/join")
    Call<Void> registerDisabled(@Body Disabled disabled);

    @POST("/login")
    Call<Void> loginUser(@Body Member member);
}