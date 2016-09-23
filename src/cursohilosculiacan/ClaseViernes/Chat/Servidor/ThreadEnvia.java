package cursohilosculiacan.ClaseViernes.Chat.Servidor;

//EL SERVIDOR
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectOutputStream;
import java.awt.*;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class ThreadEnvia implements Runnable {

    private final PrincipalServidor main;
    private ObjectOutputStream salida;

    private String mensaje;
    private Socket conexion;

    public ThreadEnvia(Socket conexion, final PrincipalServidor main) {
        this.conexion = conexion;
        this.main = main;

        //Lo que ocurre al escribir un texto en areaTexto
        main.campoTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mensaje = e.getActionCommand();
                enviarDatos(mensaje);
                main.campoTexto.setText(" "); //Borra el texto
            }
        });
    }

    //enviar objetos (mensajes) al cliente
    private void enviarDatos(String mensaje) {
        try {
            salida.writeObject("Servidor: " + mensaje);
            salida.flush();
            main.mostrarMensaje("Servidor: " + mensaje);
        } catch (IOException e) {
            main.mostrarMensaje("Error al escribir mensaje");
        }
    }

    //Manipulamos la pantalla en el hilo con un despachador de eventos
    public void mostrarMensaje(String mensaje) {
        main.areaTexto.append(mensaje);
    }

    public void run() {
        try {
            salida = new ObjectOutputStream(conexion.getOutputStream());
            salida.flush();
        } catch (SocketException se) {
            se.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
    }
}
