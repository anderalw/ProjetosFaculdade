package DAO;

import Entidade.Cliente;
import Apoio.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class ClienteDAO implements InterfaceDAO<Cliente> {

    private Connection conexao;
    private PreparedStatement statment;

    @Override
    public Boolean inserir(Cliente cliente) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "insert into cliente values (default, '"
                    + cliente.getNome() + "','"
                    + cliente.getRua() + "','"
                    + cliente.getBairro() + "','"
                    + cliente.getCep() + "','"
                    + cliente.getNumero() + "','"
                    + cliente.getTelefone() + "')";

            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao inserir Cliente: " + e);
            return false;
        }
    }

    public int buscarUltimoId() {
        int id = 0;
        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select id_cliente from cliente order by id_cliente";
            ResultSet retorno = st.executeQuery(sql);
            System.out.println("SQL: " + sql);
            while (retorno.next()) {

                id = retorno.getInt("id_cliente");
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar cliente: " + e);

        }
        return id;
    }

    @Override
    public Boolean alterar(Cliente cliente) {

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
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a cliente: " + e);
            return false;
        }
    }

    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<Cliente>();

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from cliente order by id_cliente";
            System.out.println("SQL: " + sql);
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
                lista.add(cliente);

            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Cliente: " + e);

        }
        return lista;

    }

    public List<Cliente> listar(JComboBox clientes) {
        List<Cliente> lista = new ArrayList<Cliente>();

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
            System.out.println("SQL: " + sql);
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
    public Boolean deletar(int id) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "delete from cliente where id_cliente=" + id;
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);
            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o Cliente: " + e);
            return false;
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
            System.out.println("Erro ao consultar Cliente: " + e);

        }
        return cliente;

    }

}
