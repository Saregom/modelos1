/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaco;

/**
 *
 * @author truqu
 */
import java.util.ArrayList;

public class Caretaker {

    private ArrayList<Memento> historial = new ArrayList<>();

    public void addMemento(Memento mem) {
        historial.add(mem);
    }
    
    public ArrayList<Memento> getMementos() {
        return historial;
    }

    public Memento getMemento(int index) {
        return historial.get(index);
    }
}
