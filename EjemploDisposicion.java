package ejemplodisposicion;

import javax.swing.*;
import java.awt.*;

public class EjemploDisposicion {
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Ejemplo de Layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Crear un panel con FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Botón 1"));
        flowPanel.add(new JButton("Botón 2"));
        flowPanel.add(new JButton("Botón 3"));

        // Crear un panel con BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("Norte"), BorderLayout.NORTH);
        borderPanel.add(new JButton("Sur"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("Este"), BorderLayout.EAST);
        borderPanel.add(new JButton("Oeste"), BorderLayout.WEST);
        borderPanel.add(new JButton("Centro"), BorderLayout.CENTER);

        // Crear un panel con GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(3, 2));
        gridPanel.add(new JButton("Celda 1"));
        gridPanel.add(new JButton("Celda 2"));
        gridPanel.add(new JButton("Celda 3"));
        gridPanel.add(new JButton("Celda 4"));
        gridPanel.add(new JButton("Celda 5"));
        gridPanel.add(new JButton("Celda 6"));

        // Crear un panel con GridBagLayout
        JPanel gbagPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbagPanel.add(new JButton("Botón G1"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbagPanel.add(new JButton("Botón G2"), gbc);
        
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbagPanel.add(new JButton("Botón G3"), gbc);

        // Añadir los paneles al marco principal
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(flowPanel);
        frame.add(borderPanel);
        frame.add(gridPanel);
        frame.add(gbagPanel);

        // Mostrar el marco
        frame.setVisible(true);
    }
}

