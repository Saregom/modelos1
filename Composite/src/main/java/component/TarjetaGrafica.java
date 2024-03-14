/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package component;

/**
 *
 * @author truqu
 */
public abstract class TarjetaGrafica {
    public String nombre;
    public double precio;

    public TarjetaGrafica(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract double getPrecio();

    public String getNombre() {
        return nombre;
    }
}
