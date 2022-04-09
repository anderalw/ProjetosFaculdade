package cadastroalunos;

/**
 *
 * @author ander
 */
public class EstadoCivil {

    private String descricao;

    public EstadoCivil(String descricao) {
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
