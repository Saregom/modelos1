/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstracto;

/**
 *
 * @author jorge malaver
 */

//Clase abstracta triangulo
public abstract class Triangulo {
    //lados del triangulo
     private int lado_1;
     private int lado_2;
     private int lado_3;
     
     //Constructor
     public Triangulo(int ladoA, int ladoB, int ladoC){
      
         this.lado_1=ladoA;
         this.lado_2=ladoB;
         this.lado_3=ladoC;
     }
     
     //Metodos abstractos
     public abstract String describir();
     public abstract String Superficie();
     
}
