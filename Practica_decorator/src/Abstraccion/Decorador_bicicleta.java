package Abstraccion;

/**
 *
 * @author jorge malaver
 */

/**
 * Clase abstracta que sirve como base para los decoradores de bicicletas.
 * Define un método abstracto para obtener la descripción.
 */

import clase_base.*;
public abstract class Decorador_bicicleta extends Bicicletas{
    
    public abstract String getDescripcion();
    
}
