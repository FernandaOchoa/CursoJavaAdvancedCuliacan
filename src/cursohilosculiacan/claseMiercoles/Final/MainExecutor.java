
package cursohilosculiacan.claseMiercoles.Final;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutor {
    private static final int numCajeras = 2;
    
    public static void main (String [] args){
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente ("Cliente 1", new int[] {2,2,1,5,2})); //12 seg
        clientes.add(new Cliente ( "Cliente 2", new int[] {1,1,5,1,1})); //9 seg
        clientes.add(new Cliente ("Cliente 3", new int[]{5,3,1,5,2})); //16 seg
        clientes.add(new Cliente ("Cliente 4", new int[] {2,2,1,5,2})); //12 seg
        clientes.add(new Cliente ( "Cliente 5", new int[] {1,1,5,1,1})); //9 seg
        clientes.add(new Cliente ("Cliente 6", new int[]{5,3,1,5,2})); //16 seg
        clientes.add(new Cliente ("Cliente 7", new int[] {2,2,1,5,2})); //12 seg
        clientes.add(new Cliente ( "Cliente 8", new int[] {1,1,5,1,1})); //9 seg
        clientes.add(new Cliente ("Cliente 9", new int[]{5,3,1,5,2})); //16 seg
        
        long init = System.currentTimeMillis(); //Instante en el que se inicia el procesamiento
        ExecutorService executor = Executors.newFixedThreadPool(numCajeras);
        
        for(Cliente cliente : clientes){
            Runnable cajera = new CajeraRunnable (cliente, init);
            executor.execute(cajera);
        }
        executor.shutdown(); //Cierro el gestor
        while (!executor.isTerminated()){
            //Espero a que terminen de ejecutarse todos los procesos para pasar a las siguientes instrucciones
        }
        long fin = System.currentTimeMillis(); //Instante final del procesamiento
        System.out.println("Tiempo total de procesamiento: "+(fin - init) / 1000 +"Segundos");
    }
    
}
