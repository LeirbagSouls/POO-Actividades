package ventanacontexto;

import javax.swing.*;
import java.awt.Container;

public class VentanaConTexto {
    private JFrame frame;

    private void makeFrame() {
        frame = new JFrame("ImageViewer");
        Container contentPane = frame.getContentPane();
        
        JLabel label = new JLabel("I am a label. I can display some text.");
        contentPane.add(label);
        
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        VentanaConTexto ventana = new VentanaConTexto();
        ventana.makeFrame();
    }
}
