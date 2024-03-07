/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import practica_builder.Practica_builder;

/**
 *
 * @author santi
 */

//Clase creadora de la interfaz grafica
public class Interfaz extends JFrame{
//    componentes de la interfaz
    private JPanel pnlMain;
    private JLabel lblTitle, lblSelect;
    private JButton btnCrear;
    private JComboBox<String> listaSelect;
    public int indexListSelect; //Índice de la lista de camiones
    
//    Metodo constructor de la interfaz
    public Interfaz(){
        super.setTitle("Builder camion");
        showComponents();
    }
    
//    Mostrar componentes de la interfaz
    private void showComponents(){
//        Panel principal
        pnlMain = new JPanel();
        pnlMain.setSize(600, 540);
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
        pnlMain.setMaximumSize(new Dimension(600, 540));
        pnlMain.setPreferredSize(new Dimension(600, 540)); 

//        Textos
        lblTitle = new JLabel("Construir un camion");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        lblSelect = new JLabel("Escoge un tipo de camion");
        lblSelect.setFont(new Font("", Font.PLAIN, 16));
        lblSelect.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
//        Lista de camiones
        String[] opciones = {"Camion uno", "Camion dos"};
        listaSelect = new JComboBox<>(opciones);
        listaSelect.setMaximumSize(new Dimension(200, 30)); 
        listaSelect.setPreferredSize(new Dimension(200, 30));
        
//        Boton crear camion
        btnCrear = new JButton("Crear camion");
        btnCrear.setMaximumSize(new Dimension(200, 30)); 
        btnCrear.setPreferredSize(new Dimension(200, 30));
        btnCrear.setAlignmentX(Component.CENTER_ALIGNMENT);
        
//        Actiion listeners
        listaSelect.addActionListener(e -> {
            this.indexListSelect = listaSelect.getSelectedIndex();
        });
        
        btnCrear.addActionListener((ActionEvent evt) -> {
            JOptionPane.showMessageDialog(this, "Camion creado con: " + Practica_builder.elegirOpcion(indexListSelect), "Informacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
//        Adicion de componentes
        pnlMain.add(lblTitle);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlMain.add(lblSelect);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(listaSelect);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(btnCrear);

//        Atributos frame de la interfaz
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(600, 540);
        this.setLayout(new FlowLayout());  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
