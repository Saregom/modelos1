/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package celularMethodFactory;

import factory.Celular;
import factory.CelularGamaAlta;
import factory.CelularGamaBaja;
import factory.CelularGamaMedia;
import java.util.Scanner;

/**
 *
 * @author santi
 */
public class CelularMethodFactory {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op;
        do{
            op=menu();
            switch(op){
                case 1:
                    Celular gamaAlta = new CelularGamaAlta();
                    gamaAlta.construirComponentes();
                    break; 
                case 2:
                    Celular gamaMedia = new CelularGamaMedia();
                    gamaMedia.construirComponentes();
                    break;
                case 3:
                    Celular gamaBaja = new CelularGamaBaja();
                    gamaBaja.construirComponentes();
                    break;
                case 4:
                    System.out.println("Cerrando Programa");
                    System.exit(0);
                default :
                    System.out.println(".....Opcion invalida....");
            }
        }while(op!=4);
    }
    
    public static int  menu(){
        System.out.println(
                "\nMENU DE OPCIONES\n"
                + "1. Construir celular gama alta. \n"
                + "2. Construir celular gama media. \n"
                + "3. Construir celular gama baja. \n"
                + "4. Cerrar programa. \n\n"
                + "Seleccione una opcion:"
        );
        return Integer.parseInt(sc.nextLine());
    }
}
