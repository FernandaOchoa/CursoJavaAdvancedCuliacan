package cursohilosculiacan.ClaseJueves.Seriaiizacion.ejemplo3;

import java.io.Serializable;

/*
Java Tansient Keyword
Se define como cualquier miembro transitorio que no va a ser serializado
 */
public class Estudiante implements Serializable {

    int id;
    String name;
    transient int edad; //<-Fresa que no juega

    public Estudiante(int id, String name, int edad) {
        this.id = id;
        this.name = name;
        this.edad = edad;
    }
}
