/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;
import interfas.*;
/**
 *
 * @author truqu
 */

//Servicio real
public class CelularReal implements Celular{
    @Override
    public String hacerLlamada(String numero) {
        return "Llamando al número " + numero;
    }

    @Override
    public String ingresarACorreo(String usuario, String contrasena) {
        return "Autenticacion correcta del usuario " + usuario;
    }
}
