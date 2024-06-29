package com.example.service;

import com.example.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/join")
    Call<Void> registerUser(@Body User user);
}