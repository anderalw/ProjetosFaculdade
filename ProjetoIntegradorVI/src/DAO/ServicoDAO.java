package DAO;

import Entidade.Servico;
import Apoio.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServicoDAO implements InterfaceDAO<Servico> {

    @Override
    public Boolean inserir(Servico servico) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "insert into participa values (default, '"
                    + servico.getData() + "','"
                    + servico.getHorario() + "','"
                    + servico.getPrecoServico()+ "','"
                    + servico.getCusto()+ "','"
                    + servico.getId_animal() + "','"
                    + servico.getNomeAnimal() + "','"
                    + servico.getNomeDonoAnimal() + "','"
                    + servico.getId_tipoServico() + "','"
                    + servico.getNomeServico() + "','"
                    + servico.isFinalizado() + "')";

            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);
            return true;

        } catch (Exception e) {
            System.out.println("Erro ao inserir Cliente: " + e);
            return false;
        }
    }

    @Override
    public Boolean alterar(Servico servico) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "update participa set nomeservico = '"
                    + servico.getNomeServico() + "', nomeanimal = '"
                    + servico.getNomeAnimal() + "', data = '"
                    + servico.getData() + "', horario = '"
                    + servico.getHorario() + " where id_participa= "
                    + servico.getId();

            int retorno = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a Serviço: " + e);
            return false;
        }
    }

    public List<Servico> listar() {

        List<Servico> lista = new ArrayList<Servico>();

        ResultSet rs;

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from participa order by id_participa";
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {

                Servico servico = new Servico();
                servico.setId(retorno.getInt("id_participa"));
                servico.setData(retorno.getString("data"));
                servico.setHorario(retorno.getString("horario"));
                servico.setPrecoServico(retorno.getFloat("precoservico"));
                servico.setCusto(retorno.getFloat("custo"));
                servico.setId_animal(retorno.getInt("id_animal"));
                servico.setNomeAnimal(retorno.getString("nomeanimal"));
                servico.setNomeDonoAnimal(retorno.getString("nomedono"));
                servico.setId_tipoServico(retorno.getInt("id_tiposervico"));
                servico.setNomeServico(retorno.getString("nomeservico"));
                servico.setFinalizado(retorno.getBoolean("finalizado"));

                lista.add(servico);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Serviço: " + e);

        }
        return lista;

    }

    public Servico listarUm(int idServico) {

        Servico servico = new Servico();

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from participa where id_participa = "
                    + idServico + "order by id_participa";
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {

                servico.setId(retorno.getInt("id_participa"));
                servico.setData(retorno.getString("data"));
                servico.setHorario(retorno.getString("horario"));
                servico.setCusto(retorno.getInt("custo"));
                servico.setId_animal(retorno.getInt("id_animal"));
                servico.setNomeAnimal(retorno.getString("nomeanimal"));
                servico.setNomeDonoAnimal(retorno.getString("nomedono"));
                servico.setId_tipoServico(retorno.getInt("id_tiposervico"));
                servico.setNomeServico(retorno.getString("nomeservico"));
                servico.setFinalizado(retorno.getBoolean("finalizado"));

            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar Serviço: " + e);

        }
        return servico;

    }

    @Override
    public Boolean deletar(int id) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "delete from participa where id_participa = " + id;
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o Serviço: " + e);
            return false;
        }
    }

    public void finalizarServico(int id) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "update participa set finalizado = " + true + " where id_participa=  " + id;

            int retorno = st.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a Serviço: " + e);
        }
    }

    public boolean verificaFinalizacao(int id) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select finalizado from participa where id_participa = " + id;
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {

                if (retorno.getBoolean("finalizado") == false) {
                    return true;
                } else {
                    return false;
                }

            }

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a Serviço: " + e);

        }
        return false;

    }
}
