package cursohilosculiacan.ejemploJueves.javaiosample;
//Escribir archivo ejercicio 2

import java.io.FileOutputStream;

public class FileOutputStreamTest {

    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("C:\\abc.txt");
            String s = "Hola soy un archivo escrito en Java";
            byte b[] = s.getBytes();//converting string into byte array  
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
