/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;
import colores.Color;
/**
 *
 * @author truqu
 */

//Clase Moto extiende de vehiculo
public class Moto extends Vehiculo { 
    //Constructor, setea color, ruedas, velocidad
    public Moto(Color color) {
        super(color, 2, "250Km/H");
    }

    //Metodos de la clase abstracta
    @Override
    public String pintar() {
        return "Moto pintada de: " + color.aplicarColor();
    }

    @Override
    public String getRuedas() {
        return "Ruedas: " + this.ruedas;
    }
    
    @Override
    public String getMaxVelocidad() {
        return "Max velocidad: " + this.maxVelocidad;
    }
}

