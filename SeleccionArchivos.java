/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccionarchivos;

/**
 *
 * @author isabr
 */
import javax.swing.*;
import java.io.File;

public class SeleccionArchivos {
    public static void main(String[] args) {
        // Crear un JFileChooser
        JFileChooser selector = new JFileChooser();

        // Establecer el directorio actual
        selector.setCurrentDirectory(new File(System.getProperty("user.home")));

        // Mostrar el diálogo para abrir archivos
        int resultado = selector.showOpenDialog(null);

        // Comprobar si el usuario seleccionó un archivo
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = selector.getSelectedFile();
            // Realizar la operación pertinente con el archivo seleccionado
            System.out.println("Archivo seleccionado: " + archivoSeleccionado.getAbsolutePath());
        } else {
            System.out.println("Operación cancelada por el usuario.");
        }
    }
}
