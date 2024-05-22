/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elemento_concreto;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
//Visitable concreto con descuento
public class Tarjeta_con implements Visitable {
 
    private double precio;
    
    @Override
    public double acepto(Visitante vis){
        return vis.visita(this);
    }
public double getprecio(){
    return precio;
}
public void setprecio(double precio){
    this.precio=precio;
}
}
