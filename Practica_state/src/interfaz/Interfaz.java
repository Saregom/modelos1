package interfaz;

import Probador.Probar_ascensor;
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
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain, pnlTitle, pnlY1;
    private JLabel lblTitle, lblTitle2, lblSelect1;
    private JButton btn1,  btn2;
    private JComboBox<String> lista1;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("Ascensor");//Setea el titulo de la app
        showComponents();
    }
    
    //Muestra los componentes de la interfaz
    private void showComponents(){
// -------- Panel main
        pnlMain = new JPanel();
        pnlMain.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlMain.setMaximumSize(new Dimension(610, 500));
        pnlMain.setPreferredSize(new Dimension(610, 500));
        
// -------- pnl Title
        pnlTitle = new JPanel();
        pnlTitle.setLayout(new BoxLayout(pnlTitle, BoxLayout.Y_AXIS));
        pnlTitle.setMaximumSize(new Dimension(600, 40));
        pnlTitle.setPreferredSize(new Dimension(600, 40));
        
        lblTitle = new JLabel("Ascensor");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT); 
     
// --------------- PnlY1
        pnlY1 = new JPanel();
        pnlY1.setLayout(new BoxLayout(pnlY1, BoxLayout.Y_AXIS));
        pnlY1.setMaximumSize(new Dimension(600, 300));
        pnlY1.setPreferredSize(new Dimension(600, 300));
        pnlY1.setAlignmentY(Component.TOP_ALIGNMENT); 
        
        lblSelect1 = new JLabel("Elija el estado del ascensor");
        lblSelect1.setFont(new Font("", Font.PLAIN, 16));
        lblSelect1.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect1.setAlignmentX(Component.CENTER_ALIGNMENT); 

        String[] str1 = {"En servicio", "En mantenimiento"};
        lista1 = new JComboBox<>(str1);
        lista1.setMaximumSize(new Dimension(200, 30));
        lista1.setPreferredSize(new Dimension(200, 30));
        
        lblTitle2 = new JLabel("Cambiar estado de ascensor");
        lblTitle2.setFont(new Font("", Font.BOLD, 20));
        lblTitle2.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle2.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        btn1 = new JButton("Utilizar ascensor");
        btn1.setMaximumSize(new Dimension(200, 30)); 
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btn2 = new JButton("Salir");
        btn2.setMaximumSize(new Dimension(200, 30)); 
        btn2.setPreferredSize(new Dimension(200, 30));
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn1.addActionListener((ActionEvent evt) -> {
            Probar_ascensor probar =new Probar_ascensor();
            JOptionPane.showMessageDialog(this, probar.pmenu((String)lista1.getSelectedItem()), "Informacion de cliente", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btn2.addActionListener((ActionEvent evt) -> {
            System.exit(0);
        });
        
// ----------- Adicion de componentes
        pnlMain.add(pnlTitle);
        pnlTitle.add(lblTitle);
        
        pnlY1.add(btn1);
        
        pnlY1.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlY1.add(lblTitle2);
        
        pnlY1.add(lblSelect1);
        pnlY1.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlY1.add(lista1);
        
        pnlY1.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlY1.add(btn2);
        
        pnlMain.add(pnlY1);
        

// ------------ Atributos frame
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(630, 500);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}