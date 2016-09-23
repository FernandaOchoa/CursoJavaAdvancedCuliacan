package cursohilosculiacan.claseMiercoles;

public class Main {
    
    public static void main(String [] args){
        //objeto cliente1 de la clase cliente
        Cliente cliente1 = new Cliente("Cliente 1", new int [] { 2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente ("Cliente 2", new int [] { 1, 3, 5, 2 ,5});
        
        //Objetos de Cajera
        Cajera cajera1 = new Cajera ("Cajera 1");
        Cajera cajera2 = new Cajera ("Cajera 2");
        
        //Tiempo Inicial de referencia
        long initialTime = System.currentTimeMillis();
        
        cajera1.procesarCompra(cliente1, initialTime);
        cajera2.procesarCompra(cliente2, initialTime);
        
    } 
    
}
