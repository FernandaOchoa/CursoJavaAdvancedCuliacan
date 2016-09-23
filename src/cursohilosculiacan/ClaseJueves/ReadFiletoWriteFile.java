
package cursohilosculiacan.ClaseJueves;

//Ejercicio 4

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFiletoWriteFile {
    public static void main(String [] args) throws Exception{
        
        FileInputStream fin = new FileInputStream("C:\\hola.txt");
        
        FileOutputStream fout = new FileOutputStream ("C:\\nuevo.txt");
        
        int i = 0;
        while((i = fin.read()) != -1) {
            fout.write((byte) i);
        } fin.close();
    }
}
