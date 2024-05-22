package interfaz;

import celular.Celular;
import iterator.Iterator;
import iterator.ShoppingCartCollention;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
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
    private JLabel lblTitle, lblTitle2, lbl1, lbl2, lbl3;
    private JButton btn1, btn2, btnSalir;
    private JComboBox<String> lista1, lista2, lista3, lista4;
    private DefaultComboBoxModel<String> model1, model2, model3;
    private ShoppingCartCollention collection;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("Iterable Collection"); //Setea el titulo de la app
        collection = new ShoppingCartCollention(5);
        showComponents();
    }
    
    //Muestra los componentes de la interfaz
    private void showComponents(){
//----- Panel main
        pnlMain = new JPanel();
        pnlMain.setSize(600, 540);
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
        pnlMain.setMaximumSize(new Dimension(600, 540));
        pnlMain.setPreferredSize(new Dimension(600, 540)); 

//----- Title 1
        lblTitle = new JLabel("Tienda de celulares");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);   
        
        lbl1 = new JLabel("Escoge la marca del celular");
        lbl1.setFont(new Font("", Font.PLAIN, 16));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        String[] str1 = {"Motorola", "Iphone", "Google"};
        lista1 = new JComboBox<>(str1);
        lista1.setMaximumSize(new Dimension(200, 30)); 
        lista1.setPreferredSize(new Dimension(200, 30));
        
        lbl2 = new JLabel("Escoge el modelo del celular");
        lbl2.setFont(new Font("", Font.PLAIN, 16));
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        model1 = new DefaultComboBoxModel<>();
        model1.addElement("Moto g72");
        model1.addElement("Moto g84");
        
        model2 = new DefaultComboBoxModel<>();
        model2.addElement("iPhone 14");
        model2.addElement("iPhone 15");
        
        model3 = new DefaultComboBoxModel<>();
        model3.addElement("Pixel 7");
        model3.addElement("Pixel 8");
        
        lista2 = new JComboBox<>(model1);
        lista2.setMaximumSize(new Dimension(200, 30)); 
        lista2.setPreferredSize(new Dimension(200, 30));
        
        btn1 = new JButton("Agregar al carrito");
        btn1.setMaximumSize(new Dimension(200, 30));
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btn2 = new JButton("Mostrar celulares del carrito");
        btn2.setMaximumSize(new Dimension(200, 30));
        btn2.setPreferredSize(new Dimension(200, 30));
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btnSalir = new JButton("Salir de la tienda");
        btnSalir.setMaximumSize(new Dimension(200, 30)); 
        btnSalir.setPreferredSize(new Dimension(200, 30));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
// ---- Action listeners
        lista1.addActionListener((ActionEvent evt) -> {
            switch ((String)lista1.getSelectedItem()) {
                case "Motorola":
                    lista2.setModel(model1); break;
                case "Iphone":
                    lista2.setModel(model2); break;
                case "Google":
                    lista2.setModel(model3); break;
            }
        });

        btn1.addActionListener((ActionEvent evt) -> {
            if(!collection.addCelular(new Celular((String)lista1.getSelectedItem(), (String)lista2.getSelectedItem()))){
                JOptionPane.showMessageDialog(this, "Se ha alcanzado el limite de 5 productos", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Celular agregado con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        btn2.addActionListener((ActionEvent evt) -> {
            Iterator iterator = collection.createIterator();
            String listaCel = "";
            int countCel = 1;
            
            while (iterator.hasNext()) {
                listaCel += countCel + ". " + iterator.next().getInfo() + "\n";
                countCel++;
            }
            
            if(listaCel.equals("")){
                JOptionPane.showMessageDialog(this, "Carrito vacio", "Carrito de compras", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, listaCel, "Carrito de compras", JOptionPane.INFORMATION_MESSAGE);
            }
        });
       
        btnSalir.addActionListener((ActionEvent evt) -> {
           System.exit(0);
        });
        
        //Adicion de componentess
        pnlMain.add(lblTitle);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lbl1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lbl2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btn1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 30)));
        pnlMain.add(btn2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 30)));
        pnlMain.add(btnSalir);
        
//----- Atributos frame
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(600, 540);
        this.setLayout(new FlowLayout());  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
