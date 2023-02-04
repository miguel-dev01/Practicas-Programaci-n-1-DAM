/**
 * Ejercicio 12
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 11/10/2022
 */

 	
/*
Escribe un programa simple que lea exactamente ocho números enteros y 
luego escriba la suma de todos ellos.

 **Debe utilizarse un bucle.
*/

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int result = 0;
		
		for(int i=0; i <= 7; i++) {
			System.out.print("Introduzca ocho numeros enteros: ");
			int pregunta = keyboard.nextInt();
			result = result + pregunta;
		}
		
		System.out.println("La suma total de los ochos numeros leidos por el programa es --> " + result);
	}
}