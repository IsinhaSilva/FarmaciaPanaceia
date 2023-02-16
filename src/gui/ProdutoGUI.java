
package gui;

import table.TableProduto;
import dao.ProdutoDAO;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.Produto;

public class ProdutoGUI extends javax.swing.JFrame {

    public ProdutoGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boder2 = new gui.Boder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNomeMed = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtFornec = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtValorEstoq = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 192, 128));

        boder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 72, 45));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUTOS");
        boder2.add(jLabel1);
        jLabel1.setBounds(70, 30, 280, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        boder2.add(jLabel2);
        jLabel2.setBounds(30, 110, 60, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Preço:");
        boder2.add(jLabel3);
        jLabel3.setBounds(30, 300, 130, 22);

        txtPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPreco.setText("Preço");
        txtPreco.setBorder(null);
        txtPreco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecoMousePressed(evt);
            }
        });
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        boder2.add(txtPreco);
        txtPreco.setBounds(30, 330, 230, 30);
        boder2.add(jSeparator1);
        jSeparator1.setBounds(30, 170, 230, 2);

        txtNomeMed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeMed.setText("Digite o nome do medicamento");
        txtNomeMed.setBorder(null);
        txtNomeMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomeMedMousePressed(evt);
            }
        });
        txtNomeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMedActionPerformed(evt);
            }
        });
        boder2.add(txtNomeMed);
        txtNomeMed.setBounds(30, 140, 230, 30);
        boder2.add(jSeparator2);
        jSeparator2.setBounds(30, 270, 230, 2);

        txtFornec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFornec.setText("Digite o nome do fornecedor");
        txtFornec.setBorder(null);
        txtFornec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFornecMousePressed(evt);
            }
        });
        txtFornec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornecActionPerformed(evt);
            }
        });
        boder2.add(txtFornec);
        txtFornec.setBounds(30, 240, 230, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fornecedor:");
        boder2.add(jLabel4);
        jLabel4.setBounds(30, 210, 110, 22);
        boder2.add(jSeparator3);
        jSeparator3.setBounds(30, 360, 230, 2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Valor Estoque");
        boder2.add(jLabel5);
        jLabel5.setBounds(30, 390, 130, 22);
        boder2.add(jSeparator4);
        jSeparator4.setBounds(30, 450, 230, 2);

        txtValorEstoq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorEstoq.setText("Valor Estoque");
        txtValorEstoq.setBorder(null);
        txtValorEstoq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtValorEstoqMousePressed(evt);
            }
        });
        txtValorEstoq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorEstoqActionPerformed(evt);
            }
        });
        boder2.add(txtValorEstoq);
        txtValorEstoq.setBounds(30, 420, 230, 30);

        btEditar.setBackground(new java.awt.Color(0, 52, 39));
        btEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEditar.setForeground(new java.awt.Color(0, 52, 39));
        btEditar.setText("Editar");
        btEditar.setContentAreaFilled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        boder2.add(btEditar);
        btEditar.setBounds(270, 560, 110, 40);

        btCadastrar.setBackground(new java.awt.Color(0, 52, 39));
        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(0, 52, 39));
        btCadastrar.setText("Cadastrar");
        btCadastrar.setContentAreaFilled(false);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        boder2.add(btCadastrar);
        btCadastrar.setBounds(50, 560, 110, 40);

        btLimpar.setBackground(new java.awt.Color(0, 52, 39));
        btLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(0, 52, 39));
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        boder2.add(btLimpar);
        btLimpar.setBounds(160, 560, 110, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Codigo funcionario:");
        boder2.add(jLabel6);
        jLabel6.setBounds(30, 470, 160, 22);
        boder2.add(jSeparator5);
        jSeparator5.setBounds(30, 530, 230, 2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(boder2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(boder2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtNomeMed.setText("Digite o nome do medicamento");
        txtFornec.setText("Digite o nome do fornecedor");
        txtPreco.setText("Preço");
        txtValorEstoq.setText("Valor Estoque");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Produto produto = new Produto();
        produto.setNome(txtNomeMed.getText());
        produto.setFornecedores(txtFornec.getText());
        produto.setPrecos(Double.parseDouble(txtPreco.getText()));
        produto.setValorEstoque(Double.parseDouble(txtValorEstoq.getText()));

        if ((txtNomeMed.getText().isEmpty()) || (txtFornec.getText().isEmpty())
            || (txtPreco.getText().isEmpty()) || (txtValorEstoq.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }  else {
            // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
            ProdutoDAO dao = new ProdutoDAO();
            dao.adiciona(produto);
            JOptionPane.showMessageDialog(null, "produto " + txtNomeMed.getText() + " insirido com sucesso! ");
        }
        txtNomeMed.setText("Digite o nome do medicamento");
        txtFornec.setText("Digite o nome do fornecedor");
        txtPreco.setText("Preço");
        txtValorEstoq.setText("Valor Estoque");
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        new TableProduto().setVisible(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void txtValorEstoqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorEstoqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorEstoqActionPerformed

    private void txtValorEstoqMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorEstoqMousePressed
        txtValorEstoq.setText("");
    }//GEN-LAST:event_txtValorEstoqMousePressed

    private void txtFornecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornecActionPerformed

    private void txtFornecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFornecMousePressed
        txtFornec.setText("");
    }//GEN-LAST:event_txtFornecMousePressed

    private void txtNomeMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeMedActionPerformed

    private void txtNomeMedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMedMousePressed
        txtNomeMed.setText("");
    }//GEN-LAST:event_txtNomeMedMousePressed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtPrecoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecoMousePressed
        txtPreco.setText("");
    }//GEN-LAST:event_txtPrecoMousePressed

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
            java.util.logging.Logger.getLogger(ProdutoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoDAO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.Boder boder2;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtFornec;
    private javax.swing.JTextField txtNomeMed;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtValorEstoq;
    // End of variables declaration//GEN-END:variables
}
