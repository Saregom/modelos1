package interfaz;

import Celphone.CellPhone;
import Context.Context;
import Expresions.AndExpression;
import Expresions.BrandExpression;
import Expresions.Expression;
import Expresions.PriceExpression;
import Expresions.RamExpression;
import Expresions.WordExpressionNoTerminal;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain, pnlTabla;
    private JLabel lblTitle, lbl1, lbl2;
    private JButton btn1, btnSalir;
    private JTextField fld1;
    private JTable tabla;
    private JScrollPane panelScroll;
    private final Context context;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("Celulares"); //Setea el titulo de la app
        context = new Context(Arrays.asList(
                new CellPhone("Samsung", "6Gb", 210),
                new CellPhone("Apple", "8Gb", 999),
                new CellPhone("Google", "4Gb", 300),
                new CellPhone("Apple", "4Gb", 500),
                new CellPhone("Apple", "4Gb", 700),
                new CellPhone("Samsung", "12Gb", 650)
        ));
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

        lblTitle = new JLabel("Buscador de celulares");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        //Labels, fields, botones
        lbl1 = new JLabel("Lista de celulares");
        lbl1.setFont(new Font("", Font.PLAIN, 16));
        lbl1.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BorderLayout());
        pnlTabla.setMaximumSize(new Dimension(500, 119)); 
        pnlTabla.setPreferredSize(new Dimension(500, 119));
        pnlTabla.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        tabla = new JTable();
        panelScroll = new JScrollPane(tabla);
        pnlTabla.add(panelScroll, BorderLayout.CENTER);
        setDatosTabla();
        
        lbl2 = new JLabel("Buscador de celulares");
        lbl2.setFont(new Font("", Font.PLAIN, 16));
        lbl2.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        fld1 = new JTextField();
        fld1.setFont(new Font("", 0, 15));
        fld1.setMaximumSize(new Dimension(200, 30)); 
        fld1.setPreferredSize(new Dimension(200, 30));
        
        btn1 = new JButton("Buscar");
        btn1.setMaximumSize(new Dimension(200, 30)); 
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //btn salir
        btnSalir = new JButton("Salir del buscador");
        btnSalir.setMaximumSize(new Dimension(200, 30)); 
        btnSalir.setPreferredSize(new Dimension(200, 30));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn1.addActionListener((ActionEvent evt) -> {
            String sentence = fld1.getText();
            
            WordExpressionNoTerminal wordExpression = new WordExpressionNoTerminal(sentence);
            ArrayList<Expression> expressions = wordExpression.interpretWord(context);
            
            String info = "";
            if(!expressions.isEmpty()){
                if(expressions.size() == 2){
                    Expression andExpression = new AndExpression(expressions.get(0), expressions.get(1));
                    for(CellPhone phone : andExpression.interpret(context)){
                        info += phone.toString();
                    }
                }else{
                    for(CellPhone phone : expressions.get(0).interpret(context)){
                        info += phone.toString();
                    }
                }
                
                if(info.equals("")){
                    JOptionPane.showMessageDialog(this, "No se encontro ningun resultado del texto a interpretar", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, info, "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Verifica la busqueda", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        });
        
        btnSalir.addActionListener((ActionEvent evt) -> {
           System.exit(0);
        });
        
        //Adicion de componentess
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lblTitle);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lbl1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(pnlTabla);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lbl2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(fld1);
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
    
    public void setDatosTabla(){
        Object[][] datosFilas = new Object[context.getCellPhones().size()][3]; 
        String[] nombresColumnas = new String[]{"Marca", "Ram", "Precio"};
        
        int fila=0;
        for(CellPhone phone : context.getCellPhones()){
            datosFilas[fila][0] = phone.getBrand();
            datosFilas[fila][1] = phone.getRam();
            datosFilas[fila][2] = phone.getPrice();
            fila++;
        }
        tabla.setModel(new DefaultTableModel(datosFilas, nombresColumnas));
    }
}
