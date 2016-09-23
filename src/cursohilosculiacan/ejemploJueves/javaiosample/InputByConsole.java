package cursohilosculiacan.ejemploJueves.javaiosample;

import java.io.Console;
//Ejercicio 16
public class InputByConsole {

    public static void main(String args[]) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n = c.readLine();
        System.out.println("Welcome " + n);
    }

}
