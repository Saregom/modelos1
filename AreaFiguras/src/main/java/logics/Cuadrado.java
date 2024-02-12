/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logics;

/**
 *
 * @author truqu
 */
public class Cuadrado extends Figura{

    public Cuadrado(double tamanioLado) {
        super(tamanioLado);
    }
    
    @Override
    public double calcularArea(){
        return (this.tamanioLado * this.tamanioLado);
    }
    
    
}
