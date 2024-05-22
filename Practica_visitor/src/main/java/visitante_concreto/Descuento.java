/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitante_concreto;

/**
 *
 * @author JORGE MALAVER
 */
import Abstraccion.*;
import Elemento_concreto.*;

//Visitante concreto
public class Descuento implements Visitante{
    
    private final double sindes=0.83;
    private final double condes=0.33;
    
    //Metodos sobreescritos
    @Override
    public double visita(Tarjeta_sin normal){
        return normal.getprecio() * sindes;
    }
            
    @Override
       public double visita(Tarjeta_con des){
           return des.getprecio() * condes;
       }
               
}
