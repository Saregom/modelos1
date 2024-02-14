/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import Procesadores.Procesador;
import Procesadores.ProcesadorSnapdragon782;
import camaras.Camara;
import camaras.Camara_64Mpx;

/**
 *
 * @author santi
 */
public class CelularGamaMedia extends Celular{
    @Override
    public Procesador crearProcesador(){
        return new ProcesadorSnapdragon782();
    };
    
    @Override
    public Camara crearCamara(){
        return new Camara_64Mpx();
    };
}
