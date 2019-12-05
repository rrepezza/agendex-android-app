package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.api.APIClient;
import br.com.senaigo.mobile.vouaprenderandroid.api.AgendamentoResorce;
import br.com.senaigo.mobile.vouaprenderandroid.api.LoginResorce;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Agendamento;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Login;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class AgendamentoActivity extends AppCompatActivity {

    public EditText txtDataConsulta;
    public EditText txtHoraAgendamento;
    public EditText txtMedico;
    String cpfTelaAnterior;
    public CalendarView calendar;
    String data;
    public Spinner comboHora;
    public Spinner comboMedico;

    AgendamentoResorce agendamentoResorce;

    Spinner opcoes, opcoes2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamento);

        agendamentoResorce = APIClient.getClient().create(AgendamentoResorce.class);

        opcoes = (Spinner)findViewById(R.id.comboMedicos);
        opcoes2 = (Spinner)findViewById(R.id.comboHora);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.opcoes, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.opcoesConsulta, android.R.layout.simple_spinner_item);
        opcoes.setAdapter(adapter);
        opcoes2.setAdapter(adapter2);

        Intent intentPg = getIntent();

        cpfTelaAnterior = intentPg.getStringExtra("cpf");

        comboHora = findViewById(R.id.comboHora);
        comboMedico = findViewById(R.id.comboMedicos);

        calendar = findViewById(R.id.calendarView);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                if(i1 < 12) {
                    i1 = i1 + 1;
                }
                data = i2 + "/" + i1 + "/" + i;
            }
        });

    }


    @SuppressLint("WrongViewCast")
    public void agendar(View view){


        String hora = comboHora.getSelectedItem().toString();
        String medicoCombo = comboMedico.getSelectedItem().toString();


        //txtDataConsulta = findViewById(R.id.calendarView);
        //txtHoraAgendamento = findViewById(R.id.comboHora);
        //txtMedico = findViewById(R.id.comboMedicos);

        String dataAgendamento, horaAgendamento, paciente, medico;


        dataAgendamento = data;
        horaAgendamento = hora;
        medico = medicoCombo;
        paciente = cpfTelaAnterior;


        final Agendamento agendamento = new Agendamento(paciente, medico, dataAgendamento, horaAgendamento);
        Retrofit retrofit = APIClient.getClient();
        agendamentoResorce = retrofit.create(AgendamentoResorce.class);

        Call<Agendamento> agendamentoCall = agendamentoResorce.post(agendamento);

        agendamentoCall.enqueue(new Callback<Agendamento>() {
            @Override
            public void onResponse(Call<Agendamento> call, Response<Agendamento> response) {

                Log.i("objLogin", agendamento.toString());

                if (response.code() == 400) {

                    Toast.makeText(getApplicationContext(), "Erro ao gerar o agendamento", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Agendamento realizado com sucesso!", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));

                }


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

