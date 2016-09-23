package cursohilosculiacan.ejemploJueves.javaiosample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

//Ejercicio 10
public class BufferedInputStreamTest {

    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("C:\\f1.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.println((char) i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
