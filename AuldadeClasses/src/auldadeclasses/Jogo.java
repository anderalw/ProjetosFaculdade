package auldadeclasses;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private List adversarios = new ArrayList();
    private List personagens = new ArrayList();
    private List itens = new ArrayList();
    private Ambiente ambienteAtual;

    public void AcessarMenu() {

    }

    public void Pausar() {

    }

    public void ExibirSelecaoSave() {

    }

    public void Jogar() {

    }

    public void Salvar() {

    }

    public List getAdversarios() {
        return adversarios;
    }

    public void setAdversarios(List adversarios) {
        this.adversarios = adversarios;
    }

    public List getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List personagens) {
        this.personagens = personagens;
    }

    public List getItens() {
        return itens;
    }

    public void setItens(List itens) {
        this.itens = itens;
    }

    public Ambiente getAmbienteAtual() {
        return ambienteAtual;
    }

    public void setAmbienteAtual(Ambiente ambienteAtual) {
        this.ambienteAtual = ambienteAtual;
    }
    
}
