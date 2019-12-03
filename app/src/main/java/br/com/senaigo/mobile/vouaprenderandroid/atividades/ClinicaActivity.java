package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.entidades.Clinica;

public class ClinicaActivity extends AppCompatActivity {

    public EditText txtNomeClinica;
    public EditText txtRazaoSocial;
    public EditText txtCnpj;
    public EditText txtTelefone;
    public EditText txtEmail;
    public EditText txtInscricaoEstadual;
    public EditText txtInscricaoMunicipal;
    public EditText txtCep;
    public EditText txtLogradouro;
    public EditText txtComplemento;
    public List<Clinica> listaC  = new ArrayList<>();
    public ListView listaClinica;

}
