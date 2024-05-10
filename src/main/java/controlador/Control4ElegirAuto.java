/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.*;

/**
 *
 * @author dcrio
 */
public class Control4ElegirAuto {
    public static Ventana4ElegirAuto ventana = new Ventana4ElegirAuto();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventoBtnElegirAuto(){
        ocultar();
        Control5ComprarAuto.mostrar();
    }
}
