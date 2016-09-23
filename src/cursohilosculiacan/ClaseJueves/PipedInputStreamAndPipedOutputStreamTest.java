package cursohilosculiacan.ClaseJueves;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *
 * Las Clases PipedInputStream y PipedOutputStream, son utilizadas para leer y
 * escribir dtos simultaneamente Amos streams son conectados uno con otro usando
 * el metodo connect de la clase PipedOutputStream
 *
 */
//Utilizando 2 hilos t1 y t2... escribimos datos usando POS, y en t2 leemos los datos usando PIS.
//Ambos objetos conectados
public class PipedInputStreamAndPipedOutputStreamTest extends Thread{

    public static void main(String[] args) throws Exception {

        final PipedOutputStream pout = new PipedOutputStream();
        final PipedInputStream pin = new PipedInputStream();

        //Conectamos los streams
        pout.connect(pin);
        //Creamos un hilo que escribira los datos

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 65; i <= 90; i++) {
                    try {
                        pout.write(i);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        };
        //Creamos el hilo que escribira los datos
        Thread t2 = new Thread() {
            public void run() {
                try {
                    for (int i = 65; i <= 90; i++) {
                        System.out.println(pin.read());
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        //Iniciamos los hilos
        t1.start();
        t2.start();
    }
}
