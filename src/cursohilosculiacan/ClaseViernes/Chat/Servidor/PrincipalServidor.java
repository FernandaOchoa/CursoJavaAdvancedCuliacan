package cursohilosculiacan.ClaseViernes.Chat.Servidor;

//CLASE SERVIDOR
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;

public class PrincipalServidor extends JFrame {

    public JTextField campoTexto; //Para mostrar mensajes a los usuarios
    public JTextArea areaTexto;

    private static ServerSocket servidor;
    private static Socket conexion;
    private static String ip = "127.0.0.1"; //Ip a la que me conecto
    public static PrincipalServidor main;

    public PrincipalServidor() {
        super("Ventana del Servidor"); // <-Titulo de la ventana

       campoTexto = new JTextField(); //Creamos el campo de texto
        campoTexto.setEditable(false);

        areaTexto = new JTextArea(); //Creo el display area
        areaTexto.setEditable(false);
        add(campoTexto, BorderLayout.NORTH); 
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
        //Tamaño de la ventana
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
        
        PrincipalServidor main = new PrincipalServidor();
        
        //Centrar el JFrame 
        main.setLocationRelativeTo(null);
        //Habilito el cierre de la ventana
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Para correr TODO nuestro puño de hilos
        ExecutorService executor = Executors.newCachedThreadPool();
        
        try {
            servidor = new ServerSocket(11111, 100);
            main.mostrarMensaje("Esperando al Cliente");
            
            //Ciclo infinito para esperar conexiones de los clientes
            
            while(true){
                try {
                    //Aceptamos o Abrimos la conexion del socket
                    conexion = servidor.accept();
                    
                    main.mostrarMensaje("Conexion Realizada con Exito");
                    
                    main.mostrarMensaje("Conectado a: "+conexion.getInetAddress().getHostName());
                    //Ya se puede escribir
                    main.habilitarTexto(true);
                    //Hilos
                    //cliente
                    executor.execute(new ThreadRecibe(conexion,main));
                    executor.execute(new ThreadEnvia(conexion, main));
                } catch (IOException e) {
                    Logger.getLogger(PrincipalServidor.class.getName()).log(Level.SEVERE, null, e);
                    
                }
            }
        } catch(IOException e){
            Logger.getLogger(PrincipalServidor.class.getName()).log(Level.SEVERE, null, args);
        }
        finally {
            //Aunque arroje una excepcion, no se salga del while
        }
        executor.shutdown();
    }
}

