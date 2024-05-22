package interfaz;

//import Bridge.Bridge;
//import component.TarjetaGrafica;
import Elemento_concreto.Tarjeta_con;
import Elemento_concreto.Tarjeta_sin;
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
import visitante_concreto.Descuento;
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
    private JComboBox<String> lista1;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("Servicio transmilenio"); //Setea el titulo de la app
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

        lblTitle = new JLabel("Servicio transmilenio");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        //Labels, fields, botones
        lbl1 = new JLabel("Tipo de tarjeta");
        lbl1.setFont(new Font("", Font.PLAIN, 16));
        lbl1.setBorder(new EmptyBorder(10,0,0,0));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        String[] model = {"Tarjeta con descuento", "Tarjeta sin descuento"};
        lista1 = new JComboBox<>(model);
        lista1.setMaximumSize(new Dimension(200, 30)); 
        lista1.setPreferredSize(new Dimension(200, 30));
        
        lbl2 = new JLabel("Ingresa al servicio");
        lbl2.setFont(new Font("", Font.PLAIN, 16));
        lbl2.setBorder(new EmptyBorder(10,0,0,0));
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        btn1 = new JButton("Ingresar");
        btn1.setMaximumSize(new Dimension(200, 30)); 
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
       
        
        //btn salir
        btnSalir = new JButton("Salir del servicio");
        btnSalir.setMaximumSize(new Dimension(200, 30)); 
        btnSalir.setPreferredSize(new Dimension(200, 30));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        lista1.addActionListener((ActionEvent evt) -> {
            
            
            //JOptionPane.showMessageDialog(this, celularProxy.ingresarAFacebook(fld1.getText(), null), "Informacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btn1.addActionListener((ActionEvent evt) -> {
            Tarjeta_con con = new Tarjeta_con();
            Tarjeta_sin sin = new Tarjeta_sin();
            con.setprecio(2000);
            sin.setprecio(2500);
            
            Descuento des = new Descuento();
            double res = con.acepto(des);
            double res1 = sin.acepto(des);

            String info = "";
            
            switch((String)lista1.getSelectedItem()){
                case "Tarjeta con descuento": 
                    info = "Valor con descuento: " + res;
                    break;
                case "Tarjeta sin descuento": 
                    info = "Valor sin descuento: " + res1;
                    break;
            }

            JOptionPane.showMessageDialog(this, "Valor total a pagar\n"+info, "Informacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btnSalir.addActionListener((ActionEvent evt) -> {
            System.exit(0);
        });
        
        //Adicion de componentess
        pnlMain.add(lblTitle);
        pnlMain.add(lbl1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lbl2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btn1);
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
