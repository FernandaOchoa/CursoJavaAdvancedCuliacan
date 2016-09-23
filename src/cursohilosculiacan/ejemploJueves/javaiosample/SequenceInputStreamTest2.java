package cursohilosculiacan.ejemploJueves.javaiosample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

//Ejercicio 7

public class SequenceInputStreamTest2 {

    public static void main(String args[]) throws Exception {

        FileInputStream fin1 = new FileInputStream("C:\\f1.txt");
        FileInputStream fin2 = new FileInputStream("C:\\f2.txt");

        FileOutputStream fout = new FileOutputStream("C:\\f3.txt");

        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
        int i;
        while ((i=sis.read()) != -1) {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
    }

}
