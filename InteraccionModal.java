package interaccionmodal;

import javax.swing.JOptionPane;

public class InteraccionModal {
    public static void main(String[] args) {
        // Solicitar el nombre del usuario
        String nombre = JOptionPane.showInputDialog(null, "¿Cómo te llamas?", "Petición", JOptionPane.QUESTION_MESSAGE);
        if (nombre != null && !nombre.trim().isEmpty()) {
            System.out.println("Hola, " + nombre + "!");
        } else {
            System.out.println("No se proporcionó un nombre.");
        }

        // Opciones de colores para que el usuario elija
        String[] colores = {"rojo", "negro", "amarillo", "azul", "magenta"};
        Object colorSeleccionado = JOptionPane.showInputDialog(null, "Selecciona un color:", "Petición", JOptionPane.QUESTION_MESSAGE, null, colores, colores[0]);
        if (colorSeleccionado != null) {
            System.out.println("Has seleccionado el color: " + colorSeleccionado);
        } else {
            System.out.println("No se seleccionó ningún color.");
        }
    }
}

