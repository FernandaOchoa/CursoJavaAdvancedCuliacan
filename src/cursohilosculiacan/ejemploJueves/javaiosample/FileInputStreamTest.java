package cursohilosculiacan.ejemploJueves.javaiosample;

//Lectura de Archivo en Java Ejercicio 3

import java.io.FileInputStream;

public class FileInputStreamTest {

    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("C:\\abc.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.println((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
