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
public class Control10Atropello {
    public static Ventana10Atropello ventana = new Ventana10Atropello();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventoBtnAtropelloSiguiente(){
        ocultar();
        Control11Carcel.mostrar();
    }
}
