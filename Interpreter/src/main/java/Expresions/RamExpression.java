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
public class RamExpression implements Expression { //Expresiones terminales
    private String ram;

    public RamExpression(String ram) {
        this.ram = ram;
    }

    //Devuelve lista de celulares que tienen el sistema operativo actual
    @Override
    public List<CellPhone> interpret(Context context) {
        return context.getCellPhones().stream()
                .filter(phone -> phone.getRam().equalsIgnoreCase(ram))
                .collect(Collectors.toList());
    }
}
