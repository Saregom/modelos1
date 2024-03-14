/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosConcretos;
import component.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truqu
 */
public class TarjetaGraficaCompuesta extends TarjetaGrafica{
    List<TarjetaGrafica> tarjetas;

    public TarjetaGraficaCompuesta(String nombre) {
        super(nombre, 0); // El precio se calculará dinámicamente
        tarjetas = new ArrayList<>();
    }

    @Override
    public double getPrecio() {
        precio = 0;
        for (TarjetaGrafica tarjeta : tarjetas) {
            precio += tarjeta.getPrecio();
        }
        return precio;
    }

    public List<TarjetaGrafica> getTarjetas() {
        return tarjetas;
    }

    public void agregarTarjeta(TarjetaGrafica tarjeta) {
        tarjetas.add(tarjeta);
    }

    public void removerTarjeta() {
        if(tarjetas != null && !tarjetas.isEmpty()){
            tarjetas.remove(tarjetas.size()-1);
        }
    }
    
    public void removerTarjetas() {
        tarjetas.clear();
    }
}
