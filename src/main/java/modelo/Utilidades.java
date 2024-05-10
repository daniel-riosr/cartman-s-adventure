/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dcrio
 */
public class Utilidades {
    
    public static double masIva19(double valor){
        double vdesiva = valor * 1.19;
        return vdesiva;
    }
    
    public static double calcIva19(double valor){
        double iva = valor * 0.19;
        return iva;
    }
}
