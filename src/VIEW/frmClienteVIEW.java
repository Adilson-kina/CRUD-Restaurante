package VIEW;

import DAO.ClienteDAO;
import DTO.ClienteDTO;

/**
 *
 * @author Gabriel Possato
 */
public class frmClienteVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmClienteVIEW
     */
    public frmClienteVIEW() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxSexo_Clientes = new javax.swing.ButtonGroup();
        TÍTULO = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        NOME = new javax.swing.JLabel();
        jtxNome_Clientes = new javax.swing.JTextField();
        SEXO = new javax.swing.JLabel();
        IDADE = new javax.swing.JLabel();
        ENDEREÇO = new javax.swing.JLabel();
        jtxEndereço_Clientes = new javax.swing.JTextField();
        EMAIL = new javax.swing.JLabel();
        jtxEmail_Clientes = new javax.swing.JTextField();
        TELEFONE = new javax.swing.JLabel();
        CADASTRO = new javax.swing.JLabel();
        jtxCPF_Clientes = new javax.swing.JFormattedTextField();
        jtxIdade_Clientes = new javax.swing.JTextField();
        jtxTelefone_Clientes = new javax.swing.JFormattedTextField();
        jtxDataCadastro_Clientes = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();
        btnEnviar_Clientes = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        radioMasculino = new javax.swing.JRadioButton();
        radioFeminino = new javax.swing.JRadioButton();
        btnVerTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TÍTULO.setBackground(new java.awt.Color(153, 0, 51));
        TÍTULO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TÍTULO.setForeground(new java.awt.Color(255, 255, 255));
        TÍTULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TÍTULO.setText("Clientes");
        TÍTULO.setOpaque(true);

        CPF.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        CPF.setText("CPF:");

        NOME.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        NOME.setText("Nome:");

        jtxNome_Clientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxNome_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxNome_ClientesActionPerformed(evt);
            }
        });

        SEXO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        SEXO.setText("Sexo:");

        IDADE.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        IDADE.setText("Idade:");

        ENDEREÇO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        ENDEREÇO.setText("Endereço:");

        jtxEndereço_Clientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxEndereço_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEndereço_ClientesActionPerformed(evt);
            }
        });

        EMAIL.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        EMAIL.setText("Email:");

        jtxEmail_Clientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxEmail_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEmail_ClientesActionPerformed(evt);
            }
        });

        TELEFONE.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TELEFONE.setText("Telefone:");

        CADASTRO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        CADASTRO.setText("Data de cadastro:");

        try {
            jtxCPF_Clientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtxIdade_Clientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIdade_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIdade_ClientesActionPerformed(evt);
            }
        });

        try {
            jtxTelefone_Clientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtxDataCadastro_Clientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnVoltar.setBackground(new java.awt.Color(0, 153, 153));
        btnVoltar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEnviar_Clientes.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviar_Clientes.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnEnviar_Clientes.setText("ENVIAR");
        btnEnviar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar_ClientesActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jtxSexo_Clientes.add(radioMasculino);
        radioMasculino.setText("M");
        radioMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMasculinoActionPerformed(evt);
            }
        });

        jtxSexo_Clientes.add(radioFeminino);
        radioFeminino.setText("F");

        btnVerTabela.setBackground(new java.awt.Color(0, 153, 153));
        btnVerTabela.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnVerTabela.setText("VER TABELA");
        btnVerTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TÍTULO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jtxCPF_Clientes))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NOME)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jtxNome_Clientes))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnviar_Clientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerTabela)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxEndereço_Clientes)
                                    .addComponent(jtxEmail_Clientes)
                                    .addComponent(jtxIdade_Clientes)
                                    .addComponent(jtxTelefone_Clientes)
                                    .addComponent(jtxDataCadastro_Clientes)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SEXO)
                                    .addComponent(IDADE)
                                    .addComponent(ENDEREÇO)
                                    .addComponent(EMAIL)
                                    .addComponent(TELEFONE)
                                    .addComponent(CADASTRO)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(radioMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 244, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TÍTULO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxCPF_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NOME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxNome_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SEXO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDADE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxIdade_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ENDEREÇO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxEndereço_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EMAIL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxEmail_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TELEFONE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxTelefone_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CADASTRO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxDataCadastro_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar_Clientes)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnVerTabela))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxNome_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxNome_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxNome_ClientesActionPerformed

    private void jtxEndereço_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEndereço_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEndereço_ClientesActionPerformed

    private void jtxEmail_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEmail_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEmail_ClientesActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        new LoginVIEW().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEnviar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar_ClientesActionPerformed
        cadastrarClientes();
    }//GEN-LAST:event_btnEnviar_ClientesActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        jtxCPF_Clientes.setText("");
        jtxDataCadastro_Clientes.setText("");
        jtxEmail_Clientes.setText("");
        jtxEndereço_Clientes.setText("");
        jtxIdade_Clientes.setText("");
        jtxNome_Clientes.setText("");
        jtxTelefone_Clientes.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jtxIdade_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIdade_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIdade_ClientesActionPerformed

    private void radioMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMasculinoActionPerformed

    private void btnVerTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTabelaActionPerformed
        new tableClienteVIEW().setVisible(true);
    }//GEN-LAST:event_btnVerTabelaActionPerformed

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
            java.util.logging.Logger.getLogger(frmClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClienteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClienteVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CADASTRO;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel EMAIL;
    private javax.swing.JLabel ENDEREÇO;
    private javax.swing.JLabel IDADE;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel SEXO;
    private javax.swing.JLabel TELEFONE;
    private javax.swing.JLabel TÍTULO;
    private javax.swing.JButton btnEnviar_Clientes;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVerTabela;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField jtxCPF_Clientes;
    private javax.swing.JFormattedTextField jtxDataCadastro_Clientes;
    private javax.swing.JTextField jtxEmail_Clientes;
    private javax.swing.JTextField jtxEndereço_Clientes;
    private javax.swing.JTextField jtxIdade_Clientes;
    private javax.swing.JTextField jtxNome_Clientes;
    private javax.swing.ButtonGroup jtxSexo_Clientes;
    private javax.swing.JFormattedTextField jtxTelefone_Clientes;
    private javax.swing.JRadioButton radioFeminino;
    private javax.swing.JRadioButton radioMasculino;
    // End of variables declaration//GEN-END:variables
    
    private void cadastrarClientes() {
        String CPF_ClienteVIEW, Nome_ClienteVIEW, Sexo_ClienteVIEW, Endereço_ClienteVIEW, Email_ClienteVIEW, Telefone_ClienteVIEW, DataCadastro_ClienteVIEW;
        int Idade_ClienteVIEW;
        
        if (radioMasculino.isSelected()){
            Sexo_ClienteVIEW = "M";
        }
        
        else {
            Sexo_ClienteVIEW = "F";
        }
        
        CPF_ClienteVIEW = jtxCPF_Clientes.getText();
        Nome_ClienteVIEW = jtxNome_Clientes.getText();
        Idade_ClienteVIEW = Integer.parseInt(jtxIdade_Clientes.getText());
        Endereço_ClienteVIEW = jtxEndereço_Clientes.getText();
        Email_ClienteVIEW = jtxEmail_Clientes.getText();
        Telefone_ClienteVIEW = jtxTelefone_Clientes.getText();
        DataCadastro_ClienteVIEW = jtxDataCadastro_Clientes.getText();
        
        ClienteDTO objClienteDTO = new ClienteDTO();
        
        objClienteDTO.setCPF_ClienteDTO(CPF_ClienteVIEW);
        objClienteDTO.setNome_ClienteDTO(Nome_ClienteVIEW);
        objClienteDTO.setSexo_ClienteDTO(Sexo_ClienteVIEW);
        objClienteDTO.setIdade_ClienteDTO(Idade_ClienteVIEW);
        objClienteDTO.setEndereço_ClienteDTO(Endereço_ClienteVIEW);
        objClienteDTO.setEmail_ClienteDTO(Email_ClienteVIEW);
        objClienteDTO.setTelefone_ClienteDTO(Telefone_ClienteVIEW);
        objClienteDTO.setDataCadastro_ClienteDTO(DataCadastro_ClienteVIEW);
        
        ClienteDAO objClienteDAO = new ClienteDAO();
        objClienteDAO.cadastrarCliente(objClienteDTO);
    }
}