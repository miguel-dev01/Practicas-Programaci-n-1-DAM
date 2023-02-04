/**
 * Ejercicio 13
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 11/10/2022
 */

 	
/*
 Escribe un programa simple que lea una serie de números enteros por teclado e indique cuál es el mayor de todos ellos.
   No se deben guardar los datos introducidos; sólo debe ir guardándose el que vaya siendo mayor.
   Cada vez que se lee un dato el programa pregunta si se quiere seguir. Se debe pulsar la tecla S para seguir.
   Documenta el programa con comentarios aclaratorios adicionales si se considera necesario.

*/

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Declaramos los tipos de las variables
		int num = 0;
		String pregunta = "S";
		int num_bucle;
		
		while(pregunta.equalsIgnoreCase("S")) {
			
			System.out.print("\nIntroduce numero: ");
			num_bucle = keyboard.nextInt();
			keyboard.nextLine();
			
			System.out.print("\nIndica con 'S' si quieres seguir jugando. De lo contrario, indica cualquier otra letra: ");
			pregunta = keyboard.nextLine();	
			
			// Indicamos con condicional que numero de los introducidos sera el mayor de todos.
			if(Boolean.valueOf(pregunta) != true) {
				if(num_bucle > num) {
					num = num_bucle;
					//System.out.println(num + " es el numero mas mayor.");
				}
			}
					
		} // Cierre del while
		
		System.out.println("\nEl numero mas mayor de los que has introducido es " + num);
		
		
		System.out.print("\nPrograma finalizado ;)");
		
	}
}