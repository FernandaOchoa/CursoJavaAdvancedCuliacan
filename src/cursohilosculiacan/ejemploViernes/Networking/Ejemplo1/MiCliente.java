package cursohilosculiacan.ejemploViernes.Networking.Ejemplo1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

//El cliente escribirá primero en el servidor, entonces el servidor recibirá e imprimirá el texto. 
//A continuación, el servidor va a escribir en el cliente y el cliente recibirá e imprimir el texto
public class MiCliente {

    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 3333);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "", str2 = "";
        while (!str.equals("stop")) {
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("El Servidor dice: " + str2);
        }

        dout.close();
        s.close();

    }
}