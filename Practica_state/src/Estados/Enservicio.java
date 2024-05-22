
package Estados;

/**
 *
 * @author jorge malaver
 */
import Interfaces.Estado_ascensor;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Enservicio implements Estado_ascensor{
    
    // implementa el metodo ejecutar y muestra el estado del servicio
    
   @Override
   public String ejecutar(){
       return "Continue y elija un piso porfavor";
   }
}
