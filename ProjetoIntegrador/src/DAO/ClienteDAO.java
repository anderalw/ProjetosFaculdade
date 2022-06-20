package DAO;

import Entidade.Cliente;
import Apoio.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class ClienteDAO implements InterfaceDAO<Cliente> {

    private Connection conexao;
    private PreparedStatement statment;

    @Override
    public String inserir(Cliente cliente) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "insert into cliente values (default,  + '"
                    + cliente.getNome() + "','"
                    + cliente.getRua() + "','"
                    + cliente.getTelefone() + "','"
                    + cliente.getBairro() + "','"
                    + cliente.getCep() + "','"
                    + cliente.getNumero() + "',')";

            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao enserir Cliente: " + e);
            return e.toString();
        }
    }

    public int buscarUltimoId() {
        int id = 0;
        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select id_cliente from cliente order by id_cliente";
            this.statment = conexao.prepareStatement(sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {

                id = retorno.getInt("id_cliente");
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar cliente: " + e);

        }
        return id;
    }

    @Override
    public String alterar(Cliente cliente) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "update cliente set nome = '"
                    + cliente.getNome() + "' , rua = '"
                    + cliente.getRua() + "' , telefone =  '"
                    + cliente.getTelefone() + "' , bairro = '"
                    + cliente.getBairro() + "' , cep = '"
                    + cliente.getCep() + "' , numero = '"
                    + cliente.getNumero() + "'  where id_cliente= "
                    + cliente.getId();

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a cliente: " + e);
            return e.toString();
        }
    }

    public ArrayList<Cliente> listar() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from cliente order by id_cliente";
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {

                Cliente cliente = new Cliente();
                cliente.setNome(retorno.getString("nome"));
                cliente.setRua(retorno.getString("rua"));
                cliente.setBairro(retorno.getString("bairro"));
                cliente.setCep(retorno.getString("cep"));
                cliente.setNumero(retorno.getInt("numero"));
                cliente.setTelefone(retorno.getString("telefone"));
                cliente.setId(retorno.getInt("id_cliente"));
                clientes.add(cliente);

            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Fornecedores: " + e);

        }
        return clientes;

    }

    public ArrayList<Cliente> listar(JComboBox clientes) {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();

        Cliente clienteDefault = new Cliente();
        clienteDefault.setNome("Default");
        clienteDefault.setRua("default");
        clienteDefault.setBairro("default");
        clienteDefault.setCep("default");
        clienteDefault.setNumero(0);
        clienteDefault.setTelefone("default");
        clienteDefault.setId(0);
        lista.add(clienteDefault);

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from cliente order by nome";
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {

                clientes.addItem(retorno.getString("nome"));

                Cliente cliente = new Cliente();
                cliente.setNome(retorno.getString("nome"));
                cliente.setRua(retorno.getString("rua"));
                cliente.setBairro(retorno.getString("bairro"));
                cliente.setCep(retorno.getString("cep"));
                cliente.setNumero(retorno.getInt("numero"));
                cliente.setTelefone(retorno.getString("telefone"));
                cliente.setId(retorno.getInt("id_cliente"));
                lista.add(cliente);

            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar clientes: " + e);

        }
        return lista;
    }

    @Override
    public String deletar(int id) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "delete from cliente where id_cliente=" + id;
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);
            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o Fornecedor: " + e);
            return e.toString();
        }
    }

    public Cliente buscarCliente(int id) {
        Cliente cliente = null;
        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from cliente where id_cliente= " + id;
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {

                cliente = new Cliente();
                cliente.setNome(retorno.getString("nome"));
                cliente.setRua(retorno.getString("rua"));
                cliente.setBairro(retorno.getString("bairro"));
                cliente.setCep(retorno.getString("cep"));
                cliente.setNumero(retorno.getInt("numero"));
                cliente.setTelefone(retorno.getString("telefone"));
                cliente.setId(retorno.getInt("id_cliente"));

            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar fornecedores: " + e);

        }
        return cliente;

    }

}
