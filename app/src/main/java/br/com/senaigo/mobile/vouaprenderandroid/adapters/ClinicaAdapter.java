package br.com.senaigo.mobile.vouaprenderandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Clinica;

public class ClinicaAdapter extends BaseAdapter {

    Context context;
    List<Clinica> colecaoClinica;
    LayoutInflater inflter;

    public ClinicaAdapter (final Context applicationContext, final List<Clinica> colecaoClinica){
        this.context = applicationContext;
        this.colecaoClinica = colecaoClinica;
    }

    @Override
    public int getCount() {
        return this.colecaoClinica != null ? this.colecaoClinica.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecaoClinica.get(i);
    }

    public Clinica parsetItem(int i){
        return this.colecaoClinica.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup){

        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.item_clinica,
                            viewGroup, false);
        }

        Clinica clinica = parsetItem(i);


        TextView campoNome, campoRazaoSocial, campoCnpj, campoTelefone, campoEmail, campoInscricaoEstadual, campoInscricaoMunicipal, campoCep, campoLogradouro, campoComplemento;

        campoNome = view.findViewById(R.id.txtItemNomeClinica);
        campoRazaoSocial = view.findViewById(R.id.txtItemRazaoSocialClinica);
        campoCnpj = view.findViewById(R.id.txtItemCnpj);
        campoTelefone = view.findViewById(R.id.txtItemTelefone);
        campoEmail = view.findViewById(R.id.txtItemEmail);
        campoInscricaoEstadual = view.findViewById(R.id.txtItemInscricaoEstadual);
        campoInscricaoMunicipal = view.findViewById(R.id.txtItemInscricaoMunicipal);
        campoCep = view.findViewById(R.id.txtItemCep);
        campoLogradouro = view.findViewById(R.id.txtItemLogradouro);
        campoComplemento = view.findViewById(R.id.txtItemComplemento);


        campoNome.setText(clinica.getNomeClinica());
        campoRazaoSocial.setText(clinica.getRazaoSocial());
        campoCnpj.setText(clinica.getCnpj());
        campoTelefone.setText(clinica.getTelefone());
        campoEmail.setText(clinica.getEmail());
        campoInscricaoEstadual.setText(clinica.getInscricaoEstadual());
        campoInscricaoMunicipal.setText(clinica.getInscricaoMunicipal());
        campoCep.setText(clinica.getCep());
        campoLogradouro.setText(clinica.getLogradouro());
        campoComplemento.setText(clinica.getComplemento());

        return view;


    }
}
