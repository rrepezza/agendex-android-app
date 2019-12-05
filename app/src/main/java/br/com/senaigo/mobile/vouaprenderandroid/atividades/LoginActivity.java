package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.api.APIClient;
import br.com.senaigo.mobile.vouaprenderandroid.api.LoginResorce;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Login;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {

    EditText txtCpf;
    EditText txtSenha;

    LoginResorce loginResorce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        loginResorce = APIClient.getClient().create(LoginResorce.class);

    }

    public void logar(final View view) {

        txtCpf = findViewById(R.id.txtcpfLogin);
        txtSenha = findViewById(R.id.txtsenhaLogin);


        final String senha,cpf;
        cpf = txtCpf.getText().toString();
        senha = txtSenha.getText().toString();


        if (cpf.isEmpty()) {

            txtCpf.setError("Insira o CPF!");

        } else if (senha.isEmpty()) {

            txtSenha.setError("Insira a Senha!");

        } else {

            final Login login = new Login(cpf, senha);
            Retrofit retrofit = APIClient.getClient();
            loginResorce = retrofit.create(LoginResorce.class);
            Call<Login> call = loginResorce.post(login);

            call.enqueue(new Callback<Login>() {
                @Override
                public void onResponse(Call<Login> call, Response<Login> response) {

                    //Log.i("objLogin", login.toString());
                   // Log.i("resposta", response.body().toString());

                    if (response.code() == 401) {

                        Toast.makeText(getApplicationContext(), "Senha está incorreta!", Toast.LENGTH_LONG).show();

                    } else if (response.code() == 400) {

                        Toast.makeText(getApplicationContext(), "CPF nao encontrado!", Toast.LENGTH_LONG).show();

                    } else {

                        Intent intent = new Intent(view.getContext(), MainActivity.class);
                        intent.putExtra("cpf", cpf);
                        startActivity(intent);

                        //startActivity(new Intent(getApplicationContext(), MainActivity.class));



                        //Toast.makeText(getApplicationContext(), login.getCpf() + " Logado com sucesso !", Toast.LENGTH_LONG).show();

                    }

                }

                @Override
                public void onFailure(Call<Login> call, Throwable t) {

                    Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();

                }
            });

        }
    }

    public void cadastrar(final View view) {

        startActivity(new Intent(getApplicationContext(), PacienteAtctivity.class));
    }

}


        /*
        Login logins = new Login(cpf,senha);

        Call<Login> postResource = loginResorce.post(logins);
        postResource.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                String dados = "Logado com sucesso. {}"+response.body().toString();
                Log.i("senai",String.format("Status da requisiao %s",response.code()));
                Log.i("senai",dados);

                //Toast.makeText(getApplicationContext(),dados,Toast.LENGTH_LONG).show();

                if(response.code() == 400) {

                }

                startActivity(new Intent(getApplicationContext(), MainActivity.class));



            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getLocalizedMessage(),Toast.LENGTH_LONG).show();
            }
        });

        */
