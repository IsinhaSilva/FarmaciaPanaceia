package gui;

import dao.VendaDAO;
import dao.ClienteDAO;
import dao.ProdutoDAO;
import factory.ConnectionFactory;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Venda;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Produto;
import gui.ProdutoGUI;
import java.sql.Connection;

public class VendaGui extends javax.swing.JFrame {

    
    double valorT = 0;
    private Produto produto;
    private Connection connection;
    int quantidade  = 0, quantidadeCaixa = 0, totalQuantidade = 0, quantidadeEstoque = 0;
    
    public VendaGui() {
        
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boder1 = new gui.Boder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfIdCliente = new javax.swing.JTextField();
        txfIdProduto = new javax.swing.JTextField();
        txfQuantidadeVendida = new javax.swing.JTextField();
        txfValorU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        somar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txfValorTotal = new javax.swing.JTextField();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        jbCancel = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        confirmarCompra = new javax.swing.JButton();
        txfNomeProduto = new javax.swing.JTextField();
        atualizarNc = new javax.swing.JButton();
        atualizarNP = new javax.swing.JButton();
        txfNomeCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        txfQuantidadeVendida.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txfQuantidadeVendida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfQuantidadeVendida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfQuantidadeVendida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfQuantidadeVendidaActionPerformed(evt);
            }
        });
        boder1.add(txfQuantidadeVendida);
        txfQuantidadeVendida.setBounds(70, 460, 370, 40);

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
        somar1.setBounds(570, 430, 130, 34);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/carrinho caixa gui.png"))); // NOI18N
        boder1.add(jLabel6);
        jLabel6.setBounds(620, 110, 280, 250);

        txfValorTotal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txfValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfValorTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txfValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfValorTotalActionPerformed(evt);
            }
        });
        boder1.add(txfValorTotal);
        txfValorTotal.setBounds(560, 510, 430, 90);

        cbFormaPagamento.setBackground(new java.awt.Color(149, 237, 218));
        cbFormaPagamento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de crédito", "Cartão de débito", "Dinheiro vivo", "Cheque a vista", "Cheque a prazo", "A prazo no carnê" }));
        cbFormaPagamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        boder1.add(cbFormaPagamento);
        cbFormaPagamento.setBounds(770, 430, 230, 34);

        jbCancel.setBackground(new java.awt.Color(255, 51, 51));
        jbCancel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jbCancel.setText("Cancelar");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });
        boder1.add(jbCancel);
        jbCancel.setBounds(190, 720, 160, 34);

        apagar.setBackground(new java.awt.Color(255, 255, 51));
        apagar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        apagar.setText("Apagar");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });
        boder1.add(apagar);
        apagar.setBounds(750, 720, 160, 34);

        confirmarCompra.setBackground(new java.awt.Color(0, 204, 204));
        confirmarCompra.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        confirmarCompra.setText("Confirmar");
        confirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarCompraActionPerformed(evt);
            }
        });
        boder1.add(confirmarCompra);
        confirmarCompra.setBounds(460, 720, 160, 34);

        txfNomeProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boder1.add(txfNomeProduto);
        txfNomeProduto.setBounds(170, 300, 270, 50);

        atualizarNc.setText("NC");
        atualizarNc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarNcActionPerformed(evt);
            }
        });
        boder1.add(atualizarNc);
        atualizarNc.setBounds(460, 180, 72, 50);

        atualizarNP.setText("NP");
        atualizarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarNPActionPerformed(evt);
            }
        });
        boder1.add(atualizarNP);
        atualizarNP.setBounds(460, 300, 72, 50);

        txfNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boder1.add(txfNomeCliente);
        txfNomeCliente.setBounds(170, 180, 270, 50);

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
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void txfIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdClienteActionPerformed

    private void txfIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdProdutoActionPerformed

    private void txfQuantidadeVendidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfQuantidadeVendidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfQuantidadeVendidaActionPerformed

    private void txfValorUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfValorUActionPerformed

    private void somar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somar1ActionPerformed
      
     //Puxando o valor das caixa
        double valorU = Double.parseDouble(txfValorU.getText());

        double quantidadeVendida = Double.parseDouble(txfQuantidadeVendida.getText());

        //Somando o valor da Unidade com o Total
        valorU = quantidadeVendida * valorU;
        valorT = valorU + valorT;
        //Transferindo o resultado para texto
        double valorTDouble = valorT;
        String ValorTString = String.valueOf(valorTDouble);
        txfValorTotal.setText(ValorTString);

        //Inserindo informações na tabela
        //selecionando quantidade do banco de dados
        try {
            connection = new ConnectionFactory().getConnection();

            String sql = "SELECT quantidade FROM produto WHERE idProduto = ?";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(txfIdProduto.getText()));

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                quantidadeEstoque = rs.getInt("quantidade");
                quantidadeCaixa = Integer.parseInt(txfQuantidadeVendida.getText());

                System.out.println("Quantidade do produto: " + quantidadeEstoque);
                System.out.println("Quantidade vendida: " + quantidadeCaixa);

                totalQuantidade = quantidadeEstoque - quantidadeCaixa;

            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar a quantidade do produto: ");
        }
    }//GEN-LAST:event_somar1ActionPerformed

    private void txfValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfValorTotalActionPerformed

    //chamando nome do cliente
    public void valoresComboxCliente() {
        Vector<Integer> idCliente = new Vector<Integer>();
        try {
            java.sql.Connection connection = new ConnectionFactory().getConnection();
            ClienteDAO clienteDAO = new ClienteDAO();
            connection = new ConnectionFactory().getConnection();
            ResultSet rs = clienteDAO.listarCliente();

            while (rs.next()) {
                idCliente.addElement(rs.getInt(1));
                txfNomeCliente.setText(rs.getString(4));
            
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no cliente GUI");
        }
    }
    
    //chamando nome do produto
    public void valoresComboxProduto() {
    }
 
    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        txfValorU.setText("");
        txfQuantidadeVendida.setText("");
        txfIdProduto.setText("");
        txfIdCliente.setText("");
        txfNomeCliente.setText("");
        txfNomeProduto.setText("");
        txfValorTotal.setText("");
    }//GEN-LAST:event_jbCancelActionPerformed

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarActionPerformed

        txfValorU.setText("");
        txfQuantidadeVendida.setText("");
        txfIdProduto.setText("");
        txfIdCliente.setText("");
        txfNomeCliente.setText("");
        txfNomeProduto.setText("");
        txfValorTotal.setText("");
    }//GEN-LAST:event_apagarActionPerformed

    private void confirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarCompraActionPerformed
        
        
        Venda venda = new Venda();
        venda.setIdCliente(Integer.parseInt(txfIdCliente.getText()));
        venda.setIdProduto(Integer.parseInt(txfIdProduto.getText()));
        venda.setNomeCliente(txfNomeCliente.getText());
        venda.setNomeProduto(txfNomeProduto.getText());
        venda.setQuantidade(Integer.parseInt(txfQuantidadeVendida.getText()));
        venda.setValorUnidade(Double.parseDouble(txfValorU.getText()));
        venda.setFormaPagamento(cbFormaPagamento.getSelectedItem().toString());
        venda.setValorTotal(Double.parseDouble(txfValorTotal.getText()));

        
        VendaDAO dao = new VendaDAO();
        dao.adiciona(venda);
        JOptionPane.showMessageDialog(null, "Compra inserido com sucesso! ");
        dao.update(venda);

        //Comparando quantidade somada com quantidade existente no banco de dados
        if (quantidadeCaixa < quantidadeEstoque) {
           //Caso a quantidade esteja correta agora fazendo update da nova quantidade no banco de dados produto
            String sql = "UPDATE produto SET quantidade = ? WHERE idProduto = ?";
            try {
                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setInt(1, totalQuantidade);
                stmt.setInt(2, Integer.parseInt(txfIdProduto.getText()));
                stmt.execute();
                stmt.close();
            } catch (SQLException u) {
                throw new RuntimeException(u);
            }

        } else {

            JOptionPane.showMessageDialog(null, "Quantidade vendida maior do que a quantidade em estoque!" + quantidadeEstoque + " " );

        }

        txfValorU.setText("");
        txfQuantidadeVendida.setText("");
        txfIdProduto.setText("");
        txfValorTotal.setText("");
        txfNomeProduto.setText("");
        JOptionPane.showMessageDialog(null, "Item abatido com sucesso! ");
    }//GEN-LAST:event_confirmarCompraActionPerformed

    private void atualizarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarNPActionPerformed
        
        try {

            connection = new ConnectionFactory().getConnection();

            String sql = "SELECT nomeProduto, valorUnidade FROM produto WHERE idProduto = ?";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(txfIdProduto.getText()));

            ResultSet rs = stmt.executeQuery();

// Transferindo para caixa de texto          
            if (rs.next()) {
                String nome = rs.getString("nomeproduto");
                Double valorBanco = rs.getDouble("valorUnidade");

                System.out.println("Nome produto" + nome);
                System.out.println("Valor produto" + valorBanco);
                txfNomeProduto.setText(nome);
                txfValorU.setText(String.valueOf(valorBanco));

            } else {
                
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
            }

        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro no buscar produto");
        }
                     
    }//GEN-LAST:event_atualizarNPActionPerformed

    private void atualizarNcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarNcActionPerformed
        
        try {

            connection = new ConnectionFactory().getConnection();

            String sql = "SELECT nomeCliente FROM cliente WHERE idCliente = ?";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(txfIdCliente.getText()));

            ResultSet rs = stmt.executeQuery();

// Transferindo para caixa de texto          
            if (rs.next()) {
                String nome = rs.getString("nomeCliente");
                txfNomeCliente.setText(nome);

            } else {

                JOptionPane.showMessageDialog(null, "Cliente não encontrado");

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente");
        }
        
    }//GEN-LAST:event_atualizarNcActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apagar;
    private javax.swing.JButton atualizarNP;
    private javax.swing.JButton atualizarNc;
    private gui.Boder boder1;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JButton confirmarCompra;
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
    private javax.swing.JTextField txfNomeCliente;
    private javax.swing.JTextField txfNomeProduto;
    private javax.swing.JTextField txfQuantidadeVendida;
    private javax.swing.JTextField txfValorTotal;
    private javax.swing.JTextField txfValorU;
    // End of variables declaration//GEN-END:variables
}
