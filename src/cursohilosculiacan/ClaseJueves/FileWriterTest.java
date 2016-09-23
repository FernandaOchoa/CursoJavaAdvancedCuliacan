//Ejercicio 12

package cursohilosculiacan.ClaseJueves;

import java.io.FileWriter;


public class FileWriterTest {
    
    public static void main(String [] args) {
        try {
            FileWriter  fw = new FileWriter("C:\\hola.txt");
            fw.write("Soy un mensaje");
            fw.close();
        } catch (Exception e){
            System.out.println(e);
        } 
        System.out.println("Listo");
    }
}
