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
    

    public CellPhoneModel(String model) {
        this.model = model;
    }

    public String display() {
        return this.model;
    }

}
