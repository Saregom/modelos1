/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import logics.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author santi
 */
public class Interfaz extends JFrame{
    private JPanel pnlMain;
    private JLabel lblTitle, lblSelect, lblSize;
    private JTextField fldFigureSize;
    private JButton btnCalculate;
    private JComboBox<String> listaFiguras;
    public ArrayList<Figura> figuras;
    public int figuraIndex;
    
    public Interfaz(ArrayList<Figura> figuras){
        super.setTitle("Calcula areas figuras");
        this.figuras = figuras;
        showComponents();
    }
    
    private void showComponents(){
        pnlMain = new JPanel();
        pnlMain.setSize(600, 540);
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
        pnlMain.setMaximumSize(new Dimension(600, 540));
        pnlMain.setPreferredSize(new Dimension(600, 540)); 

        lblTitle = new JLabel("Calcula área de figuras");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        lblSelect = new JLabel("Escoge una figura");
        lblSelect.setFont(new Font("", Font.PLAIN, 16));
        lblSelect.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        String[] opciones = {"Circulo", "Cuadrado", "Triangulo isoceles"};
        listaFiguras = new JComboBox<>(opciones);
        listaFiguras.setMaximumSize(new Dimension(200, 30)); 
        listaFiguras.setPreferredSize(new Dimension(200, 30));
        
        lblSize = new JLabel("Ingresa el tamaño de lado de la figura:");
        lblSize.setFont(new Font("", Font.PLAIN, 16));
        lblSize.setBorder(new EmptyBorder(10,0,0,0));
        lblSize.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        fldFigureSize = new JTextField();
        fldFigureSize.setFont(new Font("", 0, 17));
        fldFigureSize.setMaximumSize(new Dimension(200, 30)); 
        fldFigureSize.setPreferredSize(new Dimension(200, 30));
        
        btnCalculate = new JButton("Calcular figura");
        btnCalculate.setMaximumSize(new Dimension(200, 30)); 
        btnCalculate.setPreferredSize(new Dimension(200, 30));
        btnCalculate.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Actiion listeners
        btnCalculate.addActionListener((ActionEvent evt) -> {
            if(fldFigureSize.getText().equals("")){
                JOptionPane.showMessageDialog(this, "El campo esta vacio", "Informacion", JOptionPane.ERROR_MESSAGE);
            }else{
                figuras.get(figuraIndex).setTamanio(Double.parseDouble(fldFigureSize.getText()));
                JOptionPane.showMessageDialog(this, "El area de la figura es: " + figuras.get(figuraIndex).calcularArea(), "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
            
        });
        
        listaFiguras.addActionListener(e -> {
            this.figuraIndex = listaFiguras.getSelectedIndex();
        });
        
        //Adicion de componentes
        pnlMain.add(lblTitle);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlMain.add(lblSelect);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(listaFiguras);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(lblSize);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(fldFigureSize);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btnCalculate);

        //Atributos frame
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(600, 540);
        this.setLayout(new FlowLayout());  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
