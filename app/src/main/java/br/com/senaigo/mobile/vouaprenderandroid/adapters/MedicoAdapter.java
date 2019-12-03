package br.com.senaigo.mobile.vouaprenderandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Medico;


public class MedicoAdapter extends BaseAdapter {

    Context context;
    List<Medico> colecaoMed;
    LayoutInflater inflter;


    public MedicoAdapter (final Context applicationContext, final List<Medico> colecaoMed){
        this.context = applicationContext;
        this.colecaoMed = colecaoMed;
    }

    @Override
    public int getCount() {
        return this.colecaoMed != null ? this.colecaoMed.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecaoMed.get(i);
    }

    public Medico parsetItem(int i){
        return this.colecaoMed.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.item_medico,
                            viewGroup, false);
        }

        Medico medico = parsetItem(i);

        TextView campoNome, campoNomeSocial, campoCPF, campoRG, campotelefone, campoOrgaoExpeditor, campoSexo, campoDataNasc, campoEmail, campoEspecialidade, campoCRM, campoEndereco;

        campoNome = view.findViewById(R.id.txtItemNome);
        campoNomeSocial = view.findViewById(R.id.txtItemNomeSocial);
        campoCPF = view.findViewById(R.id.txtItemCPF);
        campoRG = view.findViewById(R.id.txtItemRG);
        campotelefone = view.findViewById(R.id.txtItemTelefone);
        campoOrgaoExpeditor = view.findViewById(R.id.txtItemOrgaoExpeditor);
        campoSexo = view.findViewById(R.id.txtItemSexo);
        campoDataNasc = view.findViewById(R.id.txtItemDataNasc);
        campoEmail = view.findViewById(R.id.txtItemEmail);
        campoEspecialidade = view.findViewById(R.id.txtItemEspecialidade);
        campoCRM  = view.findViewById(R.id.txtItemCRM);
        campoEndereco = view.findViewById(R.id.txtItemEndereco);


        campoNome.setText(medico.getNome());
        campoNomeSocial.setText(medico.getNomeSocial());
        campoCPF.setText(medico.getCpf());
        campoRG.setText(medico.getRg());
        campotelefone.setText(medico.getTelefone());
        campoOrgaoExpeditor.setText(medico.getOrgaoExpeditor());
        campoSexo.setText(medico.getSexo());
        campoDataNasc.setText(medico.getDataNasc());
        campoEmail.setText(medico.getEmail());
        campoEspecialidade.setText(medico.getEspecialidade());
        campoCRM.setText(medico.getCrm());
        campoEndereco.setText(medico.getEndereco());

        return view;
    }

}
