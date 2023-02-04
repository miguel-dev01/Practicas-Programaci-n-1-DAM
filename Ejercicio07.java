/**
 * Ejercicio 07 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*
Escribe un programa que muestre el factorial de un número leído por teclado.

Para el cálculo del factorial utiliza un método llamado factorial() 
que recibe el número para el cálculo y devuelve el resultado.
*/

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Indique numero para sacar factorial del mismo: ");
	int number = keyboard.nextInt();
	
	if(number <= 0) {
		System.out.println("No se pueden introducir numeros negativos ni el 0."); return;
	}
	
	long mostrar_factorial = factorial(number);
	System.out.println("\nEl numero factorial de " + number + " es " + mostrar_factorial);

	} // Cierre metodo main
	
	public static long factorial(int fact) {
		
		long result = 1;
		
		for(int i = 1; i <= fact; i++) {
			result = result * i;
		}
		
		return result;
		
	} // Cierre metodo factorial
}