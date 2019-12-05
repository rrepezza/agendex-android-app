package br.com.senaigo.mobile.vouaprenderandroid.entidades;

public class Agendamento {

    private String cpfPaciente;
    private String nomeMedico;
    private String dataAgendamento;
    private String horaAgendamento;


    public Agendamento(String cpf, String medico, String dataAgendamento, String horaAgendamento) {
        this.cpfPaciente = cpf;
        this.nomeMedico = medico;
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getHoraAgendamento() {
        return horaAgendamento;
    }

    public void setHoraAgendamento(String horaAgendamento) {
        this.horaAgendamento = horaAgendamento;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "cpfPaciente='" + cpfPaciente + '\'' +
                ", nomeMedico='" + nomeMedico + '\'' +
                ", dataAgendamento='" + dataAgendamento + '\'' +
                ", horaAgendamento='" + horaAgendamento + '\'' +
                '}';
    }
}
