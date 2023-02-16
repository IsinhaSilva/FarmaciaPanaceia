package gui;

import dao.FuncionarioDAO;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.Funcionario;
import table.TableFuncionario;

public class FuncionarioGUI extends javax.swing.JFrame {

    public FuncionarioGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        boder2 = new gui.Boder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodClient = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtEnderN = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtEnderRua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btCadastrar = new javax.swing.JButton();
        btLimpar1 = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 192, 128));

        boder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 72, 45));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Funcionario");
        boder2.add(jLabel1);
        jLabel1.setBounds(80, 20, 280, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        boder2.add(jLabel2);
        jLabel2.setBounds(30, 110, 60, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("E-mail:");
        boder2.add(jLabel3);
        jLabel3.setBounds(30, 300, 70, 22);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setText("Digite seu E-mail");
        txtEmail.setBorder(null);
        boder2.add(txtEmail);
        txtEmail.setBounds(30, 330, 230, 30);
        boder2.add(jSeparator1);
        jSeparator1.setBounds(30, 170, 230, 2);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.setText("Digite seu nome");
        txtNome.setBorder(null);
        boder2.add(txtNome);
        txtNome.setBounds(30, 140, 230, 30);
        boder2.add(jSeparator2);
        jSeparator2.setBounds(30, 270, 230, 2);

        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpf.setText("Digite seu cpf");
        txtCpf.setBorder(null);
        boder2.add(txtCpf);
        txtCpf.setBounds(30, 240, 230, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CPF:");
        boder2.add(jLabel4);
        jLabel4.setBounds(30, 210, 70, 22);
        boder2.add(jSeparator3);
        jSeparator3.setBounds(30, 360, 230, 2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("N°");
        boder2.add(jLabel5);
        jLabel5.setBounds(30, 380, 60, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Codigo Cliente:");
        boder2.add(jLabel6);
        jLabel6.setBounds(30, 570, 140, 22);

        txtCodClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodClient.setText("Digite o codigo do cliente");
        txtCodClient.setBorder(null);
        txtCodClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClientActionPerformed(evt);
            }
        });
        boder2.add(txtCodClient);
        txtCodClient.setBounds(30, 600, 230, 30);
        boder2.add(jSeparator4);
        jSeparator4.setBounds(30, 440, 230, 2);

        txtEnderN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEnderN.setText("Digite seu endereço");
        txtEnderN.setBorder(null);
        txtEnderN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderNActionPerformed(evt);
            }
        });
        boder2.add(txtEnderN);
        txtEnderN.setBounds(30, 410, 230, 30);
        boder2.add(jSeparator5);
        jSeparator5.setBounds(30, 540, 230, 2);

        txtEnderRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEnderRua.setText("Digite seu endereço");
        txtEnderRua.setBorder(null);
        boder2.add(txtEnderRua);
        txtEnderRua.setBounds(30, 510, 230, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Rua:");
        boder2.add(jLabel7);
        jLabel7.setBounds(30, 480, 70, 22);
        boder2.add(jSeparator6);
        jSeparator6.setBounds(30, 630, 230, 2);

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
        btCadastrar.setBounds(40, 680, 110, 40);

        btLimpar1.setBackground(new java.awt.Color(0, 52, 39));
        btLimpar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btLimpar1.setForeground(new java.awt.Color(0, 52, 39));
        btLimpar1.setText("Limpar");
        btLimpar1.setContentAreaFilled(false);
        btLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpar1ActionPerformed(evt);
            }
        });
        boder2.add(btLimpar1);
        btLimpar1.setBounds(160, 680, 110, 40);

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
        btEditar.setBounds(290, 680, 110, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(boder2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(boder2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeFuncionario(txtNome.getText());
        funcionario.setCpf(txtCpf.getText());
        funcionario.setEmail(txtEmail.getText());
        funcionario.setEnderecoNumero(Integer.parseInt(txtEnderN.getText()));
        funcionario.setEnderecoRua(txtEnderRua.getText());
        funcionario.setIdCliente(Integer.parseInt(txtCodClient.getText()));
        
        if ((txtNome.getText().isEmpty()) || (txtCpf.getText().isEmpty()) 
                || (txtEmail.getText().isEmpty()) || (txtEnderN.getText().isEmpty()) 
                || (txtEnderRua.getText().isEmpty()) || (txtCodClient.getText().isEmpty())) {
             JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }  else {
            // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
            FuncionarioDAO dao = new FuncionarioDAO();
            dao.adiciona(funcionario);
            JOptionPane.showMessageDialog(null, "Novo funcionario cadastrado" + txtNome.getText());
        }
        txtNome.setText("Digite seu nome");
        txtCpf.setText("Digite seu cpf");
        txtEmail.setText("Digite seu E-mail");
        txtEnderN.setText("Digite seu endereço");
        txtEnderRua.setText("Digite seu endereço");
        txtCodClient.setText("Digite o codigo do cliente");
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txtEnderNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderNActionPerformed

    private void txtCodClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClientActionPerformed

    private void btLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpar1ActionPerformed
        txtNome.setText("Digite seu nome");
        txtCpf.setText("Digite seu cpf");
        txtEmail.setText("Digite seu E-mail");
        txtEnderN.setText("Digite seu endereço");
        txtEnderRua.setText("Digite seu endereço");
        txtCodClient.setText("Digite o codigo do cliente");
    }//GEN-LAST:event_btLimpar1ActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        new TableFuncionario().setVisible(true);
    }//GEN-LAST:event_btEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.Boder boder2;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField txtCodClient;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnderN;
    private javax.swing.JTextField txtEnderRua;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
