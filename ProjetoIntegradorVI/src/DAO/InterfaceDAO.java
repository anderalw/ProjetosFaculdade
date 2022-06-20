package DAO;

public interface InterfaceDAO<T> {

    public Boolean inserir(T objeto);

    public Boolean alterar(T objeto);

    public Boolean deletar(int id);

}
