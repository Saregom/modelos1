/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author truqu
 */
public class NotificacionFaceBook implements NotificacionAplicacion{//observador concreto
    public String notificar(String mensaje){
        return "Notificacion enviada a FaceBook: ";
    };
}
