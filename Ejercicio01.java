/**
 * Ejercicio 01 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*

    Descarga el archivo Java llamado Multiplo1.java que debe ser incorporado a un proyecto, compilado y ejecutado. 
    Estudia su estructura y su comportamiento.
    
    Crea un método dentro de la clase principal que se llame mostrarMultiplos1() 
    que se encargue de hacer todo lo hace hace el programa.
    
    Consiste en poner todas las instrucciones, anterirmente en main(), dentro del método pedido.
    
    Llama al método creado desde main() para que el programa siga haciendo lo mismo.
    
    Deben seguirse los principios y estilo del código limpio.

*/

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String args[]) {
		// Declaración de variables
		Scanner teclado = new Scanner(System.in);
		
		// Llamamos o instanciamos al metodo de Mostrar Multiplos
		mostrarMultiplos1();
		
		teclado.close();
		
	} // Cierre de clase Main
	
	
	public static void mostrarMultiplos1() {
			
		final int TOPE = 16  ; 				// Constante, el máximo valor del múltiplo
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
		
		
	} // Cierre metodo Mostrar Multiplo
}