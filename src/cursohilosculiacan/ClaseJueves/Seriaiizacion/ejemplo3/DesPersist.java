
package cursohilosculiacan.ClaseJueves.Seriaiizacion.ejemplo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesPersist {
    
    public static void main(String [] args) throws IOException,FileNotFoundException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\f.txt"));
        
        Estudiante estudiante = (Estudiante)in.readObject();
        System.out.println(estudiante.id+" "+estudiante.edad+" "+estudiante.name);
        in.close();
    }
    
}
