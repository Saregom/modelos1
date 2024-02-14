/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import Procesadores.Procesador;
import Procesadores.ProcesadorSnapdragon888;
import camaras.Camara;
import camaras.Camara_108Mpx;

/**
 *
 * @author santi
 */
public class CelularGamaAlta extends Celular{
    @Override
    public Procesador crearProcesador(){
        return new ProcesadorSnapdragon888();
    };
    
    @Override
    public Camara crearCamara(){
        return new Camara_108Mpx();
    };
}
