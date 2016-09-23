
package cursohilosculiacan.ClaseViernes.Chat.Cliente;

import cursohilosculiacan.ClaseViernes.Chat.Servidor.PrincipalServidor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class PrincipalCliente  extends JFrame{
    
    public JTextField campoTexto; //Para mostrar mensajes a los usuarios
    public JTextArea areaTexto;

    private static ServerSocket servidor;
    private static Socket cliente;
    private static String ip = "127.0.0.1"; //Ip a la que me conecto
    public static PrincipalCliente main;

    public PrincipalCliente() {
        super("Ventana del Cliente"); // <-Titulo de la ventana

        campoTexto = new JTextField(); //Creamos el campo de texto
        campoTexto.setEditable(false);

        add(campoTexto, BorderLayout.NORTH);
        
        areaTexto = new JTextArea(); //Creo el display area
        areaTexto.setEditable(false);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
        areaTexto.setBackground(Color.LIGHT_GRAY); //Color gris claro al area del texto
        areaTexto.setForeground(Color.BLACK); //Letra negra
        campoTexto.setForeground(Color.BLACK); //Letra negra

        //Creamos un menu Opciones y un submenu Salir, agregando el submenu al menu
        JMenu menuOpciones = new JMenu("Opciones");
        JMenuItem salir = new JMenuItem("Salir");
        menuOpciones.add(salir);

        //Crear la barrita
        JMenuBar barra = new JMenuBar();
        setJMenuBar(barra); //Agrega la barra de menus a la aplicacion
        barra.add(menuOpciones);

        //Eventos
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //TamaÃ±o de la ventana
        setSize(300, 320);
        setVisible(true);
    }
//Para mostrar texto en el display area
    
    public void mostrarMensaje (String mensaje){
        areaTexto.append(mensaje + "\n");
    }
    public void habilitarTexto(boolean editable){
        campoTexto.setEditable(editable);
    }
    public static void main (String[] args) throws IOException{
        
        PrincipalCliente main = new PrincipalCliente();
        
        //Centrar el JFrame 
        main.setLocationRelativeTo(null);
        //Habilito el cierre de la ventana
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Para correr TODO nuestro puÃ±o de hilos
        ExecutorService executor = Executors.newCachedThreadPool();
        
        try {
            main.mostrarMensaje("Buscando Servidor");
            //Comunicacion al servidor
            cliente = new Socket(InetAddress.getByName(ip),11111);
            //Mostrar conectando a..
            main.mostrarMensaje("Conectando a: "+cliente.getInetAddress().getHostName());
            //Habilitamos el texto
            main.habilitarTexto(true);
            
            //Ejecutamos los Threads
            executor.execute(new ThreadRecibe(cliente, main));
            executor.execute(new ThreadEnvia(cliente,main));
            
        }catch(IOException ioe) {
            Logger.getLogger(PrincipalCliente.class.getName()).log(Level.SEVERE, null, ioe);
        }
        finally {
            
        }
        executor.shutdown();

    }
}
