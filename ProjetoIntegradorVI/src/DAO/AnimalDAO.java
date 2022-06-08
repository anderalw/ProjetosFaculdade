package DAO;

import Entidade.Animal;
import Entidade.Cliente;
import Apoio.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AnimalDAO implements InterfaceDAO<Animal> {

    @Override
    public String inserir(Animal animal) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();

            String sql = "insert into animal values (default, '"
                    + animal.getNome() + "','"
                    + animal.getRaca() + "','"
                    + animal.getEspecie() + "','"
                    + animal.getIdade() + "','"
                    + animal.getIdDono() + "','"
                    + animal.getSexo() + "',')";

            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao enserir Animal: " + e);
            return e.toString();
        }
    }

    @Override
    public String alterar(Animal animal) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "update animal set nome = '"
                    + animal.getNome() + "' , raca = '"
                    + animal.getRaca() + "' , sexo =  '"
                    + animal.getSexo() + "' , idade = '"
                    + animal.getIdade() + "'  where id_animal= "
                    + animal.getId();

            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar o Animal: " + e);
            return e.toString();
        }
    }

    public ArrayList<Animal> listar(int idDono) {
        ArrayList<Animal> animais = new ArrayList<Animal>();

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from animal where id_cliente = " 
                    + idDono + " order by id_animal";

            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {
                Animal animal = new Animal();
                animal.setId(retorno.getInt("id_animal"));
                animal.setNome(retorno.getString("nome"));
                animal.setRaca(retorno.getString("raca"));
                animal.setEspecie(retorno.getString("especie"));
                animal.setIdade(retorno.getInt("idade"));
                animal.setIdDono(retorno.getInt("id_cliente"));
                animal.setSexo(retorno.getString("sexo"));

                animais.add(animal);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Animais: " + e);

        }
        return animais;

    }

    public Cliente buscarODono(int idAnimal) {
        Cliente cliente = new Cliente();

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select id_cliente from animal where id_animal = " + idAnimal;

            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {
                cliente.setId(retorno.getInt("id_cliente"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Animal: " + e);

        }
        return cliente;
    }

    public Animal buscarUm(int id) {
        Animal animal = null;

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from animal where id_animal = " + id;
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {

                animal = new Animal();
                animal.setId(retorno.getInt("id_animal"));
                animal.setNome(retorno.getString("nome"));
                animal.setRaca(retorno.getString("raca"));
                animal.setEspecie(retorno.getString("especie"));
                animal.setIdade(retorno.getInt("idade"));
                animal.setIdDono(retorno.getInt("id_cliente"));
                animal.setSexo(retorno.getString("sexo"));

            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Animal: " + e);

        }
        return animal;
    }

    public String deletar(int id) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();

            String sql = "delete from animal where id_animal = " + id;
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o Animal: " + e);
            return e.toString();
        }

    }

    public String detelarTodos(int idDono) {

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "delete from animal where id_cliente = " + idDono;
            String comando = "DELETE animal, cliente from animal "
                    + "INNER JOIN cliente on cliente.id_cliente = animal.id_cliente "
                    + "WHERE animal.id_cliente = " + idDono;
            int retorno = st.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println("Erro ao excluir o Animal: " + e);
            return e.toString();
        }
        return null;

    }

    public ArrayList<Animal> listarTodos() {
        ArrayList<Animal> lista = new ArrayList();

        try {
            Statement st = Conexao.getInstance().getConnection().createStatement();
            String sql = "select * from animal order by nome";
            ResultSet retorno = st.executeQuery(sql);
            while (retorno.next()) {
                Animal animal = new Animal();
                animal.setId(retorno.getInt("id_animal"));
                animal.setNome(retorno.getString("nome"));
                animal.setRaca(retorno.getString("raca"));
                animal.setEspecie(retorno.getString("especie"));
                animal.setIdade(retorno.getInt("idade"));
                animal.setIdDono(retorno.getInt("id_cliente"));
                animal.setSexo(retorno.getString("sexo"));

                lista.add(animal);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Animal: " + e);

        }
        return lista;

    }

}
