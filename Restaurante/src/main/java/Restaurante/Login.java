/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Restaurante;


/**
 *
 * @author CAMARGO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jTextField1 = new javax.swing.JTextField();
        jbtCliente = new javax.swing.JButton();
        jbtFunc = new javax.swing.JButton();
        jbtfornecedores = new javax.swing.JButton();
        jbtPedidos = new javax.swing.JButton();
        jbt_entrega = new javax.swing.JButton();
        jbtreservas1 = new javax.swing.JButton();
        jbt_estoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(135, 27, 34));
        jTextField1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(240, 240, 240));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Restaurante");

        jbtCliente.setText("Clientes");
        jbtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClienteActionPerformed(evt);
            }
        });

        jbtFunc.setText("Funcionarios");
        jbtFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFuncActionPerformed(evt);
            }
        });

        jbtfornecedores.setText("Fornecedores");
        jbtfornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtfornecedoresActionPerformed(evt);
            }
        });

        jbtPedidos.setText("Pedidos");
        jbtPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPedidosActionPerformed(evt);
            }
        });

        jbt_entrega.setText("Entrega");
        jbt_entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_entregaActionPerformed(evt);
            }
        });

        jbtreservas1.setText("Reservas");
        jbtreservas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtreservas1ActionPerformed(evt);
            }
        });

        jbt_estoque.setText("Estoque");
        jbt_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_estoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtreservas1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtfornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtfornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtreservas1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbt_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClienteActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Cad_Cliente().setVisible(true);
    }//GEN-LAST:event_jbtClienteActionPerformed

    private void jbtFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFuncActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Funcionarios().setVisible(true);
    }//GEN-LAST:event_jbtFuncActionPerformed

    private void jbt_entregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_entregaActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Entregas().setVisible(true);
    }//GEN-LAST:event_jbt_entregaActionPerformed

    private void jbt_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_estoqueActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Estoque().setVisible(true);
    }//GEN-LAST:event_jbt_estoqueActionPerformed

    private void jbtfornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtfornecedoresActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Fornecedores().setVisible(true);
    }//GEN-LAST:event_jbtfornecedoresActionPerformed

    private void jbtPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPedidosActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Pedidos().setVisible(true);
    }//GEN-LAST:event_jbtPedidosActionPerformed

    private void jbtreservas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtreservas1ActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new Reservas().setVisible(true);
    }//GEN-LAST:event_jbtreservas1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtCliente;
    private javax.swing.JButton jbtFunc;
    private javax.swing.JButton jbtPedidos;
    private javax.swing.JButton jbt_entrega;
    private javax.swing.JButton jbt_estoque;
    private javax.swing.JButton jbtfornecedores;
    private javax.swing.JButton jbtreservas1;
    // End of variables declaration//GEN-END:variables
}
