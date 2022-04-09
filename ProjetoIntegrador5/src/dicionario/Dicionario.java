package dicionario;

public class Dicionario {

    private int codigo;
    private String termo;
    private String significado;
    private String fonte;

    public Dicionario(int codigo, String termo, String significado, String fonte) {
        this.codigo = codigo;
        this.termo = termo;
        this.significado = significado;
        this.fonte = fonte;
    }

    public Dicionario() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

}
