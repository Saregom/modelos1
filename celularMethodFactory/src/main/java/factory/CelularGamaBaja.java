/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import Procesadores.Procesador;
import Procesadores.ProcesadorSnapdragon632;
import camaras.Camara;
import camaras.Camara_12Mpx;

/**
 *
 * @author santi
 */
public class CelularGamaBaja extends Celular{
    @Override
    public Procesador crearProcesador(){
        return new ProcesadorSnapdragon632();
    };
    
    @Override
    public Camara crearCamara(){
        return new Camara_12Mpx();
    };
}
