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

//Clase carro avanzado (Abstraccion refinida) extiende de carro basico 
public class CarroAvanzado extends CarroBasico { 
    //Constructor, setea color y velocidad
    public CarroAvanzado(Color color) {
        super(color, "350Km/H");
    }

    //Metodos de la clase abstracta
    @Override
    public String pintar(){
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
    
    //Instalar nitro
    public String ponerNitro(){
        return "Nitro instalado";
    }
}
