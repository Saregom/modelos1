/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
/**
 *
 * @author truqu
 */
public class RegistroAcceso{
    private static RegistroAcceso instance;
    private JTextArea textArea;

    private RegistroAcceso(JTextArea textArea) {
        this.textArea = textArea;
    }

    public static RegistroAcceso getInstance(JTextArea textArea) {
        if (instance == null) {
            instance = new RegistroAcceso(textArea);
        }
        return instance;
    }

    public void registrarEntrada(Empleado empleado) {
        textArea.append(empleado.getNombre() + " ha entrado al edificio.\n");
    }

    public void registrarSalida(Empleado empleado) {
        textArea.append(empleado.getNombre() + " ha salido del edificio.\n");
    }
}


