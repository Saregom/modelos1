
package Figuras;

/**
 *
 * @author jorge malaver
 */
import Interface.Figuras_geometricas;

// Clase rectangulo implementa clse figura geometrica
public class Rectangulo implements Figuras_geometricas{
    private String Nombre;
    private int pos_x, pos_y;
    
    // Constructor
    public Rectangulo(){        
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
     
    //Setea tamaños del rectangulo
    @Override
    public void tamaño1(int x, int y){
        pos_x = x;
        pos_y = y;
    }
    
    //Obtine el tamaño del rectangulo
    @Override
    public String getposicion(){
       return "\nAncho: " + String.valueOf(this.pos_x) + "\nAltura: " + String.valueOf(this.pos_y) ;  
    }
    
    @Override
    public void tamaño2(int x){
    }
    
    //Clona el rectangulo
    @Override
    public Figuras_geometricas clonar(){
        Figuras_geometricas geometrica= new Rectangulo();
        geometrica.setNombre(this.Nombre);
        geometrica.tamaño1(this.pos_x, this.pos_y);
        return geometrica;
    }
}
