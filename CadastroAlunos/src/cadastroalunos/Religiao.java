package cadastroalunos;

/**
 *
 * @author ander
 */
public class Religiao {

    private String descricao;

    public Religiao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

}
