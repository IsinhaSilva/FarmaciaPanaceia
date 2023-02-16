package table;

import dao.ClienteDAO;
import gui.ClienteGUI;
import modelo.Cliente;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class TableClienteGUI extends javax.swing.JFrame {

    public TableClienteGUI() {
        initComponents();
        leiaJTable();
        this.setLocationRelativeTo(null);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.png")).getImage());
        
    }
    public void leiaJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0);//evida duplicar os resultadas ao cadastrar um item
        ClienteDAO dao = new ClienteDAO();
        for (Cliente cliente : dao.leitura()) {
            modelo.addRow(new Object[]{
                cliente.getIdCliente(),
                cliente.getCpf(),
                cliente.getCep(),
                cliente.getNomeCliente(),
                cliente.getGenero(),
                cliente.getTelefone(),
                cliente.getDataNasc(),
                cliente.isConvenio(), 
                cliente.getEndRua(),
                cliente.getEndNum(),  
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boder1 = new gui.Boder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btEditar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(24, 164, 111));

        boder1.setBackground(new java.awt.Color(255, 255, 255));

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Cliente", "CPF", "CEP", "Nome", "Genero", "Telefone", "Data Nascimento", "Convenio", "Rua", "N°"
            }
        ));
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        boder1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 1070, 430);

        btVoltar.setBackground(new java.awt.Color(0, 255, 255));
        btVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(0, 0, 51));
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        boder1.add(btVoltar);
        btVoltar.setBounds(380, 540, 110, 40);

        btExcluir.setBackground(new java.awt.Color(0, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 0, 51));
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        boder1.add(btExcluir);
        btExcluir.setBounds(490, 540, 110, 40);

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente");
        boder1.add(jLabel1);
        jLabel1.setBounds(400, 30, 280, 40);

        btEditar1.setBackground(new java.awt.Color(0, 255, 255));
        btEditar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEditar1.setForeground(new java.awt.Color(0, 0, 51));
        btEditar1.setText("Editar");
        btEditar1.setContentAreaFilled(false);
        btEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditar1MouseClicked(evt);
            }
        });
        btEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditar1ActionPerformed(evt);
            }
        });
        boder1.add(btEditar1);
        btEditar1.setBounds(580, 540, 110, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(500, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        new ClienteGUI().setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if (jtCliente.getSelectedRow() != -1) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente((int) jtCliente.getValueAt(jtCliente.getSelectedRow(), 0)); //somente id
                ClienteDAO dao = new ClienteDAO();
                dao.delete(cliente);
                leiaJTable();
            }else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditar1ActionPerformed
        
        new ClienteGUI().setVisible(true);
        if (jtCliente.getSelectedRow() != 1) {

            String cpf = new String("");
            String cep = new String("");
            String nomeCliente = new String("");
            String genero = new String("");
            String telefone = new String("");
            String dataNasc = new String("");
            String convenio = new String("");
            String endRua = new String("");
            String endNum = new String("");

            for (int i = 0; i <= jtCliente.getSelectedRow(); i++) {
                //As variáveis recebem os valores da JTable

                cpf = (String) jtCliente.getValueAt(i, 1);
                cep = (String) jtCliente.getValueAt(i, 2);
                nomeCliente = (String) jtCliente.getValueAt(i, 3);
                genero = (String) jtCliente.getValueAt(i, 4);
                telefone = (String) jtCliente.getValueAt(i, 5);
                dataNasc = (String) jtCliente.getValueAt(i, 6);
                convenio = (String) jtCliente.getValueAt(i, 7);
                endRua = (String) jtCliente.getValueAt(i, 8);
                endNum = (String) jtCliente.getValueAt(i, 9);
            }
        } else {
            Cliente cliente = new Cliente();
            cliente.setIdCliente((int) jtCliente.getValueAt(jtCliente.getSelectedRow(), 0));
            ClienteDAO dao = new ClienteDAO();
            dao.update(cliente);
        }

    }//GEN-LAST:event_btEditar1ActionPerformed

    private void btEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditar1MouseClicked
        
        
        
        
    }//GEN-LAST:event_btEditar1MouseClicked

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked

        
        
    }//GEN-LAST:event_jtClienteMouseClicked

    
    
    
    
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
            java.util.logging.Logger.getLogger(TableClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.Boder boder1;
    private javax.swing.JButton btEditar1;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCliente;
    // End of variables declaration//GEN-END:variables
}

