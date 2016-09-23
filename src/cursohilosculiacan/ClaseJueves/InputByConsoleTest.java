package cursohilosculiacan.ClaseJueves;

import java.io.Console;

public class InputByConsoleTest {
    public static void main (String[] args[]){
        Console c = System.console();
        
        System.out.println("Introduce tu dome: ");
        String n = c.readLine();
        
        System.out.println("Hola "+n);
    }
}
