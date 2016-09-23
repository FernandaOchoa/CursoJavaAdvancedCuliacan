//Ekercicio 8
//Leer de Multiples archivos con ENUM

package cursohilosculiacan.ClaseJueves;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//Ejercicio 9
public class SequenceInputStreamTest3 {
    
    public static void main (String [] args) throws IOException {
        
        //Creamos el FileInputStream para todos los archivos
        FileInputStream fin = new FileInputStream("C:\\f1.txt");
        FileInputStream fin2 = new FileInputStream("C:\\f2.txt");
         FileInputStream fin3 = new FileInputStream("C:\\f3.txt");
        FileInputStream fin4 = new FileInputStream("C:\\f4.txt");
        
        //Creamos el objeto de tipo vector para todos en el stream
        Vector v = new Vector();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
        
        //Creamos el objeto enum llamando todos los elementos 
        Enumeration e = v.elements();
        
        //Pasamos el objeto enum en el Constructor de mi SIS
        SequenceInputStream  sis = new SequenceInputStream(e);
        
        int  i= 0;
        while((i = sis.read())!= -1){
            System.out.println((char)i);
        }
        sis.close();
        fin.close();
        fin2.close();
        fin3.close();
        fin4.close();
    }
    
}
