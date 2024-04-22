/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxypattern;
import interfas.Celular;
import interfaz.Interfaz;
import proxies.*;
/**
 *
 * @author truqu
 */
public class ProxyPattern {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Llama interfaz y Crea un proxy para el servicio de Celular
        new Interfaz(new CelularProxy("admin", "123"));
    }
}
