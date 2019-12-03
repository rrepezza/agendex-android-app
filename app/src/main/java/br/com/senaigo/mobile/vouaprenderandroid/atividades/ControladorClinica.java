package br.com.senaigo.mobile.vouaprenderandroid.atividades;


import android.os.Bundle;
import android.view.View;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.adapters.ClinicaAdapter;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Clinica;

public class ControladorClinica extends ClinicaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cad_clinica);
    }

    public void  adicionarClinica(View view){

        txtNomeClinica = findViewById(R.id.txtNomeClinica);
        txtRazaoSocial = findViewById(R.id.txtRazaoSocial);
        txtCnpj = findViewById(R.id.txtCnpj);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtEmail = findViewById(R.id.txtEmail);
        txtInscricaoEstadual = findViewById(R.id.txtInscricaoEstadual);
        txtInscricaoMunicipal = findViewById(R.id.txtInscricaoMunicipal);
        txtCep = findViewById(R.id.txtCep);
        txtLogradouro = findViewById(R.id.txtLogradouro);
        txtComplemento = findViewById(R.id.txtComplemento);


        String nomeClinica, razaoSocial,  cnpj,  telefone,  email,  inscricaoEstadual,  inscricaoMunicipal,  cep,  logradouro, complemento;


        nomeClinica = txtNomeClinica.getText().toString();
        razaoSocial = txtRazaoSocial.getText().toString();
        cnpj = txtCnpj.getText().toString();
        telefone = txtTelefone.getText().toString();
        email = txtEmail.getText().toString();
        inscricaoEstadual = txtInscricaoEstadual.getText().toString();
        inscricaoMunicipal = txtInscricaoMunicipal.getText().toString();
        cep =  txtCep.getText().toString();
        logradouro = txtLogradouro.getText().toString();
        complemento = txtComplemento.getText().toString();

        Clinica clinica = new Clinica(nomeClinica, razaoSocial,  cnpj,  telefone,  email,  inscricaoEstadual,  inscricaoMunicipal,  cep,  logradouro, complemento);
        listaC.add(clinica);


        listaClinica = findViewById(R.id.listaClinica);

        ClinicaAdapter clinicaAdapter = new ClinicaAdapter(this, listaC);

        listaClinica.setAdapter(clinicaAdapter);
    }
}
