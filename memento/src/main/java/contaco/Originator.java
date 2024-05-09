/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaco;

import java.util.ArrayList;


/**
 *
 * @author truqu
 */
public class Originator {
    private ArrayList<Contacto> listaContactos = new ArrayList<>();

    public void agregarContacto(Contacto contacto) {
        this.listaContactos.add(contacto);
    }
    
    public void cambiarContacto(Contacto contacto, int index) {
        this.listaContactos.set(index, contacto);
    }

    public ArrayList<Contacto> getEstado() {
        return listaContactos;
    }

    public Memento guardar() {
        return new Memento((ArrayList)listaContactos.clone());
    }

    public void restaurar(Memento mem) {
        this.listaContactos = (ArrayList)mem.getEstado().clone();
    }
}
