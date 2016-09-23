//Ejercicio 11
//Leyendo datos con BufferedInputStream
package cursohilosculiacan.ClaseJueves;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

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
