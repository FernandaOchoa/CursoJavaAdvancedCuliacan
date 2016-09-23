package cursohilosculiacan.ClaseViernes.Chat.Servidor;

//EL SERVIDOR
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRecibe implements Runnable {

    private final PrincipalServidor main;
    private String mensaje;
    private ObjectInputStream entrada;
    private Socket cliente;

    //Inicializamos el servidor del chat y configuramos la interfaz
    public ThreadRecibe(Socket cliente, PrincipalServidor main) {
        this.cliente = cliente;
        this.main = main;
    }

    public void mostrarMensaje(String mensaje) {
        main.areaTexto.append(mensaje);
    }

    public void run() {
        try {
            entrada = new ObjectInputStream(cliente.getInputStream());
        } catch (IOException ioe) {
            Logger.getLogger(ThreadRecibe.class.getName()).log(Level.SEVERE, null, ioe);
        }
        //procesamos los datos enviados desde el servidor
        do {
            //Intentamos leer el mensaje y mostrarlo
            try {
                //Leo el nuevo mensaje
                mensaje = (String) entrada.readObject();
                main.mostrarMensaje(mensaje);
            } catch (SocketException soe) {
                Logger.getLogger(ThreadRecibe.class.getName()).log(Level.SEVERE, null, soe);
            } catch (EOFException eof) {
                eof.printStackTrace();
            } catch (IOException ioe) {
                main.mostrarMensaje("Excepcion de entrada / salida");
            } catch (ClassNotFoundException cnfe) {
                main.mostrarMensaje("No se de que clase hablas");
            }
        } while (!mensaje.equals("Servidor STOP"));

        try {
            //cerramos el input stream
            entrada.close();
            //cerramos el socket
            cliente.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        main.mostrarMensaje("Fin de la conexion");
        System.exit(0);
    }

}
