package interfaz;

//import Bridge.Bridge;
import component.TarjetaGrafica;
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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import productosConcretos.TarjetaGraficaCompuesta;
import productosConcretos.TarjetaGraficaSimple;

/**
 *
 * @author santi
 */

//Clase interfaz
public class Interfaz extends JFrame{
    //atributos/componentes de la interfaz
    private JPanel pnlMain, pnlTabla;
    private JTable tablaInfoProductos;
    private JLabel lblTitle, lblSelect;
    private JButton btn, btn1, btn2, btn3, btnSalir;
    JScrollPane panelScroll;
    private JComboBox<String> lista;
    private int cantidadGraficasKit;
    private int indexKit;
    private List<TarjetaGraficaCompuesta> pedido;
    
    //Constructor de la interfaz, llama los componentes
    public Interfaz(){
        super.setTitle("Mercado Tarjetas Graficas para Minar");//Setea el titulo de la app
        cantidadGraficasKit = 0;
        indexKit = 0;
        pedido = new ArrayList<>();
        pedido.add(new TarjetaGraficaCompuesta("\n\n---Kit Mineria #1"));
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
        lblTitle = new JLabel("Arma tu Kit de Mineria");
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10,0,0,0));
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);     
        
        //Labels y listas despleglables
        lblSelect = new JLabel("Escoge tu grafica");
        lblSelect.setFont(new Font("", Font.PLAIN, 16));
        lblSelect.setBorder(new EmptyBorder(10,0,0,0));
        lblSelect.setAlignmentX(Component.CENTER_ALIGNMENT); 
        
        String[] opciones = {"NVIDIA RTX 4090", "NVIDIA RTX 3080", "AMD RX 7800", "AMD RX 6600"};
        lista = new JComboBox<>(opciones);
        lista.setMaximumSize(new Dimension(200, 30)); 
        lista.setPreferredSize(new Dimension(200, 30));
        
        //Boton llama funciones
        btn = new JButton("Agregar al kit");
        btn.setMaximumSize(new Dimension(200, 30)); 
        btn.setPreferredSize(new Dimension(200, 30));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btn1 = new JButton("Remover ultima grafica");
        btn1.setMaximumSize(new Dimension(200, 30)); 
        btn1.setPreferredSize(new Dimension(200, 30));
        btn1.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Tabla
        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BorderLayout());
        pnlTabla.setMaximumSize(new Dimension(500, 100)); 
        pnlTabla.setPreferredSize(new Dimension(500, 100));
        pnlTabla.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        tablaInfoProductos = new JTable();
        panelScroll = new JScrollPane(tablaInfoProductos);
        pnlTabla.add(panelScroll, BorderLayout.CENTER);
        setDatosTabla();
        
        btn2 = new JButton("Pedir kit");
        btn2.setMaximumSize(new Dimension(200, 30)); 
        btn2.setPreferredSize(new Dimension(200, 30));
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btn3 = new JButton("Mostrar Pedido completo");
        btn3.setMaximumSize(new Dimension(200, 30)); 
        btn3.setPreferredSize(new Dimension(200, 30));
        btn3.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        btnSalir = new JButton("Salir de la aplicacion");
        btnSalir.setMaximumSize(new Dimension(180, 30)); 
        btnSalir.setPreferredSize(new Dimension(180, 30));
        btnSalir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Action listeners
        btn.addActionListener((ActionEvent evt) -> {
            cantidadGraficasKit += 1;
            pedido.get(indexKit).agregarTarjeta(getTarjeta((String)lista.getSelectedItem()));
            setDatosTabla();
            JOptionPane.showMessageDialog(this, "Tarjeta grafica agregada al kit", "Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btn1.addActionListener((ActionEvent evt) -> {
            if(pedido.get(indexKit).getTarjetas() != null && !pedido.get(indexKit).getTarjetas().isEmpty()){
                pedido.get(indexKit).removerTarjeta();
                cantidadGraficasKit -= 1;
                setDatosTabla();
                JOptionPane.showMessageDialog(this, "Tarjeta removida del kit", "Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        btn2.addActionListener((ActionEvent evt) -> {
            if(pedido.get(indexKit).getTarjetas() != null && !pedido.get(indexKit).getTarjetas().isEmpty()){
                JOptionPane.showMessageDialog(this, getPedido(pedido.get(indexKit)), "Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
                indexKit += 1;
                pedido.add(new TarjetaGraficaCompuesta("\n\n---Kit Mineria #"+(indexKit+1)));
                cantidadGraficasKit = 0;
                setDatosTabla();
            }
        });
        
        btn3.addActionListener((ActionEvent evt) -> {
            JOptionPane.showMessageDialog(this, getPedidos(), "Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
        });
        
        btnSalir.addActionListener((ActionEvent evt) -> {
           System.exit(0);
        });
        
        //Adicion de componentess
        pnlMain.add(lblTitle);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlMain.add(lblSelect);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(lista);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(btn);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 10)));
        pnlMain.add(btn1);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(pnlTabla);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(btn2);
        pnlMain.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlMain.add(btn3);
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
    
    private void setDatosTabla(){
        Object[][] datosFilas = new Object[cantidadGraficasKit][3]; 
        String[] nombresColumnas = new String[]{"Nombre Grafica", "Precio", "Cantidad"};
        
        int fila=0;
        for(TarjetaGrafica tarjeta : pedido.get(indexKit).getTarjetas()){
            datosFilas[fila][0] = tarjeta.getNombre();
            datosFilas[fila][1] = tarjeta.getPrecio();
            datosFilas[fila][2] = 1;
            fila++;
        }
        DefaultTableModel model = new DefaultTableModel(datosFilas, nombresColumnas);
        tablaInfoProductos.setModel(model);
    }
    
    private TarjetaGrafica getTarjeta(String tarjeta){
        switch(tarjeta){
            case "NVIDIA RTX 4090": return new TarjetaGraficaSimple("NVIDIA RTX 4090", 2300);
            case "NVIDIA RTX 3080": return new TarjetaGraficaSimple("NVIDIA RTX 3080", 800);
            case "AMD RX 7800": return new TarjetaGraficaSimple("AMD RX 7800", 530);
            case "AMD RX 6600": return new TarjetaGraficaSimple("AMD RX 6600", 189);
            default: return new TarjetaGraficaSimple("None", 0);
        }
    }
    
    private String getPedidos(){
        int kitPos = 0;
        String miPedidoStr = "";
        miPedidoStr += "Cliente: Santiago Truque";
        for (TarjetaGraficaCompuesta kit : pedido) {
            if(kitPos == indexKit) continue;
            
            miPedidoStr += kit.getNombre();
            for (TarjetaGrafica tarjetaGrafica : kit.getTarjetas()) {
                miPedidoStr += "\n- " + tarjetaGrafica.nombre + ": $" + tarjetaGrafica.getPrecio();
            }
            miPedidoStr += "\nTotal kit: $" + kit.getPrecio();
            
            kitPos += 1;
        }
        return miPedidoStr;
    }
    
    private String getPedido(TarjetaGraficaCompuesta kit){
        String miPedidoStr = "";
        miPedidoStr += "Cliente: Santiago Truque";
        miPedidoStr += kit.getNombre();
        for (TarjetaGrafica tarjetaGrafica : kit.getTarjetas()) {
            miPedidoStr += "\n- " + tarjetaGrafica.nombre + ": $" + tarjetaGrafica.getPrecio();
        }
        miPedidoStr += "\nTotal kit: $" + kit.getPrecio();
        return miPedidoStr;
    }
}
