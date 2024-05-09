/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificador;
import java.util.ArrayList;
import java.util.List;
import observer.NotificacionAplicacion;


/**
 *
 * @author truqu
 */
public class Celular {//Subject
    private List<NotificacionAplicacion> observadores;
    private String notificacion;
    
    public Celular() {
        this.observadores = new ArrayList<>();
    }

    public void agregarObservador(NotificacionAplicacion observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(NotificacionAplicacion observador) {
        observadores.remove(observador);
        System.out.println("a");
    }

    public String notificarObservadores(String mensaje){
        notificacion = "";
        if(observadores.isEmpty()){
            notificacion = "Ninguna aplicacion abierta, no se envio ninguna notificacion";
        }
        
        for (NotificacionAplicacion observador : observadores) {
            notificacion += observador.notificar(notificacion) + mensaje + "\n";
        }
        return notificacion;
    }
}
