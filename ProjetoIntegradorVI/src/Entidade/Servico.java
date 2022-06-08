package Entidade;

public class Servico {

    private int id;
    private float custo;
    private float precoServico;
    private String horario;
    private String data;
    private int id_animal;
    private String nomeAnimal;
    private String nomeDonoAnimal;
    private int id_tipoServico;
    private String nomeServico;
    private boolean finalizado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(float precoServico) {
        this.precoServico = precoServico;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public int getId_tipoServico() {
        return id_tipoServico;
    }

    public void setId_tipoServico(int id_tipoServico) {
        this.id_tipoServico = id_tipoServico;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeDonoAnimal() {
        return nomeDonoAnimal;
    }

    public void setNomeDonoAnimal(String donoAnimal) {
        this.nomeDonoAnimal = donoAnimal;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

}
