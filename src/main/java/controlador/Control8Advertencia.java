/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Auto;
import vista.*;

/**
 *
 * @author dcrio
 */
public class Control8Advertencia {
    public static Ventana8Advertencia ventana = new Ventana8Advertencia();
    
    public static VistaAuto vistaAuto; 

    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventoBtnAdvertenciaSiguiente(){
        ocultar();
        if (vistaAuto == null) {
            
            Auto modelo = new Auto();
            vistaAuto = new VistaAuto();
            ControladorAuto controlador = new ControladorAuto(modelo, vistaAuto);
        }
        vistaAuto.setVisible(true);
    }
}
