/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author dcrio
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.Auto;
import vista.Ventana8Advertencia;
import vista.VistaAuto;

public class ControladorAuto implements KeyListener {
    private Auto modelo;
    private VistaAuto vista;

    public ControladorAuto(Auto modelo, VistaAuto vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.inicializarKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            modelo.mover(-5, 0); // Mover hacia la izquierda
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            modelo.mover(5, 0); // Mover hacia la derecha
        } else if (keyCode == KeyEvent.VK_DOWN) {
            modelo.mover(0, 5); // Mover hacia abajo
        }
        vista.actualizarPosicion(modelo.getX(), modelo.getY());
              if (modelo.estaEnEsquinaInferiorDerecha()){
            vista.finalizarJuego();
        }
    }
    
    public static VistaAuto ventana = new VistaAuto();
    
    public static void mostrar(){
        ventana.setVisible(true);
    }
    
    public static void ocultar(){
        ventana.setVisible(false);
    }
    
    public static void eventofinalizarjuego(){
        ocultar();
        Control9Busqueda.mostrar();
    }
  

    @Override
    public void keyReleased(KeyEvent e) {}
}
