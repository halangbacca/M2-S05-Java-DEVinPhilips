public class Medico extends Pessoa {
    private String instituicaoDeEnsinoDaFormacao;
    private String crm;
    private String especialidade;
    private Boolean statusNoSistema = true;
    private Integer totalDeAtendimentosRealizados = 0;

    // Getters
    public String getEspecialidade() {
        return especialidade;
    }

    public String getInstituicaoDeEnsinoDaFormacao() {
        return instituicaoDeEnsinoDaFormacao;
    }

    public String getCrm() {
        return crm;
    }

    // Setters
    public void setInstituicaoDeEnsinoDaFormacao(String instituicaoDeEnsinoDaFormacao) {
        this.instituicaoDeEnsinoDaFormacao = instituicaoDeEnsinoDaFormacao;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspecialidade(String especialidade) {
        switch (especialidade) {
            case "1" -> this.especialidade = "Clínico geral";
            case "2" -> this.especialidade = "Anestesiologia";
            case "3" -> this.especialidade = "Dermatologia";
            case "4" -> this.especialidade = "Ginecologia";
            case "5" -> this.especialidade = "Neurologia";
            case "6" -> this.especialidade = "Pediatria";
            case "7" -> this.especialidade = "Psiquiatria";
            case "8" -> this.especialidade = "Ortopedia";
        }
    }

    public void setStatusNoSistema(Boolean statusNoSistema) {
        this.statusNoSistema = statusNoSistema;
    }

    public void setTotalDeAtendimentosRealizados() {
        this.totalDeAtendimentosRealizados += 1;
    }

    // toString
    @Override
    public String toString() {
        return "Médico {" +
                "Nome completo = '" + getNomeCompleto() + '\'' +
                ", Gênero = '" + getGenero() + '\'' +
                ", CPF = '" + getCpf() + '\'' +
                ", Data de nascimento = '" + getDataDeNascimento() + '\'' +
                ", Especialidade = '" + especialidade + '\'' +
                ", CRM/UF = '" + crm + '\'' +
                ", Instituição acadêmica = '" + instituicaoDeEnsinoDaFormacao + '\'' +
                '}';
    }
}
