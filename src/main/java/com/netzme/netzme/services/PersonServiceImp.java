package com.netzme.netzme.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.netzme.netzme.dtos.responses.ApiResponse;
import com.netzme.netzme.dtos.responses.PersonResponse;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Service
public class PersonServiceImp {

    public PersonResponse getPerson(String url) {
        PersonResponse response = new PersonResponse();
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        client.addInterceptor(interceptor);
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client.build())
                .build();

        PersonService personService = retrofit.create(PersonService.class);
        Call<ApiResponse> callSync = personService.getPerson();

        try{
            Response<ApiResponse> resp = callSync.execute();
            ApiResponse apiResponse = resp.body();
            System.out.println("ApiResponse : "+apiResponse);
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
