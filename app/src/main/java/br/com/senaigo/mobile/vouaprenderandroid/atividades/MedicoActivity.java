package br.com.senaigo.mobile.vouaprenderandroid.atividades;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.entidades.Medico;

public class MedicoActivity extends AppCompatActivity {

    public EditText txtNome;
    public EditText txtNomeSocial;
    public EditText txtCPF;
    public EditText txtRG;
    public EditText txtTelefone;
    public EditText txtOrgaoExpeditor;
    public EditText txtSexo;
    public EditText txtDataNasc;
    public EditText txtCRM;
    public EditText txtEndereco;
    public EditText txtEspecialidade;
    public EditText txtEmail;

    public List<Medico> listaMed = new ArrayList<>();
    public ListView listaMedico;

}
