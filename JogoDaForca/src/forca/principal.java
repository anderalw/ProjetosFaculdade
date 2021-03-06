package forca;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class principal extends javax.swing.JFrame {

    String PalavraSorteada = new String();
    ArrayList Tentativas = new ArrayList();
    ArrayList PalavrasArquivo = new ArrayList();
    ArrayList DicasArquivo = new ArrayList();

    int MaxTentativas = 6;
    int NumTentativas = 0;
    boolean FimDoJogo = true;
    ImageIcon icon0 = new ImageIcon("forca00.jpg");
    ImageIcon icon1 = new ImageIcon("forca11.jpg");
    ImageIcon icon2 = new ImageIcon("forca22.jpg");
    ImageIcon icon3 = new ImageIcon("forca33.jpg");
    ImageIcon icon4 = new ImageIcon("forca44.jpg");
    ImageIcon icon5 = new ImageIcon("forca55.jpg");
    ImageIcon icon6 = new ImageIcon("forca66.jpg");

    @Override
    public Image createImage(int width, int height) {
        return super.createImage(width, height);
    }

    /**
     * Creates new form principal
     */
    public principal() {

        initComponents();

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        joga_nov = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jogo_novo = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        deseja_sair = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        btnao = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btsim = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LabelImagem = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        PalavraForca = new javax.swing.JTextField();
        lblDigite = new javax.swing.JLabel();
        CampoTentar = new javax.swing.JTextField();
        btVerifica = new javax.swing.JButton();
        TxtDica = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        BtSair = new javax.swing.JButton();
        BtCad = new javax.swing.JButton();
        BtSairMain = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Voc?? ganhou. Quer jogar novamente?");

        jButton1.setText("Sim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("N??o");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addGap(34, 34, 34))
                        .addComponent(jLabel1))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout joga_novLayout = new javax.swing.GroupLayout(joga_nov.getContentPane());
        joga_nov.getContentPane().setLayout(joga_novLayout);
        joga_novLayout.setHorizontalGroup(
            joga_novLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joga_novLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        joga_novLayout.setVerticalGroup(
            joga_novLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joga_novLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jogo_novo.setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setText("Sim");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Voc?? perdeu. Jogar novamente?");

        jButton4.setText("N??o");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(16, 16, 16))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jButton3))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(24, 24, 24))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton3)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jogo_novoLayout = new javax.swing.GroupLayout(jogo_novo.getContentPane());
        jogo_novo.getContentPane().setLayout(jogo_novoLayout);
        jogo_novoLayout.setHorizontalGroup(
            jogo_novoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogo_novoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo_novoLayout.setVerticalGroup(
            jogo_novoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogo_novoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        deseja_sair.setBounds(new java.awt.Rectangle(300, 300, 330, 200));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnao.setText("N??o");
        btnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Deseja mesmo sair?");

        btsim.setText("Sim");
        btsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btsim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(btnao)
                .addGap(15, 15, 15))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel4)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnao)
                    .addComponent(btsim))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jLabel4)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout deseja_sairLayout = new javax.swing.GroupLayout(deseja_sair.getContentPane());
        deseja_sair.getContentPane().setLayout(deseja_sairLayout);
        deseja_sairLayout.setHorizontalGroup(
            deseja_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deseja_sairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deseja_sairLayout.setVerticalGroup(
            deseja_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deseja_sairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Forca - Enforcado");

        jLabel2.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jogo da Forca");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forca/forca00.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PalavraForca.setEditable(false);
        PalavraForca.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        PalavraForca.setEnabled(false);

        lblDigite.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        lblDigite.setText("Digite uma letra:");
        lblDigite.setEnabled(false);

        CampoTentar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        CampoTentar.setEnabled(false);

        btVerifica.setText("Verificar");
        btVerifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerificaActionPerformed(evt);
            }
        });

        TxtDica.setEditable(false);
        TxtDica.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        TxtDica.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PalavraForca, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblDigite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoTentar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVerifica)
                        .addGap(14, 14, 14)
                        .addComponent(TxtDica, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtDica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDigite)
                        .addComponent(CampoTentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btVerifica)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PalavraForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtSair.setText("Iniciar Jogo");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        BtCad.setText("Cadastrar Palavra");
        BtCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadActionPerformed(evt);
            }
        });

        BtSairMain.setText("Sair");
        BtSairMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtSair)
                .addGap(59, 59, 59)
                .addComponent(BtCad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtSairMain)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSairMain)
                    .addComponent(BtSair)
                    .addComponent(BtCad))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PalavraForca.setText("");
        Tentativas.clear();
        sortearpalavra();
        FimDoJogo = false;
        LabelImagem.setIcon(icon0);
        NumTentativas = 0;
        desenharpalavra(false);
        joga_nov.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PalavraForca.setText("");
        Tentativas.clear();
        sortearpalavra();
        FimDoJogo = false;
        LabelImagem.setIcon(icon0);
        NumTentativas = 0;
        desenharpalavra(false);
        jogo_novo.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsimActionPerformed

    private void btnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaoActionPerformed
        deseja_sair.setVisible(false);
    }//GEN-LAST:event_btnaoActionPerformed

    private void BtSairMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairMainActionPerformed
        deseja_sair.setLocationRelativeTo(null);
        deseja_sair.setVisible(true);
    }//GEN-LAST:event_BtSairMainActionPerformed

    private void BtCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadActionPerformed
        Cadastro cadastro = new Cadastro();
        cadastro.show();
    }//GEN-LAST:event_BtCadActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        lblDigite.enable(true);
        CampoTentar.enable(true);

        TxtDica.enable(true);
        PalavraForca.enable(true);

        PalavraForca.setText("");
        Tentativas.clear();
        sortearpalavra();
        FimDoJogo = false;
        LabelImagem.setIcon(icon0);
        NumTentativas = 0;
        desenharpalavra(false);
    }//GEN-LAST:event_BtSairActionPerformed

    private void btVerificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerificaActionPerformed
        if (!FimDoJogo) {
            tentarletra(CampoTentar.getText());
            CampoTentar.setText("");
            CampoTentar.requestFocus();
        }
    }//GEN-LAST:event_btVerificaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCad;
    private javax.swing.JButton BtSair;
    private javax.swing.JButton BtSairMain;
    private javax.swing.JTextField CampoTentar;
    private javax.swing.JLabel LabelImagem;
    private javax.swing.JTextField PalavraForca;
    private javax.swing.JTextField TxtDica;
    private javax.swing.JButton btVerifica;
    private javax.swing.JButton btnao;
    private javax.swing.JButton btsim;
    private javax.swing.JDialog deseja_sair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JDialog joga_nov;
    private javax.swing.JDialog jogo_novo;
    private javax.swing.JLabel lblDigite;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("empty-statement")
    public void sortearpalavra() {
        try {
            File Arquivo = new File("Palavras.txt");
            FileReader leitor = new FileReader(Arquivo);
            BufferedReader leitorBuf = new BufferedReader(leitor);
            PalavrasArquivo.clear();
            DicasArquivo.clear();

            String linha = null;

            while ((linha = leitorBuf.readLine()) != null) {
                String colunas[] = linha.split(";");
                PalavrasArquivo.add(colunas[0]);
                DicasArquivo.add(colunas[1]);
            }

            leitorBuf.close();

            int TotalPalavras = PalavrasArquivo.size();
            int CodPalavraSorteada = (int) (Math.random() * (TotalPalavras));
            PalavraSorteada = (String) PalavrasArquivo.get(CodPalavraSorteada);
            PalavraSorteada = PalavraSorteada.toUpperCase();
            TxtDica.setText("DICA: " + (String) DicasArquivo.get(CodPalavraSorteada));
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.toString());
        };
    }

    public void desenharpalavra(boolean MostrarTodaAPalavra) {
        String tempTexto = new String();
        boolean faltauma = false;
        for (int n = 1; n <= PalavraSorteada.length(); n++) {
            if ((MostrarTodaAPalavra) || (Tentativas.contains(PalavraSorteada.substring(n - 1, n)))) {
                tempTexto = tempTexto + PalavraSorteada.substring(n - 1, n);
            } else {
                tempTexto = tempTexto + "_";
                faltauma = true;
            }
            tempTexto = tempTexto + " ";
        }

        PalavraForca.setText(tempTexto);

        if (!faltauma) {
            FimDoJogo = true;
            if ((NumTentativas) < 6) {
                joga_nov.pack();
                joga_nov.setLocationRelativeTo(null);
                joga_nov.setVisible(true);
            }

        }
    }

    public void tentarletra(String Letra) {
        Letra = Letra.toUpperCase();
        if (Tentativas.contains(Letra)) {

        } else {

            Tentativas.add(Letra);
            if (PalavraSorteada.contains(Letra)) {

                desenharpalavra(false);
            } else {
                NumTentativas = NumTentativas + 1;
                switch (NumTentativas) {
                    case (1): {
                        LabelImagem.setIcon(icon1);
                        break;
                    }
                    case (2): {
                        LabelImagem.setIcon(icon2);
                        break;
                    }
                    case (3): {
                        LabelImagem.setIcon(icon3);
                        break;
                    }
                    case (4): {
                        LabelImagem.setIcon(icon4);
                        break;
                    }
                    case (5): {
                        LabelImagem.setIcon(icon5);
                        break;
                    }
                    case (6): {
                        LabelImagem.setIcon(icon6);
                        FimDoJogo = true;
                        desenharpalavra(true);
                        FimDoJogo = true;
                        jogo_novo.pack();
                        jogo_novo.setLocationRelativeTo(null);
                        jogo_novo.setVisible(true);
                        break;
                    }
                }
            }
        }
    }
}
