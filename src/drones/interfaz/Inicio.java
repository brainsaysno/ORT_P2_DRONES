/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package drones.interfaz;

import drones.dominio.Sistema;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author nrusso
 */
public class Inicio extends javax.swing.JFrame {

  Sistema sistema;

  /** Creates new form Inicio */
  public Inicio() {
    initComponents();
  }

  public Inicio(Sistema s) {
    this.sistema = s;
    initComponents();
    this.addWindowListener(
        new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
            try {
              FileOutputStream fileOut = new FileOutputStream("./sistema.ser");
              ObjectOutputStream out = new ObjectOutputStream(fileOut);
              out.writeObject(sistema);
              out.close();
              fileOut.close();
              Logger.getLogger(Inicio.class.getName())
                  .log(Level.INFO, "Sistema serializado y guardado correctamente");

            } catch (FileNotFoundException ex) {

              Logger.getLogger(Inicio.class.getName())
                  .log(Level.SEVERE, "El archivo de serialización no existe", ex);

            } catch (IOException ex) {

              Logger.getLogger(Inicio.class.getName())
                  .log(Level.SEVERE, "La serialización ha fallado", ex);

            }
          }
        });
  }

  private void openFrame(javax.swing.JFrame frame) {
    javax.swing.JFrame inicio = this;
    inicio.setVisible(false);
    frame.setVisible(true);
    frame.addWindowListener(
        new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
            inicio.setVisible(true);
          }
        });
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

    btnIngresoEgresoCarga = new javax.swing.JButton();
    btnRegistroDeVuelo = new javax.swing.JButton();
    btnRegistroArticulo = new javax.swing.JButton();
    btnRegistrarFuncionario = new javax.swing.JButton();
    btnRegistrarDron = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridLayout(3, 2, 30, 30));

    btnIngresoEgresoCarga.setText("Ingreso/Egreso Carga");
    btnIngresoEgresoCarga.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnIngresoEgresoCargaActionPerformed(evt);
          }
        });
    getContentPane().add(btnIngresoEgresoCarga);

    btnRegistroDeVuelo.setText("Registro de Vuelo");
    btnRegistroDeVuelo.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegistroDeVueloActionPerformed(evt);
          }
        });
    getContentPane().add(btnRegistroDeVuelo);
    btnRegistroArticulo.setText("Registrar Articulo");
    btnRegistroArticulo.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegistroArticuloActionPerformed(evt);
          }
        });
    getContentPane().add(btnRegistroArticulo);

    btnRegistrarFuncionario.setText("Registrar Funcionario");
    btnRegistrarFuncionario.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegistrarFuncionarioActionPerformed(evt);
          }
        });
    getContentPane().add(btnRegistrarFuncionario);

    btnRegistrarDron.setText("Registrar Dron");
    btnRegistrarDron.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegistrarDronActionPerformed(evt);
          }
        });
    getContentPane().add(btnRegistrarDron);

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void btnIngresoEgresoCargaActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnIngresoEgresoCargaActionPerformed
    IngresoEgresoCarga ingresoEgreso = new IngresoEgresoCarga(this.sistema);
    openFrame(ingresoEgreso);
  } // GEN-LAST:event_btnIngresoEgresoCargaActionPerformed

  private void btnRegistroDeVueloActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnRegistroDeVueloActionPerformed    
      RegistrarVuelo registroDeVuelo = new RegistrarVuelo(this.sistema);
      openFrame(registroDeVuelo);
  } // GEN-LAST:event_btnRegistroDeVueloActionPerformed

  private void btnRegistroArticuloActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnRegistroArticuloActionPerformed
    RegistrarArticulo registrarArticulo = new RegistrarArticulo(this.sistema);
    openFrame(registrarArticulo);
  } // GEN-LAST:event_btnRegistroArticuloActionPerformed

  private void btnRegistrarFuncionarioActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnRegistrarFuncionarioActionPerformed
    RegistrarFuncionario registrarFuncionario = new RegistrarFuncionario(this.sistema);
    openFrame(registrarFuncionario);
  } // GEN-LAST:event_btnRegistrarFuncionarioActionPerformed

  private void btnRegistrarDronActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_btnRegistrarDronActionPerformed
    RegistrarDron registrarDron = new RegistrarDron(this.sistema);
    openFrame(registrarDron);
  } // GEN-LAST:event_btnRegistrarDronActionPerformed

  // /**
  // * @param args the command line arguments
  // */
  // public static void main(String args[]) {
  // /* Set the Nimbus look and feel */
  // //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code
  // (optional) ">
  // /* If Nimbus (introduced in Java SE 6) is not available, stay with the
  // default look and
  // feel.
  // * For details see
  // http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
  // */
  // try {
  // for (javax.swing.UIManager.LookAndFeelInfo info :
  // javax.swing.UIManager.getInstalledLookAndFeels()) {
  // if ("Nimbus".equals(info.getName())) {
  // javax.swing.UIManager.setLookAndFeel(info.getClassName());
  // break;
  // }
  // }
  // } catch (ClassNotFoundException ex) {
  //
  // java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE,
  // null, ex);
  // } catch (InstantiationException ex) {
  //
  // java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE,
  // null, ex);
  // } catch (IllegalAccessException ex) {
  //
  // java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE,
  // null, ex);
  // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
  //
  // java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE,
  // null, ex);
  // }
  // //</editor-fold>
  //
  // /* Create and display the form */
  // java.awt.EventQueue.invokeLater(new Runnable() {
  // public void run() {
  // new Inicio().setVisible(true);
  // }
  // });
  // }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnIngresoEgresoCarga;
  private javax.swing.JButton btnRegistrarDron;
  private javax.swing.JButton btnRegistroDeVuelo;
  private javax.swing.JButton btnRegistrarFuncionario;
  private javax.swing.JButton btnRegistroArticulo;
  // End of variables declaration//GEN-END:variables
}
