
package gui;

import table.TableProduto;
import dao.ProdutoDAO;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.Produto;

public class ProdutoGUI extends javax.swing.JFrame {
    
    double valorT = 0;
    
    
    public void Calculo(){
        double valorU = Double.parseDouble(txtValorUnidade.getText());
        double quantidadeProduto = Integer.parseInt( txtQuantidade.getText());
        if (valorU != 0){
            valorU = valorU * quantidadeProduto;
            valorT = valorU + valorT;
            
            double valorTDouble = valorT;
                    String ValorTString = String.valueOf(valorTDouble);
                    txtValorEstoque.setText(ValorTString);
                    
            
            
        }
        
    }
   

    public ProdutoGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        Calculo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boder2 = new gui.Boder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtValorUnidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtFornecedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtQuantidade = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtValorEstoque = new javax.swing.JTextField();

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
        jLabel3.setText("Valor da Unidade");
        boder2.add(jLabel3);
        jLabel3.setBounds(30, 300, 170, 22);

        txtValorUnidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorUnidade.setBorder(null);
        txtValorUnidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtValorUnidadeMousePressed(evt);
            }
        });
        txtValorUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnidadeActionPerformed(evt);
            }
        });
        boder2.add(txtValorUnidade);
        txtValorUnidade.setBounds(30, 330, 230, 30);
        boder2.add(jSeparator1);
        jSeparator1.setBounds(30, 170, 230, 2);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.setText("Digite o nome do medicamento");
        txtNome.setBorder(null);
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomeMousePressed(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        boder2.add(txtNome);
        txtNome.setBounds(30, 140, 230, 30);
        boder2.add(jSeparator2);
        jSeparator2.setBounds(30, 270, 230, 2);

        txtFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFornecedor.setText("Digite o nome do fornecedor");
        txtFornecedor.setBorder(null);
        txtFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFornecedorMousePressed(evt);
            }
        });
        txtFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornecedorActionPerformed(evt);
            }
        });
        boder2.add(txtFornecedor);
        txtFornecedor.setBounds(30, 240, 230, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fornecedor:");
        boder2.add(jLabel4);
        jLabel4.setBounds(30, 210, 110, 22);
        boder2.add(jSeparator3);
        jSeparator3.setBounds(30, 360, 230, 2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Quantidade");
        boder2.add(jLabel5);
        jLabel5.setBounds(30, 390, 130, 22);
        boder2.add(jSeparator4);
        jSeparator4.setBounds(30, 450, 230, 2);

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuantidade.setBorder(null);
        txtQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtQuantidadeMousePressed(evt);
            }
        });
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        boder2.add(txtQuantidade);
        txtQuantidade.setBounds(30, 420, 230, 30);

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
        jLabel6.setText("Valor Estoque");
        boder2.add(jLabel6);
        jLabel6.setBounds(30, 470, 130, 22);
        boder2.add(jSeparator5);
        jSeparator5.setBounds(30, 530, 230, 2);

        txtValorEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtValorEstoque.setText("Valor Estoque");
        txtValorEstoque.setBorder(null);
        txtValorEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtValorEstoqueMousePressed(evt);
            }
        });
        txtValorEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorEstoqueActionPerformed(evt);
            }
        });
        boder2.add(txtValorEstoque);
        txtValorEstoque.setBounds(30, 500, 230, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(boder2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
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
        txtNome.setText        ("Digite o nome do medicamento");
        txtFornecedor.setText  ("Digite o nome do fornecedor");
        txtValorUnidade.setText("");
        txtQuantidade.setText  ("");
        txtValorEstoque.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Produto produto = new Produto();
        produto.setNome        (txtNome.getText());
        produto.setFornecedores(txtFornecedor.getText());
        produto.setValorEstoque(Double.parseDouble(txtValorUnidade.getText()));
        produto.setQuantidade  (Integer.parseInt(txtQuantidade.getText()));
        produto.setValorEstoque(Double.parseDouble(txtValorEstoque.getText()));

        if (   (txtNome.getText().isEmpty())         || (txtFornecedor.getText().isEmpty())
            || (txtValorUnidade.getText().isEmpty()) || (txtQuantidade.getText().isEmpty())
            || (txtValorEstoque.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }  else {
            // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
            ProdutoDAO dao = new ProdutoDAO();
            dao.adiciona(produto);
            JOptionPane.showMessageDialog(null, "produto " + txtNome.getText() + " insirido com sucesso! ");
        }
        txtNome.setText        ("Digite o nome do medicamento");
        txtFornecedor.setText  ("Digite o nome do fornecedor");
        txtValorUnidade.setText("");
        txtQuantidade.setText  ("");
        txtValorEstoque.setText("Valor Estoque");
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        new TableProduto().setVisible(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtQuantidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantidadeMousePressed
        txtQuantidade.setText("");
    }//GEN-LAST:event_txtQuantidadeMousePressed

    private void txtFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornecedorActionPerformed

    private void txtFornecedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFornecedorMousePressed
        txtFornecedor.setText("");
    }//GEN-LAST:event_txtFornecedorMousePressed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMousePressed
        txtNome.setText("");
    }//GEN-LAST:event_txtNomeMousePressed

    private void txtValorUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnidadeActionPerformed

    private void txtValorUnidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorUnidadeMousePressed
        txtValorUnidade.setText("");
    }//GEN-LAST:event_txtValorUnidadeMousePressed

    private void txtValorEstoqueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorEstoqueMousePressed
        txtValorEstoque.setText("");
    }//GEN-LAST:event_txtValorEstoqueMousePressed

    private void txtValorEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorEstoqueActionPerformed
        
    }//GEN-LAST:event_txtValorEstoqueActionPerformed

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
                new ProdutoGUI().setVisible(true);
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
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorEstoque;
    private javax.swing.JTextField txtValorUnidade;
    // End of variables declaration//GEN-END:variables
}
