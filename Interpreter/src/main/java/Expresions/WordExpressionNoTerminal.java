/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresions;
import Celphone.CellPhone;
import Context.Context;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author truqu
 */


public class WordExpressionNoTerminal implements Expression { //Expresiones no terminales
    private String sentence;
    private ArrayList<Expression> expressions;

    public WordExpressionNoTerminal(String sentence) {
        this.sentence = sentence;
    }

    //Devuelve celulares que cumplan las condiciones de cada expresion (expre1, expre2)
    @Override
    public List<CellPhone> interpret(Context context) {
        return new ArrayList<>();
    }
    
    public ArrayList<Expression> interpretWord(Context context) {
        ArrayList<String> brands = new ArrayList();
        ArrayList<String> rams = new ArrayList();

        for (CellPhone phone : context.getCellPhones()) {
            brands.add(phone.getBrand());
            rams.add(phone.getRam());
        }

        String [] words = sentence.split(" ");
        expressions = new ArrayList();
        boolean lessThan = false;

        for (String word : words) {
            for (String brand : brands) {
                if(word.equalsIgnoreCase(brand)){
                    expressions.add(new BrandExpression(word)); 
                    break;
                }
            }
            for (String ram : rams) {
                if(word.equalsIgnoreCase(ram)){
                    expressions.add(new RamExpression(word)); 
                    break;
                }
            }
            if(word.equalsIgnoreCase("menor")){
                lessThan = true;
            }
            try { 
                Integer priceInt = Integer.valueOf(word);
                expressions.add(new PriceExpression(priceInt, lessThan)); 
            } catch (Exception e) {}
        }

        return expressions;
    }
}

