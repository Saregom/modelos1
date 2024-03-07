
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;

//Clase camion tipo dos, extiende del constructor
public class Camion_dos extends CamionBuilder{
   
//   Sobreescritura de los metodos abstractosss
    @Override
    public void builmotor(){
        Camion.setmotor("Motor normal");
    }

    @Override
    public void builcarroceria(){
        Camion.setcarroceria("Carroceria corriente");
    }

    @Override
    public void builruedas(){
        Camion.setruedas("Ruedas medianas");
    }
}
