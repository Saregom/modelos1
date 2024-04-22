package Gerencia;
/**
 *
 * @author jorge malaver
 */
import Interfaces.Manejo_principal;

public class gerencia implements Manejo_principal{      //Última clase de manejo
    private  final int TipoD = 3;
    
    public gerencia(){}     //Clase constructor
    
    @Override
    public void getManejo(int Tipo_Dpto){
       //Imprime la petición que fue enviada por la interfaz principal
        System.out.println("......LA PETICION DEBE SER RESPONDIDA SOLAMENTE POR LA GERENCIA.....");
    }       //No tiene método else porque es la última clase y no puede enviarla a otro manejo
}