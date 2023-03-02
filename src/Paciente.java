import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    private String contatoDeEmergencia;
    private List<String> listaDeAlergias = new ArrayList<>();
    private List<String> listaDeCuidadosEspecificos = new ArrayList<>();
    private String convenio;
    private String numeroDoConvenio;
    private String validadeDoConvenio;
    private String statusDeAtendimento = "Aguardando atendimento";
    private Integer totalDeAtendimentosRealizados = 0;

    // Setters
    public void setContatoDeEmergencia(String contatoDeEmergencia) {
        this.contatoDeEmergencia = contatoDeEmergencia;
    }

    public void setListaDeAlergias(String alergia) {
        this.listaDeAlergias.add(alergia);
    }

    public void setListaDeCuidadosEspecificos(String cuidadosEspecificos) {
        this.listaDeCuidadosEspecificos.add(cuidadosEspecificos);
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setNumeroDoConvenio(String numeroDoConvenio) {
        this.numeroDoConvenio = numeroDoConvenio;
    }

    public void setValidadeDoConvenio(String validadeDoConvenio) {
        this.validadeDoConvenio = validadeDoConvenio;
    }

    public void setTotalDeAtendimentosRealizados() {
        this.totalDeAtendimentosRealizados += 1;
    }

    public void setStatusDeAtendimento(String statusDeAtendimento) {
        this.statusDeAtendimento = statusDeAtendimento;
    }

    // Getter
    public String getStatusDeAtendimento() {
        return statusDeAtendimento;
    }

    // toString
    @Override
    public String toString() {
        return "Paciente {" +
                "Nome completo = '" + getNomeCompleto() + '\'' +
                ", Convênio = '" + convenio + '\'' +
                ", Total de atendimentos = " + totalDeAtendimentosRealizados +
                '}';
    }
}


