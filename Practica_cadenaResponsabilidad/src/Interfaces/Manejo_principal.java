package Interfaces;
/**
 *
 * @author jorge malaver
 */
public interface Manejo_principal {     //Clase handler o interfaz
    public void getManejo(int envio);       //Pedido hecho por la clase handler implementando el enlace a los sucesores
    //el metodo recibe un parametro que identifica cual de los dptos debe contestar
    // la peticion
}