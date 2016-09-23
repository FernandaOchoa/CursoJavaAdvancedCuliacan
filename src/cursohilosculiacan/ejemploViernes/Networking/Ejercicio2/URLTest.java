package cursohilosculiacan.ejemploViernes.Networking.Ejercicio2;

import java.net.URL;
//La clase URL Java representa una URL. URL es un acrónimo de Uniform Resource Locator. Apunta a un recurso en la World Wide Web. Por ejemplo:
public class URLTest {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.oracle.com/java");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
