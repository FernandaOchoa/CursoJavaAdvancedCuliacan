package cursohilosculiacan.ejemploViernes.Networking.Ejercicio4;

import java.io.*;  
import java.net.*;

public class INetTest {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("https://www.javatpoint.com/");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
