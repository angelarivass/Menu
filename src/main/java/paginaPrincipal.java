/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author andreamoran
 */
public class paginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form paginaPrincipal
     */
    public paginaPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        boules = new javax.swing.JLabel();
        sobreNosotros = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        reserva = new javax.swing.JButton();
        realizarPedido = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        modernKitchen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        boules.setFont(new java.awt.Font("Academy Engraved LET", 0, 30)); // NOI18N
        boules.setForeground(new java.awt.Color(255, 255, 255));
        boules.setText("B O U L E S");

        sobreNosotros.setBackground(new java.awt.Color(0, 37, 51));
        sobreNosotros.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        sobreNosotros.setForeground(new java.awt.Color(255, 255, 255));
        sobreNosotros.setText("Sobre nosotros");
        sobreNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreNosotrosActionPerformed(evt);
            }
        });

        menu.setBackground(new java.awt.Color(0, 38, 51));
        menu.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("Menú");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        reserva.setBackground(new java.awt.Color(0, 37, 51));
        reserva.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        reserva.setForeground(new java.awt.Color(255, 255, 255));
        reserva.setText("Reservar");
        reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaActionPerformed(evt);
            }
        });

        realizarPedido.setBackground(new java.awt.Color(0, 37, 51));
        realizarPedido.setFont(new java.awt.Font("Apple SD Gothic Neo", 0, 13)); // NOI18N
        realizarPedido.setForeground(new java.awt.Color(255, 255, 255));
        realizarPedido.setText("Realizar pedido");
        realizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarPedidoActionPerformed(evt);
            }
        });

        modernKitchen.setFont(new java.awt.Font("Academy Engraved LET", 0, 10)); // NOI18N
        modernKitchen.setForeground(new java.awt.Color(255, 255, 255));
        modernKitchen.setText("m  o  d  e  r  n   k  i  t  c  h  e  n ");

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/andreamoran/Downloads/imagenBoules.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(modernKitchen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sobreNosotros, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(realizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(boules)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(boules)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modernKitchen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(realizarPedido)
                .addGap(18, 18, 18)
                .addComponent(reserva)
                .addGap(18, 18, 18)
                .addComponent(menu)
                .addGap(18, 18, 18)
                .addComponent(sobreNosotros)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sobreNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreNosotrosActionPerformed
        // TODO add your handling code here:
        
        sobreBoules sN = new sobreBoules();
        sN.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_sobreNosotrosActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        
        vistaMenu vM = new vistaMenu();
        vM.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_menuActionPerformed

    private void reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaActionPerformed
        // TODO add your handling code here:
        
        reservar r = new reservar();
        r.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_reservaActionPerformed

    private void realizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarPedidoActionPerformed
        // TODO add your handling code here:
        
        pedidosFrame pF = new pedidosFrame();
        pF.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_realizarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(paginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boules;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton menu;
    private javax.swing.JLabel modernKitchen;
    private javax.swing.JButton realizarPedido;
    private javax.swing.JButton reserva;
    private javax.swing.JButton sobreNosotros;
    // End of variables declaration//GEN-END:variables
}
