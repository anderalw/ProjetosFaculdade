package cadastroalunos;

/**
 *
 * @author ander
 */
public class Cidade {

    private String descricao;
    private String cep;

    public Cidade(String descricao, String cep) {
        this.descricao = descricao;
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
