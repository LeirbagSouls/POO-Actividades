package selectordearchivos;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;

public class SelectorDeArchivos {
    public static void main(String[] args) {
        // Creación y configuración de un selector
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new FiltroTexto());
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        selector.setCurrentDirectory(new File(System.getProperty("user.dir")));

        // Mostrar el selector de ficheros
        int resultado = selector.showOpenDialog(null);

        // Procesar el resultado
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = selector.getSelectedFile();
            JOptionPane.showMessageDialog(null, "Archivo seleccionado: " + archivoSeleccionado.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo.");
        }
    }

    // Un filtro de ficheros para archivos de texto
    static class FiltroTexto extends FileFilter {
        public boolean accept(File f) {
            if (f.isDirectory()) {
                return true; // Aceptar directorios para la navegación
            }
            String nombre = f.getName();
            return nombre.endsWith(".txt"); // Filtrar por extensión .txt
        }

        public String getDescription() {
            return "Ficheros de texto (*.txt)"; // Descripción del filtro
        }
    }
}
