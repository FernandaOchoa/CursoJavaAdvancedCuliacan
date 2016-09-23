package cursohilosculiacan.ClaseJueves;

//Ejercicio 10

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

//BufferefOutputStream utiliza un buffer para almacenar la informacion
// Es mucho mas eficioente cuando se escriben datos directos al stream
public class BufferedOutputStreamTest {
    public static void main(String args[]) throws Exception{
        
        FileOutputStream fout = new FileOutputStream("C:\\f1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        
        String mensaje = "Hola soy un mensajito";
        byte b[] = mensaje.getBytes();
        bout.write(b);
        
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Listo ");
    }
}
