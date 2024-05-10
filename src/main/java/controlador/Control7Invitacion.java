/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import static controlador.Control6Factura.ocultar;
import vista.*;

/**
 *
 * @author dcrio
 */
public class Control7Invitacion {
    public static Ventana7Invitacion ventana = new Ventana7Invitacion();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventoBtnInvitacionSiguiente(){
        ocultar();
        Control8Advertencia.mostrar();
    }
}
