/**
 * Ejercicio 04 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*
  A partir de los archivos de Multiplo2.java y Multiplo3.java de los ejercicios anteriores:
  Crea una sola clase llamada Multiplo4.
  En main(), escribe la llamada:

		mostrarMultiplos2(pedirTope());

   Hay que hacer que todo funcione correctamente.
*/

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
	
	mostrarMultiplos2(pedirTope());

	
	teclado.close();
	} // Cierre de clase Main
	
	public static int pedirTope() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un numero para saber la cantidad de multiplos por X numero: ");
		int valor = teclado.nextInt();
		
		return valor;
	} // Cierre metodo pedirTope
	
	public static void mostrarMultiplos2(int TOPE) {
		
		int mult  ;							// Almacena el múltiplo calculado
		int cont  ;							// Contador utilizado en el cálculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE)					// Bucle de cálculo y visualización
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
		
		
	} // Cierre metodo Mostrar Multiplo2
}