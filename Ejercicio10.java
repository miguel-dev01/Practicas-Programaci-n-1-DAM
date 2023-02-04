/**
 * Ejercicio 10
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 06/10/2022
 */

 	
/*
Escribe un programa simple que pida tres datos de tipo entero por teclado, 
los guarde y los muestre ordenados por pantalla.
*/

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Pedimos primer numero de tipo entero
		System.out.print("Introduzca el primer numero: ");
		int num1 = keyboard.nextInt();
		
		// Pedimos segundo numero de tipo entero
		System.out.print("Introduzca el segundo numero: ");
		int num2 = keyboard.nextInt();
		
		// Pedimos tercer numero de tipo entero
		System.out.print("Introduzca el tercer numero: ");
		int num3 = keyboard.nextInt();
		
		// Mostramos el resultado
		System.out.println("\n" + "El primer numero introducido es: " + num1);
		System.out.println("El segundo numero introducido es: " + num2);
		System.out.println("El tercer numero introducido es: " + num3);

	}
}