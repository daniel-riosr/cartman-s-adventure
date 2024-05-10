/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import static controlador.Control1Inicio.ocultar;
import vista.*;

/**
 *
 * @author dcrio
 */
public class Control5ComprarAuto {
    public static Ventana5ComprarAuto ventana = new Ventana5ComprarAuto();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventoBtnComprarAuto(){
        ocultar();
        Control6Factura.mostrar();
    }
}
