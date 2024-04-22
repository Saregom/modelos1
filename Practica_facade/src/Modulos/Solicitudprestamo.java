
package Modulos;

/**
 *
 * @author jorge malaver
 */
import Cliente.*;

//Clase solicitud de prestamo
public class Solicitudprestamo {
    private boolean prestamo;
    private Cliente cliente;
    
//    Constructor
    public Solicitudprestamo(boolean prestamo, Cliente cliente){
        this.prestamo = prestamo;
        this.cliente = cliente;
    }
    
//    getter
    public boolean poseeprestamo(){
        return prestamo;
    }
    
//    Devuelve string segun prestamo
    public String getPrestamo(){
        if(prestamo){
            return "El cliente " + cliente.getNom() + " ya posee prestamos";
        }
        return "El cliente " + cliente.getNom() + " NO posee prestamos";
    }
}
