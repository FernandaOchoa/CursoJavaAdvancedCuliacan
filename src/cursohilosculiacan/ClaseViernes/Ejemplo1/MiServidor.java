package cursohilosculiacan.ClaseViernes.Ejemplo1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
El Cliente escribira primero en el servidor, entonces el servidor recibe e imprime el texto
A continuacion, el servidor va a escribir en el cliente y el cliente recibe e imprime el texto
 */
public class MiServidor {

    public static void main(String[] args) throws Exception {

        ServerSocket socket = new ServerSocket(3333);
        Socket s = socket.accept();
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        String str = "", str2= "";
        
        while(!str.equals("stop")) {
            str = din.readUTF();
            System.out.println("El cliente dice; "+str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        socket.close();
    }
}
