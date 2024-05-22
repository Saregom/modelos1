/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresions;

import Context.Context;
import Celphone.CellPhone;
import java.util.List;
/**
 *
 * @author truqu
 */


public interface Expression {  //Expresión abstractas
    List<CellPhone> interpret(Context context);
}
