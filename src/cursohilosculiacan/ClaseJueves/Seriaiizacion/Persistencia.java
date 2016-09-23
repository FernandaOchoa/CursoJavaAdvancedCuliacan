package cursohilosculiacan.ClaseJueves.Seriaiizacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persistencia {

    public static void main(String[] args) throws Exception {
        Estudiante s1 = new Estudiante(190, "Jose");

        FileOutputStream fout = new FileOutputStream("C:\\f.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(s1);
        out.flush();
        System.out.println("Listo");
    }

}
