
package cursohilosculiacan.ClaseViernes.Ejemplo3;

//La Clase de Java URLConnection representa un enlace de comunicacion entre la URL 

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

//y la aplicacion.
//Esta clase se utiliza para leer y escribir datos en el recurso especificado planteado
//por el URL
public class URLConnectionTest {
    
    public static void main (String [] args){
        
        try {
            URL url = new URL ("https://www.oracle.com/java");
            URLConnection urlcon = url.openConnection();
            
            InputStream stream = urlcon.getInputStream();
            
            int i;
            while((i = stream.read())!= -1) {
                System.out.print((char) i);
        }
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
