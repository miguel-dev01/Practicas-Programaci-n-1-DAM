/**
 * Ejercicio 21
 * 
 * MIGUEL SANCHEZ GARCIA - 23/10/2022
 */

 	
/*

Escribe un programa simple que:

     Lea tres números.
     
     Comprueba que los números son correctos tomados esos números como medidas de los lados de un triángulo; 
     sino muestra un mensaje de error. (La suma de dos cualquiera de los lados debe ser mayor que el tercero). 
     
     Indique el tipo de triángulo que formarían (isósceles, equilátero, escaleno).
     
     Pregunte si se quiere volver a repetir tecleando S o N para hacerlo. Si no se teclea S o N debe insistir.

*/

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			String pregunta;
			System.out.print("Introduce primer numero: ");
			double num1 = keyboard.nextDouble();
			
			
			System.out.print("Introduce segundo numero: ");
			double num2 = keyboard.nextDouble();
			
			
			System.out.print("Introduce tercer numero: ");
			double num3 = keyboard.nextDouble();
			
			
			if(num1 == num2 && num1 == num3 && num2 == num3) {
				System.out.println("\nTriangulo Equilatero");
				
			}else if(num1 == num2 || num2 == num3) {
				System.out.println("\nTriangulo Isosceles");
				
			}else if(num1 != num2 && num1 != num3 && num2 != num3) {
				System.out.println("\nTriangulo Escaleno");
			}
			
			System.out.println();
			
			System.out.print("¿Quieres continuar? \nIndique con S para seguir o N para terminar: ");
			keyboard.nextLine();
			pregunta = keyboard.nextLine();
			
			if(pregunta.equalsIgnoreCase("S")) {
				System.out.println();
				continue;
				
			}else if(pregunta.equalsIgnoreCase("N")) {
				System.out.println("\nFin del programa.");
				break;
				
			}else if(!pregunta.equalsIgnoreCase("S") || !pregunta.equalsIgnoreCase("N")) {
				System.out.print("No has indicado ni N ni S. Indica que quieres hacer: ");
				pregunta = keyboard.nextLine();
				
				if(pregunta.equalsIgnoreCase("S")) {
					System.out.println();
					continue;
					
				}else if(pregunta.equalsIgnoreCase("N")) {
					System.out.println("\nFin del programa.");
					break;
					
				}else if(!pregunta.equalsIgnoreCase("S") || !pregunta.equalsIgnoreCase("N")) {
					System.out.print("No has vuelto a indicar nada. Vuelva a ejecutar el programa.");
					break;
					
				}
			}

		} // Cierre del bucle While

	}
}