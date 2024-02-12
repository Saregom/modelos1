/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concret_factories;

import abstract_factory.CelularFactory;
import abstract_products.Camara;
import abstract_products.Pantalla;
import abstract_products.Procesador;
import concret_products.CamaraGamaBaja;
import concret_products.PantallaGamaBaja;
import concret_products.ProcesadorGamaBaja;

/**
 *
 * @author santi
 */
public class GamaBajaConcret implements CelularFactory {
    @Override
    public Pantalla crearPantalla(){
        return new PantallaGamaBaja();
    };
    @Override
    public Procesador crearProcesador(){
        return new ProcesadorGamaBaja();
    };
    @Override
    public Camara crearCamara(){
        return new CamaraGamaBaja();
    };
}
