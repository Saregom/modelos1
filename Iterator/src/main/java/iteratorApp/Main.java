/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iteratorApp;
import celular.Celular;
import interfaz.Interfaz;
import iterator.*;
/**
 *
 * @author truqu
 */
public class Main {

    public static void main(String[] args) {
        ShoppingCartCollention collection = new ShoppingCartCollention(5);
        collection.addCelular(new Celular("Motorola", "Moto g84"));
        collection.addCelular(new Celular("Apple", "iPhone 14"));
        collection.addCelular(new Celular("Google", "Pixel 7"));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            Celular celular = (Celular)iterator.next();
            System.out.println(celular);
        }
        
        new Interfaz();
    }
}
