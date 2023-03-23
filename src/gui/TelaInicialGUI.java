
package gui;

import java.awt.Toolkit;
import table.TableClienteGUI;
import table.TableProdutoGUI;
import table.TableFuncionario;
import gui.ClienteGUI;
import gui.ProdutoGUI;

public class TelaInicialGUI extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicialGUI
     */
    public TelaInicialGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boder1 = new gui.Boder();
        btnEditarProdutos = new javax.swing.JButton();
        btnCadastroProdutos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEditarFunc = new javax.swing.JButton();
        btnCadastroFunc = new javax.swing.JButton();
        btnEditarClientes = new javax.swing.JButton();
        btnCadastroClientes = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 191, 152));

        boder1.setBackground(new java.awt.Color(255, 255, 255));

        btnEditarProdutos.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarProdutos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarProdutos.setText("Consultar");
        btnEditarProdutos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153)));
        btnEditarProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutosActionPerformed(evt);
            }
        });
        boder1.add(btnEditarProdutos);
        btnEditarProdutos.setBounds(400, 410, 120, 40);

        btnCadastroProdutos.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastroProdutos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastroProdutos.setText("Cadastrar");
        btnCadastroProdutos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153)));
        btnCadastroProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutosActionPerformed(evt);
            }
        });
        boder1.add(btnCadastroProdutos);
        btnCadastroProdutos.setBounds(400, 350, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuário.png"))); // NOI18N
        boder1.add(jLabel1);
        jLabel1.setBounds(530, 330, 110, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
        boder1.add(jLabel2);
        jLabel2.setBounds(290, 320, 120, 160);

        btnEditarFunc.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarFunc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarFunc.setText("Historico");
        btnEditarFunc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153)));
        btnEditarFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFuncActionPerformed(evt);
            }
        });
        boder1.add(btnEditarFunc);
        btnEditarFunc.setBounds(160, 410, 120, 40);

        btnCadastroFunc.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastroFunc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastroFunc.setText("Abrir");
        btnCadastroFunc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153)));
        btnCadastroFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastroFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroFuncActionPerformed(evt);
            }
        });
        boder1.add(btnCadastroFunc);
        btnCadastroFunc.setBounds(160, 360, 120, 40);

        btnEditarClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarClientes.setText("Editar");
        btnEditarClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153)));
        btnEditarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClientesActionPerformed(evt);
            }
        });
        boder1.add(btnEditarClientes);
        btnEditarClientes.setBounds(630, 410, 120, 40);

        btnCadastroClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastroClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastroClientes.setText("Cadastrar");
        btnCadastroClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153)));
        btnCadastroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClientesActionPerformed(evt);
            }
        });
        boder1.add(btnCadastroClientes);
        btnCadastroClientes.setBounds(630, 350, 120, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoNav.png"))); // NOI18N
        boder1.add(jLabel5);
        jLabel5.setBounds(220, 80, 430, 210);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Clientes");
        boder1.add(jLabel4);
        jLabel4.setBounds(560, 460, 50, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Caixa");
        boder1.add(jLabel6);
        jLabel6.setBounds(80, 460, 40, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Produtos");
        boder1.add(jLabel7);
        jLabel7.setBounds(310, 460, 60, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho.png"))); // NOI18N
        boder1.add(jLabel8);
        jLabel8.setBounds(50, 340, 120, 120);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(555, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutosActionPerformed
        new TableProdutoGUI().setVisible(true);
    }//GEN-LAST:event_btnEditarProdutosActionPerformed

    private void btnCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdutosActionPerformed
        new ProdutoGUI().setVisible(true);
    }//GEN-LAST:event_btnCadastroProdutosActionPerformed

    private void btnEditarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFuncActionPerformed
        new TableFuncionario().setVisible(true);
    }//GEN-LAST:event_btnEditarFuncActionPerformed

    private void btnCadastroFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroFuncActionPerformed
        new VendaGui().setVisible(true);
    }//GEN-LAST:event_btnCadastroFuncActionPerformed

    private void btnEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClientesActionPerformed
        new TableClienteGUI().setVisible(true);
    }//GEN-LAST:event_btnEditarClientesActionPerformed

    private void btnCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClientesActionPerformed
        new ClienteGUI().setVisible(true);
    }//GEN-LAST:event_btnCadastroClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicialGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.Boder boder1;
    private javax.swing.JButton btnCadastroClientes;
    private javax.swing.JButton btnCadastroFunc;
    private javax.swing.JButton btnCadastroProdutos;
    private javax.swing.JButton btnEditarClientes;
    private javax.swing.JButton btnEditarFunc;
    private javax.swing.JButton btnEditarProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
