
package cursohilosculiacan.ClaseJueves;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;

/**
 * 
 * DeflaterOutputStream e InflaterInputStream proveen los mecanismos para comprimir
 * y descomprimir los datos en el "deflate compression format"
 * 
 * DeflaterOutputStream: es usado para comprimir los datos, provee con facilidad los filtros de compresion como GZIPOutputStream
 * *DEFLATE Compreess: Algoritmo de compresion de datos sin perdida definido por Phil Katz
 * 
 */
//Leemos datos de un archivo y comprimimos el archivo en uno nuevo usando DeflaterOutputStream.
//Deflater.java
public class CompressingAndDecompressingTest {
    public static void main (String [] args){
        try{
            FileInputStream fin = new FileInputStream("C:\\hola.txt");
            FileOutputStream fout = new FileOutputStream("C:\\def.txt");
            DeflaterOutputStream out = new DeflaterOutputStream(fout);
            
            int i;
            
            while((i=fin.read())!= -1){
                out.write((byte)i);
                out.flush();
            }
            fin.close();
            out.close();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
