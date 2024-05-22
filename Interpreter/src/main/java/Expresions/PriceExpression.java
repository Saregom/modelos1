/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresions;

import Context.Context;
import Celphone.CellPhone;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author truqu
 */


public class PriceExpression implements Expression { //Expresiones terminales
    private int price;
    private boolean lessThan;

    public PriceExpression(int price, boolean lessThan) {
        this.price = price;
        this.lessThan = lessThan;
    }

    //Devuelve lista con precio de celular menor al actual    
    @Override
    public List<CellPhone> interpret(Context context) {
        if(lessThan){
            return context.getCellPhones().stream()
                .filter(phone -> phone.getPrice() < price)
                .collect(Collectors.toList());
        }else{
            return context.getCellPhones().stream()
                .filter(phone -> phone.getPrice() > price)
                .collect(Collectors.toList());
        }
        
    }
}