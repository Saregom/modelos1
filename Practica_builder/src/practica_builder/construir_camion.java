
 package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Concrete_builder.*;
import Productos.*;
import Abstraccion.*;
 
//Clase construye camion
public class construir_camion {
    
    private CamionBuilder nuevo;//Nuevo constructor de camion
    
    public void setcamionBuilder(CamionBuilder op ){
        nuevo= op;//Asignacion de constructor
    }
    
//    Obtiene camion
    public camion getcamion(){
        return nuevo.getcamion();
    }
    
//    Construye camion llamando metodos de los componentes
    public void fabrica_camion(){
        nuevo.ConstruirCamion();
        nuevo.builmotor();
        nuevo.builcarroceria();
        nuevo.builruedas();
    }
}
