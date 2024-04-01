
package Decorador;

/**
 *
 * @author jorge malaver
 */

/**
 * Clase que representa un decorador para añadir frenos a una bicicleta.
 * Extiende de Decorador_bicicleta.
 */
import Abstraccion.*;
import clase_base.*;
public class Frenos extends Decorador_bicicleta {
    
    private Bicicletas bicicleta;
    
    public Frenos(Bicicletas bici){
        this.bicicleta=bici;
    }
    
    @Override
    public String getDescripcion(){
        return bicicleta.getDescripcion() + "\nFRENOS DE DISCO";
    }
}
