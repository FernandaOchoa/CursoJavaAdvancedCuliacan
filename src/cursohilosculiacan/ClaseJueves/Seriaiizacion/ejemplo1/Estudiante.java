
package cursohilosculiacan.ClaseJueves.Seriaiizacion.ejemplo1;

import java.io.Serializable;
//Direcion no es serializable, asi que no se puede crear una instancia a la clase estudiante
//Arroja un NotSerializableException en ejecucion
public class Estudiante implements Serializable {
    int id;
    String nombre;
    Direccion direccion;
    
    public Estudiante(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}
