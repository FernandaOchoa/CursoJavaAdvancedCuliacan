package cursohilosculiacan.ClaseJueves;
//Ejercicio 16
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferedReader2 {
    
    public static void main(String [] args) throws Exception {
        
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        
        String name = "";
        
        while (!name.equals("stop")) {
            System.out.println("Introduce un dato: ");
            name = br.readLine();
            System.out.println("El dato es: "+name);
        }
        br.close();
        r.close();
    }
    
}
