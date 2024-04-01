/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logics;

/**
 *
 * @author truqu
 */
// Clase concreta que implementa el objeto flyweight
// Clase compartida por varios celulares (intrinseco)(Flyweight)
public class CellPhoneModel{
    private String model;
    private String color;

    public CellPhoneModel(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String display() {
        return this.model;
//        System.out.println("Mostrando: " + img);
    }

    public String getColor() {
        return color;
    }
}
