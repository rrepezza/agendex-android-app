package br.com.senaigo.mobile.vouaprenderandroid.api;

import br.com.senaigo.mobile.vouaprenderandroid.entidades.Medico;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MedicoResorce {
    //Envia um posts para o servidor
    @POST("medicos")
    Call<Medico> post(@Body Medico post);
}
