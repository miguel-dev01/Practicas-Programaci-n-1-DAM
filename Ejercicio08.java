/**
 * Ejercicio 08 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*

 Escribe un método llamado fibonacci() que reciba un entero, compruebe que es válido y devuelva el valor 
 que le corresponde en la sucesión de Fibonacci.
 
 El método fibonacci() calcula su valor de la siguiente manera:
     Sólo debe admitir números positivos
     Si el número recibido es un 0, el termino de la sucesión vale 0; si es un 1, la sucesión vale 1;  si es un 2, la sucesión vale 1, si es un 3, la sucesión vale 2...

0, 1, 1, 2, 3, 5...

    Para los sucesivos términos, se obtienen sumando los dos términos anteriores.
    Por ejemplo, para el término 5 el valor es la suma del término para n=4 más el término para n=3.
    Prueba el método pedido desde main().
*/

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Indique termino de sucesion fibonacci: ");
	int number = keyboard.nextInt();
	
	if(number == 0) {
		System.out.println("\nEl valor en la serie de fibonacci del numero introducido es: 0"); return;
	}else if(number < 0) {
		System.out.println("\nNo se pueden introducir numeros negativos."); return;
	}
	
	int mostrar_fibonacci = fibonacci(number);
	System.out.println("\nEl valor en la serie de fibonacci del numero introducido es: " + mostrar_fibonacci);
	
	} // Cierre metodo main
	
	public static int fibonacci(int number) {
		
		int numero1 = 1;
		int numero2 = 0;
		int suma;
		
		for(int i = 0; i < number-1; i++) {
			suma = numero1 + numero2;
			numero2 = numero1;
			numero1 = suma;
	
		}
		return numero1;
		
	} // Cierre metodo fibonacci
}