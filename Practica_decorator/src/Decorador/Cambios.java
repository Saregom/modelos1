
package Decorador;

/**
 *
 * @author jorge malaver
 */

/**
 * Clase que representa un decorador para añadir cambios a una bicicleta.
 * Extiende de Decorador_bicicleta.
 */
import Abstraccion.*;
import clase_base.*;
public class Cambios extends Decorador_bicicleta {
    
    private Bicicletas bicicleta;
    
    public Cambios(Bicicletas bici){
        this.bicicleta=bici;
                
    }
    
    @Override
    public String getDescripcion(){
        
        return bicicleta.getDescripcion() + "\nCAMBIOS SHIMANO";
    }
}
