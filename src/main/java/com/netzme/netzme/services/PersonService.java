package com.netzme.netzme.services;

import com.netzme.netzme.dtos.responses.PersonResponse;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class PersonService {

    public PersonResponse getPerson(String url) {
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client.build())
                .build();

        retrofit.create(null);
        return null;
    }
}
