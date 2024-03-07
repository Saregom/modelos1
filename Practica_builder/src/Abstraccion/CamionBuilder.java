
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import Productos.*;

//Clase constructora del camion
public abstract class CamionBuilder {
    
    protected camion Camion;//objeto de la clase producto
    
//    Obtiene el camion construido
    public camion getcamion(){
        return Camion;
    }
    
//    Construye, instancia camion
    public void ConstruirCamion(){
        Camion =new camion();
    }
    
//    Metodos abstractos de la construccion de los componentes del camion
    public abstract void builmotor();
    public abstract void builcarroceria();
    public abstract void builruedas();
}
