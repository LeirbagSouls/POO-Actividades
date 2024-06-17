/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomenu;

/**
 *
 * @author isabr
 */
import javax.swing.*;
import java.awt.*;

public class EjemploMenu extends JFrame {

    public EjemploMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Menú 1");
        menu1.add(new JMenuItem("Una opción de texto"));
        menu1.addSeparator();

        JRadioButtonMenuItem opcion1 = new JRadioButtonMenuItem("Opción 1");
        JRadioButtonMenuItem opcion2 = new JRadioButtonMenuItem("Opción 2");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(opcion1);
        grupo.add(opcion2);

        menu1.add(opcion1);
        menu1.add(opcion2);
        menu1.addSeparator();

        menu1.add(new JCheckBoxMenuItem("Selección 1", true));
        menu1.add(new JCheckBoxMenuItem("Selección 2"));

        JMenu submenu = new JMenu("Submenú");
        submenu.add(new JMenuItem("Opción 1"));
        submenu.add(new JMenuItem("Opción 2"));

        menu1.add(submenu);

        menuBar.add(menu1);
        menuBar.add(new JMenu("Menú 2"));

        setJMenuBar(menuBar);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploMenu();
    }
}
