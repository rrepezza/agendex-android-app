package br.com.senaigo.mobile.vouaprenderandroid.api;

import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.entidades.Paciente;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PacienteResorce {


    //Envia um posts para o servidor
    @POST("auth/registrar")
    Call<Paciente> post(@Body Paciente post);


    //Tràs a lista de posts;
    @GET("pacientes")
    Call<List<Paciente>> get();
}
