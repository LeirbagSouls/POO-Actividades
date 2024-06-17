/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lampara;

/**
 *
 * @author isabr
 */
import java.awt.*;
import java.applet.Applet;
import javax.swing.JFrame;

public class Lampara extends Applet {
    public void paint(Graphics g) {
        // Dibuja la base de la lámpara
        g.fillRect(120, 250, 60, 120);
        
        // Dibuja el soporte de la lámpara
        g.drawLine(150, 250, 150, 200);
        
        // Dibuja la pantalla de la lámpara
        g.drawArc(100, 150, 100, 100, 0, 180);
        
        // Rellena la pantalla de la lámpara
        g.setColor(Color.YELLOW);
        g.fillArc(100, 150, 100, 100, 0, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de Applet");
        Lampara lampara = new Lampara();
        
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(lampara);
        frame.setVisible(true);
    }
}
