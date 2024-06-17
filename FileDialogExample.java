/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filedialogexample;

/**
 *
 * @author isabr
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileDialogExample {
    private Frame mainFrame;

    public FileDialogExample() {
        mainFrame = new Frame("Ejemplo de FileDialog");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        Button openButton = new Button("Abrir Archivo");
        Button saveButton = new Button("Guardar Archivo");

        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileDialog fileDialog = new FileDialog(mainFrame, "Abrir", FileDialog.LOAD);
                fileDialog.setVisible(true);
                if (fileDialog.getFile() != null) {
                    System.out.println("Archivo seleccionado: " + fileDialog.getDirectory() + fileDialog.getFile());
                } else {
                    System.out.println("Operación cancelada por el usuario.");
                }
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileDialog fileDialog = new FileDialog(mainFrame, "Guardar", FileDialog.SAVE);
                fileDialog.setVisible(true);
                if (fileDialog.getFile() != null) {
                    System.out.println("Archivo guardado: " + fileDialog.getDirectory() + fileDialog.getFile());
                } else {
                    System.out.println("Operación cancelada por el usuario.");
                }
            }
        });

        mainFrame.add(openButton);
        mainFrame.add(saveButton);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        FileDialogExample fileDialogExample = new FileDialogExample();
    }
}

