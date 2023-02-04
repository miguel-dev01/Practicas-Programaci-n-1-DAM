/**
 * Ejercicio 18
 * 
 * MIGUEL SANCHEZ GARCIA - 18/10/2022
 */

 	
/*

  Escribe un programa simple que pida un número entero positivo por teclado. *******HACER IF PARA QUE NO SE META NUMERO NEGATIVO
  Calcule el factorial del número y muestre el resultado.
  El programa sólo debe admitir números positivos y el cero. El factorial de 0 es 1 por convenio.

*/

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Escribe un numero: ");
		int numero = keyboard.nextInt();
		int i;
		int result = 1;
		
		
		if(numero < 0) {
			
			System.out.println("Has introducido un numero entero negativo. Debes introducir un numero entero POSITIVO");
			
		}else {
			for(i = 1; i <= numero; i++) {
				result *= i;
			}
			
			// Mostramos el resultado
			System.out.println("El factorial del numero "+ numero + " es " + result);
		}
		
		
	}
}