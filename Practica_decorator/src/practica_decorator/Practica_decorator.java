
package practica_decorator;

/**
 *
 * @author jorge malaver
 */

/**
 * Clase principal que contiene el método main para ejecutar el programa del distribuidor de bicicletas.
 */
import clase_base.*;
import Decorador.*;
import interfaz.Interfaz;
import java.util.Scanner;
public class Practica_decorator {
    static Bicicletas obj = new Bicicletas();
   
    public static void main(String[] args) {
        new Interfaz();
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.println();
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXxxxxxxxxx");
        System.out.println("BIENVENIDO A SU DISTRIBUIDOR DE BICICLETAS");
        System.out.println("DIGITE 0 PARA VER EL OBJETO DECORADO.... DESPUES DE ESCOJER EL ADITAMENTO ");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();
        
        Bicicletas obj = new Bicicletas();
        
        int op =0 ;
        
        do{
            System.out.println("CON SU BICICLETA, SELECCIONE SU ADITAMENTO");
            System.out.println();
            System.out.println("1.  FRENOS ESPECIALES");
            System.out.println("2.  CAMBIOS CAMPANOLO");
            System.out.println("3.  MANUBRIO PROFESIONAL");
            System.out.println();
            System.out.print("SELECCIONE OPCION...."); op=sc.nextInt();
            
            switch(op){
                case 0:
                    break;
                case 1:
                    obj= new Frenos(obj);
                    break;
                case 2:
                    obj= new Cambios(obj);
                    break;
                case 3:
                    obj = new Manubrio(obj);
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                
            }//fin switch
            
            
        }while(op!=0);
        
        System.out.println();
        System.out.println(obj.getDescripcion());
        System.out.println();
        System.out.println("!!!!!DISFRUTE SU BICICLETA!!!!!!!!");
    }
    
    public static String setComponent(String component){
        switch(component){
            case "Frenos de disco":
                obj= new Frenos(obj); break;
            case "Cambios shimano":
                obj= new Cambios(obj); break;
            case "Manubrio de carbono":
                obj = new Manubrio(obj); break;
            default: break;
        }//fin switch
        return obj.getDescripcion();
    }
}
