package Figuras;

/**
 *
 * @author jorge malaver
 */
import Interface.Figuras_geometricas;
public class Circulo implements Figuras_geometricas{
    private String Nombre;
    private int radio;
    
    // Constructor
    public Circulo(){        
    }
    
    //Setter nombre
    @Override
    public void setNombre(String n){
     this.Nombre=n;   
    }
    
    //Getter nombre
    @Override
    public String getNombre(){
        return Nombre;
    }
     
    //Setea tamaños del circulo
    @Override 
    public void tamaño2(int x){
       this.radio = x;
    }
    
    //Obtine el tamaño del circulo
    @Override
    public String getposicion(){
        return "\nRadio: " +  String.valueOf(this.radio);
    }
    
    @Override
    public void tamaño1(int x, int y){
    }
    
    //Clona el circulo
    @Override
    public Figuras_geometricas clonar(){
        Figuras_geometricas geometrica= new Circulo();
        geometrica.setNombre(this.Nombre);
        geometrica.tamaño2(this.radio);
        return geometrica;
    }
}
