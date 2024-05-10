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
public class Control9Busqueda {
    public static Ventana9Busqueda ventana = new Ventana9Busqueda();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventoBtnBusquedaSiguiente(){
        ocultar();
        Control10Atropello.mostrar();
    }
}
