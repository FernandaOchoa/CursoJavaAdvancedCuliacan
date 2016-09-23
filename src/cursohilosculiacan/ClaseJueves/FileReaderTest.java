package cursohilosculiacan.ClaseJueves;
//Ejercicio 13

import java.io.FileReader;
import java.io.FileWriter;

//Ejercicio 13
public class FileReaderTest {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("C:\\hola.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);
        }
        fr.close();
    }
}
