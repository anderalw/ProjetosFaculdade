package auldadeclasses;

public class Item {

    private int codItem;
    private TipoItem tipo;

    public TipoItem getTipo() {
        return tipo;
    }
    private int qtd;

    public void Usar() {

    }

    public int getCodItem() {
        return codItem;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

}
