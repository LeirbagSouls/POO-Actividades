package confirmaciondialogo;

import javax.swing.JOptionPane;

public class ConfirmacionDialogo {
    public static void main(String[] args) {
        int seleccion = JOptionPane.showConfirmDialog(
            null,
            "¿Lo aceptas?",
            "Aviso",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.WARNING_MESSAGE
        );

        switch (seleccion) {
            case JOptionPane.YES_OPTION:
                // Código para manejar la opción "Sí"
                System.out.println("Has seleccionado 'Sí'.");
                break;
            case JOptionPane.NO_OPTION:
                // Código para manejar la opción "No"
                System.out.println("Has seleccionado 'No'.");
                break;
            case JOptionPane.CANCEL_OPTION:
                // Código para manejar la opción "Cancelar"
                System.out.println("Has seleccionado 'Cancelar'.");
                break;
            case JOptionPane.CLOSED_OPTION:
                // Código para manejar el cierre del cuadro de diálogo
                System.out.println("Has cerrado el cuadro de diálogo.");
                break;
            default:
                // Esta opción nunca debería alcanzarse
                System.err.println("Opción desconocida.");
        }
    }
}
