package table;

import dao.ProdutoDAO;
import gui.ProdutoGUI;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Produto;


public class TableProdutoGUI extends javax.swing.JFrame {

    public TableProdutoGUI() {
        initComponents();
        leiaJTable();
        this.setLocationRelativeTo(null);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png")).getImage());

    }
    
    public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.setNumRows(0);//evida duplicar os resultadas ao cadastrar um item
        ProdutoDAO dao = new ProdutoDAO();
        for (Produto produto : dao.leitura()) {
            modelo.addRow(new Object[]{
                produto.getIdProduto(),
                produto.getNomeProduto(),
                produto.getValorUnidade(),
                produto.getQuantidade(),
                produto.getBula()});
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boder1 = new gui.Boder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        boder2 = new gui.Boder();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValorUnidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBula = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 191, 152));

        boder1.setBackground(new java.awt.Color(255, 255, 255));

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Produto", "Nome Produto", "Valor Unidade", "Quantidade", "Bula"
            }
        ));
        jtProdutos.getTableHeader().setReorderingAllowed(false);
        jtProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(4).setMinWidth(1);
            jtProdutos.getColumnModel().getColumn(4).setPreferredWidth(1);
            jtProdutos.getColumnModel().getColumn(4).setMaxWidth(1);
        }

        boder1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 770, 500);

        btVoltar.setBackground(new java.awt.Color(1, 72, 45));
        btVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(1, 72, 45));
        btVoltar.setText("Voltar");
        btVoltar.setBorder(null);
        btVoltar.setContentAreaFilled(false);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        boder1.add(btVoltar);
        btVoltar.setBounds(200, 610, 110, 40);

        btExcluir.setBackground(new java.awt.Color(0, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(1, 72, 45));
        btExcluir.setText("Excluir");
        btExcluir.setBorder(null);
        btExcluir.setContentAreaFilled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        boder1.add(btExcluir);
        btExcluir.setBounds(340, 610, 110, 40);

        btAtualizar.setBackground(new java.awt.Color(0, 255, 255));
        btAtualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAtualizar.setForeground(new java.awt.Color(1, 72, 45));
        btAtualizar.setText("Atualizar");
        btAtualizar.setBorder(null);
        btAtualizar.setContentAreaFilled(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        boder1.add(btAtualizar);
        btAtualizar.setBounds(480, 610, 110, 40);

        jLabel7.setBackground(new java.awt.Color(0, 0, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 72, 45));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PRODUTOS");
        boder1.add(jLabel7);
        jLabel7.setBounds(230, 30, 280, 40);

        boder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 72, 45));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRODUTOS");
        boder2.add(jLabel2);
        jLabel2.setBounds(70, 30, 280, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        boder2.add(jLabel3);
        jLabel3.setBounds(30, 110, 60, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Valor da Unidade");
        boder2.add(jLabel4);
        jLabel4.setBounds(30, 200, 170, 22);

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
        txtValorUnidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorUnidadeKeyPressed(evt);
            }
        });
        boder2.add(txtValorUnidade);
        txtValorUnidade.setBounds(30, 230, 230, 30);
        boder2.add(jSeparator1);
        jSeparator1.setBounds(30, 170, 230, 2);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        boder2.add(txtNome);
        txtNome.setBounds(30, 140, 230, 30);
        boder2.add(jSeparator3);
        jSeparator3.setBounds(30, 260, 230, 2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Quantidade");
        boder2.add(jLabel5);
        jLabel5.setBounds(30, 290, 130, 22);
        boder2.add(jSeparator4);
        jSeparator4.setBounds(30, 350, 230, 2);

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
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
        });
        boder2.add(txtQuantidade);
        txtQuantidade.setBounds(30, 320, 230, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("BULA");
        boder2.add(jLabel6);
        jLabel6.setBounds(30, 370, 60, 30);

        txtBula.setColumns(20);
        txtBula.setRows(5);
        jScrollPane2.setViewportView(txtBula);

        boder2.add(jScrollPane2);
        jScrollPane2.setBounds(30, 410, 400, 230);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(boder2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boder2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new ProdutoGUI().setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (jtProdutos.getSelectedRow() != -1) {
            Produto produto = new Produto();
            produto.setIdProduto((int) jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 0)); //somente id
            ProdutoDAO dao = new ProdutoDAO();
            dao.delete(produto);
            leiaJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (jtProdutos.getSelectedRow() != -1) {
            Produto produto = new Produto();
            produto.setIdProduto((int) jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 0));
            
            produto.setNomeProduto(txtNome.getText());
            produto.setValorUnidade(Double.parseDouble(txtValorUnidade.getText()));
            produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()) );
            produto.setBula(txtBula.getText());
            
            if ((txtNome.getText().isEmpty()) || (txtValorUnidade.getText().isEmpty())
                    || (txtQuantidade.getText().isEmpty()) || (txtBula.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {
                ProdutoDAO dao = new ProdutoDAO();
                dao.update(produto);
            }
            txtNome.setText("");
            txtValorUnidade.setText("");
            txtQuantidade.setText("");
            txtBula.setText("");
            leiaJTable();
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void txtValorUnidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorUnidadeMousePressed
        txtValorUnidade.setText("");
    }//GEN-LAST:event_txtValorUnidadeMousePressed

    private void txtValorUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnidadeActionPerformed

    private void txtValorUnidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorUnidadeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtQuantidade.requestFocus();
        }
    }//GEN-LAST:event_txtValorUnidadeKeyPressed

    private void txtNomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMousePressed
        txtNome.setText("");
    }//GEN-LAST:event_txtNomeMousePressed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtValorUnidade.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtQuantidadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantidadeMousePressed
        txtQuantidade.setText("");
    }//GEN-LAST:event_txtQuantidadeMousePressed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtBula.requestFocus();
        }
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void jtProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutosMouseClicked
        if (jtProdutos.getSelectedRow() != -1) {
            txtNome.setText(jtProdutos.getValueAt           (jtProdutos.getSelectedRow(), 1).toString());
            txtValorUnidade.setText(jtProdutos.getValueAt   (jtProdutos.getSelectedRow(), 2).toString());
            txtBula.setText(jtProdutos.getValueAt           (jtProdutos.getSelectedRow(), 4).toString());
            txtQuantidade.setText(jtProdutos.getValueAt     (jtProdutos.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_jtProdutosMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableProdutoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.Boder boder1;
    private gui.Boder boder2;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTextArea txtBula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValorUnidade;
    // End of variables declaration//GEN-END:variables
}
