/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

/**
 *
 * @author Fam.Morales
 */
public class OPMate extends javax.swing.JFrame {

    /**
     * Creates new form OPMate
     */
    public OPMate() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOperacion = new javax.swing.ButtonGroup();
        jRButtonSumar = new javax.swing.JRadioButton();
        jRButtonRestar = new javax.swing.JRadioButton();
        jRButtonMultiplicar = new javax.swing.JRadioButton();
        jRButtonDividir = new javax.swing.JRadioButton();
        jLabelPrimerNumero = new javax.swing.JLabel();
        jTextPrimerNumero = new javax.swing.JTextField();
        jLabelSegundoNumero = new javax.swing.JLabel();
        jTextSegundoNumero = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonOperacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextResultado = new javax.swing.JTextField();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        buttonGroupOperacion.add(jRButtonSumar);
        jRButtonSumar.setText("Sumar");

        buttonGroupOperacion.add(jRButtonRestar);
        jRButtonRestar.setText("Restar");

        buttonGroupOperacion.add(jRButtonMultiplicar);
        jRButtonMultiplicar.setText("Multiplicar");

        buttonGroupOperacion.add(jRButtonDividir);
        jRButtonDividir.setText("Dividir");

        jLabelPrimerNumero.setText("Ingrese el primer número");

        jTextPrimerNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrimerNumeroActionPerformed(evt);
            }
        });

        jLabelSegundoNumero.setText("Ingrese el segundo número");

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonOperacion.setText("Realizar Operación");
        jButtonOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOperacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resultado");

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRButtonSumar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRButtonRestar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRButtonMultiplicar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRButtonDividir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelSegundoNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelPrimerNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextPrimerNumero)
                                            .addComponent(jTextSegundoNumero)
                                            .addComponent(jButtonOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextResultado))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRButtonSumar)
                    .addComponent(jRButtonRestar)
                    .addComponent(jRButtonMultiplicar)
                    .addComponent(jRButtonDividir))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrimerNumero)
                    .addComponent(jLabelPrimerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSegundoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jButtonOperacion))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPrimerNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrimerNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrimerNumeroActionPerformed

    private void jButtonOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOperacionActionPerformed
    int numero1,numero2,resultado=0;
    numero1=Integer.parseInt(jTextPrimerNumero.getText());
    numero2=Integer.parseInt(jTextSegundoNumero.getText());
        if(jRButtonSumar.isSelected()){
       resultado=numero1+numero2;
    }else if(jRButtonRestar.isSelected()){
       resultado=numero1-numero2;
    }else if (jRButtonMultiplicar.isSelected()){
        resultado=numero1*numero2;
    }else if(jRButtonDividir.isSelected()){
        resultado=numero1/numero2;
    }        
        jTextResultado.setText(""+resultado);
    }//GEN-LAST:event_jButtonOperacionActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
       System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextPrimerNumero.setText("");
        jTextSegundoNumero.setText("");
        jTextResultado.setText("");
        
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(OPMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPMate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOperacion;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonOperacion;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPrimerNumero;
    private javax.swing.JLabel jLabelSegundoNumero;
    private javax.swing.JRadioButton jRButtonDividir;
    private javax.swing.JRadioButton jRButtonMultiplicar;
    private javax.swing.JRadioButton jRButtonRestar;
    private javax.swing.JRadioButton jRButtonSumar;
    private javax.swing.JTextField jTextPrimerNumero;
    private javax.swing.JTextField jTextResultado;
    private javax.swing.JTextField jTextSegundoNumero;
    // End of variables declaration//GEN-END:variables
}
