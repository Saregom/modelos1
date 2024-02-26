/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

/**
 *
 * @author truque
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Figuras.Circulo;
import Figuras.Rectangulo;
import Interface.*;

// Clase interfaz
public class InterfazPracticaPrototype extends JFrame {
    private JComboBox<String> opcionesFigura;
    private JLabel labelLado1, labelLado2, labelRadio;
    private JTextField campoLado1, campoLado2, campoRadio;
    private JButton botonMostrar;
    private JPanel panelRectangulo, panelCirculo, panelBoton;
    Figuras_geometricas geometrica = null;
    Rectangulo rectangulo;
    Circulo circulo;

    // Constructor de la interfaz
    public InterfazPracticaPrototype(Rectangulo rectangulo, Circulo circulo) {
        setTitle("Selecciona una Figura");
        this.rectangulo = rectangulo;
        this.circulo = circulo;
        
        showComponents();
    }
    
    // Metodo llama componentes de la interfaz
    private void showComponents() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        opcionesFigura = new JComboBox<>(new String[]{"Rectangulo", "Circulo"});

        // Panel para el rectángulo
        panelRectangulo = new JPanel();
        panelRectangulo.setLayout(new GridLayout(2, 2));
        labelLado1 = new JLabel("Ancho:");
        campoLado1 = new JTextField(5);
        labelLado2 = new JLabel("Altura:");
        campoLado2 = new JTextField(5);
        panelRectangulo.add(labelLado1);
        panelRectangulo.add(campoLado1);
        panelRectangulo.add(labelLado2);
        panelRectangulo.add(campoLado2);

        // Panel para el círculo
        panelCirculo = new JPanel();
        panelCirculo.setLayout(new FlowLayout());
        labelRadio = new JLabel("Radio:");
        campoRadio = new JTextField(5);
        panelCirculo.add(labelRadio);
        panelCirculo.add(campoRadio);

        // Panel boton
        panelBoton = new JPanel();
        botonMostrar = new JButton("Clonar figura");
        botonMostrar.addActionListener((ActionEvent evt) -> {
            mostrarInformacion();
        });
        panelBoton.add(botonMostrar);

        setLayout(new BorderLayout());
        add(opcionesFigura, BorderLayout.NORTH);
        add(panelRectangulo, BorderLayout.CENTER);
        add(panelCirculo, BorderLayout.SOUTH);
        add(panelBoton, BorderLayout.EAST);

        //Action listeners
        opcionesFigura.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (opcionesFigura.getSelectedItem().equals("Rectangulo")) {
                    panelRectangulo.setVisible(true);
                    panelCirculo.setVisible(false);
                } else {
                    panelRectangulo.setVisible(false);
                    panelCirculo.setVisible(true);
                }
            }
        });

        panelRectangulo.setVisible(true);
        panelCirculo.setVisible(false);

        setVisible(true);
    }

    // Metodo Obtine datos, llama metodo para clonar
    private void mostrarInformacion() {
        String figuraSeleccionada = (String) opcionesFigura.getSelectedItem();
        if (figuraSeleccionada.equals("Rectangulo")) {
            int lado1 = Integer.parseInt(campoLado1.getText());
            int lado2 = Integer.parseInt(campoLado2.getText());
            clonarRectangulo(lado1, lado2);
        } else {
            int radio = Integer.parseInt(campoRadio.getText());
            clonarCirculo(radio);
        }
    }

    // Metodo clona el rectangulo
    private void clonarRectangulo(int lado1, int lado2) {
        this.geometrica = rectangulo.clonar();
        geometrica.setNombre("Rectangulo");
        geometrica.tamaño1(lado1, lado2);
        
        String info = "TAMAÑO ORIGINAL" + rectangulo.getposicion() + "\n\nTAMAÑO CLON" + geometrica.getposicion();
        JOptionPane.showMessageDialog(this, info, "Información del rectangulo", JOptionPane.INFORMATION_MESSAGE);
    }

    // Metodo clona el circulo
    private void clonarCirculo(int radio) {
        this.geometrica = circulo.clonar();
        geometrica.setNombre("Circulo");
        geometrica.tamaño2(radio);
        
        String info = "TAMAÑO ORIGINAL" + circulo.getposicion() + "\n\nTAMAÑO CLON" + geometrica.getposicion();
        JOptionPane.showMessageDialog(this, info, "Información del circulo", JOptionPane.INFORMATION_MESSAGE);
    }
}
