/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Persona;
import vista.*  ;

/**
 *
 * @author dcrio
 */
public class Control51Registro {
    private static Persona persona;
    public static Ventana2Registro ventana = new Ventana2Registro();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventoBtnFinalizarCompra(){
        
    String nombre = Ventana2Registro.txtNombre.getText();
    String documento = Ventana2Registro.txtDocumento.getText();
    String telefono = Ventana2Registro.txtTelefono.getText();
    String direccion = Ventana2Registro.txtDireccion.getText();
    String correo = Ventana2Registro.txtCorreo.getText();

    Persona persona = new Persona(nombre, documento, telefono, direccion, correo);
    
    Control51Registro.setPersona(persona);

    ocultar();
    Control4ElegirAuto.mostrar();

    }
    public static Persona obtenerPersona() {
        return persona;
    }
    public static void setPersona(Persona nuevaPersona) {
        persona = nuevaPersona;
    }
}
