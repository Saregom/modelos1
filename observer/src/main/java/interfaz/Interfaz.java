package interfaz;

import notificador.Celular;
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
import observer.NotificacionFaceBook;
import observer.NotificacionWhatsApp;

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
    private final Celular celular;
    private NotificacionWhatsApp notiWhats;
    private NotificacionFaceBook notiFace;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(Celular celular){
        super.setTitle("Celular"); //Setea el titulo de la app
        this.celular = celular;
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

//----- pnl Title 1
        lblTitle = new JLabel("Abrir o cerrar aplicacion");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);   
        
        String[] str1 = {"Whatsapp", "Facebook"};
        lista1 = new JComboBox<>(str1);
        lista1.setMaximumSize(new Dimension(200, 30)); 
        lista1.setPreferredSize(new Dimension(200, 30));
        
        btn1 = new JButton("Abrir");
        btn1.setMaximumSize(new Dimension(200, 30));
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btn2 = new JButton("Cerrar");
        btn2.setMaximumSize(new Dimension(200, 30));
        btn2.setPreferredSize(new Dimension(200, 30));
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        
// ---- pnl Title 2
        lblTitle2 = new JLabel("Cambiar configuracion de celular");
        lblTitle2.setFont(new Font("", Font.BOLD, 20));
        lblTitle2.setBorder(new EmptyBorder(20,0,0,0));
        lblTitle2.setAlignmentX(Component.CENTER_ALIGNMENT);   
        
        lbl1 = new JLabel("WiFi");
        lbl1.setFont(new Font("", Font.PLAIN, 16));
        lbl1.setBorder(new EmptyBorder(10,0,0,0));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        String[] str2 = {"Prendido", "Apagado"};
        lista2 = new JComboBox<>(str2);
        lista2.setMaximumSize(new Dimension(200, 30)); 
        lista2.setPreferredSize(new Dimension(200, 30));
        
        lbl2 = new JLabel("Modo no molestar");
        lbl2.setFont(new Font("", Font.PLAIN, 16));
        lbl2.setBorder(new EmptyBorder(10,0,0,0));
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        lista3 = new JComboBox<>(str2);
        lista3.setMaximumSize(new Dimension(200, 30)); 
        lista3.setPreferredSize(new Dimension(200, 30));    
        
        lbl3 = new JLabel("Ahorro de energia");
        lbl3.setFont(new Font("", Font.PLAIN, 16));
        lbl3.setBorder(new EmptyBorder(10,0,0,0));
        lbl3.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        lista4 = new JComboBox<>(str2);
        lista4.setMaximumSize(new Dimension(200, 30)); 
        lista4.setPreferredSize(new Dimension(200, 30)); 
        
        btnSalir = new JButton("Salir del celular");
        btnSalir.setMaximumSize(new Dimension(200, 30)); 
        btnSalir.setPreferredSize(new Dimension(200, 30));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
// ---- Action listeners
        btn1.addActionListener((ActionEvent evt) -> {
            if(lista1.getSelectedItem().equals("Whatsapp") && notiWhats == null){
                notiWhats = new NotificacionWhatsApp();
                celular.agregarObservador(notiWhats);
            }else if(lista1.getSelectedItem().equals("Facebook") && notiFace == null){
                notiFace = new NotificacionFaceBook();
                celular.agregarObservador(notiFace);
            }
        });
        
        btn2.addActionListener((ActionEvent evt) -> {
            if(lista1.getSelectedItem().equals("Whatsapp") && notiWhats != null){
                celular.eliminarObservador(notiWhats);
                notiWhats = null;
            }else if(lista1.getSelectedItem().equals("Facebook") && notiFace != null){
                celular.eliminarObservador(notiFace);
                notiFace = null;
            }
        });
        
        lista2.addActionListener((ActionEvent evt) -> {
            String info;
            if(lista2.getSelectedItem().equals("Prendido")){
                info = celular.notificarObservadores("El wifi esta ENCENDIDO, se pueden enviar mensajes");
            }else{
                info = celular.notificarObservadores("El wifi esta APAGADO, NO se pueden enviar mensajes");
            }
            JOptionPane.showMessageDialog(this, info, "Notificacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        lista3.addActionListener((ActionEvent evt) -> {
            String info;
            if(lista3.getSelectedItem().equals("Prendido")){
                info = celular.notificarObservadores("Modo no molestar esta ENCENDIDO, no se recibiran mensajes");
            }else{
                info = celular.notificarObservadores("Modo no molestar esta APAGADO, se recibiran mensajes");
            }
            JOptionPane.showMessageDialog(this, info, "Notificacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        lista4.addActionListener((ActionEvent evt) -> {
            String info;
            if(lista4.getSelectedItem().equals("Prendido")){
                info = celular.notificarObservadores("Ahorro de energia esta ENCENDIDO, se limitaran algunas funciones");
            }else{
                info = celular.notificarObservadores("Ahorro de energia esta APAGADO, las funciones estan sin limitaciones");
            }
            JOptionPane.showMessageDialog(this, info, "Notificacion", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btnSalir.addActionListener((ActionEvent evt) -> {
           System.exit(0);
        });
        
        //Adicion de componentess
        pnlMain.add(lblTitle);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btn1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btn2);
        pnlMain.add(lblTitle2);
        pnlMain.add(lbl1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista2);
        pnlMain.add(lbl2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista3);
        pnlMain.add(lbl3);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista4);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
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
