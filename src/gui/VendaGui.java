package gui;

import dao.ClienteDAO;
import dao.ProdutoDAO;
import dao.VendaDAO;
import factory.ConnectionFactory;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Venda;

public class VendaGui extends javax.swing.JFrame {

    double valorT = 0;
    
    public VendaGui() {
        initComponents();
        valoresComboxCliente();
        valoresComboxProduto();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boder1 = new gui.Boder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbNomeCliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txfIdCliente = new javax.swing.JTextField();
        cbProdutos = new javax.swing.JComboBox<>();
        txfIdProduto = new javax.swing.JTextField();
        txfQuantidade = new javax.swing.JTextField();
        txfValorU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        somar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txfValorTotal = new javax.swing.JTextField();
        formatDataVenda = new javax.swing.JFormattedTextField();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        jbCancel = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        confirmarCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 191, 152));

        boder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 72, 45));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAIXA");
        boder1.add(jLabel1);
        jLabel1.setBounds(410, 30, 280, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("VALOR DO PRODUTO");
        boder1.add(jLabel2);
        jLabel2.setBounds(70, 530, 150, 17);

        cbNomeCliente.setBackground(new java.awt.Color(3, 191, 152));
        cbNomeCliente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbNomeCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o cliente" }));
        cbNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeClienteActionPerformed(evt);
            }
        });
        boder1.add(cbNomeCliente);
        cbNomeCliente.setBounds(160, 180, 280, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("                   CLIENTES");
        boder1.add(jLabel3);
        jLabel3.setBounds(70, 130, 380, 29);

        txfIdCliente.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfIdCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfIdCliente.setPreferredSize(new java.awt.Dimension(64, 64));
        txfIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdClienteActionPerformed(evt);
            }
        });
        boder1.add(txfIdCliente);
        txfIdCliente.setBounds(80, 180, 64, 50);

        cbProdutos.setBackground(new java.awt.Color(3, 191, 152));
        cbProdutos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o produto" }));
        cbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutosActionPerformed(evt);
            }
        });
        boder1.add(cbProdutos);
        cbProdutos.setBounds(160, 300, 280, 50);

        txfIdProduto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfIdProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfIdProduto.setPreferredSize(new java.awt.Dimension(64, 64));
        txfIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdProdutoActionPerformed(evt);
            }
        });
        boder1.add(txfIdProduto);
        txfIdProduto.setBounds(80, 300, 64, 50);

        txfQuantidade.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfQuantidadeActionPerformed(evt);
            }
        });
        boder1.add(txfQuantidade);
        txfQuantidade.setBounds(70, 460, 370, 40);

        txfValorU.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfValorU.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfValorU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfValorU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfValorUActionPerformed(evt);
            }
        });
        boder1.add(txfValorU);
        txfValorU.setBounds(70, 550, 370, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("                 PRODUTOS");
        boder1.add(jLabel4);
        jLabel4.setBounds(80, 260, 360, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("QUANTIDADE DO PRODUTO");
        boder1.add(jLabel5);
        jLabel5.setBounds(70, 440, 196, 17);

        somar1.setBackground(new java.awt.Color(102, 255, 102));
        somar1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        somar1.setText("Somar");
        somar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somar1ActionPerformed(evt);
            }
        });
        boder1.add(somar1);
        somar1.setBounds(570, 430, 103, 37);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho caixa gui.png"))); // NOI18N
        boder1.add(jLabel6);
        jLabel6.setBounds(620, 110, 280, 250);

        txfValorTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfValorTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfValorTotalActionPerformed(evt);
            }
        });
        boder1.add(txfValorTotal);
        txfValorTotal.setBounds(570, 510, 430, 40);

        try {
            formatDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formatDataVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formatDataVenda.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boder1.add(formatDataVenda);
        formatDataVenda.setBounds(930, 80, 100, 34);

        cbFormaPagamento.setBackground(new java.awt.Color(3, 191, 152));
        cbFormaPagamento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de crédito", "Cartão de débito", "Dinheiro vivo", "Cheque a vista", "Cheque a prazo", "A prazo no carnê" }));
        cbFormaPagamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        boder1.add(cbFormaPagamento);
        cbFormaPagamento.setBounds(770, 430, 224, 36);

        jbCancel.setBackground(new java.awt.Color(255, 51, 51));
        jbCancel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbCancel.setText("Cancelar");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });
        boder1.add(jbCancel);
        jbCancel.setBounds(300, 720, 129, 37);

        apagar.setBackground(new java.awt.Color(255, 255, 51));
        apagar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        apagar.setText("Apagar");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });
        boder1.add(apagar);
        apagar.setBounds(690, 720, 109, 37);

        confirmarCompra.setBackground(new java.awt.Color(0, 204, 204));
        confirmarCompra.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        confirmarCompra.setText("Confirmar");
        confirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarCompraActionPerformed(evt);
            }
        });
        boder1.add(confirmarCompra);
        confirmarCompra.setBounds(490, 720, 137, 37);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 1084, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cbNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNomeClienteActionPerformed

    private void txfIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdClienteActionPerformed

    private void txfIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdProdutoActionPerformed

    private void txfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfQuantidadeActionPerformed

    private void txfValorUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfValorUActionPerformed

    private void somar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somar1ActionPerformed
        //Puxando o valor das caixa
        double valorU = Double.parseDouble(txfValorU.getText());

        double quantidade = Double.parseDouble(txfQuantidade.getText());

        //Somando o valor da Unidade com o Total
        valorU = quantidade * valorU;
        valorT = valorU + valorT;
        
        //Transferindo o resultado para texto
        double valorTDouble = valorT;
        String ValorTString = String.valueOf(valorTDouble);
        txfValorTotal.setText(ValorTString);

        //Apagando texto ruim
        cbProdutos.setSelectedItem(0);
        txfValorU.setText("");
        txfQuantidade.setText("");
        txfIdProduto.setText("");
    }//GEN-LAST:event_somar1ActionPerformed

    private void txfValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfValorTotalActionPerformed

    
    public void valoresComboxCliente() {
        Vector<Integer> idProduto = new Vector<Integer>();
        try {
            java.sql.Connection connection = new ConnectionFactory().getConnection();
            ClienteDAO clienteDAO = new ClienteDAO();
            connection = new ConnectionFactory().getConnection();
            ResultSet rs = clienteDAO.listarCliente();

            while (rs.next()) {
                idProduto.addElement(rs.getInt(1));
                cbNomeCliente.addItem(rs.getString(2));
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no cliente GUI");
        }
    }
    
    public void valoresComboxProduto() {
        Vector<Integer> idProduto = new Vector<Integer>();
        try {
            java.sql.Connection connection = new ConnectionFactory().getConnection();
            ProdutoDAO produtoDAO = new ProdutoDAO();
            connection = new ConnectionFactory().getConnection();
            ResultSet rs = produtoDAO.listarProduto();

            while (rs.next()) {
                idProduto.addElement(rs.getInt(1));
                cbProdutos.addItem(rs.getString(2));
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no produto GUI");
        }
    }
    
    
    
    
    
    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        txfValorU.setText("");
        txfQuantidade.setText("");
        formatDataVenda.setText("");
        txfIdProduto.setText("");
        cbNomeCliente.setSelectedItem(0);
        txfValorTotal.setText("");
    }//GEN-LAST:event_jbCancelActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed

        txfValorU.setText("");
        txfQuantidade.setText("");
        formatDataVenda.setText("");
        txfIdProduto.setText("");
        txfIdCliente.setText("");
        cbNomeCliente.setSelectedItem(0);
        txfValorTotal.setText("");
    }//GEN-LAST:event_apagarActionPerformed

    private void confirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarCompraActionPerformed

        Venda venda = new Venda();
        venda.setIdCliente(Integer.parseInt(txfIdCliente.getText()));
        venda.setDataVenda (formatDataVenda.getText());
        venda.setValorTotal(Double.parseDouble(txfValorTotal.getText()));
        venda.setNomeCliente(cbNomeCliente.getSelectedItem().toString());
        venda.setFormaPagamento(cbFormaPagamento.getSelectedItem().toString());
        VendaDAO dao = new VendaDAO();
        dao.adiciona(venda);
        JOptionPane.showMessageDialog(null, "Compra finalizada com sucesso! ");

    }//GEN-LAST:event_confirmarCompraActionPerformed

    private void cbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProdutosActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private gui.Boder boder1;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JComboBox<String> cbNomeCliente;
    private javax.swing.JComboBox<String> cbProdutos;
    private javax.swing.JButton confirmarCompra;
    private javax.swing.JFormattedTextField formatDataVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton somar1;
    private javax.swing.JTextField txfIdCliente;
    private javax.swing.JTextField txfIdProduto;
    private javax.swing.JTextField txfQuantidade;
    private javax.swing.JTextField txfValorTotal;
    private javax.swing.JTextField txfValorU;
    // End of variables declaration//GEN-END:variables
}
