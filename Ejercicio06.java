/**
 * Ejercicio 06 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*
Escribe un programa que muestre las tablas de multiplicar. 
Para la visualización utiliza un método llamado calcularMostrarTabla().

El método calcularMostrarTabla() recibe el número del que calculará la tabla y 

la visualiza por pantalla con el formato adecuado.

La tabla mostrará productos hasta el 15. 
*/

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Indique un numero para conocer su tabla de multiplicar: ");
	int number = keyboard.nextInt();
	
	if(number <= 0) {
		System.out.println("\nNo se pueden introducir numeros negativos ni el 0."); return;
	}
	
	calcularMostrarTabla(number);
	
	
	} // Cierre metodo main
	
	public static void calcularMostrarTabla(int table) {
		
		System.out.println("\nTabla de multiplicar del " + table + "\n");
		
		for(int i = 1; i <= 15; i++) {
			System.out.println(table + " * " + i + " = " + table*i);
		}
		
	} // Cierre metodo calcularMostrarTabla
}