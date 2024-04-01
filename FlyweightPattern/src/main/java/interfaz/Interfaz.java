package interfaz;

//import Bridge.Bridge;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;
import logics.CellPhone;

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain, pnlTitle;
    private JLabel lblTitle, lblImgPhone;
    private JButton btn;
    private ImageIcon imgPhone;
    private JScrollPane panelScroll;
    private ArrayList<CellPhone> cellPhones;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(ArrayList cellPhones){
        super.setTitle("Personalizar Vehiculo");//Setea el titulo de la app
        this.cellPhones = cellPhones;
        showComponents();
    }
    
    //Muestra los componentes de la interfaz
    private void showComponents(){
        //Panel
        
        pnlMain = new JPanel();
        pnlMain.setSize(635, 1200);
        pnlMain.setLayout(new FlowLayout(FlowLayout.LEFT));
//        pnlMain.setMaximumSize(new Dimension(500, 440));
        pnlMain.setPreferredSize(new Dimension(635, 1200));
        
        
        pnlTitle = new JPanel();
        pnlTitle.setSize(635, 40);
        pnlTitle.setLayout(new BoxLayout(pnlTitle, BoxLayout.Y_AXIS));
        pnlTitle.setMaximumSize(new Dimension(635, 40));
        pnlTitle.setPreferredSize(new Dimension(635, 40));
        
        //Label titulo
        lblTitle = new JLabel("Catalogo de celulares");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        //img
//        imgPhone = new ImageIcon(getClass().getResource("images/iphone14.png"));
//        lblImgPhone = new JLabel();
//        lblImgPhone.setIcon(new ImageIcon("iphone14.jpg"));
//        lblImgPhone.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Adicion de componentes
        pnlTitle.add(lblTitle);
        pnlMain.add(pnlTitle);

        for(CellPhone phone : cellPhones){
            //pnl cell
            JPanel pnlCell = new JPanel();
            pnlCell.setSize(100, 120);
            pnlCell.setLayout(new BoxLayout(pnlCell, BoxLayout.Y_AXIS));
            pnlCell.setMaximumSize(new Dimension(100, 120));
            pnlCell.setPreferredSize(new Dimension(100, 120)); 
            pnlCell.setBackground(Color.decode(phone.getPhoneModel().getColor()));
            
            JLabel lbl = new JLabel(phone.display());
            lbl.setFont(new Font("", Font.BOLD, 12));
            lbl.setBorder(new EmptyBorder(20,0,0,0));
            lbl.setAlignmentX(Component.CENTER_ALIGNMENT); 

            JLabel lbl2 = new JLabel("Ram: " + phone.getRam());
            lbl2.setFont(new Font("", Font.PLAIN, 12));
            lbl2.setBorder(new EmptyBorder(20,0,0,0));
            lbl2.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel lbl3 = new JLabel("Storage: " + phone.getStorage());
            lbl3.setFont(new Font("", Font.PLAIN, 12));
            lbl3.setBorder(new EmptyBorder(5,0,0,0));
            lbl3.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel lbl4 = new JLabel("Camera: " + phone.getCamera());
            lbl4.setFont(new Font("", Font.PLAIN, 12));
            lbl4.setBorder(new EmptyBorder(5,0,0,0));
            lbl4.setAlignmentX(Component.CENTER_ALIGNMENT);
            
            pnlCell.add(lbl);
            pnlCell.add(lbl2);
            pnlCell.add(lbl3);
            pnlCell.add(lbl4);
            pnlMain.add(pnlCell);
        }
        
        //Boton llama funciones
        btn = new JButton("Salir");
        btn.setMaximumSize(new Dimension(200, 30)); 
        btn.setPreferredSize(new Dimension(200, 30));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn.addActionListener((ActionEvent evt) -> {
            System.exit(0);
        });

        //Atributos frame
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(660, 600);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
