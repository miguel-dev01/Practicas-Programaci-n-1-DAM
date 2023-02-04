/**
 * Ejercicio 2
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 06/10/2022
 */

/*
    En un programa simple basado en Saludos.java identifica, con un comentario de párrafo, los tipos de datos que aparecen; primitivos y no primitivos.
    Con un comentario de párrafo, escribe todos los tipos de datos primitivos que tiene Java.
    Con un comentario de párrafo, da tu definición personal de qué es un dato primitivo en Java 
    Con un comentario de párrafo, identifica en el programa los valores o constantes literales que aparecen y su tipo de dato.
*/
import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		/* teclado es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		 */
		Scanner teclado = new Scanner(System.in);

		int numOrden;			// Variable numérica.
		String nombre = "";		// Variable de texto. 

		// Configura y muestra mensajes de bienvenida.
		numOrden = 1 ;
		System.out.println("Hola,");
		System.out.print("Soy un modesto ");
		System.out.print("programa de ordenador...\n");
		System.out.println("Bienvenido al Curso.\t" + "Este es el saludo nº " + numOrden);
		numOrden++;
		System.out.println("Bienvenido a Java.\t" + "Este es el saludo nº " + numOrden);
		System.out.println("\nFin programa..."); 
	}
}

// Escribe todos los tipos de datos primitivos que tiene Java.
// Int, long, short, char, byte, double, float, boolean.

// Da tu definición personal de qué es un dato primitivo en Java.
// Son un tipo de datos que nos permiten trabajar con numeros y valores, para construir estructuras.

// Identifica en el programa los valores o constantes literales que aparecen y su tipo de dato.
// numOrden es un tipo de dato entero y se le ha asignado el valor 1.
// nombre es un tipo de dato String y se le he asignado el valor null o vacio.