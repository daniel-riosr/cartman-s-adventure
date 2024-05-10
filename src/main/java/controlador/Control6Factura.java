/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import static controlador.Control51Registro.ocultar;
import vista.*;

/**
 *
 * @author dcrio
 */
public class Control6Factura {
    public static Ventana6Factura ventana = new Ventana6Factura();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventoBtnFacturaSiguiente(){
        ocultar();
        Control7Invitacion.mostrar();
    }
}
