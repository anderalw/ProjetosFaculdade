/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tela;

import DAO.CompraDAO;
import DAO.ItemCompraDAO;
import apoio.Formatacao;
import apoio.IItemPesquisa;
import entidade.Compra;
import entidade.ItemCompra;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class IfrCompra extends javax.swing.JInternalFrame implements IItemPesquisa {

    int idCompra = 0;
    double total = 0.0;

    /**
     * Creates new form IfrCompra
     */
    public IfrCompra() {
        initComponents();

        tffDataCom.setText(Formatacao.getDataAtual());

        tfdIdForn.setEditable(false);
        tfdNomeForn.setEditable(false);
        tfdTotal.setEditable(false);

        tfdIdProd.setEditable(false);
        tfdProd.setEditable(false);
        tfdValor.setEditable(false);

        btnLocalizarProd.setEnabled(false);
        btnRemover.setEnabled(false);
        btnInserir.setEnabled(false);
        Formatacao.formatarData(tfDtinicio);
        Formatacao.formatarData(tfDtFim);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        btnPes = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfDtinicio = new javax.swing.JFormattedTextField();
        tfDtFim = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tffDataCom = new javax.swing.JFormattedTextField();
        tfdQtde = new javax.swing.JTextField();
        tfdNomeForn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfdIdForn = new javax.swing.JTextField();
        btnLocalizarForn = new javax.swing.JButton();
        btnCriar = new javax.swing.JButton();
        tfdTotal = new javax.swing.JTextField();
        tfdProd = new javax.swing.JTextField();
        btnLocalizarProd = new javax.swing.JButton();
        tfdValor = new javax.swing.JTextField();
        tfdIdProd = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompra = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblLista);

        btnPes.setText("Pesquisar");
        btnPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel6.setText("Data início");

        jLabel7.setText("Data fim");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(tfDtFim)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfDtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfDtFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnPes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Listagem", jPanel1);

        jLabel2.setText("Fornecedor");

        jLabel4.setText("Quantidade");

        tffDataCom.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("TOTAL");

        btnLocalizarForn.setText("Localizar");
        btnLocalizarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarFornActionPerformed(evt);
            }
        });

        btnCriar.setText("Criar");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        tfdTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfdTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnLocalizarProd.setText("Localizar");
        btnLocalizarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarProdActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel1.setText("Data");

        jLabel3.setText("Produto");

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        tblCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "ID Produto", "Descrição", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCompra);
        if (tblCompra.getColumnModel().getColumnCount() > 0) {
            tblCompra.getColumnModel().getColumn(0).setResizable(false);
            tblCompra.getColumnModel().getColumn(1).setResizable(false);
            tblCompra.getColumnModel().getColumn(2).setResizable(false);
            tblCompra.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tfdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(btnCriar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(405, 405, 405)
                                    .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLocalizarProd))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(tfdIdForn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfdNomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tffDataCom, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addComponent(btnLocalizarForn))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfdQtde, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(tfdIdProd))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(297, 297, 297)
                                    .addComponent(btnInserir)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnRemover))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tffDataCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdIdForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdNomeForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizarForn))
                .addGap(18, 18, 18)
                .addComponent(btnCriar)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizarProd))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfdQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInserir)
                        .addComponent(btnRemover))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manutenção", jPanel2);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocalizarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarProdActionPerformed
        new DlgLocalizar(null, true, this, "produto").setVisible(true);    }//GEN-LAST:event_btnLocalizarProdActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        ItemCompra itemCompra = new ItemCompra();

        itemCompra.setCompraId(idCompra);
        itemCompra.setProdutoId(Integer.parseInt(tfdIdProd.getText()));
        itemCompra.setQntde(Double.parseDouble(tfdQtde.getText()));
        itemCompra.setValor(Double.parseDouble(tfdValor.getText()));

        if (new ItemCompraDAO().salvar(itemCompra) == null) {
            JOptionPane.showMessageDialog(null, "Item inserido.");

            new ItemCompraDAO().popularTabela(tblCompra, "", idCompra);

            total += (itemCompra.getValor() * itemCompra.getQntde());

            tfdTotal.setText(String.valueOf(total));

            tfdIdProd.setText("");
            tfdProd.setText("");
            tfdValor.setText("");
            tfdQtde.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Erro na inserção.");
        }

    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (tblCompra.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro.");
        } else {
            int idItCom = Integer.parseInt(String.valueOf(tblCompra.getValueAt(tblCompra.getSelectedRow(), 0)));

            System.out.println("ItCom: " + idItCom);

            String retorno = new ItemCompraDAO().excluir(idItCom);

            if (retorno == null) {
                JOptionPane.showMessageDialog(null, "Registro remvodio.");

                double qtde = Double.parseDouble(String.valueOf(tblCompra.getValueAt(tblCompra.getSelectedRow(), 3)));
                double valor = Double.parseDouble(String.valueOf(tblCompra.getValueAt(tblCompra.getSelectedRow(), 4)));

                total -= (qtde * valor);

                tfdTotal.setText(String.valueOf(total));

                new ItemCompraDAO().popularTabela(tblCompra, "", idCompra);
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Problemas ao remover registro.\n\n" + retorno);
            }
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnLocalizarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarFornActionPerformed
        new DlgLocalizar(null, true, this, "fornecedor").setVisible(true);
    }//GEN-LAST:event_btnLocalizarFornActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        Compra Compra = new Compra();

        Compra.setData(tffDataCom.getText());
        Compra.setFornecedorId(Integer.parseInt(tfdIdForn.getText()));

        String retorno = new CompraDAO().salvar(Compra);

        System.out.println("Id Compra retorno: " + retorno);

        if (!retorno.contains("ERROR")) {
            idCompra = Integer.parseInt(retorno);

            btnCriar.setEnabled(false);
            btnLocalizarProd.setEnabled(true);
            btnRemover.setEnabled(true);
            btnInserir.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao criar Compra: " + retorno);
        }
    }

    @Override
    public void definirValor(String[] valores, String itemPesquisa) {
        if (itemPesquisa.equalsIgnoreCase("fornecedor")) {
            tfdIdForn.setText(valores[0]);
            tfdNomeForn.setText(valores[1]);
        } else if (itemPesquisa.equalsIgnoreCase("produto")) {
            tfdIdProd.setText(valores[0]);
            tfdProd.setText(valores[1]);
            tfdValor.setText(valores[2]);

        }

    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesActionPerformed
        new CompraDAO().popularTabela(tblLista, tfDtinicio.getText(), tfDtFim.getText());
    }//GEN-LAST:event_btnPesActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         if (tblLista.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro.");
        } else {
            idCompra = Integer.parseInt(String.valueOf(tblLista.getValueAt(tblLista.getSelectedRow(), 0)));

            System.out.println("OSIt: " + idCompra);

            jTabbedPane1.setSelectedIndex(1);

            tffDataCom.setText(String.valueOf(tblLista.getValueAt(tblLista.getSelectedRow(), 1)));
            tfdIdForn.setText(String.valueOf(tblLista.getValueAt(tblLista.getSelectedRow(), 2)));
            tfdNomeForn.setText(String.valueOf(tblLista.getValueAt(tblLista.getSelectedRow(), 3)));
            tfdTotal.setText(String.valueOf(tblLista.getValueAt(tblLista.getSelectedRow(), 4)));

            total = Double.parseDouble(String.valueOf(tblLista.getValueAt(tblLista.getSelectedRow(), 4)));
            
            new ItemCompraDAO().popularTabela(tblCompra, "", idCompra);

            btnCriar.setEnabled(false);
            btnLocalizarForn.setEnabled(false);
            btnLocalizarProd.setEnabled(true);
            btnRemover.setEnabled(true);
            btnInserir.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLocalizarForn;
    private javax.swing.JButton btnLocalizarProd;
    private javax.swing.JButton btnPes;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblCompra;
    private javax.swing.JTable tblLista;
    private javax.swing.JFormattedTextField tfDtFim;
    private javax.swing.JFormattedTextField tfDtinicio;
    private javax.swing.JTextField tfdIdForn;
    private javax.swing.JTextField tfdIdProd;
    private javax.swing.JTextField tfdNomeForn;
    private javax.swing.JTextField tfdProd;
    private javax.swing.JTextField tfdQtde;
    private javax.swing.JTextField tfdTotal;
    private javax.swing.JTextField tfdValor;
    private javax.swing.JFormattedTextField tffDataCom;
    // End of variables declaration//GEN-END:variables

}
