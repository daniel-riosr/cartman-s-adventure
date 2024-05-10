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
public class Control1Inicio {
    public static Ventana1Inicio ventana = new Ventana1Inicio();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventoBtnComenzar(){
        ocultar();
        Control51Registro.mostrar();
    }
}
