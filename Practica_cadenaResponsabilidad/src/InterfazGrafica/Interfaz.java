/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazGrafica;

/**
 *
 * @author truqu
 */

import Interfaces.Manejo_principal;
import Manejos_concretos.Contabilidad;
import Manejos_concretos.Personal;
import Gerencia.gerencia;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

public class Interfaz extends JFrame{
    private final Manejo_principal contabilidad;

    public Interfaz() {
        // Instanciar los manejadores
        contabilidad = new Contabilidad(new Personal(new gerencia()));
        
        // Crear la ventana principal
        super.setTitle("Interfaz de Departamentos");
        
        // Crear panel contenedor
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(350, 180));
        panel.setLayout(new FlowLayout()); 
        
        JLabel lblTitle = new JLabel("Seleccione la peticion al dpto");
        lblTitle.setBorder(new EmptyBorder(10,0,10,0));
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        
        // Crear botones para cada tipo de departamento
        JButton contabilidadButton = new JButton("Contabilidad");
        contabilidadButton.addActionListener(new ActionListener() {
            @Override   
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("El pedido debe ser contestado por Contabilidad");
            }
        });
        
        JButton personalButton = new JButton("Personal");
        personalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("El pedido debe ser contestado por Personal");
            }
        });
        
        JButton gerenciaButton = new JButton("Gerencia");
        gerenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("La petición debe ser respondida solamente por la Gerencia");
            }
        });
        
        JButton salirButton = new JButton("Salir");
        salirButton.addActionListener((ActionEvent evt) -> {
            System.exit(0);
        });
        
        // Agregar botones al panel
        panel.add(lblTitle);
        panel.add(contabilidadButton);
        panel.add(personalButton);
        panel.add(gerenciaButton);
        panel.add(salirButton);
        
        // Agregar panel a la ventana
        this.add(panel);
        
        // Hacer visible la ventana
        this.setVisible(true);
        this.setSize(350, 180);
        this.setLayout(new FlowLayout());  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}