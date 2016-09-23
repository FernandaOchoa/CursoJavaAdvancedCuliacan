package cursohilosculiacan.ejemploJueves.javaiosample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//Ejercicio 8
public class SecuenceInputStreamTest3 {

    public static void main(String args[]) throws IOException {

//creating the FileInputStream objects for all the files  
        FileInputStream fin = new FileInputStream("C:\\A.java");
        FileInputStream fin2 = new FileInputStream("C:\\abc2.txt");
        FileInputStream fin3 = new FileInputStream("C:\\abc.txt");
        FileInputStream fin4 = new FileInputStream("C:\\B.java");

//creating Vector object to all the stream  
        Vector v = new Vector();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);

//creating enumeration object by calling the elements method  
        Enumeration e = v.elements();

//passing the enumeration object in the constructor  
        SequenceInputStream bin = new SequenceInputStream(e);
        int i = 0;

        while ((i = bin.read()) != -1) {
            System.out.print((char) i);
        }

        bin.close();
        fin.close();
        fin2.close();
    }

}
