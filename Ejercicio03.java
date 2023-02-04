/**
 * Ejercicio 3
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 06/10/2022
 */

/*
Con un comentario de párrafo, indica en el programa ejemplo las palabras reservadas que aparecen y para qué sirven.
Con un comentario de párrafo, escribe todas las palabras reservadas que tiene Java.
Con un comentario de párrafo, da tu definición personal de qué es un identificador en Java.
*/

import java.util.Scanner;

public class Ejercicio03 {
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

// Indica en el programa ejemplo las palabras reservadas que aparecen y para qué sirven.
// Int es una palabra reservada y sirve para declarar un entero. String es una palabra reservada y sirve para declarar una
// cadena de texto. Public y class son tambien palabras reservadas de Java, asi como void y new.