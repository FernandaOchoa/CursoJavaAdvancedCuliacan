package cursohilosculiacan.ejemploJueves.javaiosample;

//Ejercicio 14

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferedReader {

    public static void main(String args[]) throws Exception {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Enter your name");
        String name = br.readLine();
        System.out.println("Welcome " + name);
    }

}
