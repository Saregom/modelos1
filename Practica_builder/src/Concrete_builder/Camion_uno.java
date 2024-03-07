/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete_builder;

/**
 *
 * @author jorge malaver
 */
import Abstraccion.*;

//Clase camion tipo uno, extiende del constructor
public class Camion_uno extends CamionBuilder{
    
//   Sobreescritura de los metodos abstractosss
    @Override
    public void builmotor(){
        Camion.setmotor("Motor cummis");
    }

    @Override
    public void builcarroceria(){

        Camion.setcarroceria("Carroceria de lujo");
    }

    @Override
    public void builruedas(){
        Camion.setruedas("Ruedas gran tamaño");
    }
}
