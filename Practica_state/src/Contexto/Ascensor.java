package Contexto;

/**
 *
 * @author jorge malaver
 */
import Interfaces.Estado_ascensor;
public class Ascensor {
    private Estado_ascensor estado;
    
    public void setestado(Estado_ascensor n){
        this.estado=n;
    }
    
    public String Ejecutar(){
        return estado.ejecutar();
    }
            
}
