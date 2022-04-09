package meuesporte;

import java.util.ArrayList;

public class ControleJogador {

    ArrayList<Jogador> jogadores = new ArrayList();

    public void adicionaJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listarJogador() {

        jogadores.forEach(jogador -> {
            System.out.println("Código: " + jogador.getCodigo()
                    + ", Nome: " + jogador.getNome()
                    + ", Posição: " + jogador.getPosicao());
        });
    }

    public Jogador pesquisar(int codigo) throws Exception {
        for (Jogador jogador : jogadores) {
            if (jogador.getCodigo() == codigo) {
                return jogador;
            }
        }
        throw new Exception("Jogador não encontrado");
    }

    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }
}
