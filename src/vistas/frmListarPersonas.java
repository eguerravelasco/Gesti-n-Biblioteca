/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import servicios.personaServicios;


public class frmListarPersonas extends javax.swing.JFrame {

    private persona personaSel;
    private ArrayList<persona> lstPersonas;

    public frmListarPersonas() {
        initComponents();
        personaSel = new persona();
        lstPersonas = new ArrayList<persona>();
        this.llenarTabla();

    }

    private void cargarPersonas() {
        try {
            this.lstPersonas = personaServicios.obtenerTodos();
            this.personaSel = lstPersonas.get(0);
            System.out.println(lstPersonas.get(0).getNombresPersona());

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "cargarPersonas dice:", e.getMessage(), JOptionPane.ERROR_MESSAGE);
            System.out.println("private void cargarPersonas dice: " + e.getMessage());
        }
    }

    private void llenarTabla() {
        this.cargarPersonas();
        try {
            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
            Alinear.setHorizontalAlignment(SwingConstants.LEFT);
            tblPersonas.getColumnModel().getColumn(0).setCellRenderer(Alinear);
            tblPersonas.getColumnModel().getColumn(1).setCellRenderer(Alinear);
            tblPersonas.getColumnModel().getColumn(2).setCellRenderer(Alinear);
            DefaultTableModel dtm = (DefaultTableModel) tblPersonas.getModel();
            dtm.setRowCount(0);

            for (int i = 0; i < this.lstPersonas.size(); i++) {
                dtm.addRow(new Object[]{
                    this.lstPersonas.get(i).getIdPersona(),
                    this.lstPersonas.get(i).getIdLector().getDescripcion(),
                    this.lstPersonas.get(i).getCedulaPersona(),
                    this.lstPersonas.get(i).getNombresPersona(),
                    this.lstPersonas.get(i).getApellidosPersona(),
                    this.lstPersonas.get(i).getDireccionPersona(),
                    this.lstPersonas.get(i).getTelefonoPersona(),
                    this.lstPersonas.get(i).getCorreoElectronico(),});
            }
        } catch (Exception e) {
        }
    }
    
    public void eliminarPersona() {
        try {
            if (personaServicios.eliminar(personaSel)) {
                JOptionPane.showMessageDialog(null, "Datos Eliminados Correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Datos no Eliminados ", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("eliminarPersona dice;" + e);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LECTORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Game of Thrones", 1, 12))); // NOI18N

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "TIPO LECTOR", "D.N.I", "NOMBRES", "APELLIDOS", "DIRECCIÓN", "TELÉFONO", "CORREO"
            }
        ));
        jScrollPane1.setViewportView(tblPersonas);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegresar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 167, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmGuardarPersona vista = new frmGuardarPersona();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila_seleccionada = tblPersonas.getSelectedRow();
        this.dispose();
        if (fila_seleccionada >= 0) {
            //lstLectores.this.dispose();
            frmActualizarPersona vista = new frmActualizarPersona();
            this.personaSel = lstPersonas.get(fila_seleccionada);
            vista.txtCodigo.setText(String.valueOf(lstPersonas.get(fila_seleccionada).getIdPersona()));
            vista.cbLectores.setSelectedItem(lstPersonas.get(fila_seleccionada).getIdLector().getDescripcion());
            vista.txtCedula.setText(lstPersonas.get(fila_seleccionada).getCedulaPersona());
            vista.txtNombres.setText(lstPersonas.get(fila_seleccionada).getNombresPersona());
            vista.txtApellidos.setText(lstPersonas.get(fila_seleccionada).getApellidosPersona());
            vista.txtDireccion.setText(lstPersonas.get(fila_seleccionada).getDireccionPersona());
            vista.txtTelefono.setText(lstPersonas.get(fila_seleccionada).getTelefonoPersona());
            vista.txtCorreo.setText(lstPersonas.get(fila_seleccionada).getCorreoElectronico());
            vista.setVisible(true);
            vista.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila.");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila_seleccionada = tblPersonas.getSelectedRow();
        this.dispose();
        if (fila_seleccionada >= 0) {
            this.personaSel= lstPersonas.get(fila_seleccionada);

            int decision = JOptionPane.showConfirmDialog(null, "¿Está seguro/a que desea eliminar este Registro?\n"
                    + "Código: " + personaSel.getIdPersona() + "\n"
                    + "Tipo Lector: " + personaSel.getIdLector().getDescripcion() + "\n"
                    + "D.N.I: " + personaSel.getCedulaPersona() + "\n"
                    + "Nombres: " + personaSel.getNombresPersona() + "\n"
                    + "Apellidos: " + personaSel.getApellidosPersona() + "\n"
                    + "Dirección: " + personaSel.getDireccionPersona() + "\n"
                    + "Teléfono: " + personaSel.getTelefonoPersona() + "\n"
                    + "E-Mail:" + personaSel.getCorreoElectronico() + "\n", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (decision == 0) {
                eliminarPersona();
                this.setVisible(true);
                this.setLocationRelativeTo(null);
            } else {
                this.setVisible(true);
                this.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila.");
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmPrincipal principal = new frmPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmPrincipal principal = new frmPrincipal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmListarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListarPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmListarPersonas persona = new frmListarPersonas();
                persona.setVisible(true);
                persona.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonas;
    // End of variables declaration//GEN-END:variables
}
