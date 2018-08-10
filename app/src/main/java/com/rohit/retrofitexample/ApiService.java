package com.rohit.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    public static final String BASE_URL = "https://squareandcuberesearch.000webhostapp.com/LocationTracking/public/";

    //getting Toatal Employee data based on manager Id
    @GET("getAllEmployees/{managerId}")
    Call<Employee> getEmployees(@Path("managerId") String id);
}
