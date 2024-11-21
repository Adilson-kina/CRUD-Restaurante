package VIEW;

import DAO.PedidosDAO;
import DTO.PedidosDTO;

/**
 *
 * @author Gabriel Possato
 */

public class frmPedidosVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmPedidosVIEW
     */
    public frmPedidosVIEW() {
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

        jtxValor_Pedidos = new javax.swing.JFormattedTextField();
        BEBIDA = new javax.swing.JLabel();
        jtxDataPedido_Pedidos = new javax.swing.JFormattedTextField();
        ENDEREÇO = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jtxEndereço_Pedidos = new javax.swing.JTextField();
        btnEnviar_Pedidos = new javax.swing.JButton();
        PAGAMENTO = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        jtxPagamento_Pedidos = new javax.swing.JTextField();
        DATA_PEDIDO = new javax.swing.JLabel();
        VALOR = new javax.swing.JLabel();
        jtxIDCliente_Pedidos = new javax.swing.JTextField();
        TÍTULO = new javax.swing.JLabel();
        CLIENTE = new javax.swing.JLabel();
        PRATO = new javax.swing.JLabel();
        jtxIDPrato_Pedidos = new javax.swing.JTextField();
        jtxIDBebida_Pedidos = new javax.swing.JTextField();
        btnVerTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxValor_Pedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            jtxValor_Pedidos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("R$ ##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        BEBIDA.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        BEBIDA.setText("ID da Bebida:");

        jtxDataPedido_Pedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            jtxDataPedido_Pedidos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ENDEREÇO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        ENDEREÇO.setText("Endereço:");

        btnVoltar.setBackground(new java.awt.Color(0, 153, 153));
        btnVoltar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jtxEndereço_Pedidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxEndereço_Pedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxEndereço_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEndereço_PedidosActionPerformed(evt);
            }
        });

        btnEnviar_Pedidos.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviar_Pedidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnEnviar_Pedidos.setText("ENVIAR");
        btnEnviar_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar_PedidosActionPerformed(evt);
            }
        });

        PAGAMENTO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        PAGAMENTO.setText("Tipo de Pagamento:");

        btnLimpar.setBackground(new java.awt.Color(0, 153, 153));
        btnLimpar.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jtxPagamento_Pedidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxPagamento_Pedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxPagamento_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxPagamento_PedidosActionPerformed(evt);
            }
        });

        DATA_PEDIDO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        DATA_PEDIDO.setText("Data do Pedido:");

        VALOR.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        VALOR.setText("Valor:");

        jtxIDCliente_Pedidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIDCliente_Pedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxIDCliente_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIDCliente_PedidosActionPerformed(evt);
            }
        });

        TÍTULO.setBackground(new java.awt.Color(153, 0, 51));
        TÍTULO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        TÍTULO.setForeground(new java.awt.Color(255, 255, 255));
        TÍTULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TÍTULO.setText("Pedidos");
        TÍTULO.setOpaque(true);

        CLIENTE.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        CLIENTE.setText("ID do Cliente:");

        PRATO.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        PRATO.setText("ID do Prato:");

        jtxIDPrato_Pedidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIDPrato_Pedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxIDPrato_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIDPrato_PedidosActionPerformed(evt);
            }
        });

        jtxIDBebida_Pedidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jtxIDBebida_Pedidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxIDBebida_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxIDBebida_PedidosActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxIDPrato_Pedidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PRATO)
                            .addComponent(BEBIDA)
                            .addComponent(CLIENTE)
                            .addComponent(VALOR)
                            .addComponent(PAGAMENTO)
                            .addComponent(ENDEREÇO)
                            .addComponent(DATA_PEDIDO))
                        .addGap(0, 241, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxDataPedido_Pedidos)
                            .addComponent(jtxIDBebida_Pedidos)
                            .addComponent(jtxIDCliente_Pedidos)
                            .addComponent(jtxValor_Pedidos)
                            .addComponent(jtxPagamento_Pedidos)
                            .addComponent(jtxEndereço_Pedidos)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnviar_Pedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TÍTULO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CLIENTE)
                .addGap(2, 2, 2)
                .addComponent(jtxIDCliente_Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PRATO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxIDPrato_Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BEBIDA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxIDBebida_Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VALOR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxValor_Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PAGAMENTO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxPagamento_Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ENDEREÇO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxEndereço_Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DATA_PEDIDO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxDataPedido_Pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar_Pedidos)
                    .addComponent(btnLimpar)
                    .addComponent(btnVoltar)
                    .addComponent(btnVerTabela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxEndereço_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEndereço_PedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEndereço_PedidosActionPerformed

    private void jtxPagamento_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxPagamento_PedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxPagamento_PedidosActionPerformed

    private void jtxIDCliente_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIDCliente_PedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIDCliente_PedidosActionPerformed

    private void jtxIDPrato_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIDPrato_PedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIDPrato_PedidosActionPerformed

    private void jtxIDBebida_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxIDBebida_PedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxIDBebida_PedidosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
        new LoginVIEW().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        jtxDataPedido_Pedidos.setText("");
        jtxEndereço_Pedidos.setText("");
        jtxIDBebida_Pedidos.setText("");
        jtxIDCliente_Pedidos.setText("");
        jtxIDPrato_Pedidos.setText("");
        jtxPagamento_Pedidos.setText("");
        jtxValor_Pedidos.setText("");     
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEnviar_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar_PedidosActionPerformed
        cadastrarPedidos();
    }//GEN-LAST:event_btnEnviar_PedidosActionPerformed

    private void btnVerTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTabelaActionPerformed
        new tablePedidosVIEW().setVisible(true);
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
            java.util.logging.Logger.getLogger(frmPedidosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPedidosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPedidosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPedidosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPedidosVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BEBIDA;
    private javax.swing.JLabel CLIENTE;
    private javax.swing.JLabel DATA_PEDIDO;
    private javax.swing.JLabel ENDEREÇO;
    private javax.swing.JLabel PAGAMENTO;
    private javax.swing.JLabel PRATO;
    private javax.swing.JLabel TÍTULO;
    private javax.swing.JLabel VALOR;
    private javax.swing.JButton btnEnviar_Pedidos;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVerTabela;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField jtxDataPedido_Pedidos;
    private javax.swing.JTextField jtxEndereço_Pedidos;
    private javax.swing.JTextField jtxIDBebida_Pedidos;
    private javax.swing.JTextField jtxIDCliente_Pedidos;
    private javax.swing.JTextField jtxIDPrato_Pedidos;
    private javax.swing.JTextField jtxPagamento_Pedidos;
    private javax.swing.JFormattedTextField jtxValor_Pedidos;
    // End of variables declaration//GEN-END:variables

    private void cadastrarPedidos() {
        String DataPedido_PedidosVIEW, Endereço_PedidosVIEW, Pagamento_PedidosVIEW, Valor_PedidosVIEW;
        int IDBebida_PedidosVIEW, IDCliente_PedidosVIEW, IDPrato_PedidosVIEW;
        
        DataPedido_PedidosVIEW = jtxDataPedido_Pedidos.getText();
        Endereço_PedidosVIEW = jtxEndereço_Pedidos.getText();
        Pagamento_PedidosVIEW = jtxPagamento_Pedidos.getText();
        Valor_PedidosVIEW = jtxValor_Pedidos.getText();
        IDBebida_PedidosVIEW = Integer.parseInt(jtxIDBebida_Pedidos.getText());
        IDPrato_PedidosVIEW = Integer.parseInt(jtxIDPrato_Pedidos.getText());
        IDCliente_PedidosVIEW = Integer.parseInt(jtxIDCliente_Pedidos.getText());
        
        PedidosDTO objPedidosDTO = new PedidosDTO();
        
        objPedidosDTO.setDataPedido_PedidosDTO(DataPedido_PedidosVIEW);
        objPedidosDTO.setEndereço_PedidosDTO(Endereço_PedidosVIEW);
        objPedidosDTO.setIDBebida_PedidosDTO(IDBebida_PedidosVIEW);
        objPedidosDTO.setIDCliente_PedidosDTO(IDCliente_PedidosVIEW);
        objPedidosDTO.setIDPrato_PedidosDTO(IDPrato_PedidosVIEW);
        objPedidosDTO.setPagamento_PedidosDTO(Pagamento_PedidosVIEW);
        objPedidosDTO.setValor_PedidosDTO(Valor_PedidosVIEW);
        
        PedidosDAO objPedidosDAO = new PedidosDAO();
        objPedidosDAO.cadastrarPedido(objPedidosDTO);
    }
}