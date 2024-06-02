package interfaz;

//import Bridge.Bridge;
//import component.TarjetaGrafica;
import interfas.Celular;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
//import productosConcretos.TarjetaGraficaCompuesta;
//import productosConcretos.TarjetaGraficaSimple;

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain;
    private JLabel lblTitle, lblTitle2, lbl1, lbl2, lbl3;
    private JButton btn, btn1, btn2, btn3, btnSalir;
    private JTextField fld1, fld2, fld3;
    private Celular celularProxy;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(Celular celularProxy){
        super.setTitle("Celular Motorola"); //Setea el titulo de la app
        this.celularProxy = celularProxy;
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

        lblTitle = new JLabel("Ingresar a internet");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        //Labels, fields, botones
        lbl1 = new JLabel("Ingresa url de la pagina");
        lbl1.setFont(new Font("", Font.PLAIN, 16));
        lbl1.setBorder(new EmptyBorder(10,0,0,0));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        fld1 = new JTextField();
        fld1.setFont(new Font("", 0, 17));
        fld1.setMaximumSize(new Dimension(200, 30)); 
        fld1.setPreferredSize(new Dimension(200, 30));
        
        lbl2 = new JLabel("Contraseña");
        lbl2.setFont(new Font("", Font.PLAIN, 16));
        lbl2.setBorder(new EmptyBorder(10,0,0,0));
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        fld2 = new JTextField();
        fld2.setFont(new Font("", 0, 17));
        fld2.setMaximumSize(new Dimension(200, 30)); 
        fld2.setPreferredSize(new Dimension(200, 30));
        
        btn1 = new JButton("Ingresar");
        btn1.setMaximumSize(new Dimension(200, 30)); 
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //contacto
        lblTitle2 = new JLabel("Llamar a un contacto");
        lblTitle2.setFont(new Font("", Font.BOLD, 20));
        lblTitle2.setBorder(new EmptyBorder(30,0,0,0));
        lblTitle2.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        lbl3 = new JLabel("Ingresar número");
        lbl3.setFont(new Font("", Font.PLAIN, 16));
        lbl3.setBorder(new EmptyBorder(10,0,0,0));
        lbl3.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        fld3 = new JTextField();
        fld3.setFont(new Font("", 0, 17));
        fld3.setMaximumSize(new Dimension(200, 30)); 
        fld3.setPreferredSize(new Dimension(200, 30));
        
        btn2 = new JButton("Llamar");
        btn2.setMaximumSize(new Dimension(200, 30)); 
        btn2.setPreferredSize(new Dimension(200, 30));
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //btn salir
        btnSalir = new JButton("Salir del celular");
        btnSalir.setMaximumSize(new Dimension(200, 30)); 
        btnSalir.setPreferredSize(new Dimension(200, 30));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn1.addActionListener((ActionEvent evt) -> {
            JOptionPane.showMessageDialog(this, celularProxy.ingresarAFacebook(fld1.getText(), null), "Informacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btn2.addActionListener((ActionEvent evt) -> {
            JOptionPane.showMessageDialog(this, celularProxy.hacerLlamada(fld3.getText()), "Informacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btnSalir.addActionListener((ActionEvent evt) -> {
           System.exit(0);
        });
        
        //Adicion de componentess
        pnlMain.add(lblTitle);
        pnlMain.add(lbl1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(fld1);
        //pnlMain.add(lbl2);
        //pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        //pnlMain.add(fld2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btn1);
        pnlMain.add(lblTitle2);
        pnlMain.add(lbl3);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(fld3);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btn2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 30)));
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
