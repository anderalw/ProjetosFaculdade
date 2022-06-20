/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PetShop;

import Apoio.Conexao;
import java.sql.*;
import Tela.PetShopTela;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class PetShop {

    static Connection conexao = null;

    public static void main(String[] args) {
        if (Conexao.getInstance().getConnection() != null) {
            new PetShopTela().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no Banco de Dados!");
        }
    }
}
