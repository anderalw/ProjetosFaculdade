package Controle;

import Entidade.Cliente;
import DAO.ClienteDAO;
import java.util.List;
import javax.swing.JComboBox;

public class ClienteControle {

    private ClienteDAO clienteDAO;

    public ClienteControle() {
        this.clienteDAO = new ClienteDAO();
    }

    public Boolean inserir(Cliente cliente) {
        return this.clienteDAO.inserir(cliente);
    }

    public void alterar(Cliente cliente) {
        this.clienteDAO.alterar(cliente);
    }

    public List<Cliente> listar() {
        List<Cliente> lista = this.clienteDAO.listar();
        return lista;
    }

    public List<Cliente> listar(JComboBox clientes) {
        List<Cliente> lista = this.clienteDAO.listar(clientes);
        return lista;
    }

    public void deletar(int id) {
        this.clienteDAO.deletar(id);
    }

    public int buscarUltimoId() {
        return this.clienteDAO.buscarUltimoId();
    }

    public Cliente buscarUm(int id) {
        Cliente cliente = new Cliente();
        cliente = clienteDAO.buscarCliente(id);
        return cliente;

    }
}
