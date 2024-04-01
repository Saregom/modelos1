package interfaz;

import Bridge.Bridge;
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

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain;
    private JLabel lblTitle, lblSelect, lblSelect2;
    private JButton btn;
    private JComboBox<String> lista, lista2;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("Personalizar Vehiculo");//Setea el titulo de la app
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
        lblTitle = new JLabel("Personaliza tu vehiculo");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        //Labels y listas despleglables
        lblSelect = new JLabel("Escoge un vehiculo");
        lblSelect.setFont(new Font("", Font.PLAIN, 16));
        lblSelect.setBorder(new EmptyBorder(30,0,0,0));
        lblSelect.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        String[] opciones = {"Carro basico", "Carro avanzado", "Moto"};
        lista = new JComboBox<>(opciones);
        lista.setMaximumSize(new Dimension(200, 30)); 
        lista.setPreferredSize(new Dimension(200, 30));
        
        lblSelect2 = new JLabel("Escoge un color");
        lblSelect2.setFont(new Font("", Font.PLAIN, 16));
        lblSelect2.setBorder(new EmptyBorder(25,0,0,0));
        lblSelect2.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        String[] opciones2 = {"Azul", "Rojo"};
        lista2 = new JComboBox<>(opciones2);
        lista2.setMaximumSize(new Dimension(200, 30)); 
        lista2.setPreferredSize(new Dimension(200, 30));
        
        //Boton llama funciones
        btn = new JButton("Personalizar");
        btn.setMaximumSize(new Dimension(200, 30)); 
        btn.setPreferredSize(new Dimension(200, 30));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn.addActionListener((ActionEvent evt) -> {
            JOptionPane.showMessageDialog(this, "Vehiculo personalizado: " + lista.getSelectedItem() + "\n\n" + 
                    Bridge.getVehiculo((String)lista.getSelectedItem(), (String)lista2.getSelectedItem()), 
                    "Informacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        //Adicion de componentes
        pnlMain.add(lblTitle);
        pnlMain.add(lblSelect);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista);
        pnlMain.add(lblSelect2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(btn);

        //Atributos frame
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(600, 540);
        this.setLayout(new FlowLayout());  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
