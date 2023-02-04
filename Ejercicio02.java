/**
 * Ejercicio 02 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*
  A partir del mismo archivo Multiplo1.java: Renombra la clase como Multiplo2.
  
  Crea un método dentro de la clase que se llame mostrarMultiplos2() 
  especializado en mostrar los múltiplos de 2 hasta el TOPE. 
  
  Recibe un valor tope como parámetro de entrada.
  
  Llama al método creado desde main().
  
  Deben seguirse los principios y estilo del código limpio.
*/

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
	
	// Llamamos al metodo en cuestion y le indicamos un parametro que sera el numero TOPE para saber cuantos numeros son multiplos de 2.
	mostrarMultiplos2(10);
	
	teclado.close();
	} // Cierre de clase Main
	
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