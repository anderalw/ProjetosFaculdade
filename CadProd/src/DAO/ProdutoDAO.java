/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Produto;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ander
 */
public class ProdutoDAO implements IDAOT<Produto> {

    @Override
    public String salvar(Produto produto) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "insert into produto values (default, '"
                    + produto.getDescricao() + "','"
                    + produto.getValorUnitario() + "','"
                    + produto.getQtdeEstoque() + "')";
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao enserir Produto: " + e);
            return e.toString();
        }
    }

    @Override
    public String atualizar(Produto produto) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "update produto set descricao = '"
                    + produto.getDescricao() + "', valor_unitario = "
                    + produto.getValorUnitario() + ", qtde_estoque = '"
                    + produto.getQtdeEstoque() + "' where id = "
                    + produto.getId();
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar a Fornecedor: " + e);
            return e.toString();
        }
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "delete from produto where id = " + id;
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);

            return null;

        } catch (Exception e) {
            System.out.println("Erro ao excluir o Produto: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Produto> consultarTodos() {
        ArrayList<Produto> produtos = new ArrayList();
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "select * from produto order by id";
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                Produto produto = new Produto();

                produto.setId(retorno.getInt("id"));
                produto.setDescricao(retorno.getString("descricao"));
                produto.setValorUnitario(retorno.getInt("valor_unitario"));
                produto.setQtdeEstoque(retorno.getString("qtde_estoque"));

                produtos.add(produto);
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Produto: " + e);

        }
        return produtos;
    }

    @Override
    public ArrayList<Produto> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto consultarId(int id) {
        Produto produto = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * FROM produto WHERE id = " + id;
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                produto = new Produto();

                produto.setId(retorno.getInt("id"));
                produto.setDescricao(retorno.getString("descricao"));
                produto.setValorUnitario(retorno.getInt("valor_unitario"));
                produto.setQtdeEstoque(retorno.getString("qtde_estoque"));

            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar Produto: " + e);

        }
        return produto;
    }

    public void popularTabela(JTable tabela, String criterio) {

        ResultSet resultadoQ;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Id";
        cabecalho[1] = "Descrição";
        cabecalho[2] = "Valor";
        cabecalho[3] = "Estoque";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM produto "
                    + "WHERE "
                    + "descricao ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][4];

        } catch (Exception e) {
            System.out.println("Erro ao consultar produto: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM produto "
                    + "WHERE "
                    + "descricao ILIKE '%" + criterio + "%' "
                    + "ORDER BY id");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("descricao");
                dadosTabela[lin][2] = resultadoQ.getString("valor_unitario");
                dadosTabela[lin][3] = resultadoQ.getString("qtde_estoque");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite selecao de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
                case 2:
                    column.setPreferredWidth(50);
                    break;
                case 3:
                    column.setPreferredWidth(50);
                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        tabela.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }

}
