/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import static controlador.Control11Carcel.eventoBtnCarcelFin;
import controlador.ImagePane;

/**
 *
 * @author dcrio
 */
public class Ventana11Carcel extends javax.swing.JFrame {

    /**
     * Creates new form Ventana11Carcel
     */
    public Ventana11Carcel() {
        initComponents();
        transparenciaButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new ImagePane("C:\\Users\\dcrio\\Documents\\NetBeansProjects\\Cartmans_Adventure\\src\\main\\java\\imagenes\\FondoCarcel.png");
        btnCarcelFin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCarcelFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarcelFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 416, Short.MAX_VALUE)
                .addComponent(btnCarcelFin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 369, Short.MAX_VALUE)
                .addComponent(btnCarcelFin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnCarcelFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarcelFinActionPerformed
        // TODO add your handling code here:
        eventoBtnCarcelFin();
    }//GEN-LAST:event_btnCarcelFinActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void transparenciaButton(){
        btnCarcelFin.setOpaque(false);
        btnCarcelFin.setContentAreaFilled(false);
        btnCarcelFin.setBorderPainted(false);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarcelFin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}