/**
 * Ejercicio 15 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 16/11/2022
 */


/*
Escribe un método llamado fibonacciA() utilizando programación por contrato que 
reciba un entero y devuelva el valor que le corresponde en la sucesión de Fibonacci.
El método fibonacciA() calcula su valor de la siguiente manera:

    Utiliza un assert para interrumpir el método cuando el valor recibido es negativo.
    Si el número recibido es un 1, la sucesión vale 1; si es un 2, la sucesión vale 2.
    Para los sucesivos términos, se obtienen sumando los dos términos anteriores.
    Por ejemplo, para el término 5 el valor es la suma del término para n=4 más el término para n=3.

Prueba el método pedido desde main(). Hay que tener en cuenta que en la programación por responsabilidades main() 
es la responsable de llamar a fibonacciA() con valores válidos.
*/

import java.util.Scanner;

public class Ejercicio15 {
	
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);
	
	int LIMITE_INFERIOR = 0;
	int LIMITE_SUPERIOR = 161;

    System.out.println("Numero de Fibonacci del término (N).");
    System.out.print("Introduce un numero: ");
    int numero = keyboard.nextInt();

    if (numero >= LIMITE_INFERIOR && numero <= LIMITE_SUPERIOR) {
        System.out.println(fibonacciA(numero, LIMITE_INFERIOR, LIMITE_SUPERIOR) + "\nEs el numero de Fibonacci para n = " + numero);
    }
    else {
        System.out.println("Fuera de rango, solo se admiten valores entre: " + LIMITE_INFERIOR + " y " + LIMITE_SUPERIOR);								
    }


	keyboard.close();
	} // Cierre metodo main
	
	public static long fibonacciA(int n, int LIMITE_INFERIOR, int LIMITE_SUPERIOR) {
		assert n >= LIMITE_INFERIOR : "Numero negativo";
		assert n <= LIMITE_SUPERIOR : "No calculable";

		long terminoActual = n;
		long terminoMenos1 = 1;
		long terminoMenos2 = 0;

		for (int i = 1; i < n; i++) {
			terminoActual = terminoMenos1 + terminoMenos2;
			terminoMenos2 = terminoMenos1;
			terminoMenos1 = terminoActual;
		}
		return terminoActual;
	}
	

}