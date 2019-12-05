package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.adapters.PacienteAdapter;
import br.com.senaigo.mobile.vouaprenderandroid.api.APIClient;
import br.com.senaigo.mobile.vouaprenderandroid.api.LoginResorce;
import br.com.senaigo.mobile.vouaprenderandroid.api.PacienteResorce;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Login;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Paciente;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {


    String cpfTelaAnterior;

    PacienteResorce pacienteResorce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menuprincipal);

        Intent intentPg = getIntent();

        cpfTelaAnterior = intentPg.getStringExtra("cpf");

        pacienteResorce = APIClient.getClient().create(PacienteResorce.class);

    }
        //opcoes = (Spinner)findViewById(R.id.comboEspecialidade);
       // ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.opcoes, android.R.layout.simple_spinner_item);
        //opcoes.setAdapter(adapter);
   // }



    public void ControladorPaciente(View view) {
        startActivity(new Intent(this,PacienteAtctivity.class));
    }

    public void ControladorMedico(View view) {
        startActivity(new Intent(this,ControladorMedico.class));
    }
    public void ControladorClinica(View view) {
        startActivity(new Intent(this,ControladorClinica.class));
    }

    public void ControladorAgendamento(View view) {
        Intent intent = new Intent(view.getContext(), AgendamentoActivity.class);
        intent.putExtra("cpf", cpfTelaAnterior);
        startActivity(intent);
    }

    public void ControladorListaAgendamentos(View view) {
        startActivity(new Intent(this,AgendamentoActivity.class));
    }

}
