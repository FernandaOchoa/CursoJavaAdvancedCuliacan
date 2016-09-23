package cursohilosculiacan.ejemploJueves.javaiosample;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

//Ejercicio 9
public class BufferedOutputStreamTest {

    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("C:\\f1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Hola soy un mensajito";
        byte b[] = s.getBytes();
        bout.write(b);

        bout.flush();
        bout.close();
        fout.close();
        System.out.println("super!!");

    }

}
