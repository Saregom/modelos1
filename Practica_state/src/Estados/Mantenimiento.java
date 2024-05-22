
package Estados;

/**
 *
 * @author jorge malaver
 */

import Interfaces.Estado_ascensor;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Mantenimiento implements Estado_ascensor{
 
    // implementa la interface y su metodo
    @Override
    public String ejecutar(){
        return "ERROR: El ascensor esta en mantenimiento, utilice las escaleras";
    }
}
