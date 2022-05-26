/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Fornecedor;
import entidade.Produto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ander
 */
public class ProdutoDAO implements IDAOT<Produto> {

    @Override
    public String salvar(Produto o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "insert into produto values (default, '"
                    + o.getDescricao() + "','"
                    + o.getValorUnitario() + "','"
                    + o.getQtdeEstoque() + "')";
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao enserir Produto: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Produto o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "update produto set descricao = '"
                    + o.getDescricao() + "', valor_unitario = "
                    + o.getValorUnitario() + ", qtde_estoque = '"
                    + o.getQtdeEstoque() + "' where id = "
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

            String sql = "delete from produto where id = " + id;
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o Produto: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Produto> consultarTodos() {
        ArrayList<Produto> produtos = new ArrayList();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select * from produto order by id";
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Produto produto = new Produto();

                produto.setId(retorno.getInt("id"));
                produto.setDescricao(retorno.getString("descricao"));
                produto.setValorUnitario(retorno.getInt("valor_unitario"));
                produto.setQtdeEstoque(retorno.getString("qtde_estoque"));

                produtos.add(produto);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Produto: " + e);

        }
        return produtos;
    }

    @Override
    public ArrayList<Produto> consultar(String criterio) {
        ArrayList<Produto> produtos = new ArrayList();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM produto WHERE descricao ILIKE '%" + criterio + "%'";
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Produto produto = new Produto();

                produto.setId(retorno.getInt("id"));
                produto.setDescricao(retorno.getString("descricao"));
                produto.setValorUnitario(retorno.getInt("valor_unitario"));
                produto.setQtdeEstoque(retorno.getString("qtde_estoque"));

                produtos.add(produto);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Produto: " + e);

        }
        return produtos;
    }

    @Override
    public Produto consultarId(int id) {
        Produto produto = null;
       try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM produto WHERE id = " + id;
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                produto = new Produto();

                produto.setId(retorno.getInt("id"));
                produto.setDescricao(retorno.getString("descricao"));
                produto.setValorUnitario(retorno.getInt("valor_unitario"));
                produto.setQtdeEstoque(retorno.getString("qtde_estoque"));


            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Produto: " + e);

        }
        return produto;
    }

}
