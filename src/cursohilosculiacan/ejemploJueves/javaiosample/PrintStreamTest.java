package cursohilosculiacan.ejemploJueves.javaiosample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {

    public static void main(String args[]) throws Exception {
        FileOutputStream fout = new FileOutputStream("C:\\mfile.txt");
        PrintStream pout = new PrintStream(fout);
        pout.println(1900);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
    }

}
