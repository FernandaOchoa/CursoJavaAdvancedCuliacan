package ejemploMiercoles.Hilos;

public class TestJoin4 extends Thread {
    
    public void run (){
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String [] args){
        
        TestJoin4 t1 = new TestJoin4();
        TestJoin4 t2 = new TestJoin4();
        
        t1.start();
        t2.start();
    }
}

