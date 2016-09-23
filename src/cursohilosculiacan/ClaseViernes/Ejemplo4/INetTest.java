package cursohilosculiacan.ClaseViernes.Ejemplo4;
//La  Clase Inet Adress representa una direccion IP. 
//La clase java.net.InetAddress proporciona los metodos para obtener la ip

import java.net.InetAddress;

// de cualquier nombre de host, por ejemplo: www.oracle.com, www.google.com, www.facebook.com, etc
public class INetTest {

    public static void main(String[] args) {

        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");

            System.out.println("Nombre del Host; " + ip.getHostName());
            System.out.println("Direccion IP: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
