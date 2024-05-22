/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import java.util.List;
import Celphone.CellPhone;
/**
 *
 * @author truqu
 */


public class Context {
    private List<CellPhone> cellPhones;

    public Context(List<CellPhone> cellPhones) {
        this.cellPhones = cellPhones;
    }

    public List<CellPhone> getCellPhones() {
        return cellPhones;
    }
}
