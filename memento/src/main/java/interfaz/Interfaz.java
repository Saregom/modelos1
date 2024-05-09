package interfaz;

import contaco.Caretaker;
import contaco.Contacto;
import contaco.Originator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
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

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain, pnlTabla, pnlTabla2, pnl1, pnl2, pnl3;
    private JTable tabla, tabla2;
    private JLabel lblTitle, lblTitle2, lbl1, lbl2, lbl3, lbl4;
    private JTextField fld1, fld2, fld3;
    private JButton btn1, btn2, btn3, btn4, btn5, btnSalir;
    private JScrollPane panelScroll, panelScroll2;
    private JComboBox<String> lista1;
    private Originator originator;
    private Caretaker caretaker;
    private DefaultComboBoxModel<String> model;
    
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(Originator originator, Caretaker caretaker){
        super.setTitle("Lista de contactos");//Setea el titulo de la app
        this.originator = originator;
        this.caretaker = caretaker;
        showComponents();
    }
    
    //Muestra los componentes de la interfaz
    private void showComponents(){
//----- Panel main
        pnlMain = new JPanel();
        pnlMain.setSize(600, 600);
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
        pnlMain.setMaximumSize(new Dimension(600, 600));
        pnlMain.setPreferredSize(new Dimension(600, 600)); 

//----- Titulo
        lblTitle = new JLabel("Lista de contactos");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
//----- Pnl Tabla lista de contactos
        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BorderLayout());
        pnlTabla.setMaximumSize(new Dimension(500, 100)); 
        pnlTabla.setPreferredSize(new Dimension(500, 100));
        pnlTabla.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        tabla = new JTable();
        panelScroll = new JScrollPane(tabla);
        pnlTabla.add(panelScroll, BorderLayout.CENTER);
        setDatosTabla();
        
        tabla.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent evt) {
                fld1.setText(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
                fld2.setText(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 1)));
                fld3.setText(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 2)));
            }
        });
        
//----- pnl Labels y Fields de contacto
        pnl1 = new JPanel();
        pnl1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnl1.setMaximumSize(new Dimension(230, 100));
        
        lbl1 = new JLabel("ID:");
        lbl1.setFont(new Font("", Font.PLAIN, 14));
        lbl1.setBorder(new EmptyBorder(0,0,0,10));
        
        lbl2 = new JLabel("Nombre:");
        lbl2.setFont(new Font("", Font.PLAIN, 14));
        lbl2.setBorder(new EmptyBorder(0,0,0,10));
        
        lbl3 = new JLabel("Número:");
        lbl3.setFont(new Font("", Font.PLAIN, 14));
        lbl3.setBorder(new EmptyBorder(0,0,0,10));
        
        fld1 = new JTextField();
        fld2 = new JTextField();
        fld3 = new JTextField();
        stilizeField(fld1);
        stilizeField(fld2);
        stilizeField(fld3);

        pnl1.add(lbl1);
        pnl1.add(fld1);
        pnl1.add(lbl2);
        pnl1.add(fld2);
        pnl1.add(lbl3);
        pnl1.add(fld3);
        
//----- pnl botones contacto
        pnl2 = new JPanel();
        pnl2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));//hgap, vgap
        pnl2.setMaximumSize(new Dimension(400, 50));
        
        btn1 = new JButton("Agregar contacto");
        btn1.setPreferredSize(new Dimension(150, 30));
        
        btn2 = new JButton("Actualizar contacto");
        btn2.setPreferredSize(new Dimension(150, 30));
        
        btn1.addActionListener((ActionEvent evt) -> {
            if(!fld2.getText().isEmpty() && !fld3.getText().isEmpty()){
                originator.agregarContacto(new Contacto(fld2.getText(), fld3.getText()));
                caretaker.addMemento(originator.guardar());
                
                model.addElement(String.valueOf(caretaker.getMementos().size()));
                setDatosTabla();
                
                if(!fld1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Contacto agregado, el campo ID sera omitido", "Info", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "Contacto agregado", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Algunos campos estan vacios", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        });
        
        btn2.addActionListener((ActionEvent evt) -> {
            if(!fld1.getText().isEmpty() && !fld2.getText().isEmpty() && !fld3.getText().isEmpty()){
                originator.cambiarContacto(new Contacto(fld2.getText(), fld3.getText()), Integer.parseInt(fld1.getText()));
                caretaker.addMemento(originator.guardar());
                
                model.addElement(String.valueOf(caretaker.getMementos().size()));
                setDatosTabla();
                
                JOptionPane.showMessageDialog(this, "Contacto actualizado", "Info", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Algunos campos estan vacios", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        
        pnl2.add(btn1);
        pnl2.add(btn2);
        
//----- Historial cambios
        lblTitle2 = new JLabel("Historial de cambios");
        lblTitle2.setFont(new Font("", Font.BOLD, 20));
        lblTitle2.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle2.setAlignmentX(Component.CENTER_ALIGNMENT);  
        
//----- pnl version botones y lista
        pnl3 = new JPanel();
        pnl3.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));//hgap, vgap
        pnl3.setMaximumSize(new Dimension(300, 90));
        
        lbl4 = new JLabel("Versión:");
        lbl4.setFont(new Font("", Font.PLAIN, 14));
        
        model = new DefaultComboBoxModel<>();
        model.addElement("1");
        lista1 = new JComboBox<>(model);
        lista1.setMaximumSize(new Dimension(110, 30)); 
        lista1.setPreferredSize(new Dimension(110, 30));
        
        btn4 = new JButton("Mostrar");
        btn4.setPreferredSize(new Dimension(110, 30));
        
        btn5 = new JButton("Restaurar");
        btn5.setPreferredSize(new Dimension(110, 30));
        
        btn4.addActionListener((ActionEvent evt) -> {
            setDatosTabla2();
        });
        
        btn5.addActionListener((ActionEvent evt) -> {
            int intIndex = Integer.parseInt(String.valueOf(lista1.getSelectedItem()))-1;
            originator.restaurar(caretaker.getMemento(intIndex));
            setDatosTabla();
            JOptionPane.showMessageDialog(this, "Lista de contactos restaurada", "Info", JOptionPane.INFORMATION_MESSAGE);
        });
        
        pnl3.add(lbl4);
        pnl3.add(lista1);
        pnl3.add(btn4);
        pnl3.add(btn5);

//----- panel tabla cambios
        pnlTabla2 = new JPanel();
        pnlTabla2.setLayout(new BorderLayout());
        pnlTabla2.setMaximumSize(new Dimension(500, 100)); 
        pnlTabla2.setPreferredSize(new Dimension(500, 100));
        pnlTabla2.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        tabla2 = new JTable();
        panelScroll2 = new JScrollPane(tabla2);
        pnlTabla2.add(panelScroll2, BorderLayout.CENTER);
        setDatosTabla2();
        
//----- boton pa salir por la cuerda del edificio
        btnSalir = new JButton("Salir ");
        btnSalir.setMaximumSize(new Dimension(110, 30)); 
        btnSalir.setPreferredSize(new Dimension(110, 30));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btnSalir.addActionListener((ActionEvent evt) -> {
           System.exit(0);
        });
        
//----- Adicion de componentess
        pnlMain.add(lblTitle);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlMain.add(pnlTabla);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(pnl1);
        pnlMain.add(pnl2);
        pnlMain.add(lblTitle2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(pnl3);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(pnlTabla2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btnSalir);

//----- Atributos frame
        this.add(pnlMain);
        this.setVisible(true);
        this.setSize(600, 660);
        this.setLayout(new FlowLayout());  
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
// Seteo datos tabla de lista de contactos 
    private void setDatosTabla(){
        Object[][] datosFilas = new Object[originator.getEstado().size()][3]; 
        String[] nombresColumnas = new String[]{"ID", "Nombre", "Número"};
        
        int fila=0;
        for(Contacto contacto : originator.getEstado()){
            datosFilas[fila][0] = fila;
            datosFilas[fila][1] = contacto.getNombre();
            datosFilas[fila][2] = contacto.getNumero();
            fila++;
        }
        tabla.setModel(new DefaultTableModel(datosFilas, nombresColumnas));
    }
    
// Seteo datos tabla de historial de cambios
    private void setDatosTabla2(){
        int intIndex = Integer.parseInt(String.valueOf(lista1.getSelectedItem()))-1;
        
        Object[][] datosFilas = new Object[caretaker.getMemento(intIndex).getEstado().size()][3]; 
        String[] nombresColumnas = new String[]{"ID", "Nombre", "Número"};
        
        int fila=0;
        for(Contacto contacto : caretaker.getMemento(intIndex).getEstado()){
            datosFilas[fila][0] = fila;
            datosFilas[fila][1] = contacto.getNombre();
            datosFilas[fila][2] = contacto.getNumero();
            fila++;
        }
        tabla2.setModel(new DefaultTableModel(datosFilas, nombresColumnas));
    }
    
// Estilo de textfields
    private void stilizeField(JTextField fld){
        fld.setFont(new Font("", 0, 14));
        fld.setMargin(new Insets(0,3,0,0));
//        btn1.setMaximumSize(new Dimension(150, 25)); //Solo si se trabaja con boxlayout
        fld.setPreferredSize(new Dimension(150, 25));
        fld.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
