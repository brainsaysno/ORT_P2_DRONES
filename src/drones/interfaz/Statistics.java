/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package drones.interfaz;

import drones.dominio.Dron;
import drones.dominio.Sistema;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Franc
 */
public class Statistics extends javax.swing.JFrame {
    
    private Sistema sistema;

    /**
     * Creates new form Statistics
     */
    public Statistics() {
        initComponents();
    }
    
    public Statistics (Sistema s){
        this.sistema = s;
        initComponents();
        
        lstDronesConVuelos.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if(!(arg0.getValueIsAdjusting())){
                    Dron dron = s.getDrones().stream().filter(d -> d.getIdentificacion()
                                .equals(lstDronesConVuelos.getSelectedValue()))
                                .collect(Collectors.toList()).get(0);
                    
                    String[] vuelos = new String[dron.getVuelos().size()];
                    
                    for (int i = 0; i < vuelos.length; i++) {
                        vuelos[i] = dron.getVuelos().get(i).toString();   
                    }
                    lstInfoVuelos.setListData(vuelos);
                }
            }
        });
        
        
        hydrate();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        pnlLeft = new javax.swing.JPanel();
        pnlDronesConVuelos = new javax.swing.JPanel();
        lblDronesConVuelos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDronesConVuelos = new javax.swing.JList<>();
        pnlDronesSinVuelos = new javax.swing.JPanel();
        lblDronesSinVuelos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstDronesSinVuelos = new javax.swing.JList<>();
        pnlInfoVuelos = new javax.swing.JPanel();
        lblInformacionVuelos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstInfoVuelos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadísticas");
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 700));

        pnlContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
        pnlContent.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        pnlLeft.setLayout(new java.awt.GridLayout(2, 1, 0, 20));

        pnlDronesConVuelos.setLayout(new java.awt.BorderLayout());

        lblDronesConVuelos.setText("Drones con vuelos");
        pnlDronesConVuelos.add(lblDronesConVuelos, java.awt.BorderLayout.NORTH);

        jScrollPane1.setViewportView(lstDronesConVuelos);

        pnlDronesConVuelos.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlLeft.add(pnlDronesConVuelos);

        pnlDronesSinVuelos.setLayout(new java.awt.BorderLayout());

        lblDronesSinVuelos.setText("Drones sin vuelos");
        pnlDronesSinVuelos.add(lblDronesSinVuelos, java.awt.BorderLayout.NORTH);

        jScrollPane3.setViewportView(lstDronesSinVuelos);

        pnlDronesSinVuelos.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        pnlLeft.add(pnlDronesSinVuelos);

        pnlContent.add(pnlLeft);

        pnlInfoVuelos.setLayout(new java.awt.BorderLayout());

        lblInformacionVuelos.setText("Informacion vuelos");
        pnlInfoVuelos.add(lblInformacionVuelos, java.awt.BorderLayout.NORTH);

        jScrollPane2.setViewportView(lstInfoVuelos);

        pnlInfoVuelos.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pnlContent.add(pnlInfoVuelos);

        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDronesConVuelos;
    private javax.swing.JLabel lblDronesSinVuelos;
    private javax.swing.JLabel lblInformacionVuelos;
    private javax.swing.JList<String> lstDronesConVuelos;
    private javax.swing.JList<String> lstDronesSinVuelos;
    private javax.swing.JList<String> lstInfoVuelos;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDronesConVuelos;
    private javax.swing.JPanel pnlDronesSinVuelos;
    private javax.swing.JPanel pnlInfoVuelos;
    private javax.swing.JPanel pnlLeft;
    // End of variables declaration//GEN-END:variables

    private void hydrate() {
        ArrayList<Dron> drones = this.sistema.getDrones();
        
        lstDronesConVuelos.setListData(drones.stream()
        .filter(d -> !d.getVuelos().isEmpty()).map(d -> d.toString()).toArray(String[]::new));
        
        lstDronesSinVuelos.setListData(drones.stream()
        .filter(d -> d.getVuelos().isEmpty()).map(d -> d.toString()).toArray(String[]::new));        
    }
}
