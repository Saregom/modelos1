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

//Clase vehiculo (Abstraccion)
public abstract class Vehiculo {
    //Atributos del vehiculo
    protected Color color;
    protected int ruedas;
    protected String maxVelocidad;

    //Constructor
    public Vehiculo(Color color, int ruedas, String maxVelocidad) {
        this.color = color;
        this.ruedas = ruedas;
        this.maxVelocidad = maxVelocidad;
    }

    //Metodos abstractos a implementar
    public abstract String pintar();
    public abstract String getRuedas();
    public abstract String getMaxVelocidad();
}
