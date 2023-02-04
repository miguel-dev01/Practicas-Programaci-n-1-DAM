/**
 * Ejercicio 20
 * 
 * MIGUEL SANCHEZ GARCIA - 23/10/2022
 */

 	
/*

 Escribe un programa simple que muestre un menú que permita realizar las operaciones de 
 sumar, restar, multiplicar, dividir y terminar.
	El menú debe ejecutarse en un bucle continuo controlando la opción terminar del menú.
	Las operaciones serán siempre de dos operandos.

*/

import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int pregunta;
		int numero1;
		int numero2;
		
		
		while(true) {
			System.out.println("¿Que opcion quieres realizar? \n 1-sumar \n 2-restar \n 3-multiplicar \n 4-dividir \n 5-terminar ");
			System.out.print("\nIndique: ");
			pregunta = keyboard.nextInt();
			
			
			if(pregunta == 5) {
				System.out.println("\nPrograma terminado.");
				break;
			}else if(pregunta >= 6) {
				System.out.println("\nEl numero introducido no corresponde a ningun menu. Vuelva a intentarlo.");
				continue;
			}else if(pregunta < 0) {
				System.out.println("\nEl numero introducido no corresponde a ningun menu. Vuelva a intentarlo.");
			}
				
			
				System.out.print("Has seleccionado la opcion " + pregunta);
				System.out.println();
			
				System.out.print("\nIntroduzca el primer operando: ");
				numero1 = keyboard.nextInt();
				
				
				System.out.print("Introduzca el segundo operando: ");
				numero2 = keyboard.nextInt();
				
			
			if(pregunta == 1) {
				int suma = numero1 + numero2;
				System.out.println("El resultado de la suma de los numeros introducidos es: " + suma + "\n");
				
			}else if(pregunta == 2) {
				int resta = numero1 - numero2;
				System.out.println("El resultado de la resta de los numeros introducidos es: " + resta + "\n");
				
			}else if(pregunta == 3) {
				int multi = numero1 * numero2;
				System.out.println("El resultado de la multiplicacion de los numeros introducidos es: " + multi + "\n");
				
			}else if(pregunta == 4) {
				int division = numero1 / numero2;
				System.out.println("El resultado de la division de los numeros introducidos es: " + division + "\n");
			}
			
		} // Cierre de bucle While
		
	}
}