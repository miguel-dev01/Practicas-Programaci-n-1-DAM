/**
 * Ejercicio 10 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*
  Escribe un método que se llame rombo() que reciba un número entero como parámetro y muestre por pantalla  
  un rombo de asteriscos.
  Por ejemplo, si como argumento se le proporciona el valor 5, el resultado sería:

                      *

                     ***

                    *****

                     ***

                      *

   Hay que tener en cuenta que el número de filas -para un rombo- debe ser impar por cuestiones de simetría.
   Prueba el método pedido desde main().
*/

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);

		while(true) {
			System.out.print("Introduzca un valor para sacar rombo: ");
			int number = keyboard.nextInt();
			
			if(number <= 0) {
				System.out.println("\nNo se pueden introducir numeros negativos o 0."); break;
			}
			
			if(number % 2 == 0) {
				System.out.println("\nNo se admiten numeros pares. Solo numeros impares."); 
				System.out.println("Intentelo de nuevo a continuacion.\n"); 
				continue;
			}
		
			rombo(number);
			break;
		}
	
	keyboard.close();
	} // Cierre metodo main
	
	public static void rombo(int number) {
		
		// Bucle para imprimir las lineas de asteriscos restantes de la parte superior + linea del medio
		int asterisco = 1;
		
		for (int i = 1; i <= number/2 + 1; i++) {

			for (int x = 1; x <= number - i; x++) {
				System.out.print(" ");

			}

			for (int j = 1; j <= asterisco; j++) {
				System.out.print("*");

			}

			asterisco += 2;
			System.out.println();
			
			} // Cierre primer bucle i
			
			// Bucle para imprimir las lineas de asteriscos restantes de la parte inferior
			int espacio = 1;
			
			for(int i = 1; i <= number / 2 ; i++) {
				
				for (int j = 1; j <= number / 2 + i; j++) {
					System.out.print(" ");

				}
				
				for (int x = 1; x <= (number - espacio) - 1; x++) {
					System.out.print("*");

				}
				
				espacio += 2;
				System.out.println();
				
			} // Cierre segundo bucle 
	
			

		
	} // Cierre metodo rombo	
}