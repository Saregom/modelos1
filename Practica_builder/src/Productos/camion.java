/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author jorge malaver
 */

//Clase producto: camion, con sus componentes
public class camion {
//    Atribiutos del camion
    private String motor="";
    private String carroceria="";
    private String ruedas="";
    
//    getters y setters de los atributos del camion
    public void setmotor(String motor){
        this.motor=motor;
    }
    
    public void setcarroceria(String carroceria){
        this.carroceria=carroceria;
    }
    
    public void setruedas(String ruedas){
        this.ruedas=ruedas;
    }

    public String getMotor() {
        return motor;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public String getRuedas() {
        return ruedas;
    }
    
    
}
