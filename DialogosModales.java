/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dialogosmodales;

/**
 *
 * @author isabr
 */
import javax.swing.JOptionPane;

public class DialogosModales {
    public static void main(String[] args) {
        // Diálogo de mensaje de error
        JOptionPane.showMessageDialog(null, "Error desconocido: algo salió mal.", "Error", JOptionPane.ERROR_MESSAGE);

        // Diálogo de mensaje de información
        JOptionPane.showMessageDialog(null, "Información importante para el usuario.", "Información", JOptionPane.INFORMATION_MESSAGE);

        // Diálogo de mensaje de advertencia
        JOptionPane.showMessageDialog(null, "Advertencia: por favor, proceda con precaución.", "Advertencia", JOptionPane.WARNING_MESSAGE);

        // Diálogo de mensaje simple
        JOptionPane.showMessageDialog(null, "Este mensaje es para ti.", "Mensaje", JOptionPane.PLAIN_MESSAGE);
    }
}
