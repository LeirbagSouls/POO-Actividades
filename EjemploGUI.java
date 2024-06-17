/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplogui;

/**
 *
 * @author isabr
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploGUI {
    public static void main(String[] args) {
        // Crear la ventana y el panel
        JFrame ventana = new JFrame("Ejemplo de Botones");
        JPanel panel = new JPanel();

        // Crear los botones y añadirlos al panel
        JButton boton = new JButton("Botón normal");
        JToggleButton botonSeleccionable = new JToggleButton("Botón seleccionable");
        JCheckBox checkBoxCine = new JCheckBox("Cine");
        JCheckBox checkBoxMusica = new JCheckBox("Música");
        JRadioButton radioHombre = new JRadioButton("Hombre");
        JRadioButton radioMujer = new JRadioButton("Mujer");
        JRadioButton radioAsexuado = new JRadioButton("Asexuado");

        // Agrupar los botones de radio para que solo uno pueda ser seleccionado a la vez
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioHombre);
        grupo.add(radioMujer);
        grupo.add(radioAsexuado);

        // Añadir elementos al panel
        panel.add(boton);
        panel.add(botonSeleccionable);
        panel.add(checkBoxCine);
        panel.add(checkBoxMusica);
        panel.add(radioHombre);
        panel.add(radioMujer);
        panel.add(radioAsexuado);

        // Configurar la ventana
        ventana.setContentPane(panel);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
