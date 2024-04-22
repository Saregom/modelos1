
package Facade;

/**
 *
 * @author jorge malaver
 */
import Modulos.*;
import Cliente.*;

//Clase facade
public class FacadePrestamo {
    private EntidadBancaria entidadBancaria;
    private Estudiocredito estudioCredito;
    private Solicitudprestamo solicitudPrestamo;
    private Cliente cliente;
    
//    Obtiene reporte y devuelde string segun valores del cliente
    public String reporte(Cliente x, boolean fondo, boolean reportado, boolean prestamo){
        entidadBancaria = new EntidadBancaria(fondo, x);
        estudioCredito = new Estudiocredito(reportado, x);
        solicitudPrestamo = new Solicitudprestamo(prestamo, x);
        
        String info = entidadBancaria.getfondos() + "\n" + estudioCredito.getReportado() + "\n" + solicitudPrestamo.getPrestamo();
        
//        return info + "\n\nSe le otorgo el prestamo";
        
        if(entidadBancaria.Tienefondos() && !(estudioCredito.historialcredito()) && !(solicitudPrestamo.poseeprestamo())){
            return info + "\n\nSe le otorgo el prestamo";
        }else{
            return "\n\nNO Se le puede otorgar el prestamo\nDebe cumplir con los requisitos";
        }
    }

}
