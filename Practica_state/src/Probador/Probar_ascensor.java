
package Probador;

/**
 *
 * @author jorge malaver
 */
import Estados.Enservicio;
import Estados.Mantenimiento;
import Contexto.Ascensor;
import java.util.Scanner;

public class Probar_ascensor {
    
    Enservicio servicio = new Enservicio(); // crea un objeto de tipo serviciio
    Mantenimiento obj = new Mantenimiento();
    Ascensor  ascensor = new Ascensor();
    int op=0;
    Scanner sc =new Scanner(System.in);
    
    public String pmenu(String opcion){
       switch(opcion){
           case "En servicio":
               ascensor.setestado(servicio);// 
               break;
           case "En mantenimiento":
               ascensor.setestado(obj);
               break;
           default:
               return "a";
       }//fin switc
       
       return ascensor.Ejecutar();
    
  } 
}// fin de la clase probar_ascensor
