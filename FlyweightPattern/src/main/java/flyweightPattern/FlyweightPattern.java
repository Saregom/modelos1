package flyweightPattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import interfaz.Interfaz;
import java.util.ArrayList;
import java.util.Random;
import logics.CellPhone;
import logics.CellPhoneFactory;
import logics.CellPhoneModel;

/**
 *
 * @author truqu
 */
//Main
public class FlyweightPattern {
    private static ArrayList<CellPhone> cellPhones = new ArrayList<>();

    public static void main(String[] args) {
        //Lista de modelos
        String[] model = {"Iphone x", "Moto G84"};
        //Lista de caracteristicas de modelos
        String[] ram = {"4GB", "6GB", "8Gb"};
        String[] storage = {"64GB", "128GB", "256Gb"};
        String[] camera = {"12MPx", "48Mpx", "108MPx"};
        
        for(int i = 0; i < 20; i++){
//            System.out.println(getRandomBrand(model));
            String randomModel = getRandom(model);
            String color = "#C3ECF4";
            if(randomModel.equals("Moto G84")){
                color = "#f5b0ab";
            }
            CellPhoneModel phoneModel = CellPhoneFactory.getCellPhoneModel(randomModel, color);
            CellPhone phone = new CellPhone(getRandom(ram), getRandom(storage), getRandom(camera), phoneModel);
            cellPhones.add(phone);
        }
        
        new Interfaz(cellPhones);
    }

    //Obtiene un string aleatorio
    private static String getRandom(String[] brands) {
        return brands[(int) (Math.random() * brands.length)];
    }
}
