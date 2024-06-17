/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package micanvas;

/**
 *
 * @author isabr
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MiCanvas extends Canvas {
    public void paint(Graphics g) {
        // Establecer el color para dibujar el texto
        g.setColor(Color.RED);
        g.drawString("Texto en Canvas", 50, 50);
        
        // Dibujar un rectángulo alrededor del texto
        g.drawRect(45, 35, 150, 30);
        
        // Dibujar líneas con colores alternos
        for (int i = 0; i < 10; i++) {
            g.setColor(i % 2 == 0 ? Color.BLUE : Color.GREEN);
            g.drawLine(50, 70 + i * 10, 250, 70 + i * 10);
        }
        
        // Dibujar y rellenar un óvalo con transparencia
        Color colorConTransparencia = new Color(90, 120, 210, 125); // RGBA
        g.setColor(colorConTransparencia);
        g.fillOval(100, 150, 100, 50);
    }

    public static void main(String[] args) {
        MiCanvas canvas = new MiCanvas();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}
