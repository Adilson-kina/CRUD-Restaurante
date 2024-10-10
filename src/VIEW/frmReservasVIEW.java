package VIEW;

import DAO.ReservasDAO;
import DTO.ReservasDTO;

/**
 *
 * @author Gabriel Possato
 */
public class frmReservasVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmReservasVIEW
     */
    public frmReservasVIEW() {
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

        TÍTULO = new javax.swing.JLabel();
        FILIAL = new javax.swing.JLabel();
        DATA = new javax.swing.JLabel();
        CLIENTE = new javax.swing.JLabel();
        jtxIDCliente_Reservas = new javax.swing.JTextField();
        MESA = new javax.swing.JLabel();
        CAPACIDADE = new javax.swing.JLabel();
        jtxMesa_Reservas = new javax.swing.JTextField();
        jtxDataReserva_Reservas = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jtxIDFilial_Reservas = new javax.swing.JTextField();
        jtxCapacidade_Reservas = new javax.swing.JTextField();
        btnEnviar_Reservas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TÍTULO.setBackground(new java.awt.Color(153, 0, 51));
        TÍTULO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TÍTULO.setForeground(new java.awt.Color(255, 255, 255));
        TÍTULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TÍTULO.setText("Reservas");
        TÍTULO.setOpaque(true);

        FILIAL.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        FILIAL.setText("ID da Filial:");

        DATA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        DATA.setText("Data da reserva:");

        CLIENTE.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        CLIENTE.setText("ID do Cliente:");

        jtxIDCliente_Reservas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIDCliente_Reservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxIDCliente_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIDCliente_ReservasActionPerformed(evt);
            }
        });

        MESA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        MESA.setText("Mesa:");

        CAPACIDADE.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        CAPACIDADE.setText("Capacidade:");

        jtxMesa_Reservas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxMesa_Reservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxMesa_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxMesa_ReservasActionPerformed(evt);
            }
        });

        jtxDataReserva_Reservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            jtxDataReserva_Reservas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
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

        btnLimpar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jtxIDFilial_Reservas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIDFilial_Reservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxIDFilial_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIDFilial_ReservasActionPerformed(evt);
            }
        });

        jtxCapacidade_Reservas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxCapacidade_Reservas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxCapacidade_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCapacidade_ReservasActionPerformed(evt);
            }
        });

        btnEnviar_Reservas.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviar_Reservas.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnEnviar_Reservas.setText("ENVIAR");
        btnEnviar_Reservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar_ReservasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TÍTULO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnviar_Reservas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVoltar))
                            .addComponent(DATA)
                            .addComponent(CLIENTE)
                            .addComponent(MESA)
                            .addComponent(FILIAL)
                            .addComponent(CAPACIDADE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxDataReserva_Reservas)
                            .addComponent(jtxIDCliente_Reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(jtxMesa_Reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(jtxIDFilial_Reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(jtxCapacidade_Reservas, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TÍTULO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DATA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxDataReserva_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CLIENTE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxIDCliente_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MESA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxMesa_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FILIAL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxIDFilial_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CAPACIDADE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxCapacidade_Reservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnEnviar_Reservas))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxIDCliente_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIDCliente_ReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIDCliente_ReservasActionPerformed

    private void jtxMesa_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxMesa_ReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxMesa_ReservasActionPerformed

    private void jtxIDFilial_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIDFilial_ReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIDFilial_ReservasActionPerformed

    private void jtxCapacidade_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCapacidade_ReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCapacidade_ReservasActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        dispose();
        new LoginVIEW().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        jtxCapacidade_Reservas.setText("");
        jtxDataReserva_Reservas.setText("");
        jtxIDCliente_Reservas.setText("");
        jtxIDFilial_Reservas.setText("");
        jtxMesa_Reservas.setText("");   
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEnviar_ReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar_ReservasActionPerformed
        int Capacidade_ReservasVIEW, IDCliente_ReservasVIEW, IDFilial_ReservasVIEW;
        String DataReserva_ReservasVIEW, Mesa_ReservasVIEW;
        
        Capacidade_ReservasVIEW = Integer.parseInt(jtxCapacidade_Reservas.getText());
        IDCliente_ReservasVIEW = Integer.parseInt(jtxIDCliente_Reservas.getText());
        IDFilial_ReservasVIEW = Integer.parseInt(jtxIDFilial_Reservas.getText());
        DataReserva_ReservasVIEW = jtxDataReserva_Reservas.getText();
        Mesa_ReservasVIEW = jtxMesa_Reservas.getText();
        
        ReservasDTO objReservasDTO = new ReservasDTO();
        
        objReservasDTO.setCapacidade_Reservas(Capacidade_ReservasVIEW);
        objReservasDTO.setDataReserva_Reservas(DataReserva_ReservasVIEW);
        objReservasDTO.setIDCliente_Reservas(IDCliente_ReservasVIEW);
        objReservasDTO.setIDFilial_Reservas(IDFilial_ReservasVIEW);
        objReservasDTO.setMesa_Reservas(Mesa_ReservasVIEW);
        
        ReservasDAO objReservasDAO = new ReservasDAO();
        objReservasDAO.cadastrarReserva(objReservasDTO);
    }//GEN-LAST:event_btnEnviar_ReservasActionPerformed

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
            java.util.logging.Logger.getLogger(frmReservasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReservasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReservasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReservasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReservasVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CAPACIDADE;
    private javax.swing.JLabel CLIENTE;
    private javax.swing.JLabel DATA;
    private javax.swing.JLabel FILIAL;
    private javax.swing.JLabel MESA;
    private javax.swing.JLabel TÍTULO;
    private javax.swing.JButton btnEnviar_Reservas;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField jtxCapacidade_Reservas;
    private javax.swing.JFormattedTextField jtxDataReserva_Reservas;
    private javax.swing.JTextField jtxIDCliente_Reservas;
    private javax.swing.JTextField jtxIDFilial_Reservas;
    private javax.swing.JTextField jtxMesa_Reservas;
    // End of variables declaration//GEN-END:variables
}
