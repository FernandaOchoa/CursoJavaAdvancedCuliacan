/**
 * It provides to user threads for background supporting tasks. It has no role in life than
 * to serve user threads.
 * Its life depends on user threads
 * It is a low  priority thread
 */
package ejemploMiercoles.Hilos.DaemonSample;

public class TestDaemon extends Thread {
    
    public void run(){
        
        //Si el hilo es un demonio...
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread work");
        } else {
            System.out.println("User thread work");
        }
    }
    
    public static void main (String [] args ){
        TestDaemon t1 = new TestDaemon(); //Creamos un hilo
        TestDaemon t2 = new TestDaemon(); //Creamos un hilo
        TestDaemon t3 = new TestDaemon(); //Creamos un hilo
        
        t1.setDaemon(true); //Ahora es un demonio muajajaja
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
