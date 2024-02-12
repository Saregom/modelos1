/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concret_factories;

import abstract_factory.CelularFactory;
import abstract_products.Camara;
import abstract_products.Pantalla;
import abstract_products.Procesador;
import concret_products.CamaraGamaMedia;
import concret_products.PantallaGamaMedia;
import concret_products.ProcesadorGamaMedia;

/**
 *
 * @author santi
 */
public class GamaMediaConcret implements CelularFactory {
    @Override
    public Pantalla crearPantalla(){
        return new PantallaGamaMedia();
    };
    @Override
    public Procesador crearProcesador(){
        return new ProcesadorGamaMedia();
    };
    @Override
    public Camara crearCamara(){
        return new CamaraGamaMedia();
    };
}
