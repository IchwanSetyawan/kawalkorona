package com.example.uas_kawalkorona;

import com.example.uas_kawalkorona.Model.ModelDataIndonesia;
import com.example.uas_kawalkorona.Model.ModelObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("indonesia")
    Call<List<ModelDataIndonesia>> getData();

    @GET("indonesia/provinsi")
    Call<List<ModelObject>> getProvinsi();

}
