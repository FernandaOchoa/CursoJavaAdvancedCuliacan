package cursohilosculiacan.ejemploJueves.javaiosample;

//Ejemplo de Byte Array Ejercicio 5
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ByteArrayOutputStreamTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fout1 = new FileOutputStream("C:\\f1.txt");
        FileOutputStream fout2 = new FileOutputStream("C:\\f2.txt");

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(139);
        try {
            bout.writeTo(fout1);
        } catch (IOException ex) {
            Logger.getLogger(ByteArrayOutputStreamTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bout.writeTo(fout2);
        } catch (IOException ex) {
            Logger.getLogger(ByteArrayOutputStreamTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        bout.flush();
        bout.close();//has no effect  
        System.out.println("success...");
    }

}
