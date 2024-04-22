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
    private String usuario;
    private String contrasena;
    private String listaContactos[];

    public CelularProxy(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.listaContactos = new String[]{"3170835965", "3004806087"};
        this.celularReal = new CelularReal();
    }

    @Override
    public String hacerLlamada(String numero) {
        if (verificarNumero(numero)) {
            return celularReal.hacerLlamada(numero);
        } else {
            return "Este numero no esta en tu lista de contactos.";
        }
    }

    @Override
    public String ingresarACorreo(String usuario, String contrasena) {
        // Lógica para verificar el usuario y contraseña (ejemplo: usuario=admin, contraseña=123)
        if (usuario.equals(this.usuario) && contrasena.equals(this.contrasena)) {
            return celularReal.ingresarACorreo(usuario, contrasena);
        } else {
            return "Acceso denegado. Usuario o contraseña incorrectos.";
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
