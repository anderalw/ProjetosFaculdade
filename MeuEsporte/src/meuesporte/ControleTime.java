package meuesporte;

import java.util.ArrayList;

public class ControleTime {

    ControleJogador cj = new ControleJogador();

    ArrayList<Time> times = new ArrayList();

    public void adicionaTime(Time time) {
        times.add(time);
    }

    public void listarTimeSemJogador() {
        times.forEach(time -> {
            System.out.println(time);
        });
    }

    public void adicionaJogador(Jogador jogador, int codigoTime) throws Exception {
        Time timeEncontrado = times.stream()
                .filter(time -> time.getCodigo() == codigoTime)
                .findFirst()
                .orElseThrow(() -> new Exception("Time não encontrado"));
        timeEncontrado.addJogador(jogador);
    }

    public void listaTimecomJogadores() {
        times.forEach((Time time) -> {
            System.out.println("\nTime: Código: " + time.getCodigo() 
                    + ", Nome: " + time.getNome() 
                    + ", Técnico: " + time.getTecnico() 
                    + "\njogadores: " + time.getJogadores());
        });
    }
}
