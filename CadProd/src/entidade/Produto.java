/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidade;

/**
 *
 * @author ander
 */
public class Produto {
    
    private int id;
    private String descricao;
    private float valorUnitario;
    private String qtdeEstoque;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(String qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }
    
}
