/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concret_products;

import abstract_products.Procesador;

/**
 *
 * @author santi
 */
public class ProcesadorGamaAlta implements Procesador{
    @Override
    public void construir(){
        System.out.println("Procesador gama alta construido");
    }
}
