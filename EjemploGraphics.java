/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplographics;

/**
 *
 * @author isabr
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploGraphics extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar una línea
        g.drawLine(10, 10, 100, 10);

        // Dibujar un rectángulo y rellenarlo
        g.drawRect(10, 30, 100, 50);
        g.setColor(Color.BLUE);
        g.fillRect(10, 30, 100, 50);

        // Dibujar un rectángulo redondeado y rellenarlo
        g.drawRoundRect(10, 100, 100, 50, 20, 20);
        g.setColor(Color.GREEN);
        g.fillRoundRect(10, 100, 100, 50, 20, 20);

        // Dibujar un óvalo y rellenarlo
        g.drawOval(150, 30, 100, 50);
        g.setColor(Color.RED);
        g.fillOval(150, 30, 100, 50);

        // Dibujar un arco y rellenarlo
        g.drawArc(150, 100, 100, 50, 0, 180);
        g.setColor(Color.YELLOW);
        g.fillArc(150, 100, 100, 50, 0, 180);

        // Escribir texto con una fuente específica
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.setColor(Color.BLACK);
        g.drawString("Texto con Graphics", 10, 200);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new EjemploGraphics());
        frame.setSize(300, 250);
        frame.setVisible(true);
    }
}
