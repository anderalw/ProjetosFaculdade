/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Cliente;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ander
 */
public class ClienteDAO implements IDAOT<Cliente> {

    @Override
    public String salvar(Cliente o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = " with first_insert as (insert into cliente values (default, '"
                    + o.getNome() + "','"
                    + o.getEmail() + "','"
                    + o.getCpf() + "','"
                    + o.getTelefone() + "') RETURNING id),"
                    + "second_insert as (insert into endereco values (default, '"
                    + o.getEndereco() + "','" + o.getCep() + "') RETURNING id)"
                    + "insert into cliente_endereco values (default, (select id from first_insert), (select id from second_insert))";

            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao enserir Cliente: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Cliente o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "update cliente set "
                    + "nome = '" + o.getNome() + "', "
                    + "email = '" + o.getEmail() + "', "
                    + "telefone = '" + o.getTelefone() + "', "
                    + "cpf = '" + o.getCpf() + "' "
                    + "where id = " + o.getId();

            String sql2 = "update endereco set "
                    + "descricao = '" + o.getEndereco() + "', "
                    + "cep = '" + o.getCep() + "' where id = (select e.id from cliente c "
                    + "inner join cliente_endereco ce  on ce.cliente_id = c.id "
                    + "inner join endereco e on ce.endereco_id = e.id "
                    + "where c.id = " + o.getId() + " ) ";

            System.out.println("SQL: " + sql + "\nSQL: " + sql2);
            int retorno = st.executeUpdate(sql);
            int retorno2 = st.executeUpdate(sql2);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a Cliente: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql3 = "delete from cliente_endereco where id = (select e.id from cliente c "
                    + "inner join cliente_endereco ce  on ce.cliente_id = c.id "
                    + "inner join endereco e on ce.endereco_id = e.id "
                    + "where c.id = " + id + " ) ";
            int retorno3 = st.executeUpdate(sql3);

            String sql2 = "delete from endereco where id = (select e.id from cliente c "
                    + "inner join cliente_endereco ce  on ce.cliente_id = c.id "
                    + "inner join endereco e on ce.endereco_id = e.id "
                    + "where c.id = " + id + " ) ";
            int retorno2 = st.executeUpdate(sql2);
            
            String sql = "delete from cliente where id = " + id;
            int retorno = st.executeUpdate(sql);

            System.out.println("SQL: " + sql + "\nSQL: " + sql2 + "\nSQL: " + sql3);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o Cliente: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Cliente> consultarTodos() {
        ArrayList<Cliente> clientes = new ArrayList();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select c.* , e.descricao, e.cep from cliente c "
                    + "inner join cliente_endereco ce  on ce.cliente_id = c.id  "
                    + "inner join endereco e on ce.endereco_id = e.id ";
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Cliente cliente = new Cliente();

                cliente.setId(retorno.getInt("id"));
                cliente.setNome(retorno.getString("nome"));
                cliente.setEmail(retorno.getString("email"));
                cliente.setTelefone(retorno.getString("telefone"));
                cliente.setCpf(retorno.getString("cpf"));
                cliente.setEndereco(retorno.getString("descricao"));
                cliente.setCep(retorno.getString("cep"));

                clientes.add(cliente);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Cliente: " + e);

        }
        return clientes;
    }

    @Override
    public ArrayList<Cliente> consultar(String criterio) {
        ArrayList<Cliente> clientes = new ArrayList();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select c.* , e.descricao, e.cep from cliente c "
                    + "inner join cliente_endereco ce  on ce.cliente_id = c.id  "
                    + "inner join endereco e on ce.endereco_id = e.id where c.nome ilike '%" + criterio + "%'";
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Cliente cliente = new Cliente();

                cliente.setId(retorno.getInt("id"));
                cliente.setNome(retorno.getString("nome"));
                cliente.setEmail(retorno.getString("email"));
                cliente.setTelefone(retorno.getString("telefone"));
                cliente.setCpf(retorno.getString("cpf"));
                cliente.setEndereco(retorno.getString("descricao"));
                cliente.setCep(retorno.getString("cep"));

                clientes.add(cliente);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Cliente: " + e);

        }
        return clientes;
    }

    @Override
    public Cliente consultarId(int id) {
        Cliente cliente = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select c.* , e.descricao, e.cep from cliente c "
                    + "inner join cliente_endereco ce  on ce.cliente_id = c.id  "
                    + "inner join endereco e on ce.endereco_id = e.id where c.id =" + id;
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                cliente = new Cliente();

                cliente.setId(retorno.getInt("id"));
                cliente.setNome(retorno.getString("nome"));
                cliente.setEmail(retorno.getString("email"));
                cliente.setTelefone(retorno.getString("telefone"));
                cliente.setCpf(retorno.getString("cpf"));
                cliente.setEndereco(retorno.getString("descricao"));
                cliente.setCep(retorno.getString("cep"));

            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Cliente: " + e);

        }
        return cliente;
    }

}
