package cursohilosculiacan.ejemploJueves.javaiosample;

//Ejercicio 15
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferedReader2 {

    public static void main(String args[]) throws Exception {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        String name = "";

        while (!name.equals("stop")) {
            System.out.println("Enter data: ");
            name = br.readLine();
            System.out.println("data is: " + name);
        }

        br.close();
        r.close();
    }

}
