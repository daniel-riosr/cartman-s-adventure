/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Control51Registro;
import controlador.Control5ComprarAuto;
import controlador.CreacionFactura;
import controlador.ImagePane;
import controlador.LecturaExcel;
import java.text.DecimalFormat;
import modelo.Persona;
import static vista.Ventana2Registro.txtCorreo;
import static vista.Ventana2Registro.txtDireccion;
import static vista.Ventana2Registro.txtDocumento;
import static vista.Ventana2Registro.txtNombre;
import static vista.Ventana2Registro.txtTelefono;

/**
 *
 * @author dcrio
 */
public class Ventana5ComprarAuto extends javax.swing.JFrame {

    /**
     * Creates new form Ventana5ComprarAuto
     */

    

    public Ventana5ComprarAuto() {
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

        jPanel1 = new ImagePane("C:\\Users\\dcrio\\Documents\\NetBeansProjects\\Cartmans_Adventure\\src\\main\\java\\imagenes\\FondoComprarAuto.png");
        btnComprarAuto1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnComprarAuto2 = new javax.swing.JButton();
        btnComprarAuto3 = new javax.swing.JButton();
        btnComprarAuto4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DecimalFormat formato = new DecimalFormat("#");
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnComprarAuto1.setAutoscrolls(true);
        btnComprarAuto1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 255), null, null));
        btnComprarAuto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAuto1ActionPerformed(evt);
            }
        });

        Object contenidoCelda153995 = LecturaExcel.leerCelda(15399, 5);
        Object contenidoCelda153996 = LecturaExcel.leerCelda(15399, 6);
        String texto1 = (String) contenidoCelda153995 + " " + contenidoCelda153996;
        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel1.setText(texto1);

        btnComprarAuto2.setAutoscrolls(true);
        btnComprarAuto2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 255), null, null));
        btnComprarAuto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAuto2ActionPerformed(evt);
            }
        });

        btnComprarAuto3.setAutoscrolls(true);
        btnComprarAuto3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 255), null, null));
        btnComprarAuto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAuto3ActionPerformed(evt);
            }
        });

        btnComprarAuto4.setAutoscrolls(true);
        btnComprarAuto4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 0, 255), null, null));
        btnComprarAuto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarAuto4ActionPerformed(evt);
            }
        });

        Object contenidoCelda153955 = LecturaExcel.leerCelda(15395, 5);
        Object contenidoCelda13956 = LecturaExcel.leerCelda(15395, 6);
        String texto2 = (String) contenidoCelda153955 + " " + contenidoCelda13956;
        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel2.setText(texto2);

        Object contenidoCelda153965 = LecturaExcel.leerCelda(15396, 5);
        Object contenidoCelda153966 = LecturaExcel.leerCelda(15396, 6);
        String texto3 = (String) contenidoCelda153965 + " " + contenidoCelda153966;
        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel3.setText(texto3);

        Object contenidoCelda154005 = LecturaExcel.leerCelda(15400, 5);
        Object contenidoCelda154006 = LecturaExcel.leerCelda(15400, 6);
        String texto4 = (String) contenidoCelda153965 + " " + contenidoCelda154006;
        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel4.setText(texto4);

        Object contenidoCelda1539566 = LecturaExcel.leerCelda(15395, 66);
        double precio2 = ((Number) contenidoCelda1539566).doubleValue();
        String precio2Formateado = formato.format(precio2);
        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel5.setText("$ " + precio2Formateado);

        Object contenidoCelda1539966 = LecturaExcel.leerCelda(15399, 66);
        double precio1 = ((Number) contenidoCelda1539966).doubleValue();
        String precio1Formateado = formato.format(precio1);
        jLabel6.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel6.setText("$ " + precio1Formateado);

        Object contenidoCelda1539666 = LecturaExcel.leerCelda(15396, 66);
        double precio3 = ((Number) contenidoCelda1539666).doubleValue();
        String precio3Formateado = formato.format(precio3);
        jLabel7.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel7.setText("$ " + precio3Formateado);

        Object contenidoCelda1540066 = LecturaExcel.leerCelda(15400, 66);
        double precio4 = ((Number) contenidoCelda1540066).doubleValue();
        String precio4Formateado = formato.format(precio4);
        jLabel8.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel8.setText("$ " + precio4Formateado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnComprarAuto1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnComprarAuto2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(176, 176, 176)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnComprarAuto4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnComprarAuto3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnComprarAuto2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComprarAuto1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnComprarAuto4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComprarAuto3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
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

    private void btnComprarAuto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAuto1ActionPerformed
        // TODO add your handling code here:Persona persona = Control51Registro.obtenerPersona();
        Persona persona = Control51Registro.obtenerPersona();

        if (persona != null) {
        String nombre = persona.getNombre();
        String documento = persona.getDocumento();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String correo = persona.getCorreo();

        Object contenidoCelda153995 = LecturaExcel.leerCelda(15399, 5);
        Object contenidoCelda153996 = LecturaExcel.leerCelda(15399, 6);
        String texto1 = (String) contenidoCelda153995 + " " + contenidoCelda153996;
        
         Object contenidoCelda1539966 = LecturaExcel.leerCelda(15399, 66);
        double precio1 = ((Number) contenidoCelda1539966).doubleValue();
        CreacionFactura.crearFactura(nombre, documento, telefono, direccion, correo, precio1, texto1);
    } else {
            System.out.println("no paila no dio");
    }
        
    Control5ComprarAuto.eventoBtnComprarAuto();
    }//GEN-LAST:event_btnComprarAuto1ActionPerformed

    private void btnComprarAuto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAuto2ActionPerformed
        // TODO add your handling code here:        
        Persona persona = Control51Registro.obtenerPersona();
      
        if (persona != null) {
        String nombre = persona.getNombre();
        String documento = persona.getDocumento();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String correo = persona.getCorreo();

        Object contenidoCelda153955 = LecturaExcel.leerCelda(15395, 5);
        Object contenidoCelda13956 = LecturaExcel.leerCelda(15395, 6);
        String texto2 = (String) contenidoCelda153955 + " " + contenidoCelda13956;
        
        Object contenidoCelda1539566 = LecturaExcel.leerCelda(15395, 66);
        double precio2 = ((Number) contenidoCelda1539566).doubleValue(); 
        CreacionFactura.crearFactura(nombre, documento, telefono, direccion, correo, precio2, texto2);
    } else {
            System.out.println("no paila no dio");
    }
        
    Control5ComprarAuto.eventoBtnComprarAuto();
        
    }//GEN-LAST:event_btnComprarAuto2ActionPerformed

    private void btnComprarAuto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAuto3ActionPerformed
        // TODO add your handling code here:
        Persona persona = Control51Registro.obtenerPersona();
      
        if (persona != null) {
        String nombre = persona.getNombre();
        String documento = persona.getDocumento();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String correo = persona.getCorreo();

        Object contenidoCelda154005 = LecturaExcel.leerCelda(15400, 5);
        Object contenidoCelda154006 = LecturaExcel.leerCelda(15400, 6);
        String texto3 = (String) contenidoCelda154005 + " " + contenidoCelda154006;
        
        Object contenidoCelda1540066 = LecturaExcel.leerCelda(15400, 66);
        double precio3 = ((Number) contenidoCelda1540066).doubleValue();
        CreacionFactura.crearFactura(nombre, documento, telefono, direccion, correo, precio3, texto3);
    } else {
            System.out.println("no paila no dio");
    }
        
    Control5ComprarAuto.eventoBtnComprarAuto();
    }//GEN-LAST:event_btnComprarAuto3ActionPerformed

    private void btnComprarAuto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarAuto4ActionPerformed
        // TODO add your handling code here:
        Persona persona = Control51Registro.obtenerPersona();
      
        if (persona != null) {
        String nombre = persona.getNombre();
        String documento = persona.getDocumento();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String correo = persona.getCorreo();

        Object contenidoCelda153965 = LecturaExcel.leerCelda(15396, 5);
        Object contenidoCelda153966 = LecturaExcel.leerCelda(15396, 6);
        String texto4 = (String) contenidoCelda153965 + " " + contenidoCelda153966;
        
        Object contenidoCelda1539666 = LecturaExcel.leerCelda(15396, 66);
        double precio4 = ((Number) contenidoCelda1539666).doubleValue();
        CreacionFactura.crearFactura(nombre, documento, telefono, direccion, correo, precio4, texto4);
    } else {
            System.out.println("no paila no dio");
    }
        
    Control5ComprarAuto.eventoBtnComprarAuto();
    }//GEN-LAST:event_btnComprarAuto4ActionPerformed

    public void transparenciaButton(){
        btnComprarAuto1.setOpaque(false);
        btnComprarAuto1.setContentAreaFilled(false);
        btnComprarAuto1.setBorderPainted(false);
        
        btnComprarAuto2.setOpaque(false);
        btnComprarAuto2.setContentAreaFilled(false);
        btnComprarAuto2.setBorderPainted(false);
        
        btnComprarAuto3.setOpaque(false);
        btnComprarAuto3.setContentAreaFilled(false);
        btnComprarAuto3.setBorderPainted(false);
        
        btnComprarAuto4.setOpaque(false);
        btnComprarAuto4.setContentAreaFilled(false);
        btnComprarAuto4.setBorderPainted(false);
        
    }
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarAuto1;
    private javax.swing.JButton btnComprarAuto2;
    private javax.swing.JButton btnComprarAuto3;
    private javax.swing.JButton btnComprarAuto4;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}