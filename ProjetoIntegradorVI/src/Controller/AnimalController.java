package Controller;

import Entidade.Animal;
import Entidade.Cliente;
import DAO.AnimalDAO;
import java.util.List;

public class AnimalController {

    private final AnimalDAO animalDAO;

    public AnimalController() {
        this.animalDAO = new AnimalDAO();
    }

    public void inserir(Animal animal) {
        this.animalDAO.inserir(animal);

    }

    public void alterar(Animal animal) {
        this.animalDAO.alterar(animal);
    }

    public List<Animal> listar(int idDono) {
        List<Animal> lista = this.animalDAO.listar(idDono);
        return lista;
    }

    public Animal buscarUm(int id) {
        Animal animal = animalDAO.buscarUm(id);
        return animal;
    }

    public String deletar(int id) {
        return this.animalDAO.deletar(id);

    }

    public String deletarTodos(int idDono) {
        return this.animalDAO.detelarTodos(idDono);
    }

    public List<Animal> listarTodos() {
        return this.animalDAO.listarTodos();
    }

    public Cliente buscarODono(int idAnimal) {
        return this.animalDAO.buscarODono(idAnimal);
    }

}
