
package Bridge;
/**
 *
 * @author jorge malaver
 */

import colores.Azul;
import colores.Color;
import colores.Rojo;
import interfaz.Interfaz;
import vehiculos.CarroAvanzado;
import vehiculos.CarroBasico;
import vehiculos.Moto;
import vehiculos.Vehiculo;

//Clase principal de la app
public class Bridge {
    private static Vehiculo vehiculo; //Clase estatica vehiculo
    private static Color color;//Clase estatica color
    
    //Main de la app, llama la interfaz
    public static void main(String[] args) {
        new Interfaz();
    }
   
   //devuelve string de las propiedades del vehiculo
    public static String getVehiculo(String vehiculoStr, String colorStr){
        //Switch case del tipo de color que obtenga de la interfaz
        switch(colorStr){
            case "Azul":
                color = new Azul();
                break;
            case "Rojo":
                color = new Rojo();
                break;
        } 
        
        //Switch case del tipo de vehiculo que obtenga de la interfaz
        switch(vehiculoStr){
            case "Carro basico":
                vehiculo = new CarroBasico(color);
                break;
            case "Carro avanzado":
                vehiculo = new CarroAvanzado(color);
                break;
            case "Moto":
                vehiculo = new Moto(color);
                break;
        } 
        return getPropiedades();
    } 
    
    //llama los metodos de la clase vehiculo y devuelve string
    private static String getPropiedades(){
        String propiedades = vehiculo.pintar() + "\n" + vehiculo.getMaxVelocidad() + "\n" + vehiculo.getRuedas();
        
        if(vehiculo instanceof CarroAvanzado){
            CarroAvanzado carroAvanzado = (CarroAvanzado) vehiculo;
            return propiedades + "\n" + carroAvanzado.ponerNitro();
        }
        
        return propiedades;
    }
}
