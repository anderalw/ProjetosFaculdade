package Controller;

import Entidade.Servico;
import DAO.ServicoDAO;
import java.util.List;

public class ServicoController {

    private ServicoDAO servico;

    public ServicoController() {
        this.servico = new ServicoDAO();
    }

    public void inserir(Servico servico) {
        this.servico.inserir(servico);
    }

    public void alterar(Servico servico) {
        this.servico.alterar(servico);
    }

    public List<Servico> listar() {
        List<Servico> lista = this.servico.listar();
        return lista;
    }

    public Servico listarUm(int idServico) {
        Servico servico = this.servico.listarUm(idServico);
        return servico;
    }

    public void deletar(int id) {
        this.servico.deletar(id);
    }

    public void finalizarServico(int id) {
        this.servico.finalizarServico(id);

    }

    public boolean verificaFinalizacao(int id) {
        return this.servico.verificaFinalizacao(id);
    }
}
