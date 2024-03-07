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

//Clase carro basico (Abstraccion) extiende de vehiculo
public class CarroBasico extends Vehiculo { 
    //Constructor, setea color, ruedas, velocidad
    public CarroBasico(Color color) {
        super(color, 4, "200Km/H");
    }
    
    //Constructor sobrecargado para admitir constructor de la subclase
    public CarroBasico(Color color, String maxVelocidad) {
        super(color, 4, maxVelocidad);
    }

    //Metodos de la clase abstracta
    @Override
    public String pintar() {
        return "Carro pintado de: " + color.aplicarColor();
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
