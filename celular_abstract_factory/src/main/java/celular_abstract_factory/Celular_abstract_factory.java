/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celular_abstract_factory;

import abstract_factory.CelularFactory;
import abstract_products.Camara;
import abstract_products.Pantalla;
import abstract_products.Procesador;
import concret_factories.GamaAltaConcret;
import concret_factories.GamaBajaConcret;
import concret_factories.GamaMediaConcret;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class Celular_abstract_factory {
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do{
            op=menu();
            switch(op){
                case 1:
                    GamaAltaConcret gamaAlta = new GamaAltaConcret();
                    servicioGamas(gamaAlta);
                    break; 
                case 2:
                    GamaMediaConcret gamaMedia = new GamaMediaConcret();
                    servicioGamas(gamaMedia);
                    break;
                case 3:
                    GamaBajaConcret gamaBaja = new GamaBajaConcret();
                    servicioGamas(gamaBaja);
                    break;
                case 4:
                    System.out.println("Cerrando Programa");
                    System.exit(0);
                 default :
                    System.out.println(".....Opcion invalida....");
            }
        }while(op!=4);
    }
    
    public static void servicioGamas(CelularFactory celularGama){
        Pantalla pantalla = celularGama.crearPantalla();
        pantalla.construir();
        
        Procesador procesador = celularGama.crearProcesador();
        procesador.construir();
        
        Camara camara = celularGama.crearCamara();
        camara.construir();
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
