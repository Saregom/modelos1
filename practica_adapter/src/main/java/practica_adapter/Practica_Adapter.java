
package practica_adapter;
/**
 *
 * @author jorge malaver
 */

import Profesionales.Arquitecto;
import Profesionales.Ingeniero;
import Profesionales.MedicoAdapter;
import Profesionales.Target_Profesionales;
import interfaz.Interfaz;

//Clase principal de la app
public class Practica_Adapter {
    private static Target_Profesionales profesionales;//Atributo tipo Target_Profesionales
     
    //Main de la app, llama la interfaz
    public static void main(String[] args) {
        new Interfaz();
    }//Cierre main

    //Metodo llama los metodos de la clase target profesionales y devuelve string
    private static String usarprofesion(){
        return profesionales.Leer_planos() + "\n" + profesionales.contratos() + "\n" + profesionales.supervision();
    }
   
   //Metodo devuelve string de las caracteristicas de cada profesional
    public static String mostrarProfesional(String profesional){
        //Switch case del tipo de profesional que obtenga de la interfaz
        switch(profesional){
            case "Arquitecto":
                profesionales = new Arquitecto();
                break;
            case "Ingeniero":
                profesionales =new Ingeniero();
                break;
            case "Medico":
                profesionales = new MedicoAdapter();
                break;
        } 
        return usarprofesion();
    } 
}// cierra la clase practica_adapter
