package Manejos_concretos;
/**
 *
 * @author jorge malaver
 */
import Interfaces.Manejo_principal;

public class Personal implements Manejo_principal{      //Handler concreto
    private  final int TipoD = 2;
    private Manejo_principal suceso;
    
    public Personal(Manejo_principal s){        //Clase concreta 
        this.suceso =s;
    }
    
    @Override
    public void getManejo(int Tipo_Dpto){       //Llama al objeto de la interfaz y observa si le toca la responsabilidad
        if(Tipo_Dpto==TipoD) {
            System.out.println("......EL PEDIDO DEBE SER CONTESTADO POR PERSONAL.....");        //si es la responsabilidad
                //Imprime la linea
        }  
        else{
            suceso.getManejo(Tipo_Dpto);  //Si no es la responsabilidad, lo manda al siguiente manejo
        }
    }
}