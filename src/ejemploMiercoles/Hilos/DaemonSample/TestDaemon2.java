
package ejemploMiercoles.Hilos.DaemonSample;

//Si queremos pasar un hilo de usuario a demonio, no debemos iniciarlo ya que de lo
//contrario arrojara un Illegal Thread State Exception

public class TestDaemon2 extends Thread {

    public void run(){
        System.out.println("Nombre: "+Thread.currentThread().getName());
        System.out.println("Daemon: "+Thread.currentThread().getName());
        
    }
    public static void main (String [] args){
        
        TestDaemon2 t1 = new TestDaemon2();
        TestDaemon2 t2 = new TestDaemon2();
        
        t1.start();
        t1.setDaemon(true); //aqui arrojara la excepcion
        t2.start();
    }
    
}
