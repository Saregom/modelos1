package interfaz;

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
import practica_adapter.Practica_Adapter;

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //Atributos/Componentes de la interfaz
    private JPanel pnlMain;
    private JLabel lblTitle, lblSelect, lblSize;
    private JButton btn;
    private JComboBox<String> lista;
    
    //Constructor de la interfaz
    public Interfaz(){
        super.setTitle("Profesionales");//Llama constructor del frame y setea titulo
        showComponents();
    }
    
    //Mostrar componentes de la interfaz
    private void showComponents(){
        //Panel main
        pnlMain = new JPanel();
        pnlMain.setSize(600, 540);
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
        pnlMain.setMaximumSize(new Dimension(600, 540));
        pnlMain.setPreferredSize(new Dimension(600, 540)); 

        //Labels
        lblTitle = new JLabel("Mostrar habilidades del profesional");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        lblSelect = new JLabel("Escoge un profesional");
        lblSelect.setFont(new Font("", Font.PLAIN, 16));
        lblSelect.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        //Lista de opcion unica desplegable
        String[] opciones = {"Arquitecto", "Ingeniero", "Medico"};
        lista = new JComboBox<>(opciones);
        lista.setMaximumSize(new Dimension(200, 30)); 
        lista.setPreferredSize(new Dimension(200, 30));
        
        //Boton llama action listener
        btn = new JButton("Mostrar");
        btn.setMaximumSize(new Dimension(200, 30)); 
        btn.setPreferredSize(new Dimension(200, 30));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Actiion listeners
        btn.addActionListener((ActionEvent evt) -> {
            //Muestra un cuadro de dialogo con las habilidades del profesional
            JOptionPane.showMessageDialog(this, "Las habilidades del profesional son: \n\n" + Practica_Adapter.mostrarProfesional((String)lista.getSelectedItem()), "Informacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        //Adicion de componentes al panel
        pnlMain.add(lblTitle);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlMain.add(lblSelect);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(btn);

        //Atributos del frame (clase)
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(600, 540);
        this.setLayout(new FlowLayout());  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }
}