package ejemploMiercoles.Hilos.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    
    public static void main(String [] args){
        
        ExecutorService executor = Executors.newFixedThreadPool(5); //Creamos un pool de 5 hilos
        
        for ( int i = 0; i < 10; i++){
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker); //Llamo al metodo ejecutar de la Clase ExecutorService
            
        }
        executor.shutdown();
        while(!executor.isTerminated()){
        }
        System.out.println("Todos los hilos estan bien muertos");
    }
    
}
