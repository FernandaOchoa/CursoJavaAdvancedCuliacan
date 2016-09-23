/*
 * La Serializacion en Java es un mecanismo de escritura de estados de un objeto en un
* byte stream, su operacion inversa se llama deserializacion
* Es principalmente utilizado en Hibernate, RMI, JPA, EJB, JMS y Android
* Ventajas de la serializacion, es principalmente usado para que los objetos viajen a traves de un canal
* Serializable Interface: Es un marcador, se usa para marcar las clases para que los objetos 
* de estas clases puedan tener ciertas capacidades, clonarse o remotos, son marcadores de estas interfaces
 */
package cursohilosculiacan.ClaseJueves.Seriaiizacion;

/*
ObjectOutputStream: Esta clase es usada para escribir tipos de datos primitivos
* y objetos en un OutputStream, siempre y cuando sean objetos que permitan la interfaz Serializable
* Serializable: Proceso de codificacion de un objeto en un medio de almacenamiento con el fin de ser transmitido a traves de una conexion de ren como una serie de bytes.
 */

import java.io.Serializable;
//La clase estudiante implementa una interfaz serializable, ahora estos objetos pueden ser
//convertidos a streams

public class Estudiante implements Serializable {

    int id;
    String name;

    public Estudiante(int id, String name) {

        this.id = id;
        this.name = name;
    }

}
