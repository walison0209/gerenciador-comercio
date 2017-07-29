package br.com.walison.lucros.visao.cadastros;

import br.com.walison.lucros.classes.Janela;
import br.com.walison.lucros.classes.Conexao;
import br.com.walison.lucros.classes.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Walison Cecílio
 */
public class JCadastroFornecedor extends javax.swing.JPanel {

    /**
     * Creates new form JCadastroProduto
     */
    public JCadastroFornecedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        camadaCadastroFornecedor = new javax.swing.JLayeredPane();
        jLabel14 = new javax.swing.JLabel();
        lNomCadFor = new javax.swing.JLabel();
        lCnpjCadFor = new javax.swing.JLabel();
        lTelCadFor = new javax.swing.JLabel();
        lEmailCadFor = new javax.swing.JLabel();
        cTelCadFor = new javax.swing.JFormattedTextField();
        cCnpjCadFor = new javax.swing.JFormattedTextField();
        cEmailCadFor = new javax.swing.JTextField();
        cNomCadFor = new javax.swing.JTextField();
        bCadCadFor = new javax.swing.JButton();
        bLimCadFor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        jLabel14.setText("CADASTRO DE FORNECEDOR");

        lNomCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        lNomCadFor.setText("NOME:  *");

        lCnpjCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        lCnpjCadFor.setText("CNPJ:");

        lTelCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        lTelCadFor.setText("TELEFONE: ");

        lEmailCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        lEmailCadFor.setText("EMAIL:  ");

        try {
            cTelCadFor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cTelCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        cTelCadFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTelCadForActionPerformed(evt);
            }
        });
        cTelCadFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cTelCadForKeyPressed(evt);
            }
        });

        try {
            cCnpjCadFor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cCnpjCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        cEmailCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        cNomCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N

        bCadCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        bCadCadFor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        bCadCadFor.setToolTipText("Cadastrar Fornecedor");
        bCadCadFor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bCadCadFor.setBorderPainted(false);
        bCadCadFor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCadCadForMouseClicked(evt);
            }
        });

        bLimCadFor.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        bLimCadFor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lixeira.png"))); // NOI18N
        bLimCadFor.setToolTipText("Limpar Camos");
        bLimCadFor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bLimCadFor.setBorderPainted(false);
        bLimCadFor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bLimCadForMouseClicked(evt);
            }
        });
        bLimCadFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimCadForActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        jLabel10.setText("CAMPOS CONTENDO * SÃO OBRIGATÓTIOS");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        jButton1.setToolTipText("Voltar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        camadaCadastroFornecedor.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(lNomCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(lCnpjCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(lTelCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(lEmailCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(cTelCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(cCnpjCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(cEmailCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(cNomCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(bCadCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(bLimCadFor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        camadaCadastroFornecedor.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout camadaCadastroFornecedorLayout = new javax.swing.GroupLayout(camadaCadastroFornecedor);
        camadaCadastroFornecedor.setLayout(camadaCadastroFornecedorLayout);
        camadaCadastroFornecedorLayout.setHorizontalGroup(
            camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, camadaCadastroFornecedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(camadaCadastroFornecedorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(157, 157, 157)
                .addComponent(bCadCadFor)
                .addGap(88, 88, 88)
                .addComponent(bLimCadFor)
                .addGap(97, 97, 97)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(camadaCadastroFornecedorLayout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(camadaCadastroFornecedorLayout.createSequentialGroup()
                        .addComponent(lNomCadFor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNomCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, camadaCadastroFornecedorLayout.createSequentialGroup()
                        .addComponent(lEmailCadFor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cEmailCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(camadaCadastroFornecedorLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lCnpjCadFor))
                    .addComponent(lTelCadFor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cTelCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCnpjCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        camadaCadastroFornecedorLayout.setVerticalGroup(
            camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(camadaCadastroFornecedorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel14)
                .addGap(85, 85, 85)
                .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(camadaCadastroFornecedorLayout.createSequentialGroup()
                        .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNomCadFor)
                            .addComponent(cNomCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lEmailCadFor)
                            .addComponent(cEmailCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(camadaCadastroFornecedorLayout.createSequentialGroup()
                        .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cCnpjCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCnpjCadFor))
                        .addGap(83, 83, 83)
                        .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cTelCadFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lTelCadFor))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(camadaCadastroFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCadCadFor)
                            .addComponent(bLimCadFor))
                        .addComponent(jButton1)))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1062, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(camadaCadastroFornecedor)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(camadaCadastroFornecedor)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cTelCadForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTelCadForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTelCadForActionPerformed

    private void cTelCadForKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTelCadForKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cTelCadForKeyPressed

    private void bCadCadForMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadCadForMouseClicked
        try {
            this.cadastroFornecedor();
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCadCadForMouseClicked

    private void bLimCadForMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLimCadForMouseClicked
        this.cCnpjCadFor.setText("");
        this.cTelCadFor.setText("");
        this.cEmailCadFor.setText("");
        this.cNomCadFor.setText("");
    }//GEN-LAST:event_bLimCadForMouseClicked

    private void bLimCadForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimCadForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLimCadForActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            this.j.voltar();
        } catch (SQLException ex) {
            Logger.getLogger(JCadastroFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadCadFor;
    private javax.swing.JButton bLimCadFor;
    private javax.swing.JFormattedTextField cCnpjCadFor;
    private javax.swing.JTextField cEmailCadFor;
    private javax.swing.JTextField cNomCadFor;
    private javax.swing.JFormattedTextField cTelCadFor;
    private javax.swing.JLayeredPane camadaCadastroFornecedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel lCnpjCadFor;
    private javax.swing.JLabel lEmailCadFor;
    private javax.swing.JLabel lNomCadFor;
    private javax.swing.JLabel lTelCadFor;
    // End of variables declaration//GEN-END:variables
    private Mensagem mensagem = new Mensagem();
    private Janela j;

    private void cadastroFornecedor() throws SQLException {
        if(this.cNomCadFor.getText().equals("")){
            this.mensagem.msg();
        }else{
            String sql = "INSERT INTO fornecedores (nom_for, cnpj_for, tel_for, email_for) VALUES (?, ?, ?, ?)";
            
            Connection conexao = new Conexao().getConexao(); 
            PreparedStatement stmt = conexao.prepareStatement(sql); 
            try {
                this.preparaStatement(stmt);
                stmt.execute();
                conexao.commit();
                this.mensagem.msg("Fornecedor cadastrado com sucesso!!");
                this.limparCampos();
            } catch (SQLException ex) {
                this.mensagem.msg("Não foi possivel cadastrar fornecedor!!");                
                conexao.rollback();
                Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                stmt.close();
                conexao.close();
            }
        }
    }
    
    private void preparaStatement(PreparedStatement stmt) throws SQLException{
        stmt.setString(1, this.cNomCadFor.getText().toUpperCase());
        stmt.setString(2, this.cCnpjCadFor.getText().toUpperCase());
        stmt.setString(3, this.cTelCadFor.getText().toUpperCase());
        stmt.setString(4, this.cEmailCadFor.getText().toUpperCase()); 
    }
    
    private void limparCampos(){
        this.cCnpjCadFor.setText("");
        this.cTelCadFor.setText("");
        this.cEmailCadFor.setText("");
        this.cNomCadFor.setText("");
    }
    
    /**
     * @param j the j to set
     */
    public void setJ(Janela j) {
        this.j = j;
    }

    /**
     * @return the j
     */
    public Janela getJ() {
        return j;
    }
}
