package ejemploMiercoles.Hilos.ThreadGroups;

/**
 *
 * Solo hay 2 constructores para la clase ThreadGroup ThreadGroup (String name)
 * <- Crea un grupo con un nombre dado ThreadGroup (ThreadGroup parent, String
 * name) <- Crea un grupo de hilos con un padre y un nombre
 *
 * Metodos Importantes de la Clase ThreadGroup int activeCount() regresa el
 * numero de hilos que actualmente se ejecutan del grupo int activeGroupCount()
 * regresa el numero de grupos activos en este grupo de hilos void destrroy()
 * destruye el grupo de hilos con sus subgrupos String getName() regresa el
 * nombre del grupo ThreadGroup getParent() regresa el padre del grupo void
 * interrumpt() interrumpe todos los hilos del grupo void list() imprime
 * informacion del grupo en la consola estandar del compilador
 *
 * Grupo con muchos hilos ThreadGroup tg1 = new ThreadGroup("Grupo A"); Thread
 * t1 = new Thread(tg1, new MyRunnable(), "one"); Thread t2 = new Thread(tg1,
 * new MyRunnable(), "two"); Thread t3 = new Thread(tg1, new MyRunnable(),
 * "three");
 *
 * Ahora los 3 hilos pertenecen a un solo grupo
 *
 * Thread.currentThread.getThreadGroup.interrumpt();
 *
 */
public class ThreadGroups implements Runnable {

    public void run() {

        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        
        ThreadGroups runnable = new ThreadGroups();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
        
        Thread t1 = new Thread (tg1, runnable, "one");
        t1.start();
        
        Thread t2 = new Thread (tg1, runnable, "two");
        t2.start();
        
        Thread t3 = new Thread(tg1, runnable, "Three");
        t3.start();
        
        System.out.println("Thread Group Nombre: "+tg1.getName());
        tg1.list();
    }

}
