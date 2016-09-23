
package ejemploMiercoles.Hilos;

public class TestJoin3 extends Thread {
    
    public void run(){
        System.out.println("Running...");
    }
    public static void main(String [] args){
        
        TestJoin3 t1 = new TestJoin3();
        TestJoin3 t2 = new TestJoin3();
        
        System.out.println("Nombre del hilo 1: "+t1.getName());
        System.out.println("Nombre del hilo 2: "+t2.getName());
        System.out.println("id del hilo 1; "+t1.getId());
        
        t1.start();
        t2.start();
        
        t1.setName("Hilo con Nombre");
        System.out.println("Despues de cambiarle el nombre al hilo 1 ahora se llama: "+t1.getName());
    }
    
}
