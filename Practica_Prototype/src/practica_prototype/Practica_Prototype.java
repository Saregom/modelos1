
package practica_prototype;

/**
 *
 * @author jorge malaver
 */
import Figuras.Circulo;
import Figuras.Rectangulo;
import interfaz.InterfazPracticaPrototype;

public class Practica_Prototype {
    // Clase principal
    public static void main(String[] args) {
        // Creacion de rectangulo
        Rectangulo rectangulo= new Rectangulo();
        rectangulo.setNombre("Rectangulo");
        rectangulo.tamaño1(18, 25);//ancho, altura
        
        // Creacion de Circulo
        Circulo circulo= new Circulo();
        circulo.setNombre("Circulo");
        circulo.tamaño2(4);//Radio 4
        
        //instancia de la interfaz, llamado
        new InterfazPracticaPrototype(rectangulo, circulo);
    }
}
