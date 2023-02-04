/**
 * Ejercicio 5
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 06/10/2022
 */

 	
/*
En el mismo programa escribe con un comentario de párrafo todos los operadores que tiene Java.
Indica con comentarios de linea las expresiones que aparecen y qué resultado producen.
*/


import java.util.Scanner;

public class Ejercicio05 {
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

// En el mismo programa escribe con un comentario de párrafo todos los operadores que tiene Java.
// operador "+" lo que hace es sumar un valor con otro.
// operador "-" lo que hace es restar un valor con otro.
// operador "*" lo que hace es multiplicar un valor con otro.
// operador "/" lo que hace es dividir un valor con otro.
// operador "%" si el resto de la division usando este operador da 0 entonces sera True. 

// Tambien estan los operadores que operan y asignan un valor despues de haberlo operado. Son los siguientes:
// "+="	"-="	"*="	"/="	"%="

// Java tambien puede hacer uso de operadores de incremento y decremento: "++" o "--"

/*
 Y por ultimo estan los operadores relacionales como:
 "==" --> Igual que
 "!=" --> Diferente de
 "<" --> Menor que
 ">" --> Mayor que
 "<=" --> Menor o igual que
 ">=" --> Mayor o igual que
*/