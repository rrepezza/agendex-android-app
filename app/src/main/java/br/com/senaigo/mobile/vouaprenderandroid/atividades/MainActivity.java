package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.api.LoginResorce;

public class MainActivity extends AppCompatActivity {

    EditText txtCpf;
    EditText txtSenha;

    LoginResorce loginResorce;

    // Spinner opcoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menuprincipal);

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
        startActivity(new Intent(this,AgendamentoActivity.class));
    }

}
