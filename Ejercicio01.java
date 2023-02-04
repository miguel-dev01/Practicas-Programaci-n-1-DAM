/**
 * Ejercicio 1
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 06/10/2022
 */

/* 
    En un programa simple basado en Saludos.java identifica con comentarios los distintos elementos del lenguaje que aparecen.
    Con un comentario de párrafo responde: ¿Los comentarios son un elemento del lenguaje Java?
    Con un comentario de párrafo, escribe el alfabeto de Java.
    Con un comentario de párrafo, escribe el léxico o diccionario de palabras del programa Saludos.
    Con un comentario de párrafo, da tu definición personal de qué es una sentencia de Java.
*/

import java.util.Scanner;

public class Ejercicio01 {
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

// ¿Los comentarios son un elemento del lenguaje Java?
// Los comentarios SI son elementos de Java.

// Escribe el alfabeto de Java.
// a b c d e f g h i j k l m n ñ o p q r s t u v w x y z 

// Escribe el léxico o diccionario de palabras del programa Saludos.
// teclado, numOrden, nombre

// Da tu definición personal de qué es una sentencia de Java.
// Una sentencia va a ser un metodo que realiza para resolver un problema, es decir,
// un accion que trae consigo y que va a recaer sobre los datos de entrada con los que trabaje el programa.