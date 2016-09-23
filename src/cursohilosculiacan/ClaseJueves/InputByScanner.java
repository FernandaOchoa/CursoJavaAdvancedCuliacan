
package cursohilosculiacan.ClaseJueves;

import java.util.Scanner;


public class InputByScanner {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int edad;
        String nombre = "";
        
        System.out.println("Escribe tu nombre");
        nombre = sc.nextLine();
        System.out.println("Escribe tu edad");
        edad= sc.nextInt();
        System.out.println("Tu nombre es: "+nombre+"y tu edad es: "+edad);
       
    }
}
