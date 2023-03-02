import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void telaInicial() {
        int opcao = 0;

        System.out.println("Bem vindo ao LABMedicine!\n\n" +
                "Selecione uma das opções abaixo:\n\n" +
                "1. Cadastro de Paciente\n" +
                "2. Cadastro de Enfermeiro\n" +
                "3. Cadastro de Médico\n" +
                "4. Realização de Atendimento Médico\n" +
                "5. Atualização do Status de Atendimento do Paciente\n" +
                "6. Relatórios\n" +
                "7. Sair\n");

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Número selecionado: ");
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção incorreta, tente novamente!\n");
            }
        } while (opcao < 1 || opcao > 7);

        switch (opcao) {
            case 1:
                System.out.println("\n====================\nCADASTRO DE PACIENTE\n====================");

                Paciente paciente = new Paciente();

                Scanner scannerPaciente = new Scanner(System.in);
                System.out.print("\nInsira o nome do paciente: ");
                paciente.setNomeCompleto(scannerPaciente.nextLine());

                System.out.print("Insira o gênero do paciente: ");
                paciente.setGenero(scannerPaciente.nextLine());

                System.out.print("Insira a data de nascimento do paciente: ");
                paciente.setDataDeNascimento(scannerPaciente.nextLine());

                System.out.print("Insira o CPF do paciente: ");
                paciente.setCpf(scannerPaciente.nextLine());

                System.out.print("Insira o telefone do paciente: ");
                paciente.setTelefone(scannerPaciente.nextLine());

                System.out.print("Insira o contato de emergência do paciente: ");
                paciente.setContatoDeEmergencia(scannerPaciente.nextLine());

                System.out.print("Insira o convênio do paciente: ");
                paciente.setConvenio(scannerPaciente.nextLine());

                System.out.print("Insira o número do convênio do paciente: ");
                paciente.setNumeroDoConvenio(scannerPaciente.nextLine());

                System.out.print("Insira a validade do convênio do paciente: ");
                paciente.setValidadeDoConvenio(scannerPaciente.nextLine());

                System.out.print("Insira alergias do paciente: ");
                paciente.setListaDeAlergias(scannerPaciente.nextLine());

                System.out.print("Insira cuidados específicos do paciente: ");
                paciente.setListaDeCuidadosEspecificos(scannerPaciente.nextLine());

                Paciente.adicionarPaciente(paciente);

                System.out.println();

                telaInicial();

                break;

            case 2:
                System.out.println("\n======================\nCADASTRO DE ENFERMEIRO\n======================");

                Enfermeiro enfermeiro = new Enfermeiro();

                Scanner scannerEnfermeiro = new Scanner(System.in);
                System.out.print("\nInsira o nome do enfermeiro: ");
                enfermeiro.setNomeCompleto(scannerEnfermeiro.nextLine());

                System.out.print("Insira o gênero do enfermeiro: ");
                enfermeiro.setGenero(scannerEnfermeiro.nextLine());

                System.out.print("Insira a data de nascimento do enfermeiro: ");
                enfermeiro.setDataDeNascimento(scannerEnfermeiro.nextLine());

                System.out.print("Insira o CPF do enfermeiro: ");
                enfermeiro.setCpf(scannerEnfermeiro.nextLine());

                System.out.print("Insira o telefone do enfermeiro: ");
                enfermeiro.setTelefone(scannerEnfermeiro.nextLine());

                System.out.print("Insira a instituição de formação do enfermeiro: ");
                enfermeiro.setInstituicaoDeEnsinoDaFormacao(scannerEnfermeiro.nextLine());

                System.out.print("Insira o COREN/UF do enfermeiro: ");
                enfermeiro.setCoren(scannerEnfermeiro.nextLine());

                Enfermeiro.adicionarEnfermeiro(enfermeiro);
                telaInicial();
                break;

            case 3:
                System.out.println("\n==================\nCADASTRO DE MÉDICO\n==================");

                Medico medico = new Medico();

                Scanner scannerMedico = new Scanner(System.in);
                System.out.print("\nInsira o nome do médico: ");
                medico.setNomeCompleto(scannerMedico.nextLine());

                System.out.print("Insira o gênero do médico: ");
                medico.setGenero(scannerMedico.nextLine());

                System.out.print("Insira a data de nascimento do médico: ");
                medico.setDataDeNascimento(scannerMedico.nextLine());

                System.out.print("Insira o CPF do médico: ");
                medico.setCpf(scannerMedico.nextLine());

                System.out.print("Insira o telefone do médico: ");
                medico.setTelefone(scannerMedico.nextLine());

                System.out.print("Insira a instituição de formação do médico: ");
                medico.setInstituicaoDeEnsinoDaFormacao(scannerMedico.nextLine());

                System.out.print("Insira o CRM/UF do médico: ");
                medico.setCrm(scannerMedico.nextLine());

                System.out.print("\nInsira a especialidade do médico: ");
                System.out.println("\n1.Clínico Geral\n2.Anestesista\n3.Dermatologia\n4.Ginecologia\n5.Neurologia\n6.Pediatria\n7.Psiquiatria\n8.Ortopedia");
                System.out.print("\nEspecialidade: ");
                medico.setEspecialidade(scannerMedico.nextInt());

                medico.setStatusNoSistema(true);

                Medico.adicionarMedico(medico);
                telaInicial();
                break;

            case 4:
                System.out.println("\n================================\nREALIZAÇÃO DE ATENDIMENTO MÉDICO\n================================");

                System.out.println("\nSelecione um dos médicos pelo seu identificador: ");
                Medico.getListaDeMedicos();

                System.out.print("Identificador do médico: ");
                Scanner scannerSelecionarMedicoPaciente = new Scanner(System.in);
                int medicoSelecionado = scannerSelecionarMedicoPaciente.nextInt();

                Medico.selecionarMedico(medicoSelecionado);

                System.out.println("Selecione um dos pacientes pelo seu identificador: ");
                Paciente.getListaDePacientes();

                System.out.print("Identificador do paciente: ");
                int pacienteSelecionado = scannerSelecionarMedicoPaciente.nextInt();

                Paciente.selecionarPaciente(pacienteSelecionado);

                break;

            case 5:
                System.out.println("\n================================================\nATUALIZAÇÃO DO STATUS DE ATENDIMENTO DO PACIENTE\n================================================");

                System.out.println("Selecione um dos pacientes pelo seu identificador: ");
                Paciente.getListaDePacientes();

                System.out.print("Identificador do paciente: ");
                Scanner scannerIndicePaciente = new Scanner(System.in);
                int indicePaciente = scannerIndicePaciente.nextInt();

                System.out.println("\nSelecione o status de atendimento:\n\n" +
                        "1. Aguardando atendimento\n" +
                        "2. Em atendimento\n" +
                        "3. Atendido\n" +
                        "4. Não atendido\n");
                System.out.print("Status de atendimento: ");
                int statusPaciente = scannerIndicePaciente.nextInt();

                Paciente.atualizarStatusPaciente(indicePaciente, statusPaciente);
                break;

            case 6:
                relatorios();
                break;

            case 7:
                System.exit(0);
        }
    }

    public static void relatorios() {
        int opcao = 0;

        System.out.println("\n==========\nRELATÓRIOS\n==========");

        System.out.println("\nSelecione uma das opções abaixo:\n\n" +
                "1. Relatório de pacientes\n" +
                "2. Relatório de enfermeiros\n" +
                "3. Relatório de médicos\n" +
                "4. Relatório geral\n" +
                "5. Voltar\n");

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Tipo de relatório: ");
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção incorreta, tente novamente!\n");
            }
        } while (opcao < 1 || opcao > 5);

        switch (opcao) {
            case 1:
                System.out.println("\nSelecione o status de atendimento:\n\n" +
                        "1. Aguardando atendimento\n" +
                        "2. Em atendimento\n" +
                        "3. Atendido\n" +
                        "4. Não atendido\n" +
                        "5. Todos\n" +
                        "6. Voltar uma tela\n" +
                        "7. Voltar a tela inicial\n");

                Scanner scannerStatusPaciente = new Scanner(System.in);
                System.out.print("Status de atendimento: ");
                int status = scannerStatusPaciente.nextInt();

                Pessoa.relatorioPacientes(status);
                break;

            case 2:
                Enfermeiro.getListaDeEnfermeiros();
                break;

            case 3:
                System.out.println("\nSelecione uma especialidade:\n\n" +
                        "1. Clínico geral\n" +
                        "2. Anestesiologia\n" +
                        "3. Dermatologia\n" +
                        "4. Ginecologia\n" +
                        "5. Neurologia\n" +
                        "6. Pediatria\n" +
                        "7. Psiquiatria\n" +
                        "8. Ortopedia\n" +
                        "9. Todos\n" +
                        "10. Voltar uma tela\n" +
                        "11. Voltar a tela inicial\n");

                Scanner scannerEspecialidadeMedico = new Scanner(System.in);
                System.out.print("Especialidade: ");
                int especialidade = scannerEspecialidadeMedico.nextInt();

                Pessoa.relatorioMedico(especialidade);
                break;

            case 4:
                Pessoa.getListaDePacientes();
                Pessoa.getListaDeEnfermeiros();
                Pessoa.getListaDeMedicos();

                System.out.println();

                break;

            case 5:
                telaInicial();
                break;
        }
    }

    public static void main(String[] args) {
        telaInicial();
    }
}