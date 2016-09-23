package cursohilosculiacan.ejemploJueves.javaiosample;

import java.io.FileReader;

//Ejercicio 12
public class FileReaderTest {

    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("C:\\abc.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);
        }

        fr.close();
    }

}
