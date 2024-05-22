/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto_concreto;

/**
 *
 * @author jorge malaver
 */
import Abstracto.Triangulo;

//Clase triangulo isosceles
public class Isoseles extends Triangulo{
    
    int lado1,lado2,lado3;
    public Isoseles(int a, int b, int c){
        super(a,b,c);
        this.lado1=a;
        this.lado2=b;
        
    }
    
    //Clase sobreescrita describe el tipo
     @Override
    public String describir(){
        return "ISOSCELES";
    }
    
    //Clase sobrescrita devuelve el tamaño de superficie
    @Override
    public String Superficie(){
        int x;
        String res;
        x=(lado1*lado2)/2;
        res=Integer.toString(x);
        return res;     
      }
}
