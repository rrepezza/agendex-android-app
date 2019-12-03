package br.com.senaigo.mobile.vouaprenderandroid.api;

import br.com.senaigo.mobile.vouaprenderandroid.entidades.Agendamento;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AgendamentoResorce {

    //Envia um posts para o servidor
    @POST("agendamentos")
    Call<Agendamento> post(@Body Agendamento post);
}
