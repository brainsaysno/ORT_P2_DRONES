/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package drones.interfaz;

import drones.dominio.Dron;
import drones.dominio.Sistema;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Nicolas Russo
 * @author Francisco Suarez
 */
public class RegistrarDron extends javax.swing.JFrame {

  private Sistema sistema;

  /** Creates new form RegistrarDron */
  public RegistrarDron() {
    initComponents();
  }

  public RegistrarDron(Sistema s) {
    this.sistema = s;
    initComponents();
    hydrate();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the
   * Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    pnlIngresoDatos = new javax.swing.JPanel();
    lblIdentificacion = new javax.swing.JLabel();
    txtIdentificacion = new javax.swing.JTextField();
    lblModelo = new javax.swing.JLabel();
    txtModelo = new javax.swing.JTextField();
    lblTipo = new javax.swing.JLabel();
    txtTipo = new javax.swing.JTextField();
    btnAgregar = new javax.swing.JButton();
    pnlDatosDrones = new javax.swing.JPanel();
    scrollDrones = new javax.swing.JScrollPane();
    tblDrones = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Registrar Dron");
    setPreferredSize(new java.awt.Dimension(1200, 400));
    setResizable(false);
    getContentPane().setLayout(new java.awt.GridLayout(1, 2));

    java.awt.GridBagLayout pnlIngresoDatosLayout = new java.awt.GridBagLayout();
    pnlIngresoDatosLayout.columnWidths = new int[] { 0, 31, 0, 31, 0, 31, 0, 31, 0, 31, 0, 31, 0 };
    pnlIngresoDatosLayout.rowHeights = new int[] { 0, 54, 0, 54, 0, 54, 0 };
    pnlIngresoDatos.setLayout(pnlIngresoDatosLayout);

    lblIdentificacion.setText("Identificación");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(lblIdentificacion, gridBagConstraints);

    txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtIdentificacionActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(txtIdentificacion, gridBagConstraints);

    lblModelo.setText("Modelo");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(lblModelo, gridBagConstraints);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(txtModelo, gridBagConstraints);

    lblTipo.setText("Tipo de Cámara");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(lblTipo, gridBagConstraints);

    txtTipo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtTipoActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    pnlIngresoDatos.add(txtTipo, gridBagConstraints);

    btnAgregar.setText("Agregar");
    btnAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAgregarActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 12;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    pnlIngresoDatos.add(btnAgregar, gridBagConstraints);

    getContentPane().add(pnlIngresoDatos);

    pnlDatosDrones.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
    pnlDatosDrones.setLayout(new java.awt.BorderLayout());

    tblDrones.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {
            { null, null, null },
            { null, null, null },
            { null, null, null },
            { null, null, null }
        },
        new String[] {
            "Identificación", "Modelo", "Tipo de Cámara"
        }) {
      Class[] types = new Class[] {
          java.lang.String.class, java.lang.String.class, java.lang.Integer.class
      };
      boolean[] canEdit = new boolean[] {
          false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });
    scrollDrones.setViewportView(tblDrones);
    if (tblDrones.getColumnModel().getColumnCount() > 0) {
      tblDrones.getColumnModel().getColumn(0).setResizable(false);
      tblDrones.getColumnModel().getColumn(1).setResizable(false);
      tblDrones.getColumnModel().getColumn(2).setResizable(false);
    }

    pnlDatosDrones.add(scrollDrones, java.awt.BorderLayout.CENTER);

    getContentPane().add(pnlDatosDrones);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtIdentificacionActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txtIdentificacionActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txtIdentificacionActionPerformed

  private void txtTipoActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txtTipoActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txtTipoActionPerformed

  private void btnAgregarActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnAgregarActionPerformed
    if (txtIdentificacion.getText().equals("")) {
      showError("Ingrese la identificación.");
    } else if (txtModelo.getText().equals("")) {
      showError("Ingrese el modelo.");
    } else if (txtTipo.getText().equals("")) {
      showError("Ingrese el tipo de camara.");
    } else if (!Pattern.matches("[0-9]+", txtTipo.getText())) {
      showError("Tipo de camara incorrecto.");
    } else if (Integer.parseInt(txtTipo.getText()) > 6 || Integer.parseInt(txtTipo.getText()) < 1) {
      showError("Tipo de camara incorrecto. Ingrese 1 - 6.");
    } else {
      this.sistema.agregarDron(
          txtIdentificacion.getText(), txtModelo.getText(), Integer.parseInt(txtTipo.getText()));
      hydrate();
      showSuccess("Dron registrado correctamente.");
    }
  } // GEN-LAST:event_btnAgregarActionPerformed

  public void showSuccess(String message) {
    JOptionPane.showMessageDialog(null, message, "Éxito", JOptionPane.INFORMATION_MESSAGE);
  }

  public void showError(String message) {
    JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
  }

  public void hydrate() {
    ArrayList<Dron> drones = this.sistema.getDrones();

    DefaultTableModel tblModel = (DefaultTableModel) tblDrones.getModel();

    tblModel.setRowCount(0);

    for (int i = 0; i < drones.size(); i++) {
      Dron dron = drones.get(i);
      String[] row = { dron.getIdentificacion(), dron.getModelo(), String.valueOf(dron.getCamara()) };

      tblModel.addRow(row);
    }

    txtIdentificacion.setText("");
    txtModelo.setText("");
    txtTipo.setText("");
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAgregar;
  private javax.swing.JLabel lblIdentificacion;
  private javax.swing.JLabel lblModelo;
  private javax.swing.JLabel lblTipo;
  private javax.swing.JPanel pnlDatosDrones;
  private javax.swing.JPanel pnlIngresoDatos;
  private javax.swing.JScrollPane scrollDrones;
  private javax.swing.JTable tblDrones;
  private javax.swing.JTextField txtIdentificacion;
  private javax.swing.JTextField txtModelo;
  private javax.swing.JTextField txtTipo;
  // End of variables declaration//GEN-END:variables
}
