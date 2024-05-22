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


public class AndExpression implements Expression { //Expresiones no terminales
    private Expression expr1;
    private Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    //Devuelve celulares que cumplan las condiciones de cada expresion (expre1, expre2)
    @Override
    public List<CellPhone> interpret(Context context) {
        List<CellPhone> firstResult = expr1.interpret(context); 
        return expr2.interpret(new Context(firstResult));
    }
}

