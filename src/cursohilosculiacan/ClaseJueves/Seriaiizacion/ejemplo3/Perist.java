
package cursohilosculiacan.ClaseJueves.Seriaiizacion.ejemplo3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Perist {
    
    public static void main (String [] args) throws Exception{
        
        Estudiante uno = new Estudiante(918,"Alan",34);
        
        FileOutputStream ut = new FileOutputStream("C:\\f.txt");
        
        ObjectOutputStream out = new ObjectOutputStream(ut);
        
        out.writeObject(uno);
        ut.close();
        System.out.println("Listo");
        
    }
    
}
