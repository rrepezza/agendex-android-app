package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.api.APIClient;
import br.com.senaigo.mobile.vouaprenderandroid.api.PacienteResorce;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Paciente;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PacienteAtctivity extends AppCompatActivity {

     EditText txtNomeCompleto;
     EditText txtCPF;
     EditText txtRG;
     EditText txtTelefone;
     EditText txtOrgaoExpeditor;
     EditText txtSexo;
     EditText txtDataNasc;
     EditText txtEmail;
     EditText txtSenha;
    ListView listView;

    //public List<Paciente> lista = new ArrayList<>();


    //Criar referência para consumir o serviço de PostService
    PacienteResorce pacienteResorce;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cad_paciente);

        pacienteResorce = APIClient.getClient().create(PacienteResorce.class);

        //carregarPaciente();
    }

   /* private void carregarPaciente(){

        Call<List<Paciente>> get = pacienteResorce.get();

        get.enqueue(new Callback<List<Paciente>>() {
            @Override
            public void onResponse(Call<List<Paciente>> call, Response<List<Paciente>> response) {
                //Recuperar a lista de posts
                List<Paciente> posts = response.body();

                //Pegar referencia da listView
                listView = findViewById(R.id.listaPaciente);

                //Chamar o Adapter para trabalhar os dados
                PacienteAdapter adapter =
                        new PacienteAdapter(getApplicationContext(),posts);

                //Fazer "bind" com a listView;
                listView.setAdapter(adapter);


            }

            @Override
            public void onFailure(Call<List<Paciente>> call, Throwable t) {

            }
        });



    }  */

    public void cadastrarPaciente(View view) {

        txtNomeCompleto = findViewById(R.id.txtNome);
        txtCPF = findViewById(R.id.txtCPF);
        txtRG = findViewById(R.id.txtRG);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtOrgaoExpeditor = findViewById(R.id.txtOrgaoExpeditor);
        txtSexo = findViewById(R.id.txtSexo);
        txtDataNasc = findViewById(R.id.txtDataNasc);
        txtEmail = findViewById(R.id.txtEmail);
        txtSenha = findViewById(R.id.txtSenha);

        String nomeCompleto,cpf,rg,telefoneCelular,orgaoExpedidor,sexo,dataNascimento,senha,email;

        nomeCompleto = txtNomeCompleto.getText().toString();
        cpf = txtCPF.getText().toString();
        rg = txtRG.getText().toString();
        telefoneCelular = txtTelefone.getText().toString();
        orgaoExpedidor = txtOrgaoExpeditor.getText().toString();
        sexo = txtSexo.getText().toString();
        dataNascimento = txtDataNasc.getText().toString();
        senha = txtSexo.getText().toString();
        email = txtEmail.getText().toString();

        Paciente paciente = new Paciente(nomeCompleto,  rg,  orgaoExpedidor,  cpf,  dataNascimento,  telefoneCelular,  email,  sexo,  senha);

        Call<Paciente> pacienteRes = pacienteResorce.post(paciente);

        pacienteRes.enqueue(new Callback<Paciente>() {
            @Override
            public void onResponse(Call<Paciente> call, Response<Paciente> response) {
                Toast.makeText(getApplicationContext(), "Paciente cadastrado !", Toast.LENGTH_LONG).show();

            }

            @Override
            public void onFailure(Call<Paciente> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }


}
