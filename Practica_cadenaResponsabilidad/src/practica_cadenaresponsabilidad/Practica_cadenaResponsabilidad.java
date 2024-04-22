package practica_cadenaresponsabilidad;     //Clase del cliente
/**
 *
 * @author jorge malaver
 */
import Gerencia.gerencia;
import Manejos_concretos.*;
import java.util.Scanner;
import InterfazGrafica.Interfaz;

public class Practica_cadenaResponsabilidad {
        public static void main(String[] args) {
        // TODO code application logic here
        
//        Scanner sc=new Scanner(System.in);
//        int op=0;
//        gerencia obj =new gerencia();       //Crea un objeto de gerencia
//        Personal obj1 = new Personal(obj);      //Crea un objeto de personal
//        Contabilidad obj2 =new Contabilidad(obj1);      //Crea un objeto de contabilidad
//        /* 
//            Aquí se da el proceso de cadena de responsabilidad, ya que en la primera clase
//            que es llamada se le envía el siguiente manejador por si no puede realizar
//            la acción enviada. Dentro del manejador tiene una clase condicional para realizar
//            la cadena hasta encontrar la clase que funcione.
//        */
//        
//        do{     //Pide el op
//            System.out.println("**********************************");
//            System.out.println("* SELECCIONE LA PETICION AL DPTO *");
//            System.out.println("* 1  CONTABILIDAD                *");
//            System.out.println("* 2  PERSONAL                    *");
//            System.out.println("* 3  GERENCIA                    *");
//            System.out.println("* 0  SALIR DE LA APLICACION      *");
//            System.out.println("**********************************");
//            
//            op=sc.nextInt();
//            if(op!=0){
//                obj2.getManejo(op);     //Llama a la clase getManejo de contabilidad y le manda el parámetro op
//                
//            }
//            
//        } while(op!=0);
           new Interfaz();
    }
}