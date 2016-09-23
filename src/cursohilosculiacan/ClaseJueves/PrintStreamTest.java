
package cursohilosculiacan.ClaseJueves;
//Esta lase provee los metodos para escribir datos en otro stream
//PrintStream automaticamente vacia los datos, asi que no necesita llamar el metodo flush

import java.io.FileOutputStream;
import java.io.PrintStream;

//Tampoco necesita el manejo de excepciones

//Escribir enteros y cadenas
public class PrintStreamTest {
    
    public static void main (String [] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("C:\\mfile.txt");
        
        PrintStream pout = new PrintStream(fout);
        pout.println(1900);
        pout.println("Hola");
        pout.println("y asi");
        
        pout.close();
        fout.close();
    }
}
