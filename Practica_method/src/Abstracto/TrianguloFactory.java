/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstracto;

/**
 *
 * @author jorge malaver,
 */
//Interface triangulo factory que crea triangulos
public interface TrianguloFactory {
    //Metodo crear triangulo
    public Triangulo CrearTriangulo(int ladoA, int ladoB, int ladoc);
}
