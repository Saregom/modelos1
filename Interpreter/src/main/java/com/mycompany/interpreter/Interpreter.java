/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interpreter;

import java.util.Arrays;
import java.util.List;

import Context.Context;
import Celphone.CellPhone;
import Expresions.*;
import interfaz.Interfaz;


/**
 *
 * @author truqu
 */
public class Interpreter {

    public static void main(String[] args) {
//        List<CellPhone> phones = Arrays.asList(
//                new CellPhone("Samsung", "Android", 21),
//                new CellPhone("Apple", "iOS", 5),
//                new CellPhone("Google", "Android", 2),
//                new CellPhone("Apple", "iOS", 999)
//        );
//
//        Context context = new Context(phones);
//
//        // Buscar teléfonos de Apple con precio menor a 1000
//        Expression isApple = new BrandExpression("apple");
//        Expression isCheap = new PriceExpression(1000, true);
//        Expression appleAndCheap = new AndExpression(isApple, isCheap);
//
//        List<CellPhone> result = appleAndCheap.interpret(context);

//        result.forEach(System.out::println);
        
        new Interfaz();
    }
}
