/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator;
import celular.Celular; 
/**
 *
 * @author truqu
 */
public class CelularIterator implements Iterator {
    private Celular[] celulares;
    private int position = 0;

    public CelularIterator(Celular[] celulares) {
        this.celulares = celulares;
    }

    @Override
    public boolean hasNext() {
        return position < celulares.length && celulares[position] != null;
    }

    @Override
    public Celular next() {
        return celulares[position++];
    }
}

