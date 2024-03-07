
package practica_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;
import Productos .*;
import Concrete_builder.*;
import interfaz.Interfaz;
import java.util.Scanner;

public class Practica_builder {
//    Instancia scanner    
    private static Scanner sc = new Scanner(System.in);
//    main
    public static void main(String[] args) {
        new Interfaz();//Llamado instancia interfaz
    }
    
//    Funcion instanciar tipo de camion y devuelve string de los componentes del camion
    public static String elegirOpcion(int op){
        construir_camion obj= new construir_camion();
        
//        Switch case para elegir dependiendo de la lista en la interfaz
        switch(op){
            case 0:
                CamionBuilder obj1= new Camion_uno();
                obj.setcamionBuilder(obj1);
                return imprimir(obj);
            case 1:
                CamionBuilder obj2=new Camion_dos();
                obj.setcamionBuilder(obj2);
                return imprimir(obj);
            default: 
                return "a";
            }
            
    }
//    Devuelve sring de los componentes del camion
    public static String imprimir(construir_camion  obj){
        obj.fabrica_camion();
        camion nueva=obj.getcamion();
        String components = nueva.getMotor() + ", " + nueva.getCarroceria() + ", " + nueva.getRuedas();
        return components;
    }
}
