/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

/**
 *
 * @author truqu
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import logica.*;

public class InterfazRegistroAcceso {
    private JFrame frame;
    private JTextArea textArea;
    private JButton entradaButton;
    private JButton salidaButton;
    private JTextField idField;
    private JTextField nombreField;

    private RegistroAcceso registro;

    public InterfazRegistroAcceso() {
        frame = new JFrame("Registro de Acceso");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        registro = RegistroAcceso.getInstance(textArea);

        idField = new JTextField(10);
        nombreField = new JTextField(10);

        entradaButton = new JButton("Registrar Entrada");
        salidaButton = new JButton("Registrar Salida");

        entradaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String nombre = nombreField.getText();
                Empleado empleado = new Empleado(nombre, id);
                registro.registrarEntrada(empleado);
            }
        });

        salidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String nombre = nombreField.getText();
                Empleado empleado = new Empleado(nombre, id);
                registro.registrarSalida(empleado);
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Nombre:"));
        inputPanel.add(nombreField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(entradaButton);
        buttonPanel.add(salidaButton);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        InterfazRegistroAcceso interfaz = new InterfazRegistroAcceso();
        interfaz.mostrar();
    }
}