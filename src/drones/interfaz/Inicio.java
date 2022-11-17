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
    frame.setLocationRelativeTo(null);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlButtons = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIngresoEgresoCarga = new javax.swing.JButton();
        btnRegistroDeVuelo = new javax.swing.JButton();
        btnRegistroArticulo = new javax.swing.JButton();
        btnRegistrarFuncionario = new javax.swing.JButton();
        btnRegistrarDron = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlButtons.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlButtons.setLayout(new java.awt.GridLayout(7, 1, 0, 10));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú");
        pnlButtons.add(jLabel1);

        btnIngresoEgresoCarga.setText("Ingreso/Egreso Carga");
        btnIngresoEgresoCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoEgresoCargaActionPerformed(evt);
            }
        });
        pnlButtons.add(btnIngresoEgresoCarga);

        btnRegistroDeVuelo.setText("Registro de Vuelo");
        btnRegistroDeVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDeVueloActionPerformed(evt);
            }
        });
        pnlButtons.add(btnRegistroDeVuelo);

        btnRegistroArticulo.setText("Registrar Articulo");
        btnRegistroArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroArticuloActionPerformed(evt);
            }
        });
        pnlButtons.add(btnRegistroArticulo);

        btnRegistrarFuncionario.setText("Registrar Funcionario");
        btnRegistrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFuncionarioActionPerformed(evt);
            }
        });
        pnlButtons.add(btnRegistrarFuncionario);

        btnRegistrarDron.setText("Registrar Dron");
        btnRegistrarDron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDronActionPerformed(evt);
            }
        });
        pnlButtons.add(btnRegistrarDron);

        btnEstadisticas.setText("Ver estadisticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        pnlButtons.add(btnEstadisticas);

        getContentPane().add(pnlButtons, java.awt.BorderLayout.CENTER);

        btnTerminar.setText("Termiinar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        btnTerminar.setText("Termiinar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTerminar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        Statistics stats = new Statistics(this.sistema);
        openFrame(stats);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnTerminarActionPerformed

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
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnIngresoEgresoCarga;
    private javax.swing.JButton btnRegistrarDron;
    private javax.swing.JButton btnRegistrarFuncionario;
    private javax.swing.JButton btnRegistroArticulo;
    private javax.swing.JButton btnRegistroDeVuelo;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlButtons;
    // End of variables declaration//GEN-END:variables
}
