
package cursohilosculiacan.ClaseJueves.Seriaiizacion.ejemplo2;

import java.io.Serializable;


public class Persona implements Serializable {
    
    int id;
    String name;
    
    Persona (int id, String name){
        this.id = id;
        this.name= name;
    }
    
}
