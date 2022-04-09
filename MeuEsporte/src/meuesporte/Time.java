package meuesporte;

import java.util.ArrayList;

public class Time {

    private int codigo;
    private String nome;
    private String tecnico;
    private ArrayList<Jogador> jogadores;

    public Time(int codigo, String nome, String tecnico) {
        this.jogadores = new ArrayList<>();
        this.codigo = codigo;
        this.nome = nome;
        this.tecnico = tecnico;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void addJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    @Override
    public String toString() {
        return "Time: " + "Código: " + codigo + ", Nome: " + nome + ", Técnico: " + tecnico;
    }

}
