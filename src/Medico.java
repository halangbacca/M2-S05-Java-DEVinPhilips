public class Medico extends Pessoa {
    private String instituicaoDeEnsinoDaFormacao;
    private String crm;
    private String especialidade;
    private Boolean statusNoSistema = true;
    private Integer totalDeAtendimentosRealizados = 0;

    // Setters
    public void setInstituicaoDeEnsinoDaFormacao(String instituicaoDeEnsinoDaFormacao) {
        this.instituicaoDeEnsinoDaFormacao = instituicaoDeEnsinoDaFormacao;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspecialidade(Integer especialidade) {
        if (especialidade == 1) {
            this.especialidade = "Clínico geral";
        } else if (especialidade == 2) {
            this.especialidade = "Anestesiologia";
        } else if (especialidade == 3) {
            this.especialidade = "Dermatologia";
        } else if (especialidade == 4) {
            this.especialidade = "Ginecologia";
        } else if (especialidade == 5) {
            this.especialidade = "Neurologia";
        } else if (especialidade == 6) {
            this.especialidade = "Pediatria";
        } else if (especialidade == 8) {
            this.especialidade = "Psiquiatria";
        } else if (especialidade == 9) {
            this.especialidade = "Ortopedia";
        }
    }

    public void setStatusNoSistema(Boolean statusNoSistema) {
        this.statusNoSistema = statusNoSistema;
    }

    public void setTotalDeAtendimentosRealizados() {
        this.totalDeAtendimentosRealizados += 1;
    }

    // Getter
    public String getEspecialidade() {
        return especialidade;
    }

    // toString
    @Override
    public String toString() {
        return "Médico {" +
                "Nome completo = '" + getNomeCompleto() + '\'' +
                ", Especialidade = '" + especialidade + '\'' +
                ", CRM/UF = '" + crm + '\'' +
                ", Instituição acadêmica = '" + instituicaoDeEnsinoDaFormacao + '\'' +
                '}';
    }
}
