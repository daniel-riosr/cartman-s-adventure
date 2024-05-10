/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Persona;
import vista.Ventana2Registro;

/**
 *
 * @author dcrio
 */
public class CreacionJson {
    
    public static void crearJson(String nombre, String documento, String telefono, String direccion, String correo){
        
        Gson gson1 = new Gson();
        
        Persona p1 = new Persona(nombre, documento, telefono, direccion, correo);
        
        gson1.toJson(p1);
        
        String infomia1 = gson1.toJson(p1);
        
        try (PrintWriter pw1 = new PrintWriter(new File("registroJson.json"))) {
            pw1.write(infomia1);
            System.out.println("json creado una belleza ");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
