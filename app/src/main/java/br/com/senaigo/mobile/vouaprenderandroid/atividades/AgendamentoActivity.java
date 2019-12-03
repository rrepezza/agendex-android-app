package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.api.APIClient;
import br.com.senaigo.mobile.vouaprenderandroid.api.AgendamentoResorce;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Agendamento;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AgendamentoActivity extends AppCompatActivity {

    public EditText txtDataConsulta;
    public EditText txtEspecialidade;
    public EditText txtIdMedico;
    public EditText txtIdPaciente;
    public List<Agendamento> lista = new ArrayList<>();
    public ListView listaAgendamento;

    AgendamentoResorce agendamentoResorce;

    Spinner opcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamento);

        agendamentoResorce = APIClient.getClient().create(AgendamentoResorce.class);

        opcoes = (Spinner)findViewById(R.id.comboEspecialidade);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.opcoes, android.R.layout.simple_spinner_item);
        opcoes.setAdapter(adapter);

    }


    @SuppressLint("WrongViewCast")
    public void agendar(View view){


        txtDataConsulta = findViewById(R.id.calendarView);
        txtEspecialidade = findViewById(R.id.comboEspecialidade);
        txtIdMedico = findViewById(R.id.txtItemIDMedico);
        //txtIdPaciente = findViewById(R.id.txtitemid);


        String dataConsulta, especialidade, idmedico, idpaciente;


        dataConsulta = txtDataConsulta.getText().toString();
        especialidade = txtEspecialidade.getText().toString();
        idmedico = txtIdMedico.getText().toString();
        idpaciente = txtIdPaciente.getText().toString();


        Agendamento agendamento = new Agendamento(dataConsulta,  especialidade, idmedico, idpaciente);

        lista.add(agendamento);
        Call<Agendamento> agendamentoCall = agendamentoResorce.post(agendamento);

        agendamentoCall.enqueue(new Callback<Agendamento>() {
            @Override
            public void onResponse(Call<Agendamento> call, Response<Agendamento> response) {

            }

            @Override
            public void onFailure(Call<Agendamento> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
            }
        });

        // listaAgendamento = findViewById(R.id.listaAgendamento);

        //AgendamentoAdapter agendamentoAdapter = new AgendamentoAdapter(this, lista);
        //listaAgendamento.setAdapter(agendamentoAdapter);
    }




}
