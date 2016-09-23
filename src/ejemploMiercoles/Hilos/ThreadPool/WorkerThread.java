package ejemploMiercoles.Hilos.ThreadPool;

public class WorkerThread implements Runnable {
    
    private String message;
    
    public WorkerThread(String msg){
        this.message = msg;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+ "(Start) Mesagge = "+ message);
       processmesagge(); //Llama al metodo que duerme el hilo por 2 seg
        System.out.println(Thread.currentThread().getName()+"(End)"); //improme el nombre del hilo
    }
    
    private void processmesagge(){
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
