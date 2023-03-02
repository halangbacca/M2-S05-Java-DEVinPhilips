public class Enfermeiro extends Pessoa {
    private String instituicaoDeEnsinoDaFormacao;
    private String coren;

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
                ", COREN/UF='" + coren + '\'' +
                ", Insituição acadêmica='" + instituicaoDeEnsinoDaFormacao + '\'' +
                '}';
    }
}
