package cursohilosculiacan.ejemploJueves.javaiosample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//Ejercicio para leer un archivo y crear otro a partir de ese 
//Ejercicio 4

public class ReadFileToWriteFile {

    public static void main(String args[]) throws Exception {
        FileInputStream fin = new FileInputStream("C:\\hola.txt");
        FileOutputStream fout = new FileOutputStream("C:\\M.txt");
        int i = 0;
        while ((i = fin.read()) != -1) {
            fout.write((byte) i);
        }
        fin.close();
    }

}
