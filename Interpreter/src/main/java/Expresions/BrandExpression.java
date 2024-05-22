/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresions;

import Celphone.CellPhone;
import Context.Context;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author truqu
 */


public class BrandExpression implements Expression { //Expresion terminales
    private String brand;

    public BrandExpression(String brand) {
        this.brand = brand;
    }

    // Devuelve celulares de la marca actual
    @Override
    public List<CellPhone> interpret(Context context) {
        return context.getCellPhones().stream()
                .filter(phone -> phone.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }
}

