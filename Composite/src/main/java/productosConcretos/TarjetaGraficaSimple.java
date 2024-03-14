/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosConcretos;
import component.*;
/**
 *
 * @author truqu
 */
public class TarjetaGraficaSimple extends TarjetaGrafica{
    public TarjetaGraficaSimple(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
