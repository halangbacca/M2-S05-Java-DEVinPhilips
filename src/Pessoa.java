import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nomeCompleto;
    private String genero;
    private String dataDeNascimento;
    private String cpf;
    private String telefone;
    private static List<Paciente> listaDePacientes = new ArrayList<>();
    private static List<Enfermeiro> listaDeEnfermeiros = new ArrayList<>();
    private static List<Medico> listaDeMedicos = new ArrayList<>();

    // Getters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public static void getListaDePacientes() {
        if (listaDePacientes.size() == 0) {
            System.out.println("\nNão há pacientes cadastrados!\n");
            Main.telaInicial();
        } else {
            for (int i = 0; i < listaDePacientes.size(); i++) {
                System.out.println("Identificador: " + i + " " + listaDePacientes.get(i));
            }
        }
    }

    public static void getListaDeEnfermeiros() {
        if (listaDeEnfermeiros.size() == 0) {
            System.out.println("\nNão há enfermeiros cadastrados!\n");
            Main.telaInicial();
        } else {
            for (int i = 0; i < listaDeEnfermeiros.size(); i++) {
                System.out.println("Identificador: " + i + " " + listaDeEnfermeiros.get(i));
            }
        }
    }

    public static void getListaDeMedicos() {
        if (listaDeMedicos.size() == 0) {
            System.out.println("\nNão há médicos cadastrados!\n");
            Main.telaInicial();
        } else {
            for (int i = 0; i < listaDeMedicos.size(); i++) {
                System.out.println("Identificador: " + i + " " + listaDeMedicos.get(i));
            }
            Main.telaInicial();
        }
    }

    // Setters
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Métodos
    public static void adicionarPaciente(Paciente paciente) {
        listaDePacientes.add(paciente);
    }

    public static void adicionarEnfermeiro(Enfermeiro enfermeiro) {
        listaDeEnfermeiros.add(enfermeiro);
    }

    public static void adicionarMedico(Medico medico) {
        listaDeMedicos.add(medico);
    }

    public static void relatorioPacientes(int status) {
        if (listaDePacientes.size() == 0) {
            System.out.println("\nNão há pacientes cadastrados!\n");
            Main.telaInicial();
        }
        if (status == 1) {
            for (Paciente paciente : listaDePacientes) {
                if (paciente.getStatusDeAtendimento().contains("Aguardando atendimento")) {
                    System.out.println(paciente);
                    Main.telaInicial();
                }
            }

        } else if (status == 2) {
            for (Paciente paciente : listaDePacientes) {
                if (paciente.getStatusDeAtendimento().contains("Em atendimento")) {
                    System.out.println(paciente);
                    Main.telaInicial();
                }
            }

        } else if (status == 3) {
            for (Paciente paciente : listaDePacientes) {
                if (paciente.getStatusDeAtendimento().contains("Atendido")) {
                    System.out.println(paciente);
                    Main.telaInicial();
                }
            }

        } else if (status == 4) {
            for (Paciente paciente : listaDePacientes) {
                if (paciente.getStatusDeAtendimento().contains("Não atendido")) {
                    System.out.println(paciente);
                    Main.telaInicial();
                }
            }

        } else if (status == 5) {
            for (Paciente paciente : listaDePacientes) {
                System.out.println(paciente);
                Main.telaInicial();
            }

        } else if (status == 6) {
            Main.relatorios();

        } else if (status == 7) {
            Main.telaInicial();
        }
    }

    public static void relatorioMedico(int especialidade) {
        if (listaDeMedicos.size() == 0) {
            System.out.println("\nNão há medicos cadastrados!\n");
            Main.telaInicial();
        }

        if (especialidade == 1) {
            for (Medico medico : listaDeMedicos) {
                if (medico.getEspecialidade().contains("Clínico geral")) {
                    System.out.println(medico);
                }
                Main.telaInicial();
            }

        } else if (especialidade == 2) {
            for (Medico medico : listaDeMedicos) {
                if (medico.getEspecialidade().contains("Anestesiologia")) {
                    System.out.println(medico);
                }
                Main.telaInicial();
            }

        } else if (especialidade == 3) {
            for (Medico medico : listaDeMedicos) {
                if (medico.getEspecialidade().contains("Dermatologia")) {
                    System.out.println(medico);
                }
                Main.telaInicial();
            }

        } else if (especialidade == 4) {
            for (Medico medico : listaDeMedicos) {
                if (medico.getEspecialidade().contains("Ginecologia")) {
                    System.out.println(medico);
                }
                Main.telaInicial();
            }

        } else if (especialidade == 5) {
            for (Medico medico : listaDeMedicos) {
                if (medico.getEspecialidade().contains("Neurologia")) {
                    System.out.println(medico);
                }
                Main.telaInicial();
            }

        } else if (especialidade == 6) {
            for (Medico medico : listaDeMedicos) {
                if (medico.getEspecialidade().contains("Pediatria")) {
                    System.out.println(medico);
                }
                Main.telaInicial();
            }

        } else if (especialidade == 7) {
            for (Medico medico : listaDeMedicos) {
                if (medico.getEspecialidade().contains("Psiquiatria")) {
                    System.out.println(medico);
                }
                Main.telaInicial();
            }

        } else if (especialidade == 8) {
            for (Medico medico : listaDeMedicos) {
                if (medico.getEspecialidade().contains("Ortopedia")) {
                    System.out.println(medico);
                }
                Main.telaInicial();
            }

        } else if (especialidade == 9) {
            for (Medico medico : listaDeMedicos) {
                System.out.println(medico);
                Main.telaInicial();
            }

        } else if (especialidade == 10) {
            Main.relatorios();

        } else if (especialidade == 11) {
            Main.telaInicial();
        }
    }

    public static void selecionarMedico(int id) {
        listaDeMedicos.get(id).setTotalDeAtendimentosRealizados();
    }

    public static void selecionarPaciente(int id) {
        listaDePacientes.get(id).setTotalDeAtendimentosRealizados();
        listaDePacientes.get(id).setStatusDeAtendimento("Em atendimento");
        Main.telaInicial();
    }

    public static void atualizarStatusPaciente(int id, int status) {
        if (status == 1) {
            listaDePacientes.get(id).setStatusDeAtendimento("Aguardando atendimento");
            Main.telaInicial();
        } else if (status == 2) {
            listaDePacientes.get(id).setStatusDeAtendimento("Em atendimento");
            Main.telaInicial();
        } else if (status == 3) {
            listaDePacientes.get(id).setStatusDeAtendimento("Atendido");
            Main.telaInicial();
        } else if (status == 4) {
            listaDePacientes.get(id).setStatusDeAtendimento("Não atendido");
            Main.telaInicial();
        }
    }
}