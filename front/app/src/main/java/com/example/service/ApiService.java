package com.example.service;

import com.example.model.Disabled;
import com.example.model.MemberDTO;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/join")
    Call<Void> registerUser(@Body MemberDTO member);

    @POST("/login")
    Call<Void> loginUser(@Body MemberDTO member);
}