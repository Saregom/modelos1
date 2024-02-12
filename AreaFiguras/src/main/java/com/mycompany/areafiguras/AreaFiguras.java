/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areafiguras;
import logics.*;
import interfaz.Interfaz;
import java.util.ArrayList;

/**
 *
 * @author truqu
 */
public class AreaFiguras {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
       
        figuras.add(new Circulo(0));
        figuras.add(new Cuadrado(0));
        figuras.add(new TrianguloIsoceles(0));
        
        new Interfaz(figuras);
    }
}
