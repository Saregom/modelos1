
package Decorador;

/**
 *
 * @author jorge malaver
 */

/**
 * Clase que representa un decorador para añadir un manubrio especial a una bicicleta.
 * Extiende de Decorador_bicicleta.
 */
import Abstraccion.*;
import clase_base.*;
public class Manubrio extends Decorador_bicicleta{
    
    private Bicicletas bicicleta;
    
    public Manubrio(Bicicletas bici){
        
        this.bicicleta=bici;
    }
    
    @Override
    public String getDescripcion(){
        return bicicleta.getDescripcion() + "\nMANUBRIO PROFESIONAL";
    }
}
