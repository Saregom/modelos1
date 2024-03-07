/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesionales;

/**
 *
 * @author jorge malaver
 */

//Clase Ingeniero, extiende de clase abstracta target_Profesionales
public class Ingeniero extends Target_Profesionales {
    
    //Constructor del iu¿ngeniero
    public Ingeniero(){
        super();//Llamado constructor padre
    }
    
    //Metodos sobrescritos de la clase abstracta devuelven un string
    @Override
    public String Leer_planos(){
        return "Contruccion de obras civiles\nPlanos de todo tipo";
    }
    
    @Override
    public String contratos(){
        return "Elaborar contratos construccion";   
    }
    
    @Override
    public String supervision(){
        return "Auditoria y control";
    }
}
