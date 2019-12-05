package br.com.senaigo.mobile.vouaprenderandroid.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    public static final String ENDPOINT = "http://192.168.107.115:3000/";

    public static Retrofit getClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

}
