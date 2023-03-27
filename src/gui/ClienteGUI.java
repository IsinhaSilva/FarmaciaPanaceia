package gui;

import dao.ClienteDAO;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Cliente;
import table.TableClienteGUI;


public class ClienteGUI extends javax.swing.JFrame {

    public ClienteGUI(){
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.png")).getImage());
        Focus();

    }
    
    
    
    
    public void Focus(){
        //Thread.sleep(1000);
        txtNomeCliente.setText("");
        txtNomeCliente.requestFocus();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttGpGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        boder1 = new gui.Boder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNomeCliente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btEditar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
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
        jRadioConv = new javax.swing.JRadioButton();
        formattedDataNasc = new javax.swing.JFormattedTextField();
        formattedCep = new javax.swing.JFormattedTextField();
        formattedCpf = new javax.swing.JFormattedTextField();
        formattedTelefone = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastroCliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 191, 152));

        boder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 72, 45));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTES");
        boder1.add(jLabel1);
        jLabel1.setBounds(120, 40, 280, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        boder1.add(jLabel2);
        jLabel2.setBounds(40, 120, 60, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CPF:");
        boder1.add(jLabel3);
        jLabel3.setBounds(40, 280, 130, 22);
        boder1.add(jSeparator1);
        jSeparator1.setBounds(40, 180, 230, 2);

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeCliente.setText("Digite o nome do cliente");
        txtNomeCliente.setBorder(null);
        txtNomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNomeClienteMousePressed(evt);
            }
        });
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });
        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyPressed(evt);
            }
        });
        boder1.add(txtNomeCliente);
        txtNomeCliente.setBounds(40, 150, 230, 30);
        boder1.add(jSeparator2);
        jSeparator2.setBounds(40, 260, 230, 2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CEP:");
        boder1.add(jLabel4);
        jLabel4.setBounds(40, 200, 110, 22);
        boder1.add(jSeparator3);
        jSeparator3.setBounds(40, 340, 230, 2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Data Nascimeno:");
        boder1.add(jLabel5);
        jLabel5.setBounds(40, 360, 170, 22);
        boder1.add(jSeparator4);
        jSeparator4.setBounds(40, 420, 230, 2);

        btEditar.setBackground(new java.awt.Color(0, 52, 39));
        btEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEditar.setForeground(new java.awt.Color(0, 52, 39));
        btEditar.setText("Editar");
        btEditar.setContentAreaFilled(false);
        btEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        boder1.add(btEditar);
        btEditar.setBounds(360, 870, 110, 40);

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
        boder1.add(btCadastrar);
        btCadastrar.setBounds(50, 870, 110, 40);

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
        boder1.add(btLimpar);
        btLimpar.setBounds(190, 870, 110, 40);
        boder1.add(jSeparator5);
        jSeparator5.setBounds(40, 500, 230, 2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Telefone:");
        boder1.add(jLabel7);
        jLabel7.setBounds(40, 440, 160, 22);
        boder1.add(jSeparator6);
        jSeparator6.setBounds(40, 500, 230, 2);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Rua:");
        boder1.add(jLabel8);
        jLabel8.setBounds(40, 590, 160, 22);
        boder1.add(jSeparator7);
        jSeparator7.setBounds(40, 650, 230, 2);

        txtRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRua.setText("Digite o nome da rua");
        txtRua.setBorder(null);
        txtRua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRuaMousePressed(evt);
            }
        });
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });
        txtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRuaKeyPressed(evt);
            }
        });
        boder1.add(txtRua);
        txtRua.setBounds(40, 620, 230, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Convênio");
        boder1.add(jLabel9);
        jLabel9.setBounds(70, 770, 160, 22);
        boder1.add(jSeparator8);
        jSeparator8.setBounds(40, 730, 230, 2);

        txtNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNum.setText("Digite o número da casa");
        txtNum.setBorder(null);
        txtNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumMousePressed(evt);
            }
        });
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumKeyPressed(evt);
            }
        });
        boder1.add(txtNum);
        txtNum.setBounds(40, 700, 230, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("N°:");
        boder1.add(jLabel10);
        jLabel10.setBounds(40, 670, 160, 22);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Genero:");
        boder1.add(jLabel11);
        jLabel11.setBounds(40, 520, 160, 22);

        jRadioGeneroFem.setBackground(new java.awt.Color(255, 255, 255));
        buttGpGenero.add(jRadioGeneroFem);
        jRadioGeneroFem.setSelected(true);
        jRadioGeneroFem.setText("Feminino");
        jRadioGeneroFem.setDoubleBuffered(true);
        jRadioGeneroFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGeneroFemActionPerformed(evt);
            }
        });
        boder1.add(jRadioGeneroFem);
        jRadioGeneroFem.setBounds(40, 550, 120, 23);

        jRadioGeneroMasc.setBackground(new java.awt.Color(255, 255, 255));
        buttGpGenero.add(jRadioGeneroMasc);
        jRadioGeneroMasc.setText("Masculino");
        jRadioGeneroMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioGeneroMascActionPerformed(evt);
            }
        });
        boder1.add(jRadioGeneroMasc);
        jRadioGeneroMasc.setBounds(170, 550, 100, 23);

        jRadioConv.setBackground(new java.awt.Color(255, 255, 255));
        jRadioConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioConvActionPerformed(evt);
            }
        });
        boder1.add(jRadioConv);
        jRadioConv.setBounds(40, 770, 21, 21);

        formattedDataNasc.setBorder(null);
        try {
            formattedDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedDataNascActionPerformed(evt);
            }
        });
        formattedDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formattedDataNascKeyPressed(evt);
            }
        });
        boder1.add(formattedDataNasc);
        formattedDataNasc.setBounds(40, 390, 230, 30);

        formattedCep.setBorder(null);
        try {
            formattedCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formattedCepKeyPressed(evt);
            }
        });
        boder1.add(formattedCep);
        formattedCep.setBounds(40, 230, 230, 30);

        formattedCpf.setBorder(null);
        try {
            formattedCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedCpfActionPerformed(evt);
            }
        });
        formattedCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formattedCpfKeyPressed(evt);
            }
        });
        boder1.add(formattedCpf);
        formattedCpf.setBounds(40, 310, 230, 30);

        formattedTelefone.setBorder(null);
        try {
            formattedTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTelefoneActionPerformed(evt);
            }
        });
        formattedTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formattedTelefoneKeyPressed(evt);
            }
        });
        boder1.add(formattedTelefone);
        formattedTelefone.setBounds(40, 470, 230, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(712, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(733, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(boder1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jMenuCadastroCliente.setText("Cadastrar Cliente");

        jMenuItem1.setText("Tabela Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastroCliente.add(jMenuItem1);

        jMenuBar1.add(jMenuCadastroCliente);

        setJMenuBar(jMenuBar1);

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

    private void txtNomeClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeClienteMousePressed
        txtNomeCliente.setText("");
    }//GEN-LAST:event_txtNomeClienteMousePressed

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        
        new TableClienteGUI().setVisible(true);
            
    }//GEN-LAST:event_btEditarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
       
        Cliente cliente = new Cliente();
        
        cliente.setCep          (formattedCep.getText());     
        cliente.setCpf          (formattedCpf.getText());
        cliente.setNomeCliente  (txtNomeCliente.getText());
        
        if(jRadioGeneroFem.isSelected()){
            cliente.setGenero("Feminino");
        }else{
            cliente.setGenero("Masculino");
        }
        
        cliente.setTelefone     (formattedTelefone.getText());
        cliente.setDataNasc     (formattedDataNasc.getText());
        cliente.setConvenio     (jRadioConv.isSelected());
        cliente.setEndRua       (txtRua.getText());
        cliente.setEndNum       (Integer.parseInt(txtNum.getText()));
        

        if ((txtNomeCliente.getText().isEmpty()) || (formattedCep.getText().isEmpty())
            || (formattedCpf.getText().isEmpty()) || (formattedDataNasc.getText().isEmpty())
            || (formattedTelefone.getText().isEmpty()) || (txtRua.getText().isEmpty())
            || (txtNum.getText().isEmpty()) 
            ) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        }  else {
            // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
            ClienteDAO dao = new ClienteDAO();
            dao.adiciona(cliente);
            JOptionPane.showMessageDialog(null, "Cliente " + txtNomeCliente.getText() + " cadastro realizado com sucesso! ");
        }
        txtNomeCliente.setText("Digite o nome do cliente");
        formattedCep.setText("");
        formattedCpf.setText("");
        formattedDataNasc.setText("");
        formattedTelefone.setText("");
        txtRua.setText("Digite o nome da rua");
        txtNum.setText("Digite o número da casa");
        buttGpGenero.clearSelection();
        jRadioConv.setSelected(false);
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtNomeCliente.setText("Digite o nome do cliente");
        formattedCep.setText("");
        formattedCpf.setText("");
        formattedDataNasc.setText("");
        formattedTelefone.setText("Digite o número do telefone");
        txtRua.setText("Digite o nome da rua");
        txtNum.setText("Digite o número da casa");
        buttGpGenero.clearSelection();
        jRadioConv.setSelected(false);
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void txtRuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRuaMousePressed
        txtRua.setText("");
    }//GEN-LAST:event_txtRuaMousePressed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void txtNumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumMousePressed
        txtNum.setText("");
    }//GEN-LAST:event_txtNumMousePressed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void jRadioConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioConvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioConvActionPerformed

    private void jRadioGeneroFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGeneroFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioGeneroFemActionPerformed

    private void jRadioGeneroMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioGeneroMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioGeneroMascActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TableClienteGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formattedDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedDataNascActionPerformed

    private void formattedTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTelefoneActionPerformed

    private void formattedCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedCpfActionPerformed

    private void txtNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            formattedCep.requestFocus();
        }
    }//GEN-LAST:event_txtNomeClienteKeyPressed

    private void formattedCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedCepKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            formattedCpf.requestFocus();
        }
    }//GEN-LAST:event_formattedCepKeyPressed

    private void formattedCpfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedCpfKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            formattedDataNasc.requestFocus();
        }
    }//GEN-LAST:event_formattedCpfKeyPressed

    private void formattedDataNascKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedDataNascKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            formattedTelefone.requestFocus();
        }
    }//GEN-LAST:event_formattedDataNascKeyPressed

    private void formattedTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedTelefoneKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtRua.requestFocus();
            txtRua.setText("");
        }
    }//GEN-LAST:event_formattedTelefoneKeyPressed

    private void txtRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtNum.requestFocus();
            txtNum.setText("");
        }
    }//GEN-LAST:event_txtRuaKeyPressed

    private void txtNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        }
    }//GEN-LAST:event_txtNumKeyPressed

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
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.Boder boder1;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpar;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastroCliente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioConv;
    private javax.swing.JRadioButton jRadioGeneroFem;
    private javax.swing.JRadioButton jRadioGeneroMasc;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
