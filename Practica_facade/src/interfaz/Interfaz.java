package interfaz;

import Cliente.Cliente;
import Facade.FacadePrestamo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain, pnlTitle, pnlX, pnlY1, pnlY2, pnlY3;
    private JLabel lblTitle, lblNoReqs, lbl1, lblSelect1, lblSelect2, lblSelect3;
    private JTextArea lblNoReqs1;
    private JButton btn1,  btn2;
    private JTextField fld1;
    private JComboBox<String> lista1, lista2, lista3;
    private Boolean fondo, reporte, prestamo;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("App Prestamos");//Setea el titulo de la app
        showComponents();
        showHideClient();
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
        
        lblTitle = new JLabel("App Prestamos");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
// --------------- PnlX
        pnlX = new JPanel();
        pnlX.setLayout(new BoxLayout(pnlX, BoxLayout.X_AXIS));
        pnlX.setMaximumSize(new Dimension(600, 350));
        pnlX.setPreferredSize(new Dimension(600, 350));
     
// --------------- PnlY1
        pnlY1 = new JPanel();
        pnlY1.setLayout(new BoxLayout(pnlY1, BoxLayout.Y_AXIS));
        pnlY1.setMaximumSize(new Dimension(600, 300));
        pnlY1.setPreferredSize(new Dimension(600, 300));
        pnlY1.setAlignmentY(Component.TOP_ALIGNMENT); 
        pnlY1.setBorder(BorderFactory.createTitledBorder("Interfaz Banco"));
        
        lblSelect1 = new JLabel("El cliente tiene fondos");
        lblSelect1.setFont(new Font("", Font.PLAIN, 16));
        lblSelect1.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect1.setAlignmentX(Component.CENTER_ALIGNMENT); 

        String[] str1 = {"Si", "No"};
        lista1 = new JComboBox<>(str1);
        lista1.setMaximumSize(new Dimension(200, 30)); 
        lista1.setPreferredSize(new Dimension(200, 30));
        
        lblSelect2 = new JLabel("El cliente esta reportado");
        lblSelect2.setFont(new Font("", Font.PLAIN, 16));
        lblSelect2.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect2.setAlignmentX(Component.CENTER_ALIGNMENT); 

        lista2 = new JComboBox<>(str1);
        lista2.setMaximumSize(new Dimension(200, 30)); 
        lista2.setPreferredSize(new Dimension(200, 30));
        
        lblSelect3 = new JLabel("El cliente posee prestamo");
        lblSelect3.setFont(new Font("", Font.PLAIN, 16));
        lblSelect3.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect3.setAlignmentX(Component.CENTER_ALIGNMENT); 

        lista3 = new JComboBox<>(str1);
        lista3.setMaximumSize(new Dimension(200, 30)); 
        lista3.setPreferredSize(new Dimension(200, 30));
        
        lista1.addActionListener((ActionEvent evt) -> {
            showHideClient();
        });
        lista2.addActionListener((ActionEvent evt) -> {
            showHideClient();
        });
        lista3.addActionListener((ActionEvent evt) -> {
            showHideClient();
        });
        
// --------------- PnlY2
        pnlY2 = new JPanel();
        pnlY2.setLayout(new BoxLayout(pnlY2, BoxLayout.Y_AXIS));
        pnlY2.setMinimumSize(new Dimension(250, 300));
        pnlY2.setMaximumSize(new Dimension(300, 300));
        pnlY2.setPreferredSize(new Dimension(300, 300));
        pnlY2.setAlignmentY(Component.TOP_ALIGNMENT); 
        pnlY2.setBorder(BorderFactory.createTitledBorder("Interfaz Cliente"));
        
        pnlY3 = new JPanel();
        pnlY3.setLayout(new BoxLayout(pnlY3, BoxLayout.Y_AXIS));
        pnlY3.setMinimumSize(new Dimension(250, 120));
        pnlY3.setMaximumSize(new Dimension(300, 120));
        pnlY3.setAlignmentY(Component.TOP_ALIGNMENT); 
        
        lblNoReqs = new JLabel("<html><center>El cliente no cumple con algunos requerimientos</center></html>");
        lblNoReqs.setFont(new Font("", Font.PLAIN, 15));
        lblNoReqs.setForeground(Color.red);
        lblNoReqs.setBorder(new EmptyBorder(10,0,10,0));
        lblNoReqs.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        lbl1 = new JLabel("Ingresa tu nombre");
        lbl1.setFont(new Font("", Font.PLAIN, 16));
        lbl1.setBorder(new EmptyBorder(0,0,0,0));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        fld1 = new JTextField();
        fld1.setFont(new Font("", 0, 14));
        fld1.setMaximumSize(new Dimension(200, 30)); 
        fld1.setPreferredSize(new Dimension(200, 30));
        fld1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btn1 = new JButton("Soslicitar prestamo");
        btn1.setMaximumSize(new Dimension(200, 30)); 
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btn2 = new JButton("Salir");
        btn2.setMaximumSize(new Dimension(200, 30)); 
        btn2.setPreferredSize(new Dimension(200, 30));
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn1.addActionListener((ActionEvent evt) -> {
            lblSelect1.setText("El cliente " + fld1.getText() + " tiene fondos");
            lblSelect2.setText("El cliente " + fld1.getText() + " esta reportado");
            lblSelect3.setText("El cliente " + fld1.getText() + " posee prestamo");
            
            switch ((String)lista1.getSelectedItem()) {
                case "No": fondo = false; break;
                default: fondo = true; break;
            }
            switch ((String)lista2.getSelectedItem()) {
                case "No": reporte = false; break;
                default: reporte = true; break;
            }
            switch ((String)lista3.getSelectedItem()) {
                case "No": prestamo = false; break;
                default: prestamo = true; break;
            }
            
            FacadePrestamo facade = new FacadePrestamo();
            String info = facade.reporte(new Cliente(fld1.getText()), fondo, reporte, prestamo);
            
            JOptionPane.showMessageDialog(this, info, "Informacion de cliente", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btn2.addActionListener((ActionEvent evt) -> {
            System.exit(0);
        });
        

// ----------- Adicion de componentes
        pnlMain.add(pnlTitle);
        pnlMain.add(pnlX);
       
        pnlTitle.add(lblTitle);
        
        pnlX.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlX.add(pnlY1);
        pnlX.add(pnlY2);
        
        pnlY1.add(lblSelect1);
        pnlY1.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlY1.add(lista1);
        pnlY1.add(lblSelect2);
        pnlY1.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlY1.add(lista2);
        pnlY1.add(lblSelect3);
        pnlY1.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlY1.add(lista3);
        
        pnlY2.add(lblNoReqs);
        pnlY2.add(pnlY3);
        pnlY3.add(lbl1);
        pnlY3.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlY3.add(fld1);
        pnlY3.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlY3.add(btn1);
        pnlY3.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlY2.add(btn2);
        
        

// ------------ Atributos frame
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(630, 500);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    public void showHideClient(){
        if(lista1.getSelectedItem().equals("No") || lista2.getSelectedItem().equals("Si") || lista3.getSelectedItem().equals("Si")){
            pnlY3.setVisible(false);
            lblNoReqs.setText("<html><center>El cliente NO cumple con algunos requerimientos</center></html>");
            lblNoReqs.setForeground(Color.red);
        }else{
            lblNoReqs.setText("<html><center>El cliente cumple con todos los requerimientos</center></html>");
            lblNoReqs.setForeground(Color.decode("#1bcf2a"));
            pnlY3.setVisible(true);
        }
    }
}
