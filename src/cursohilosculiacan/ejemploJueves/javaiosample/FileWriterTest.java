package cursohilosculiacan.ejemploJueves.javaiosample;

import java.io.FileWriter;

//Ejercicio 11
public class FileWriterTest {

    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("C:\\abc.txt");
            fw.write("my name is sachin");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("success");
    }

}
