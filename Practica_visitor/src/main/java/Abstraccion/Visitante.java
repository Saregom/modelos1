/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

/**
 *
 * @author jorge malaver
 */
import Elemento_concreto.*;
//interface visitor
public interface Visitante {
   
    public double visita(Tarjeta_sin normal);
    public double visita(Tarjeta_con des);
    
    
}
