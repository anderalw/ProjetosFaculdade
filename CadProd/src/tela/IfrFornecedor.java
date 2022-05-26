/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tela;

import DAO.FornecedorDAO;
import apoio.Formatacao;
import apoio.Validacao;
import entidade.Fornecedor;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author ander
 */
public class IfrFornecedor extends javax.swing.JInternalFrame {

    int idFornecedor = 0;
    
    Validacao val = new Validacao();

    /**
     * Creates new form IfrCliente
     */
    public IfrFornecedor() {
        initComponents();
        
        Formatacao.formatarCnpj(ftfCnpj);
        Formatacao.formatarTelefone(ftfTel);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedor = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txfPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        txEmail = new javax.swing.JTextField();
        ftfCnpj = new javax.swing.JFormattedTextField();
        ftfTel = new javax.swing.JFormattedTextField();
        btFechar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setTitle("Cadastro: Fornecedor");

        tblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "E-mail", "Telefone", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFornecedor);
        if (tblFornecedor.getColumnModel().getColumnCount() > 0) {
            tblFornecedor.getColumnModel().getColumn(0).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(1).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(2).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(3).setResizable(false);
            tblFornecedor.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel5.setText("Pesquisar");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Listagem", jPanel1);

        jLabel1.setText("Nome");

        jLabel2.setText("E-mail");

        jLabel3.setText("Telefone");

        jLabel4.setText("CNPJ");

        ftfCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftfCnpjFocusLost(evt);
            }
        });

        ftfTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftfTelFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(txNome, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                            .addComponent(ftfCnpj)
                            .addComponent(ftfTel))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ftfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manutenção", jPanel2);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btFechar)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFechar)
                    .addComponent(btSalvar)
                    .addComponent(btConsultar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String nomeForn = txNome.getText();
        String emailForn = txEmail.getText();
        String telForn = ftfTel.getText();
        String cnpjForn = ftfCnpj.getText();

        
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setId(idFornecedor);
        fornecedor.setNome(nomeForn);
        fornecedor.setEmail(emailForn);
        fornecedor.setTelefone(telForn);
        fornecedor.setCnpj(cnpjForn);

        FornecedorDAO fornecedorDAO = new FornecedorDAO();

        if (idFornecedor == 0) {
            if (fornecedorDAO.salvar(fornecedor) == null) {
                txNome.setText("");
                txEmail.setText("");
                ftfTel.setText("");
                ftfCnpj.setText("");
                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                txNome.requestFocus();
                btConsultarActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar registro!");
            }
        } else {
            if (fornecedorDAO.atualizar(fornecedor) == null) {
                txNome.setText("");
                txEmail.setText("");
                ftfTel.setText("");
                ftfCnpj.setText("");
                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                txNome.requestFocus();
                btConsultarActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar registro!");
            }
        }
        idFornecedor = 0;

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        ArrayList<Fornecedor> fornecedores = new ArrayList();

        fornecedores = new FornecedorDAO().consultarTodos();

        DefaultTableModel model = (DefaultTableModel) tblFornecedor.getModel();
        model.setRowCount(0);

        for (int i = 0; i < fornecedores.size(); i++) {
            Object rowData[] = new Object[5];
            rowData[0] = fornecedores.get(i).getId();
            rowData[1] = fornecedores.get(i).getNome();
            rowData[2] = fornecedores.get(i).getEmail();
            rowData[3] = fornecedores.get(i).getTelefone();
            rowData[4] = fornecedores.get(i).getCnpj();
            model.addRow(rowData);
        }
        TableColumnModel columnModel = tblFornecedor.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        ArrayList<Fornecedor> fornecedores = new ArrayList();

        fornecedores = new FornecedorDAO().consultar(txfPesquisar.getText());

        DefaultTableModel model = (DefaultTableModel) tblFornecedor.getModel();
        model.setRowCount(0);

        for (int i = 0; i < fornecedores.size(); i++) {
            Object rowData[] = new Object[5];
            rowData[0] = fornecedores.get(i).getId();
            rowData[1] = fornecedores.get(i).getNome();
            rowData[2] = fornecedores.get(i).getEmail();
            rowData[3] = fornecedores.get(i).getTelefone();
            rowData[4] = fornecedores.get(i).getCnpj();
            model.addRow(rowData);
        }
        TableColumnModel columnModel = tblFornecedor.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String idTabela = String.valueOf(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 0));

        idFornecedor = Integer.parseInt(idTabela);

        Fornecedor fornecedor = new FornecedorDAO().consultarId(idFornecedor);

        if (fornecedor != null) {
            jTabbedPane1.setSelectedIndex(1);
            txNome.setText(fornecedor.getNome());
            txEmail.setText(fornecedor.getEmail());
            ftfTel.setText(fornecedor.getTelefone());
            ftfCnpj.setText(fornecedor.getCnpj());
            txNome.requestFocus();
            btConsultarActionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Id da cidade não encontrado!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String idTabela = String.valueOf(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 0));

        idFornecedor = Integer.parseInt(idTabela);

        if (new FornecedorDAO().excluir(idFornecedor) == null) {
            JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
            btConsultarActionPerformed(evt);

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluír registro!");
        }
        idFornecedor = 0;
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void ftfCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftfCnpjFocusLost
        
        if (!Validacao.validarCNPJ(Formatacao.removerFormatacao(ftfCnpj.getText()))) {
            ftfCnpj.setBackground(Color.YELLOW);
        } else {
            ftfCnpj.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_ftfCnpjFocusLost

    private void ftfTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftfTelFocusLost
        if (!Validacao.validarTelefone(ftfTel.getText())) {
            ftfTel.setBackground(Color.YELLOW);
        } else {
            ftfTel.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_ftfTelFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JFormattedTextField ftfCnpj;
    private javax.swing.JFormattedTextField ftfTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblFornecedor;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txfPesquisar;
    // End of variables declaration//GEN-END:variables
}
