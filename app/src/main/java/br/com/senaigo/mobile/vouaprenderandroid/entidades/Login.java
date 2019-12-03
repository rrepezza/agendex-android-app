package br.com.senaigo.mobile.vouaprenderandroid.entidades;

import java.io.Serializable;

public class Login implements Serializable {

    private String cpf;
    private String senha;

    public Login() {
    }

    public Login(String cpfLogin, String senhaLogin) {
        this.cpf = cpfLogin;
        this.senha = senhaLogin;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senhaLogin) {
        this.senha = senhaLogin;
    }

    @Override
    public String toString() {
        return "Login{" +
                "cpf=" + cpf +
                ", senha='" + senha + '\'' +
                '}';
    }
}
