package meuesporte;

public class Menu {

    static void menu() {
        ControleJogador cj = new ControleJogador();
        ControleTime ct = new ControleTime();
        int opcao;
        int codigoAtualJogador = 1;
        int codigoAtualTime = 1;
        do {
            System.out.println("\n\n### Meu Esporte ###\n"
                    + "=======================================================\n"
                    + "|     1 - Cadastro de Jogador                         |\n"
                    + "|     2 - Cadastro de Times                           |\n"
                    + "|     3 - Listar Jogadores Cadastrados                |\n"
                    + "|     4 - Listar times cadastrados - sem os jogadores |\n"
                    + "|     5 - Vincular Jogador ao um Time                 |\n"
                    + "|     6 - Listar dados completos de um time           |\n"
                    + "|     7 - Sair                                        |\n"
                    + "=======================================================\n");

            opcao = Entrada.leiaInt("Digite uma opção: ");
            System.out.print("\n");

            switch (opcao) {
                case 1: {
                    String nome = Entrada.leiaString("Nome do jogador: ");
                    String posicao = Entrada.leiaString("Posição do jogador: ");
                    Jogador jogador = new Jogador(codigoAtualJogador, nome, posicao);
                    cj.adicionaJogador(jogador);
                    codigoAtualJogador++;
                    break;
                }
                case 2: {
                    String nome = Entrada.leiaString("Nome do time: ");
                    String tecnico = Entrada.leiaString("Técnico do time: ");
                    Time time = new Time(codigoAtualTime, nome, tecnico);
                    ct.adicionaTime(time);
                    codigoAtualTime++;
                    break;
                }
                case 3: {
                    System.out.println("Jogadores cadastrados\n");
                    cj.listarJogador();
                    break;
                }
                case 4: {
                    System.out.println("Times cadastrados\n");
                    ct.listarTimeSemJogador();
                    break;
                }
                case 5: {
                    try {
                        System.out.println("Vincule um jogador ao um time\n");
                        System.out.println("Selecione um jogador\n");
                        cj.listarJogador();
                        int codJogador = Entrada.leiaInt("Digite o código do jogador: ");
                        Jogador jogador = cj.pesquisar(codJogador);
                        cj.removerJogador(jogador);
                        System.out.println("Selecione um time\n");
                        ct.listarTimeSemJogador();
                        int codTime = Entrada.leiaInt("Digite o código do time: ");
                        ct.adicionaJogador(jogador, codTime);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }

                case 6: {
                    System.out.println("Lista de times com seus jogadores");
                    ct.listaTimecomJogadores();
                    break;
                }
                case 7: {
                    System.out.println("");
                    break;
                }
                default:
                    System.out.println("Opção Inválida");
            }
        } while (opcao != 7);
    }
}
