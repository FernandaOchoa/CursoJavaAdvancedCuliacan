package cursohilosculiacan.ClaseJueves.Seriaiizacion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesPersistencia {
    
    public static void main (String args[]) throws Exception {
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\f.txt"));
        Estudiante s = (Estudiante)in.readObject();
        
        System.out.println(s.id+" "+s.name);
        
        in.close();
    }
    
}
