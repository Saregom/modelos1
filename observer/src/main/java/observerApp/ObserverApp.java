/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package observerApp;

import interfaz.Interfaz;
import notificador.Celular;
import observer.NotificacionFaceBook;
import observer.NotificacionWhatsApp;

/**
 *
 * @author santi
 */
public class ObserverApp {

    public static void main(String[] args) {
        Celular notificador = new Celular();

        NotificacionWhatsApp whats = new NotificacionWhatsApp();
        NotificacionFaceBook face = new NotificacionFaceBook();

//        notificador.agregarObservador(whats);
//        notificador.agregarObservador(face);
        
        new Interfaz(notificador);

//        notificador.enviarNotificacion("Celular conectado a red Wifi");
    }
}
