/**
 * Ejercicio 4
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 06/10/2022
 */

 	
/*
  En un programa simple basado en Saludos.java indica, con un comentario de párrafo, todas las variables que aparecen y para qué se utilizan.
  Con un comentario de párrafo, da tu definición personal de qué es una variable en Java
*/


import java.util.Scanner;

public class Ejercicio04 {
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

// Da tu definición personal de qué es una variable en Java.
// Una variable es como un contenedor de un dato o valor, donde podremos instanciarlo o llamarlo para trabajar con el, 
// generando nuevos resultados o valores a partir de dicha variable.