/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author dcrio
 */
public class Auto {
    private int x, y;
    private final int ANCHO_VENTANA = 600;
    private final int ALTO_VENTANA = 427;

    public Auto() {
        x = 0;
        y = ALTO_VENTANA - 160;
    }

    public void mover(int deltaX, int deltaY) {
        
        int newX = x + deltaX;
        int newY = y + deltaY;

        newX = Math.min(Math.max(newX, 0), ANCHO_VENTANA - 120); 
        newY = Math.min(Math.max(newY, 0), ALTO_VENTANA - 160); 

        // Actualizar la posición del auto
        x = newX;
        y = newY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    // Ojo, estoverifica si el auto está cerca de la esquina inferior derecha
    public boolean estaEnEsquinaInferiorDerecha() {
        return (x >= ANCHO_VENTANA - 120 && y >= ALTO_VENTANA - 160);
    }
}
