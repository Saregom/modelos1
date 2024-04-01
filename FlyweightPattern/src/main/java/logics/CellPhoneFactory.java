/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logics;
import java.util.HashMap;
/**
 *
 * @author truqu
 */
// Clase FlyweightFactory que gestiona la creación y almacenamiento de objetos flyweight
public class CellPhoneFactory {
    private static final HashMap<String, CellPhoneModel> phoneModelsMap = new HashMap<>();

    public static CellPhoneModel getCellPhoneModel(String model, String color) {
        CellPhoneModel cellPhoneModel = phoneModelsMap.get(model);

        // Si el teléfono con la marca especificada no existe, lo creamos y lo almacenamos en el mapa
        if (cellPhoneModel == null) {
            cellPhoneModel = new CellPhoneModel(model, color);
            phoneModelsMap.put(model, cellPhoneModel);
        }
        return cellPhoneModel;
    }
    
    
}
