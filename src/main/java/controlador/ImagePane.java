/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author dcrio
 */
import java.awt.*;
import javax.swing.*;

public class ImagePane extends JPanel {
    private Image image;
    private float opacity;

    public ImagePane(String imagePath) {
        try {
            image = new ImageIcon(imagePath).getImage();
            opacity = 1.0f;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
            g2d.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            g2d.dispose();
        }
    }

    public void setImage(String imagePath) {
        try {
            image = new ImageIcon(imagePath).getImage();
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setOpacity(float opacity) {
        this.opacity = Math.max(0.0f, Math.min(1.0f, opacity));
        repaint();
    }
}