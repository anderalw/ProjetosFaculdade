package DAO;

import Apoio.Conexao;
import Entidade.TipoServico;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class TipoServicoDAO implements InterfaceDAO<TipoServico> {

    @Override
    public Boolean inserir(TipoServico servico) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "insert into servico values (default, '"
                    + servico.getValor()+ "','"
                    + servico.getNome()+ "')";

            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao inserir Cliente: " + e);
            return false;
        }
    }

    @Override
    public Boolean alterar(TipoServico servico) {
        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "update servico set nome = '"
                    + servico.getNome() + "', valor = '"
                    + servico.getValor() + "' where id_servico= "
                    + servico.getId_servico();

            int retorno = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a Tipo Serviço: " + e);
            return false;
        }
    }

    @Override
    public Boolean deletar(int id) {
        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "DELETE FROM servico where id_servico = " + id;
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println("Erro ao excluir Tipo Serviço: " + e);
            return false;
        }
        return true;
    }

    public List<TipoServico> listar() {
        List<TipoServico> lista = new ArrayList<TipoServico>();

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from servico order by id_servico";
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {
                TipoServico ts = new TipoServico();

                ts.setId_servico(retorno.getInt("id_servico"));
                ts.setNome(retorno.getString("nome"));
                ts.setValor(retorno.getFloat("valor"));
                lista.add(ts);

            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar Tipo Serviço: " + e);

        }
        return lista;
    }

    public List<TipoServico> listar(JComboBox servicos) {
        List<TipoServico> lista = new ArrayList<TipoServico>();
        TipoServico servicoDefault = new TipoServico();
        servicoDefault.setId_servico(2022);
        servicoDefault.setNome("Default");
        servicoDefault.setValor(0);
        lista.add(servicoDefault);

        ResultSet rs;

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from servico order by id_servico";
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {
                TipoServico ts = new TipoServico();

                servicos.addItem(retorno.getString("nome"));

                ts.setId_servico(retorno.getInt("id_servico"));
                ts.setNome(retorno.getString("nome"));
                ts.setValor(retorno.getFloat("valor"));
                lista.add(ts);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Tipo Serviço: " + e);

        }
        return lista;
    }

    public TipoServico listarUm(int idServico) {
        TipoServico tipoServico = new TipoServico();

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from servico where id_servico";
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {

                tipoServico.setId_servico(retorno.getInt("id_servico"));
                tipoServico.setNome(retorno.getString("nome"));
                tipoServico.setValor(retorno.getFloat("valor"));

            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar Tipo Serviço: " + e);

        }
        return tipoServico;
    }

    public TipoServico buscarPorId(int id) {
        TipoServico ts = null;

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from servico where id_servico = " + id;
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {

                ts = new TipoServico();

                ts.setNome(retorno.getString("nome"));
                ts.setValor(retorno.getFloat("valor"));
                ts.setId_servico(retorno.getInt("id_servico"));

            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar Tipo Serviço: " + e);

        }
        return ts;
    }

}
