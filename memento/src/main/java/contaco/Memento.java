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
public class Memento {
    final private ArrayList<Contacto> listaContactos;
    
    public Memento(ArrayList<Contacto> estado){
        this.listaContactos = estado;
    }
    
    public ArrayList<Contacto> getEstado(){
        return this.listaContactos;
    }
}
