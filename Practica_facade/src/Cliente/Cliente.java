

package Cliente;

/**
 *
 * @author jorge malaver
 */

//Clase cliente
public class Cliente {
    
    private String nom;
    
    //    Constructor
    public Cliente(String nombre){
        this.nom=nombre;
    }
    
    //    getter
    public String getNom(){
        return nom;
    }
    
    //    setter
    public void setNom(String nombre){
        this.nom=nombre;
    }  
}
