/**
 * Ejercicio 17 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 16/11/2022
 */


/*
Escribe un método llamado muestraCuadrado() que muestra un cuadrado en modo texto.
Hay que tener en cuenta que:

    El método recibe un número para el tamaño del lado y un carácter para utilizarlo en el contorno del cuadrado.
    El algoritmo utilizado debe formatear todo sobre una sola cadena de texto que será devuelta.

Prueba exhaustivamente el método pedido desde main().
*/

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);
	
	char letra;
	int num;
	
	System.out.print("Introduzca la letra con la que se dibujara el contorno del teclado: ");
	letra = keyboard.next().charAt(0);
	
	System.out.print("Introduzca el numero para el tamaño del cuadrado: ");
	num = keyboard.nextInt();
	
	String mostrarFuncion = muestraCuadrado(letra, num);
	System.out.print(mostrarFuncion);
	
	keyboard.close();
	} // Cierre metodo main
	
	public static String muestraCuadrado(char letter, int number) {
		String result = "";
		
		for(int i = 1; i <= number; i++) {
			
			for(int j = 1; j <= number; j++) {
				
				if(i == 1 || i == number || j == 1 || j == number) {
					result += letter + " ";
				}else {
					result += "  ";
				}
			}
			result += "\n";
		}
		
		return result;
		
	} // Cierre metodo muestraCuadrado
}