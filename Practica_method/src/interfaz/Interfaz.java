package interfaz;

//import Bridge.Bridge;
//import component.TarjetaGrafica;
import Abstracto.Triangulo;
import Abstracto.TrianguloFactory;
import concretoCreador.TrianguloCreador;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
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

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain;
    private JLabel lblTitle, lbl1;
    private JButton btn1, btnSalir;
    private JTextField fld1, fld2, fld3;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("Triangulo"); //Setea el titulo de la app
        showComponents();
    }
    
    //Muestra los componentes de la interfaz
    private void showComponents(){
        //Panel
        pnlMain = new JPanel();
        pnlMain.setSize(600, 540);
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
        pnlMain.setMaximumSize(new Dimension(600, 540));
        pnlMain.setPreferredSize(new Dimension(600, 540)); 

        lblTitle = new JLabel("Consulta caracteristicas de un triangulo");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        //Labels, fields, botones
        lbl1 = new JLabel("Digita los lados del triangulo (a,b,c)");
        lbl1.setFont(new Font("", Font.PLAIN, 16));
        lbl1.setBorder(new EmptyBorder(10,0,0,0));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        fld1 = new JTextField();
        fld1.setFont(new Font("", 0, 17));
        fld1.setMaximumSize(new Dimension(200, 30)); 
        fld1.setPreferredSize(new Dimension(200, 30));
        
        fld2 = new JTextField();
        fld2.setFont(new Font("", 0, 17));
        fld2.setMaximumSize(new Dimension(200, 30)); 
        fld2.setPreferredSize(new Dimension(200, 30));
        
        fld3 = new JTextField();
        fld3.setFont(new Font("", 0, 17));
        fld3.setMaximumSize(new Dimension(200, 30)); 
        fld3.setPreferredSize(new Dimension(200, 30));
        
        btn1 = new JButton("Consulta tipo y superficie");
        btn1.setMaximumSize(new Dimension(200, 30)); 
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //btn salir
        btnSalir = new JButton("Salir del celular");
        btnSalir.setMaximumSize(new Dimension(200, 30)); 
        btnSalir.setPreferredSize(new Dimension(200, 30));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn1.addActionListener((ActionEvent evt) -> {
            TrianguloFactory fabrica=new TrianguloCreador(); //
            Triangulo triangulo = fabrica.CrearTriangulo(Integer.parseInt(fld1.getText()),Integer.parseInt(fld2.getText()),Integer.parseInt(fld3.getText()));
            JOptionPane.showMessageDialog(this, "Este trriangulo es de tipo: " + triangulo.describir() + "\n" + "Su suprficie es : " + triangulo.Superficie(), "Informacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btnSalir.addActionListener((ActionEvent evt) -> {
           System.exit(0);
        });
        
        //Adicion de componentess
        pnlMain.add(lblTitle);
        pnlMain.add(lbl1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(fld1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(fld2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(fld3);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btn1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 20)));
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