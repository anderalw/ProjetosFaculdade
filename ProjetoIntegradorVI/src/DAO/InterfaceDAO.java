package DAO;

public interface InterfaceDAO<T> {

    public String inserir(T objeto);

    public String alterar(T objeto);

    public String deletar(int id);

}
