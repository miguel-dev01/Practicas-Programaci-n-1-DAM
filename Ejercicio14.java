/**
 * Ejercicio 14 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 13/11/2022
 */


/*
 Escribe un método que se llame rombo2() que reciba un número entero como 
 parámetro y devuelva una cadena de caracteres con el texto formateado de un rombo de asteríscos.
 
 Prueba el método pedido desde main().
*/
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);

		while(true) {
			System.out.print("Introduzca un valor para devolver rombo: ");
			int number = teclado.nextInt();
			
			if(number <= 0) {
				System.out.println("\nNo se pueden introducir numeros negativos o 0."); break;
			}
			
			if(number % 2 == 0) {
				System.out.println("\nNo se admiten numeros pares. Solo numeros impares."); 
				System.out.println("Intentelo de nuevo a continuacion.\n"); 
				continue;
			}
		
			String mostrarRombo2 = rombo2(number);
			System.out.print(mostrarRombo2);
			break;
		}
	
	
	teclado.close();
	} // Cierre de clase Main
	
	public static String rombo2(int numero) {
		String result = "";
		
		// Bucle para imprimir las lineas de asteriscos restantes de la parte superior + linea del medio
		int asterisco = 1;
		
		for (int i = 1; i <= numero/2 + 1; i++) {

			for (int x = 1; x <= numero - i; x++) {
				result += " ";

			}

			for (int j = 1; j <= asterisco; j++) {
				result += "*";

			}

			asterisco += 2;
			result += "\n";
			
			} // Cierre primer bucle i
			
			// Bucle para imprimir las lineas de asteriscos restantes de la parte inferior
			int espacio = 1;
			
			for(int i = 1; i <= numero / 2 ; i++) {
				
				for (int j = 1; j <= numero / 2 + i; j++) {
					result += " ";

				}
				
				for (int x = 1; x <= (numero - espacio) - 1; x++) {
					result += "*";

				}
				
				espacio += 2;
				result += "\n";
				
			} // Cierre segundo bucle 
		
		
		
		return result;
	}
}