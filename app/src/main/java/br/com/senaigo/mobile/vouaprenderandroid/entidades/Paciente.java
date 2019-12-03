package br.com.senaigo.mobile.vouaprenderandroid.entidades;

public class Paciente {

    private String nomeCompleto;
    private String nomeSocial;
    private String rg;
    private String orgaoExpedidor;
    private String cpf;
    private String dataNascimento;
    private String telefoneCelular;
    private String email;
    private String sexo;
    private String senha;

    public Paciente(String nomeCompleto, String rg, String orgaoExpedidor, String cpf, String dataNascimento, String telefoneCelular, String email, String sexo, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.orgaoExpedidor = orgaoExpedidor;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
        this.sexo = sexo;
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
