/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logics;

/**
 *
 * @author truqu
 */
//abstract class Figura{
//    double tamanioLado;
//
//    public Figura(double tamanioLado) {
//        this.tamanioLado = tamanioLado;
//    }
//    
//    public abstract double calcularArea();
//}

public abstract class Figura{
    double tamanioLado;

    public Figura(double tamanioLado) {
        this.tamanioLado = tamanioLado;
    }
    
    public void setTamanio(double tamanioLado){
        this.tamanioLado = tamanioLado;
    }
    
    public abstract double calcularArea();
}
