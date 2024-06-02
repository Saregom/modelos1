/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxies;
import interfas.*;
import implementaciones.*;
/**
 *
 * @author truqu
 */

//Servio proxy
public class CelularProxy implements Celular{
    private CelularReal celularReal;
    private String url;
    private String contrasena;
    private String listaContactos[];
    private String pais;
    private String internet;

    public CelularProxy(String url, String contrasena, String pais, String internet) {
        this.url = url;
        this.contrasena = contrasena;
        this.listaContactos = new String[]{"3170835965", "3004806087"};
        this.celularReal = new CelularReal();
        this.pais = pais;
        this.internet = internet;
    }

    @Override
    public String hacerLlamada(String numero) {
        if (!pais.equals("China")) {
            return celularReal.hacerLlamada(numero);
        } else {
            return "El pais de origen es china, no puedes hacer llamadas con este modelo";
        }
    }

    @Override
    public String ingresarAFacebook(String url, String internet) {
        // Lógica para verificar el usuario y contraseña (ejemplo: usuario=admin, contraseña=123)
        if (url.equals("www.facebook.com") && this.internet.equals("Universidad distrital")) {
            return "Acceso denegado. Sitio restringido por el proveedor de internet: " + this.internet;
            
        } else {
            return celularReal.ingresarAFacebook(url, this.internet);
        }
    }

    private boolean verificarNumero(String numero) {
        // Lógica para verificar el numero en la lista de contactos
        for(String number : listaContactos){
            if(numero.equals(number)){
                return true;
            }
        }
        return false;
    }
}
