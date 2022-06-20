package Controller;

import DAO.TipoServicoDAO;
import Entidade.TipoServico;
import java.util.List;
import javax.swing.JComboBox;

public class TipoServicoController {

    private TipoServicoDAO Tservico;

    public TipoServicoController() {
        this.Tservico = new TipoServicoDAO();
    }

    public String inserir(TipoServico Tservico) {
        return this.Tservico.inserir(Tservico);
    }

    public boolean alterar(TipoServico Tservico) {
        return this.Tservico.alterar(Tservico);
    }

    public List<TipoServico> listar() {
        List<TipoServico> lista = this.Tservico.listar();
        return lista;
    }

    public List<TipoServico> listar(JComboBox servicos) {
        List<TipoServico> lista = this.Tservico.listar(servicos);
        return lista;
    }

    public TipoServico listarUm(int idServico) {
        TipoServico servico = this.Tservico.listarUm(idServico);
        return servico;
    }

    public boolean deletar(int id) {
        return this.Tservico.deletar(id);
    }

    public TipoServico buscarPorId(int id) {
        return this.Tservico.buscarPorId(id);
    }

}
