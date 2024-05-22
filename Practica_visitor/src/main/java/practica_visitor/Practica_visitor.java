/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_visitor;

/**
 *
 * @author jorge malaver
 */

import Elemento_concreto.*;
import interfaz.Interfaz;
import visitante_concreto.Descuento;
public class Practica_visitor {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        
     Tarjeta_con con = new Tarjeta_con();
     Tarjeta_sin sin = new Tarjeta_sin();
     con.setprecio(2000);
     sin.setprecio(2500);
     
     Descuento des =new Descuento();
     double res =con.acepto(des);
     double res1 = sin.acepto(des);
     
     
     System.out.println(".....VALORES CON Y SIN DESCUENTO CON EL PATRON VISITOR");
     System.out.println();
     System.out.println("Valor con descuento...." + res);
     System.out.println("Valor sin descuento...." + res1);
     
     new Interfaz();
    }
    
}
