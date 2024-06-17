package procesamientoimagenes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProcesamientoImagenes extends JFrame {
    private JButton btnDarker, btnLighter, btnThreshold;
    private JLabel imageLabel;
    private ImageIcon image;

    public ProcesamientoImagenes() {
        super("ImageJ - Procesamiento de imágenes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Cargar imagen
        image = new ImageIcon("C:\Users\leirb\Downloads\Logo.jpg");
        imageLabel = new JLabel(image);
        add(imageLabel);

        // Botón para oscurecer la imagen
        btnDarker = new JButton("Darker");
        btnDarker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para oscurecer la imagen
            }
        });
        add(btnDarker);

        // Botón para aclarar la imagen
        btnLighter = new JButton("Lighter");
        btnLighter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para aclarar la imagen
            }
        });
        add(btnLighter);

        // Botón para aplicar umbral
        btnThreshold = new JButton("Threshold");
        btnThreshold.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para aplicar umbral a la imagen
            }
        });
        add(btnThreshold);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ProcesamientoImagenes().setVisible(true);
            }
        });
    }
}
