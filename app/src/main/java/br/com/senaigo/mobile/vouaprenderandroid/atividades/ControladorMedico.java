package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.os.Bundle;
import android.view.View;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.adapters.MedicoAdapter;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Medico;


public class ControladorMedico extends MedicoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cad_medico);
    }

    public void adicionarMedico(View view){

        txtNome = findViewById(R.id.txtNome);
        txtNomeSocial = findViewById(R.id.txtNomeSocial);
        txtCPF = findViewById(R.id.txtCPF);
        txtRG = findViewById(R.id.txtRG);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtOrgaoExpeditor = findViewById(R.id.txtOrgaoExpeditor);
        txtSexo = findViewById(R.id.txtSexo);
        txtDataNasc = findViewById(R.id.txtDataNasc);
        txtCRM = findViewById(R.id.txtCRM);
        txtEndereco = findViewById(R.id.txtEndereco);
        txtEspecialidade = findViewById(R.id.txtEspecialidade);
        txtEmail = findViewById(R.id.txtEmail);


        String nome, nomeSocial, telefone, cpf, rg, orgaoExpeditor, dataNasc, sexo, endereco, especialidade, crm,email;

        nome = txtNome.getText().toString();
        nomeSocial = txtNomeSocial.getText().toString();
        telefone = txtTelefone.getText().toString();
        cpf = txtCPF.getText().toString();
        rg = txtRG.getText().toString();
        orgaoExpeditor = txtOrgaoExpeditor.getText().toString();
        dataNasc = txtDataNasc.getText().toString();
        sexo = txtSexo.getText().toString();
        endereco = txtEndereco.getText().toString();
        especialidade = txtEspecialidade.getText().toString();
        crm = txtCRM.getText().toString();
        email = txtEmail.getText().toString();

        Medico medico = new Medico(nome, nomeSocial, cpf, rg, telefone, orgaoExpeditor, sexo, dataNasc, endereco, especialidade, crm, email);

        listaMed.add(medico);


        listaMedico = findViewById(R.id.listaMedico);

        MedicoAdapter medicoAdapter = new MedicoAdapter(this, listaMed);

        listaMedico.setAdapter(medicoAdapter);
    }

}
