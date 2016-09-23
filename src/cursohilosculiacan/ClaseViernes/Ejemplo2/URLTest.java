package cursohilosculiacan.ClaseViernes.Ejemplo2;

//La Clase URL de Java representa una URL. (Uniform Resource Locator)

import java.net.URL;

//Apunta a un recursp de la WWW (World Wide Web)
public class URLTest {
    public static void main (String [] args){
        try {
            URL url = new URL("https://www.oracle.com/java"); 
            
            System.out.println("Protocolo: " + url.getProtocol());
            System.out.println("Nombre del Host: "+url.getHost());
            System.out.println("Numero de Puerto: "+url.getPort());
            System.out.println("Nombre de Archivo: "+url.getFile());
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
