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

//Clase arquitecto extiende de clase abstracta target_Profesionales
public class Arquitecto extends Target_Profesionales {
    //Metodos sobrescritos de la clase abstracta devuelven un string
    @Override
    public String Leer_planos(){
        return "Planos de todo tipo";
    }
    
    @Override
    public String contratos(){
        return "Contratos dibujantes";
    }
    
    @Override
    public String supervision(){
        return "Auditoria diseño ";
    }
}
