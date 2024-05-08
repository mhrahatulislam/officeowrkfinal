package com.example.officeprojectjachi.Service.Network;

import com.example.officeprojectjachi.Service.Model.Responmodel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("service-type-list")
    Call<Responmodel> getApiServiceType();

}
