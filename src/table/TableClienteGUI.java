package table;

import dao.ClienteDAO;
import gui.ClienteGUI;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class TableClienteGUI extends javax.swing.JFrame {
   

    public TableClienteGUI() {
        initComponents();
        leiaJTable();
        this.setLocationRelativeTo(null);
//        setSize(Toolkit.getDefaultToolkit().getScreenSize());
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
                cliente.getEndNum(),});
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttGpGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        boder1 = new gui.Boder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        boder2 = new gui.Boder();
        btEditar2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtRua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txtNum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioGeneroFem = new javax.swing.JRadioButton();
        jRadioGeneroMasc = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioConv = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        formattedDataNasc = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        formattedCep = new javax.swing.JFormattedTextField();
        txtNomeCliente = new javax.swing.JTextField();
        formattedCpf = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        formattedTelefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 191, 152));

        boder1.setBackground(new java.awt.Color(255, 255, 255));

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Cliente", "CPF", "CEP", "Nome", "Genero", "Telefone", "Data Nascimento", "Convenio", "Rua", "N°"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        boder1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 1040, 520);

        btVoltar.setBackground(new java.awt.Color(0, 255, 255));
        btVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(0, 52, 39));
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        boder1.add(btVoltar);
        btVoltar.setBounds(260, 650, 110, 40);

        btExcluir.setBackground(new java.awt.Color(0, 255, 255));
        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 52, 39));
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        boder1.add(btExcluir);
        btExcluir.setBounds(400, 650, 110, 40);

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 72, 45));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTE");
        boder1.add(jLabel1);
        jLabel1.setBounds(10, 30, 1040, 40);

        btAtualizar.setBackground(new java.awt.Color(0, 255, 255));
        btAtualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAtualizar.setForeground(new java.awt.Color(0, 52, 39));
        btAtualizar.setText("Atualizar");
        btAtualizar.setContentAreaFilled(false);
        btAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAtualizarMouseClicked(evt);
            }
        });
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        boder1.add(btAtualizar);
        btAtualizar.setBounds(530, 650, 110, 40);

        boder2.setBackground(new java.awt.Color(255, 255, 255));

        btEditar2.setBackground(new java.awt.Color(0, 255, 255));
        btEditar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEditar2.setForeground(new java.awt.Color(0, 0, 51));
        btEditar2.setText("Editar");
        btEditar2.setContentAreaFilled(false);
        btEditar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEditar2MouseClicked(evt);
            }
        });
        btEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditar2ActionPerformed(evt);
            }
        });
        boder2.add(btEditar2);
        btEditar2.setBounds(570, 560, 110, 40);
        boder2.add(jSeparator4);
        jSeparator4.setBounds(70, 320, 280, 2);
        boder2.add(jSeparator5);
        jSeparator5.setBounds(70, 402, 280, 0);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Telefone:");
        boder2.add(jLabel7);
        jLabel7.setBounds(70, 340, 160, 20);
        boder2.add(jSeparator6);
        jSeparator6.setBounds(70, 400, 280, 0);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Rua:");
        boder2.add(jLabel8);
        jLabel8.setBounds(70, 490, 160, 20);
        boder2.add(jSeparator7);
        jSeparator7.setBounds(70, 550, 230, 2);

        txtRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRua.setText("Digite o nome da rua");
        txtRua.setBorder(null);
        boder2.add(txtRua);
        txtRua.setBounds(70, 530, 230, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Convênio");
        boder2.add(jLabel9);
        jLabel9.setBounds(100, 670, 160, 20);
        boder2.add(jSeparator8);
        jSeparator8.setBounds(70, 630, 230, 2);

        txtNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNum.setText("Digite o número da casa");
        txtNum.setBorder(null);
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        boder2.add(txtNum);
        txtNum.setBounds(70, 610, 230, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("N°:");
        boder2.add(jLabel10);
        jLabel10.setBounds(70, 570, 160, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Genero:");
        boder2.add(jLabel11);
        jLabel11.setBounds(70, 420, 160, 20);

        jRadioGeneroFem.setBackground(new java.awt.Color(255, 255, 255));
        buttGpGenero.add(jRadioGeneroFem);
        jRadioGeneroFem.setSelected(true);
        jRadioGeneroFem.setText("Feminino");
        jRadioGeneroFem.setDoubleBuffered(true);
        boder2.add(jRadioGeneroFem);
        jRadioGeneroFem.setBounds(70, 460, 120, 20);

        jRadioGeneroMasc.setBackground(new java.awt.Color(255, 255, 255));
        buttGpGenero.add(jRadioGeneroMasc);
        jRadioGeneroMasc.setText("Masculino");
        boder2.add(jRadioGeneroMasc);
        jRadioGeneroMasc.setBounds(200, 460, 100, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        boder2.add(jLabel2);
        jLabel2.setBounds(70, 20, 60, 20);

        jRadioConv.setBackground(new java.awt.Color(255, 255, 255));
        boder2.add(jRadioConv);
        jRadioConv.setBounds(70, 670, 21, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CPF:");
        boder2.add(jLabel3);
        jLabel3.setBounds(70, 180, 130, 20);

        formattedDataNasc.setBorder(null);
        try {
            formattedDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        boder2.add(formattedDataNasc);
        formattedDataNasc.setBounds(70, 300, 290, 20);
        boder2.add(jSeparator1);
        jSeparator1.setBounds(70, 80, 280, 2);

        formattedCep.setBorder(null);
        try {
            formattedCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        boder2.add(formattedCep);
        formattedCep.setBounds(70, 140, 230, 20);

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeCliente.setText("Digite o nome do cliente");
        txtNomeCliente.setBorder(null);
        boder2.add(txtNomeCliente);
        txtNomeCliente.setBounds(70, 60, 280, 20);

        formattedCpf.setBorder(null);
        try {
            formattedCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        boder2.add(formattedCpf);
        formattedCpf.setBounds(70, 220, 280, 20);
        boder2.add(jSeparator2);
        jSeparator2.setBounds(70, 160, 280, 2);

        formattedTelefone.setBorder(null);
        try {
            formattedTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        boder2.add(formattedTelefone);
        formattedTelefone.setBounds(70, 380, 280, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CEP:");
        boder2.add(jLabel4);
        jLabel4.setBounds(70, 100, 110, 20);
        boder2.add(jSeparator3);
        jSeparator3.setBounds(70, 240, 280, 2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Data Nascimeno:");
        boder2.add(jLabel5);
        jLabel5.setBounds(70, 260, 170, 20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(boder2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boder2, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addComponent(boder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        if (jtCliente.getSelectedRow() != -1) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente((int) jtCliente.getValueAt(jtCliente.getSelectedRow(), 0));
            
            cliente.setNomeCliente(txtNomeCliente.getText());
            cliente.setCep(formattedCep.getText());
            cliente.setCpf(formattedCpf.getText());
            cliente.setDataNasc(formattedDataNasc.getText());
            cliente.setTelefone(formattedTelefone.getText());
            if (jRadioGeneroFem.isSelected()) {
                cliente.setGenero("Feminino");
            } else {
                cliente.setGenero("Masculino");
            }
            if (jRadioConv.isSelected()) {
                cliente.setConvenio(true);
            } else {
                cliente.setConvenio(false);
            }
            cliente.setEndRua(txtRua.getText());
            cliente.setEndNum(Integer.parseInt(txtNum.getText()));

            if ((txtNomeCliente.getText().isEmpty()) || (formattedCep.getText().isEmpty())
                    || (formattedCpf.getText().isEmpty()) || (formattedDataNasc.getText().isEmpty()) 
                    || (formattedTelefone.getText().isEmpty()) || (txtRua.getText().isEmpty()) 
                    || (txtNum.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "O campo não pode retornar vazio");
            } else {
                ClienteDAO dao = new ClienteDAO();
                dao.update(cliente);
            }
            txtNomeCliente.setText("Digite o nome do cliente");
            formattedCep.setText("");
            formattedCpf.setText("");
            formattedDataNasc.setText("");
            formattedTelefone.setText("");
            txtRua.setText("Digite o nome da rua");
            txtNum.setText("Digite o número da casa");
            buttGpGenero.clearSelection();
            //jRadioConv.setSelected(false);
            leiaJTable();
        }

    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAtualizarMouseClicked

    }//GEN-LAST:event_btAtualizarMouseClicked

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        if (jtCliente.getSelectedRow() != -1) {
            formattedCpf.setText(jtCliente.getValueAt       (jtCliente.getSelectedRow(), 1).toString());
            formattedCep.setText(jtCliente.getValueAt       (jtCliente.getSelectedRow(), 2).toString());
            txtNomeCliente.setText(jtCliente.getValueAt     (jtCliente.getSelectedRow(), 3).toString());
            formattedTelefone.setText(jtCliente.getValueAt  (jtCliente.getSelectedRow(), 5).toString());
            formattedDataNasc.setText(jtCliente.getValueAt  (jtCliente.getSelectedRow(), 6).toString());
            txtRua.setText(jtCliente.getValueAt             (jtCliente.getSelectedRow(), 8).toString());
            txtNum.setText(jtCliente.getValueAt             (jtCliente.getSelectedRow(), 9).toString());
//            buttGpGenero.setSelected(jtCliente.getValueAt(jtCliente.getSelectedRow(),6 ));
//            buttGpGenero.setSelected(jtCliente.getValueAt(jtCliente.getSelectedRow(), 6));
        }
    }//GEN-LAST:event_jtClienteMouseClicked

    private void btEditar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEditar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditar2MouseClicked

    private void btEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditar2ActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

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
    private gui.Boder boder2;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btEditar2;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttGpGenero;
    private javax.swing.JFormattedTextField formattedCep;
    private javax.swing.JFormattedTextField formattedCpf;
    private javax.swing.JFormattedTextField formattedDataNasc;
    private javax.swing.JFormattedTextField formattedTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioConv;
    private javax.swing.JRadioButton jRadioGeneroFem;
    private javax.swing.JRadioButton jRadioGeneroMasc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
