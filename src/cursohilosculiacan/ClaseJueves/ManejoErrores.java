
package cursohilosculiacan.ClaseJueves;
//Ejercicio 1 (Output and Error)

import java.io.IOException;

public class ManejoErrores {
    
    public static void main(String [] args) throws IOException{
        
        System.out.println("Mensajito simple");
        System.err.println("Error D:");
        
        int i = System.in.read();
        System.out.println((char)i);
    }
    
}
