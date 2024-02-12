/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstract_factory;

import abstract_products.Camara;
import abstract_products.Pantalla;
import abstract_products.Procesador;

/**
 *
 * @author santi
 */
public interface CelularFactory {
    public Pantalla crearPantalla();
    public Procesador crearProcesador();
    public Camara crearCamara();
}
