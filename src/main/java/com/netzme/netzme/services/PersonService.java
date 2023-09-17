package com.netzme.netzme.services;

import com.netzme.netzme.dtos.responses.ApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PersonService {
    @GET("api")
    Call<ApiResponse> getPerson();
}
