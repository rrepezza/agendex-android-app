package br.com.senaigo.mobile.vouaprenderandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import br.com.senaigo.mobile.vouaprenderandroid.R;
import br.com.senaigo.mobile.vouaprenderandroid.entidades.Login;

public class LoginAdapter extends BaseAdapter {

    Context context;
    List<Login> colecao;
    LayoutInflater inflter;

    public LoginAdapter(final Context applicationContext,
                       final List<Login> colecao) {
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
    public View getView(int position, View view, ViewGroup parent) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.activity_tela_login,
                            parent, false);
        }

        Login logins = (Login)getItem(position);

        TextView cpfLogin, senhaLogin;


        cpfLogin = view.findViewById(R.id.txtcpfLogin);
        senhaLogin = view.findViewById(R.id.txtsenhaLogin);

        cpfLogin.setText(String.valueOf(logins.getCpf()));
        senhaLogin.setText(logins.getSenha());

        return view;
    }

}
