package br.com.senaigo.mobile.vouaprenderandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Paciente;

public class PacienteAdapter extends BaseAdapter {

    Context context;
    List<Paciente> colecao;
    LayoutInflater inflter;

    public PacienteAdapter (final Context applicationContext, final List<Paciente> colecao){
        this.context = applicationContext;
        this.colecao = colecao;
    }

    @Override
    public int getCount() {
        return this.colecao!=null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return this.colecao.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.item_paciente,
                            viewGroup, false);
        }

        //Paciente paciente = parsetItem(i);
        Paciente paciente = (Paciente)getItem(i);

        TextView campoNome, campoCPF, campoRG, campotelefone, campoOrgaoExpeditor, campoSexo, campoDataNasc, campoEmail;

        campoNome = view.findViewById(R.id.txtItemNome);
        campoCPF = view.findViewById(R.id.txtItemCPF);
        campoRG = view.findViewById(R.id.txtItemRG);
        campotelefone = view.findViewById(R.id.txtItemTelefone);
        campoOrgaoExpeditor = view.findViewById(R.id.txtItemOrgaoExpeditor);
        campoSexo = view.findViewById(R.id.txtItemSexo);
        campoDataNasc = view.findViewById(R.id.txtItemDataNasc);



        campoNome.setText(paciente.getNomeCompleto());
        campoCPF.setText(paciente.getCpf());
        campoRG.setText(paciente.getRg());
        campotelefone.setText(paciente.getTelefoneCelular());
        campoOrgaoExpeditor.setText(paciente.getOrgaoExpedidor());
        campoSexo.setText(paciente.getSexo());
        campoDataNasc.setText(paciente.getDataNascimento());


        return view;
    }

}

