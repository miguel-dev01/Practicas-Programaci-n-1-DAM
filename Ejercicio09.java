/**
 * Ejercicio 09 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*

  Escribe un método que se llame triangulo() que reciba un número entero como parámetro y 
  muestre por pantalla una pirámide de asteriscos.
  Por ejemplo, si se proporciona el valor 6, el resultado sería:
  
                      *

                     ***

                    *****

                   *******

                  *********

                 ***********

    Prueba el método pedido desde main().
*/

import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Introduzca un numero para dibujar triangulo: ");
	int TOPE_triangulo = teclado.nextInt();
	
	if(TOPE_triangulo <= 0) {
		System.out.println("\nNo se pueden introducir numeros negativos o 0."); return;
	}
	
	// Llamo a la funcion Triangulo
	Triangulo(TOPE_triangulo);
	
	teclado.close();
	} // Cierre de clase Main
	
	public static void Triangulo(int number) {
		
		for(int i = 1; i <= number; i++) {
			
				for(int j = 1; j <= number - i; j++){
					System.out.print(" ");
				}
				
				for(int x = 1; x <= (i * 2) - 1; x++) {
					System.out.print("*");
				}
			
			System.out.println();
			
		} // Cierre primer bucle for
		
	} // Cierre Clase Triangulo
}