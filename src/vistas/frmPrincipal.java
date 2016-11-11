/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        menuPrincipal = new javax.swing.JMenuBar();
        menArchivo = new javax.swing.JMenu();
        menSalir = new javax.swing.JMenuItem();
        menGestion = new javax.swing.JMenu();
        menBibliografia = new javax.swing.JMenuItem();
        menLector = new javax.swing.JMenuItem();
        menTBibliografia = new javax.swing.JMenuItem();
        menTLector = new javax.swing.JMenuItem();
        menPrestamos = new javax.swing.JMenu();
        menAcercaDe = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 700));

        menArchivo.setText("Archivo");

        menSalir.setText("Salir");
        menSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSalirActionPerformed(evt);
            }
        });
        menArchivo.add(menSalir);

        menuPrincipal.add(menArchivo);

        menGestion.setText("Gestión");

        menBibliografia.setText("Bibliografía");
        menBibliografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menBibliografiaActionPerformed(evt);
            }
        });
        menGestion.add(menBibliografia);

        menLector.setText("Lector");
        menLector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menLectorActionPerformed(evt);
            }
        });
        menGestion.add(menLector);

        menTBibliografia.setText("Tipo Bibliografía");
        menGestion.add(menTBibliografia);

        menTLector.setText("Tipo Lector");
        menGestion.add(menTLector);

        menuPrincipal.add(menGestion);

        menPrestamos.setText("Prestamos");
        menuPrincipal.add(menPrestamos);

        menAcercaDe.setText("Acerca de");
        menuPrincipal.add(menAcercaDe);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menSalirActionPerformed

    private void menBibliografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menBibliografiaActionPerformed
        // TODO add your handling code here:
        frmListarBibliografia biblio = new frmListarBibliografia();
        biblio.setVisible(true);
        biblio.setLocationRelativeTo(null);
    }//GEN-LAST:event_menBibliografiaActionPerformed

    private void menLectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menLectorActionPerformed
        // TODO add your handling code here:
        frmListarPersonas frmpersonas =new frmListarPersonas();
        frmpersonas.setVisible(true);
        frmpersonas.setLocationRelativeTo(null);
    }//GEN-LAST:event_menLectorActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPrincipal frm = new frmPrincipal();
                frm.setVisible(true);
                frm.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu menAcercaDe;
    private javax.swing.JMenu menArchivo;
    private javax.swing.JMenuItem menBibliografia;
    private javax.swing.JMenu menGestion;
    private javax.swing.JMenuItem menLector;
    private javax.swing.JMenu menPrestamos;
    private javax.swing.JMenuItem menSalir;
    private javax.swing.JMenuItem menTBibliografia;
    private javax.swing.JMenuItem menTLector;
    private javax.swing.JMenuBar menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
