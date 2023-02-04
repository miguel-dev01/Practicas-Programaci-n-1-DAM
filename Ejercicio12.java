/**
 * Ejercicio 12 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*
  Escribe un método que se llame trianguloTexto() 
  que reciba un número entero como parámetro y devuelva una cadena de caracteres 
  con el texto formateado de una pirámide de asteriscos.
  
  Por ejemplo si se introduce el 6, la cadena devuelta, al imprimirla, daría:

                      *

                     ***

                    *****

                   *******

                  *********

                 ***********

  Prueba el método pedido desde main().
*/

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Introduzca un numero para dibujar triangulo: ");
	int TOPE_triangulo = teclado.nextInt();
	
	if(TOPE_triangulo <= 0) {
		System.out.println("\nNo se pueden introducir numeros negativos o 0."); return;
	}
	
	String mostrar_triangulo = trianguloTexto(TOPE_triangulo);
	System.out.println(mostrar_triangulo);
	
	teclado.close();
	} // Cierre de clase Main
	
	public static String trianguloTexto(int number) {
		
		String result = "";
		
		for(int i = 1; i <= number; i++) {
			
				for(int j = 1; j <= number - i; j++){
					result += " ";
				}
				
				for(int x = 1; x <= (i * 2) - 1; x++) {
					result += "*";
				}
			
			result += "\n";
			
		} // Cierre primer bucle for
		
		return result;
		
	} // Cierre Clase Triangulo
}