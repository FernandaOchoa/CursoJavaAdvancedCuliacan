package cursohilosculiacan.ClaseJueves;

//Ejercicio 14
import java.io.CharArrayWriter;
import java.io.FileWriter;

//Es utilizada esta clase para escribir datos en multiples archivos, implementa una interfaz 
//de indicess, es almacenado en un bufer que aumenta cuando se escribe en el stream
public class CharArrayTest {

    public static void main(String[] args) throws Exception {

        CharArrayWriter out = new CharArrayWriter();

        out.write("Soy un titulo");

        FileWriter f1 = new FileWriter("C:\\a.txt");
        FileWriter f2 = new FileWriter("C:\\b.txt");
        FileWriter f3 = new FileWriter("C:\\c.txt");
        FileWriter f4 = new FileWriter("C:\\d.txt");

        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        
        f1.close();
        f2.close();
        f3.close();
        f4.close();

    }

}
