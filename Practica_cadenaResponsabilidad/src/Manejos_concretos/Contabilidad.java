package Manejos_concretos;
/**
 *
 * @author jorge malaver
 */
import Interfaces.Manejo_principal;

public class Contabilidad implements Manejo_principal{
    private  final int TipoD = 1;//el atributo contiene el identificador si la
    //peticion debe ser respondida por este dpto
    private Manejo_principal suceso;//parametor del sucesor en la cadena de responsabilidad
    
    public Contabilidad(Manejo_principal s){// objeto que implemena la inteface
        this.suceso =s;// al atributo de la asigna la interface
    }
        
    @Override
    public void getManejo(int Tipo_Dpto){       //Llama al objeto de la interfaz y observa si le toca la responsabilidad
        if(Tipo_Dpto==TipoD) {
            System.out.println(".......EL PEDIDO DEBE SER CONTESTADO POR CONTABILIDAD.....");
            //si es la responsabilidad
            //Imprime la linea
        }  
        else{
            suceso.getManejo(Tipo_Dpto);//llama el metodo del sucesor enviando el valor que ha 
            //solicitado el cliente
        }
    }
}