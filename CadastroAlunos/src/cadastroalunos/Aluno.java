package cadastroalunos;

/**
 *
 * @author ander
 */
public class Aluno {

    private String nome;
    private String dataNascimento;
    private Religiao religiao;
    private EstadoCivil estadoCivil;
    private Cidade cidade;

    public Aluno(String nome, String dataNascimento, Religiao religiao, EstadoCivil estadoCivil, Cidade cidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.religiao = religiao;
        this.estadoCivil = estadoCivil;
        this.cidade = cidade;
    }


    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Religiao getReligiao() {
        return religiao;
    }

    public void setReligiao(Religiao religiao) {
        this.religiao = religiao;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
