package cursohilosculiacan.ClaseJueves;

//Ejercicio 15

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InputBufferedReaderTest {
    
    public static void main(String [] args) throws Exception{
        
        InputStreamReader r = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (r);
        
        System.out.println("Escribe tu nombre ");
        String name = br.readLine();
        System.out.println("Bienvenido "+name);
    }
    
}
