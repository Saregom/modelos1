
package Modulos;

/**
 *
 * @author jorge malaver
 */
import Cliente.*;

//Clase estudio crediticio
public class Estudiocredito {
    private boolean reportado;
    private Cliente cliente;
    
    //    Constructor
    public Estudiocredito(boolean reportado, Cliente cliente){
        this.reportado = reportado;
        this.cliente = cliente;
    }
    
    //    getter
    public boolean historialcredito(){
        return reportado;
    }
    
    //    Devuelve string segun prestamo
    public String getReportado(){
        if(reportado){
            return "El cliente " + cliente.getNom() + " esta reportado";
        }
        return "El cliente " + cliente.getNom() + " NO esta reportado";
    }
}
