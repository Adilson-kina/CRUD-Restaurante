/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.restaurante_interface;

/**
 *
 * @author CAMARGO
 */
public class fornecedores extends javax.swing.JPanel {

    /**
     * Creates new form fornecedores
     */
    public fornecedores() {
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

        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxemail_fornecedor = new javax.swing.JTextPane();
        jbtnlimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnpronto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxnome_fornecedor = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtx_tipo_material_fornecedor = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxCNPJ_fornecedor = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtelefe_fornecedor = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtxvalor_material_fornecedor = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(300, 536));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(135, 27, 34));
        jTextField2.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(240, 240, 240));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("FORNECEDORES");

        jLabel7.setText("Valor do Material:");

        jScrollPane4.setViewportView(jtxemail_fornecedor);

        jbtnlimpar.setText("Limpar");
        jbtnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlimparActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jbtnpronto.setText("Pronto");
        jbtnpronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnprontoActionPerformed(evt);
            }
        });

        jLabel3.setText("CNPJ:");

        jLabel4.setText("Telefone:");

        jScrollPane1.setViewportView(jtxnome_fornecedor);

        jLabel2.setText("Email:");

        jScrollPane6.setViewportView(jtx_tipo_material_fornecedor);

        jScrollPane2.setViewportView(jtxCNPJ_fornecedor);

        jScrollPane3.setViewportView(jtxtelefe_fornecedor);

        jScrollPane7.setViewportView(jtxvalor_material_fornecedor);

        jLabel5.setText("Material:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnlimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnpronto))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnpronto)
                    .addComponent(jbtnlimpar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnlimparActionPerformed

    private void jbtnprontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnprontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnprontoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnlimpar;
    private javax.swing.JButton jbtnpronto;
    private javax.swing.JTextPane jtxCNPJ_fornecedor;
    private javax.swing.JTextPane jtx_tipo_material_fornecedor;
    private javax.swing.JTextPane jtxemail_fornecedor;
    private javax.swing.JTextPane jtxnome_fornecedor;
    private javax.swing.JTextPane jtxtelefe_fornecedor;
    private javax.swing.JTextPane jtxvalor_material_fornecedor;
    // End of variables declaration//GEN-END:variables
}
