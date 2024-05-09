/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package memento;
import contaco.*;
import interfaz.Interfaz;
//import contaco.Originator;
/**
 *
 * @author truqu
 */
public class Memento {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
                
        originator.agregarContacto(new Contacto("Juan", "3115049352"));
        originator.agregarContacto(new Contacto("Santiago", "3170835965"));
        originator.agregarContacto(new Contacto("Cristhian", "3004806087"));
        
        caretaker.addMemento(originator.guardar());
        
        new Interfaz(originator, caretaker);
    }
}
