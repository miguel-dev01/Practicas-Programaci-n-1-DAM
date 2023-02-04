/**
 * Ejercicio 22
 * 
 * MIGUEL SANCHEZ GARCIA - 23/10/2022
 */

 	
/*

    Escribe un programa simple que escriba todos los números primos comprendidos en un intervalo.
    Hay que tener en cuenta que:

       Un número es primo si sólamente es divisible por sí mismo y por la unidad.
       El cero no es primo.
       El uno es primo.
       El operador módulo proporciona el resto de la división entera; si un número es primo, 
       sólo dará cero con él mismo y con el uno.


*/

import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Indique intervalo o valor para sacar numeros primos: ");
		numero = keyboard.nextInt();
		
		 if(numero == 0) {
	        System.out.println("\n0 no es un numero primo."); return;
	     }else if(numero < 0) {
	    	System.out.println("\nNo esta permitido introducir numeros enteros NEGATIVOS. Vuelva a intentarlo."); return;
	     }

		
		System.out.println("Numeros primos del 1 al " + numero + ": " + "\n");
		System.out.println("1");
			for(int i = 1; i <= numero; i++){
        	
        	int contador = 0;
        	
        		for(int j = 1; j <= i; j++){
                
            		if(i % j == 0) {
            			// Cada vez que la vuelta i divido por la vuelta j se divida entre 1 y por el mismo y de resto 0 al contador se le sumaran o incrementaran 
            			// 2, y luego en el for de i, hacemos un if en el que si contador es igual a 2, se imprimira el numero de la vuelta del bucle i en el momento que corresponda
            			contador++;
            		}
            	} // Cierre FOR (j)
            	
            if(contador == 2) {
            	System.out.println(i);
            }
        } // Cierre FOR (i)
        
        
	} // Cierre de MAIN
}