
package cursohilosculiacan.ClaseViernes.Chat.Cliente;

//CLASE CLIENTE

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRecibe implements Runnable {
    
    private final PrincipalCliente main;
    private String mensaje;
    private ObjectInputStream entrada;
    private final Socket cliente;
    
    public ThreadRecibe(Socket cliente, PrincipalCliente main){
        this.cliente = cliente;
        this.main = main;
    }
    
    public void mostrarMensaje(String mensaje) {
        main.areaTexto.append(mensaje);
    }
    
    public void run(){
        try {
            entrada = new ObjectInputStream(cliente.getInputStream());
        } catch(IOException ioe){
            Logger.getLogger(ThreadRecibe.class.getName()).log(Level.SEVERE, null, ioe);
        } do {
            //Procesar los mensajes enviados desde el servidor
            try {
                mensaje = (String) entrada.readObject();
                main.mostrarMensaje(mensaje);
            }catch(SocketException se){
                se.printStackTrace();
            } catch(EOFException eof){
                eof.printStackTrace();
            }catch (IOException ioe) {
                ioe.printStackTrace();
            }catch(ClassNotFoundException cnfe){
                cnfe.printStackTrace();
            }
        } while (!mensaje.equals("Cliente Stop"));
        
        try {
            entrada.close();
            cliente.close();
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
        main.mostrarMensaje("Fin de la Conexion");
        System.exit(0);
    }
    
}
