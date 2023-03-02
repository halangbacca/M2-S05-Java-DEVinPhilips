public class Enfermeiro extends Pessoa {
    private String instituicaoDeEnsinoDaFormacao;
    private String coren;

    // Getters
    public String getInstituicaoDeEnsinoDaFormacao() {
        return instituicaoDeEnsinoDaFormacao;
    }

    public String getCoren() {
        return coren;
    }

    // Setters
    public void setInstituicaoDeEnsinoDaFormacao(String instituicaoDeEnsinoDaFormacao) {
        this.instituicaoDeEnsinoDaFormacao = instituicaoDeEnsinoDaFormacao;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    // toString
    @Override
    public String toString() {
        return "Enfermeiro {" +
                "Nome completo='" + getNomeCompleto() + '\'' +
                ", Gênero = '" + getGenero() + '\'' +
                ", CPF = '" + getCpf() + '\'' +
                ", Data de nascimento = '" + getDataDeNascimento() + '\'' +
                ", COREN/UF='" + coren + '\'' +
                ", Insituição acadêmica='" + instituicaoDeEnsinoDaFormacao + '\'' +
                '}';
    }
}
