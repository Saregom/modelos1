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
public class ShoppingCartCollention implements IterableCollection {
    public Celular[] celulares;
    private int index = 0;

    public ShoppingCartCollention(int size) {
        celulares = new Celular[size];
    }

    public Boolean addCelular(Celular celular) {
        if (index < celulares.length) {
            celulares[index++] = celular;
            return true;
        }
        return false;
    }

    @Override
    public Iterator createIterator() {
        return new CelularIterator(celulares);
    }
}

