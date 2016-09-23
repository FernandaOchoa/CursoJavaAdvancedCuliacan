
package cursohilosculiacan.ClaseJueves.Seriaiizacion.ejemplo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
Ahora se puede serializar el objeto. Estudiante extiende de Persona que es serializable
Las propiedades de la clase se heredan a las subclases de modo que si la clase padre es 
serializable, la subclase tambien
*/

public class Estudiante extends Persona  {
    
    String curso;
    int edad;
    
    public Estudiante(int id, String name, String curso, int edad) {
        super(id,name);
        this.curso = curso;
        this.edad= edad;
    }
    public static void main(String[] args) throws Exception{
       /*  Estudiante s1 = new Estudiante(190, "Jose","Java Advanced",28);

        FileOutputStream fout = new FileOutputStream("C:\\f.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(s1);
        out.flush();
        System.out.println("Listo");
        */
          ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\f.txt"));
        Estudiante s = (Estudiante)in.readObject();
        
        System.out.println(s.id+" "+s.name+""+s.curso+" "+s.edad);
        
        in.close();
    }
}
