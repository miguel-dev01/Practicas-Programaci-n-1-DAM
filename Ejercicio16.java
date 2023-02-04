/**
 * Ejercicio 16 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 16/11/2022
 */


/*
Escribe un metodo llamado  palabrasCuatroLetras() 
que recibe una cadena de texto como parametro y devuelve la lista de palabras con al menos cuatro letras.

Se supondra que una palabra esta separada de otra por uno o mas espacios en blanco, 
caracteres de tabulaciones o caracteres de nueva linea.

Prueba exhaustivamente el metodo pedido desde main().
*/
//import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);
	
	String palabra;
	
	System.out.print("Introduzca palabras con al menos cuatro letras. ");
	System.out.print("\nLas palabras introducidas con un numero inferior a 4 letras no seran mostrados.");
	System.out.print("\nIndique palabras a continuacion: ");
	palabra = keyboard.nextLine();
	
	String mostrarPalabrasCuatroLetras = palabrasCuatroLetras(palabra);
	System.out.println("\n" + mostrarPalabrasCuatroLetras);
	
	keyboard.close();
	} // Cierre metodo main
	

	public static String palabrasCuatroLetras(String palabra) {
		
		String result = "";
		String[] array = palabra.split(" ");
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() >= 4) {
				result += array[i] + " ";
			}
			
		}
		
		return result;

		
	} // Cierre palabrasCuatroLetras()

}