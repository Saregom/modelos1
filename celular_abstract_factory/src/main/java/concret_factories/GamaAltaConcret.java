/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concret_factories;

import abstract_factory.CelularFactory;
import abstract_products.Camara;
import abstract_products.Pantalla;
import abstract_products.Procesador;
import concret_products.CamaraGamaAlta;
import concret_products.PantallaGamaAlta;
import concret_products.ProcesadorGamaAlta;

/**
 *
 * @author santi
 */
public class GamaAltaConcret implements CelularFactory {
    @Override
    public Pantalla crearPantalla(){
        return new PantallaGamaAlta();
    };
    @Override
    public Procesador crearProcesador(){
        return new ProcesadorGamaAlta();
    };
    @Override
    public Camara crearCamara(){
        return new CamaraGamaAlta();
    };
}
