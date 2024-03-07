/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesionales;
/**
 *
 * @author jorge malaver
 */

//Clase MedicoAdapter (patron adapter) extiende de clase abstracta target_Profesionales
public class MedicoAdapter  extends Target_Profesionales{
    Medico medico;// referencia a la clase adaptada medico
    
    //Constructor del Medico adapter
    public MedicoAdapter(){
        super();//Llamado constructor padre
        this.medico = new Medico(); //Instancia de medico
    }
     
    //Metodos sobrescritos de la clase abstracta devuelven un string
    @Override
    public String Leer_planos(){
        return "Especialidades de medicas\n" + this.medico.especialidad() + this.medico.Entidades();
    }
    
    @Override
    public String contratos(){
        return "Nacionalidades\n" + this.medico.nacionalidad();
    }
    
    @Override
    public String supervision(){
        return "Campos de investigacion\n" + this.medico.Investigacion();
    }
}
