
package Modulos;

/**
 *
 * @author jorge malaver
 */
import Cliente.*;

//Clase Cuenta bancaria
public class EntidadBancaria {
    private boolean fondo;
    private Cliente cliente;
    
    //    Constructor
    public EntidadBancaria(boolean prestamo, Cliente cliente){
        this.fondo = prestamo;
        this.cliente = cliente;
    }
    
    //    getter
    public boolean Tienefondos(){
        return fondo;
    }
    
    //    Devuelve string segun prestamo
    public String getfondos(){
        if(fondo){
            return "La cuenta del cliente " + cliente.getNom() + " tiene fondos";
        }
        return "La cuenta del cliente " + cliente.getNom() + " NO tiene fondos";
    }
}
