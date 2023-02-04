/**
 * Ejercicio 03 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*
  A partir del mismo archivo Multiplo1.java: Renombra la clase como Multiplo3.
  Crea un método dentro de la clase que se llame pedirTope(). 
    
  Este método está especializado en pedir un valor por teclado y devolverlo para ser usado en main().
    
  Como el tope es ahora variable; habría que modificar la declaración correspondiente para que no sea final.
*/

import java.util.Scanner;

import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String argumentos[]) {
		int resultado = pedirTope();
		
		mostrarMultiplos2(resultado);
		
		
		
	} // Cierre metodo Main
	
	public static int pedirTope() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce valor tope: ");
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