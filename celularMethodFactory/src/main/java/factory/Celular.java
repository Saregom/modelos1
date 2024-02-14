/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import Procesadores.Procesador;
import camaras.Camara;

/**
 *
 * @author santi
 */
public abstract class Celular {
    public void construirComponentes(){
        Procesador procesador = crearProcesador();
        procesador.construir();
        
        Camara camara = crearCamara();
        camara.construir();
        
    }
    
    public abstract Procesador crearProcesador();
    
    public abstract Camara crearCamara();
}
