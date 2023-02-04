/**
 * Ejercicio 17
 * 
 * MIGUEL SANCHEZ GARCIA - 18/10/2022
 */

 	
/*
 	

    Escribe un programa simple que pida un número entero y a partir de él cree en pantalla de texto un 
    cuadrado de asteriscos con ese tamaño de lado.
    Los asteriscos sólo se verán en el borde del cuadrado.
    Un ejemplo para 5 sería:

		 	*   *   *   *   *
		
		 	*               *
		
		 	*               *
		
			*               *
		
			*   *   *   *   *
*/

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

        System.out.print("Indique un numero para representar el tamaño del cuadrado con asteriscos: ");
        int numero = keyboard.nextInt();
        int i;
        int x;
        int j;
        int h;
        
        System.out.println();
        
        // Linea arriba
        for(i = 0; i < numero; i++) {
        	System.out.print("* ");
        }
        
        
        // Lineas Izquierda Derecha
        System.out.println();
        
        for(j = 1; j < numero - 1; j++) {
        	System.out.print("*");
        	
        	for(h = 0; h < numero - 3; h++) {
        		System.out.print("  ");
        	}
        	
        	System.out.println("   *");
        }


        // Linea abajo
        for(x = 0; x < numero; x++) {
        	System.out.print("* ");
        }
        
        System.out.println("\n\nPrograma finalizado.");
        
	}
}