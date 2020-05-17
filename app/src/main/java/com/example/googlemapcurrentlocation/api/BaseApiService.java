package com.example.googlemapcurrentlocation.api;

import com.example.googlemapcurrentlocation.model.ResponsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BaseApiService {

    @GET("maps/api/place/nearbysearch/json")
    Call<ResponsModel> getRestorant(@Query("location") String location,
                                    @Query("radius") Integer radius,
                                    @Query("type") String type,
                                    @Query("key") String key);
}