package cursohilosculiacan.ejemploViernes.Networking.Ejemplo3;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {
    //La clase Java URLConnection representa un enlace de comunicación entre la URL y la aplicación. 
    //Esta clase se puede utilizar para leer y escribir datos en el recurso especificado planteada por el URL.

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.oracle.com/java");
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
