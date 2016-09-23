package cursohilosculiacan.claseMiercoles;

public class Cajera {

    private String nombre;

//Constructor por default ahora visible
    public Cajera() {

    }

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Operaciones de la caja
    public void procesarCompra(Cliente cliente, long timeStamp) {

        System.out.println("La cajera: " + this.nombre + " Comienza a procesar la compra del cliente " + cliente.getNombre()
                + "En el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");

        for (int i = 0; i < cliente.getCarroCompra().length; i++) {

            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            
            System.out.println("Procesando el producto " + (i + 1) + "Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " seg");

            System.out.println("La cajera: "+ this.nombre + "Ha terminado de procesar "+ cliente.getNombre() + "En el tiempo: "+ (System.currentTimeMillis() - timeStamp) / 1000 + " seg");
        }

    }

    //Hilo
    private void esperarXsegundos(int segundos) {

        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
