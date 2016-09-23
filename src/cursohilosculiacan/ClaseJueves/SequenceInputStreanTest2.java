//Ejercicio 7
//Leer datos de 2 archivos y escribirlos en uno solo
package cursohilosculiacan.ClaseJueves;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreanTest2 {
    public static void main (String [] args ) throws Exception{
        //Archivos que vamos a leer 
        FileInputStream fin1 = new  FileInputStream("C:\\f1.txt");
        FileInputStream fin2 = new FileInputStream("C:\\f2.txt");
        
        //Archivo que vamos a crear con la nueva info
        FileOutputStream fout = new FileOutputStream("C:\\f3.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
        int i;
        while((i= sis.read()) != -1) {
            fout.write(i);
        } 
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
    }
}
