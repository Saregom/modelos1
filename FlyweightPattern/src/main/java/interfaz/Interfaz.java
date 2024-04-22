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
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

import logics.CellPhone;
import logics.CellPhoneFactory;
import logics.CellPhoneModel;

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain, pnlTitle, pnlSelects;
    private JLabel lblTitle, lblImgPhone, lblSelect1, lblSelect2, lblSelect3, lblSelect4, lblSelect5;
    private JButton btn1,  btn2;
    private ImageIcon imgPhone;
    private JScrollPane panelScroll;
    private JComboBox<String> lista1, lista2, lista3, lista4, lista5;
    private ArrayList<CellPhone> cellPhones;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("Personalizar Celular");//Setea el titulo de la app
        this.cellPhones = new ArrayList<>();
        showComponents();
    }
    
    //Muestra los componentes de la interfaz
    private void showComponents(){
        //Panels
        pnlMain = new JPanel();
        pnlMain.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlMain.setMaximumSize(new Dimension(634, 1200));
        pnlMain.setPreferredSize(new Dimension(634, 1200));
        
        
        pnlTitle = new JPanel();
        pnlTitle.setLayout(new BoxLayout(pnlTitle, BoxLayout.Y_AXIS));
        pnlTitle.setMaximumSize(new Dimension(624, 40));
        pnlTitle.setPreferredSize(new Dimension(624, 40));
        
        //Label titulo
        lblTitle = new JLabel("Crea tu propio celular");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
// ------- pnl selects
        pnlSelects = new JPanel();
        pnlSelects.setLayout(new BoxLayout(pnlSelects, BoxLayout.Y_AXIS));
        pnlSelects.setMaximumSize(new Dimension(624, 400));
        pnlSelects.setPreferredSize(new Dimension(624, 400));
        
        lblSelect1 = new JLabel("Modelo");
        lblSelect1.setFont(new Font("", Font.PLAIN, 16));
        lblSelect1.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect1.setAlignmentX(Component.CENTER_ALIGNMENT); 

        String[] model = {"Iphone x", "Moto G84"};
        lista1 = new JComboBox<>(model);
        lista1.setMaximumSize(new Dimension(200, 30)); 
        lista1.setPreferredSize(new Dimension(200, 30));
        
        lblSelect2 = new JLabel("Color");
        lblSelect2.setFont(new Font("", Font.PLAIN, 16));
        lblSelect2.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect2.setAlignmentX(Component.CENTER_ALIGNMENT); 

        String[] color = {"Azul", "Rojo"};
        lista2 = new JComboBox<>(color);
        lista2.setMaximumSize(new Dimension(200, 30)); 
        lista2.setPreferredSize(new Dimension(200, 30));
        
        lblSelect3 = new JLabel("Ram");
        lblSelect3.setFont(new Font("", Font.PLAIN, 16));
        lblSelect3.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect3.setAlignmentX(Component.CENTER_ALIGNMENT); 

        String[] ram = {"4GB", "6GB", "8Gb"};
        lista3 = new JComboBox<>(ram);
        lista3.setMaximumSize(new Dimension(200, 30)); 
        lista3.setPreferredSize(new Dimension(200, 30));
        
        lblSelect4 = new JLabel("Almacenamiento");
        lblSelect4.setFont(new Font("", Font.PLAIN, 16));
        lblSelect4.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect4.setAlignmentX(Component.CENTER_ALIGNMENT); 

        String[] storage = {"64GB", "128GB", "256Gb"};
        lista4 = new JComboBox<>(storage);
        lista4.setMaximumSize(new Dimension(200, 30)); 
        lista4.setPreferredSize(new Dimension(200, 30));
        
        lblSelect5 = new JLabel("Camara");
        lblSelect5.setFont(new Font("", Font.PLAIN, 16));
        lblSelect5.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect5.setAlignmentX(Component.CENTER_ALIGNMENT); 

        String[] camera = {"12MPx", "48Mpx", "108MPx"};
        lista5 = new JComboBox<>(camera);
        lista5.setMaximumSize(new Dimension(200, 30)); 
        lista5.setPreferredSize(new Dimension(200, 30));
        
        //Boton llama funciones
        btn1 = new JButton("Crear Celular");
        btn1.setMaximumSize(new Dimension(200, 30)); 
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btn2 = new JButton("Salir");
        btn2.setMaximumSize(new Dimension(200, 30)); 
        btn2.setPreferredSize(new Dimension(200, 30));
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn1.addActionListener((ActionEvent evt) -> {
            String colorHex = "#C3ECF4";
            if(lista2.getSelectedItem().equals("Rojo")){
                colorHex = "#f5b0ab";
            }
            CellPhoneModel phoneModel = CellPhoneFactory.getCellPhoneModel((String)lista1.getSelectedItem());
            CellPhone phone = new CellPhone((String)lista3.getSelectedItem(), (String)lista4.getSelectedItem(), (String)lista5.getSelectedItem(), colorHex, phoneModel);
            cellPhones.add(phone);
            
            setCelular(phone);
        });
        
        btn2.addActionListener((ActionEvent evt) -> {
            System.exit(0);
        });
        
        //Adicion de componentes
        pnlTitle.add(lblTitle);
        pnlMain.add(pnlTitle);
        
        pnlSelects.add(lblSelect1);
        pnlSelects.add(lista1);
        pnlSelects.add(lblSelect2);
        pnlSelects.add(lista2);
        pnlSelects.add(lblSelect3);
        pnlSelects.add(lista3);
        pnlSelects.add(lblSelect4);
        pnlSelects.add(lista4);
        pnlSelects.add(lblSelect5);
        pnlSelects.add(lista5);
        pnlSelects.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlSelects.add(btn1);
        pnlSelects.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlSelects.add(btn2);
        
        pnlMain.add(pnlSelects);
        

        //Atributos frame
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(660, 630);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    private void setCelular(CellPhone phone){
        JPanel pnlCell = new JPanel();
        pnlCell.setSize(100, 120);
        pnlCell.setLayout(new BoxLayout(pnlCell, BoxLayout.Y_AXIS));
        pnlCell.setMaximumSize(new Dimension(100, 120));
        pnlCell.setPreferredSize(new Dimension(100, 120)); 
        pnlCell.setBackground(Color.decode(phone.getColor()));

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
       
        SwingUtilities.updateComponentTreeUI(this);
//        this.invalidate();
//        this.validate();
//        this.repaint();
    }
}
