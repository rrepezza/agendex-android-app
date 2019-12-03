package br.com.senaigo.mobile.vouaprenderandroid.entidades;

public class Agendamento {

    protected String dataConsulta;
    protected String especialidade;
    protected String idMedico;
    protected String idPaciente;

    public Agendamento(String dataConsulta, String especialidade, String idMedico, String idPaciente) {
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "dataConsulta='" + dataConsulta + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", idMedico=" + idMedico +
                ", idPaciente=" + idPaciente +
                '}';
    }
}
