
package Interface;

/**
 *
 * @author jorge malaver
 */

//Interfaz abstracta de las figuras
public interface Figuras_geometricas {
    
    //Creacion de metodos a implementar
    public void setNombre(String n);
    public String getNombre();
    public void tamaño1(int x, int y);
    public void tamaño2(int x);
    public String getposicion();
    public Figuras_geometricas clonar();
}
