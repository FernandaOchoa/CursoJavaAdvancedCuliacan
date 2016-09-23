
package cursohilosculiacan.ClaseViernes.Chat.Cliente;
//Clase Cliente

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;

public class ThreadEnvia implements Runnable{
    
    private final PrincipalCliente main;
    private ObjectOutputStream salida;
    private String mensaje;
    private Socket conexion;
    
    public ThreadEnvia(Socket conexion, final PrincipalCliente main){
        this.conexion = conexion;
        this.main = main;
        
        //Evento que ocurre al escribir en el campo de texto
        main.campoTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mensaje = e.getActionCommand();
                //envio el mensaje
                enviarDatos(mensaje);
                //limpiamos
                main.campoTexto.setText(" ");
            }
        });
    }
    
    //Enviamos objeto al cliente
    private void enviarDatos(String mensaje){
        try {
            salida.writeObject("Cliente : "+mensaje);
            salida.flush();
            main.mostrarMensaje("Cliente: "+mensaje);       
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    public void mostrarMensaje ( String mensaje) {
        main.areaTexto.append(mensaje);
    }
    public void run() {
        try {
            salida = new ObjectOutputStream(conexion.getOutputStream());
            salida.flush();
        }catch(SocketException se){
            se.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }catch(NullPointerException npe){
            npe.printStackTrace();
        }
    }
    
    
}
