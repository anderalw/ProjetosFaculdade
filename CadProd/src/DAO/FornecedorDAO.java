/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Fornecedor;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ander
 */
public class FornecedorDAO implements IDAOT<Fornecedor> {

    @Override
    public String salvar(Fornecedor o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "insert into fornecedor values (default, '"
                    + o.getNome() + "','"
                    + o.getEmail() + "','"
                    + o.getTelefone() + "','"
                    + o.getCnpj() + "')";
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao enserir Fornecedor: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Fornecedor o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "update fornecedor set nome = '" + o.getNome() + "', email = '"
                    + o.getEmail() + "', telefone = '"
                    + o.getTelefone() + "', cnpj ='"
                    + o.getCnpj() + "' where id = "
                    + o.getId();
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a Fornecedor: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "delete from fornecedor where id = " + id;
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o Fornecedor: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Fornecedor> consultarTodos() {
        ArrayList<Fornecedor> fornecedores = new ArrayList();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select * from fornecedor order by id";
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setId(retorno.getInt("id"));
                fornecedor.setNome(retorno.getString("nome"));
                fornecedor.setEmail(retorno.getString("email"));
                fornecedor.setTelefone(retorno.getString("telefone"));
                fornecedor.setCnpj(retorno.getString("cnpj"));

                fornecedores.add(fornecedor);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Fornecedores: " + e);

        }
        return fornecedores;
    }

    @Override
    public ArrayList<Fornecedor> consultar(String criterio) {
        ArrayList<Fornecedor> fornecedores = new ArrayList();

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "SELECT * FROM fornecedor WHERE nome ILIKE '%" + criterio + "%'";
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setId(retorno.getInt("id"));
                fornecedor.setNome(retorno.getString("nome"));
                fornecedor.setEmail(retorno.getString("email"));
                fornecedor.setTelefone(retorno.getString("telefone"));
                fornecedor.setCnpj(retorno.getString("cnpj"));

                fornecedores.add(fornecedor);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar fornecedores" + e);
        }
        return fornecedores;
    }

    @Override
    public Fornecedor consultarId(int id) {
        Fornecedor fornecedor = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select * from fornecedor where id = " + id;
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                fornecedor = new Fornecedor();

                fornecedor.setId(retorno.getInt("id"));
                fornecedor.setNome(retorno.getString("nome"));
                fornecedor.setEmail(retorno.getString("email"));
                fornecedor.setTelefone(retorno.getString("telefone"));
                fornecedor.setCnpj(retorno.getString("cnpj"));

            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar fornecedores: " + e);

        }
        return fornecedor;
    }

}
