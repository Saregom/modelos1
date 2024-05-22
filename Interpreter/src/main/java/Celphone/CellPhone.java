/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Celphone;

/**
 *
 * @author truqu
 */
public class CellPhone {
    private String brand;
    private String ram;
    private int price;

    public CellPhone(String brand, String ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Marca: " + brand + ", Ram: " + ram + ", Precio: " + price + "\n";
    }
}

