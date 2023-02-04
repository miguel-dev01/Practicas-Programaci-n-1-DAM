/**
 * Ejercicio 15
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 18/10/2022
 */

 	
/*
    Escribe un programa simple que escriba todos los múltiplos de 3 comprendidos entre 1 y 3000.
    Opcionalmente, haz variantes en el mismo programa, resolviendolo con diferentes tipos de bucles; 
    incluso utilizando break y continue. 
    Documenta el programa con comentarios aclaratorios adicionales.
*/

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int number = 3;
		int i;
		System.out.println("Los multiplos de " + number + " son: ");
		
		for(i = 1; i <= 3000; i++) {
			
			if(i % number == 0) {
				System.out.println(i);
			}
			
		}// Cierre de bucle FOR	
		
		
		System.out.println("\n-------------------------------");
		System.out.println("\nPRUEBA CON BUCLE WHILE");

		int j = 1;
		while(true) {
			if(j <= 3000) {
				//System.out.println(j);
				j++;
				
				if(j % number == 0) {
					System.out.println(j);
				}
			}else {
				break; //CONTINUE ignora todo lo que haya despues y vuelve a dar la vuelta
			}
			
			
				
		}// Cierre del while
	

	} // Cierre de void main
	
} // Cierre de class