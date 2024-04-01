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
import practica_decorator.Practica_decorator;

/**
 *
 * @author santi
 */


/**
 * Clase que representa la interfaz gráfica de usuario para interactuar con el distribuidor de bicicletas.
 */
//Clase interfaz

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain;
    private JLabel lblTitle, lblSelect;
    private JButton btn, btnSalir;
    private JComboBox<String> lista;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("DISTRIBUIDOR DE BICICLETAS");//Setea el titulo de la app
        showComponents();
    }
    
    //Muestra los componentes de la interfaz
    private void showComponents(){
        //Paneles
        pnlMain = new JPanel();
        pnlMain.setSize(600, 540);
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
        pnlMain.setMaximumSize(new Dimension(600, 540));
        pnlMain.setPreferredSize(new Dimension(600, 540)); 

        //Label titulo
        lblTitle = new JLabel("BIENVENIDO A SU DISTRIBUIDOR DE BICICLETAS");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        //Labels y listas despleglables
        lblSelect = new JLabel("Escoge un componente para agregar");
        lblSelect.setFont(new Font("", Font.PLAIN, 16));
        lblSelect.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        String[] opciones = {"Frenos de disco", "Cambios shimano", "Manubrio de carbono"};
        lista = new JComboBox<>(opciones);
        lista.setMaximumSize(new Dimension(200, 30)); 
        lista.setPreferredSize(new Dimension(200, 30));
        
        //Boton llama funciones
        btn = new JButton("Agregar");
        btn.setMaximumSize(new Dimension(200, 30)); 
        btn.setPreferredSize(new Dimension(200, 30));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btnSalir = new JButton("Salir de la aplicacion");
        btnSalir.setMaximumSize(new Dimension(180, 30)); 
        btnSalir.setPreferredSize(new Dimension(180, 30));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn.addActionListener((ActionEvent evt) -> {
            JOptionPane.showMessageDialog(this, "Componentes bicicleta: \n\n" + Practica_decorator.setComponent((String)lista.getSelectedItem()), "Informacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btnSalir.addActionListener((ActionEvent evt) -> {
            System.exit(0);
        });
        
        //Adicion de componentes
        pnlMain.add(lblTitle);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlMain.add(lblSelect);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(btn);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 25)));
        pnlMain.add(btnSalir);

        //Atributos frame
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(600, 540);
        this.setLayout(new FlowLayout());  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}