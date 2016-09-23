package cursohilosculiacan.ClaseJueves;
//Ejercicio 2

import java.io.FileOutputStream;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("C:\\ejercicio2.txt");

            String texto = "Hola soy un archivo escrito en java";
            byte b[] = texto.getBytes(); //Convierto el texto en un arreglo de bytes

            fout.write(b);
            fout.close();
            System.out.println("Listo :D ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
