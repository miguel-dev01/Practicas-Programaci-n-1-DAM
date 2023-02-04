/**
 * Ejercicio 11
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 06/10/2022
 */

 	
/*

    Escribe un programa simple que calcule el interés producido y el capital total acumulado de un capital inicial -
    invertido a un tipo de interés anual.
    Debe pedir el capital principal inicial,  el tipo de interés anual y el número de años.
    Muestra el valor de los intereses y el capital final acumulado.
    Se puede utilizar la fórmula:

Cf = Ci * (1 + r)n

    Cf es el capital final.
    Ci es el capital inicial.
    r es el interés anual en tanto por uno.
    n es el número de años.
    En Java para calcular la potencia de un número se debe utilizar la clase de librería matemática Math, disponible en la API del lenguaje. Ejemplo:

Math.pow(num, 2);   // calcula num2

    Documenta el programa con comentarios aclaratorios adicionales si se considera necesario.

*/

import java.util.Scanner;

// Importamos la libreria matematica Math
import java.lang.Math;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// Capital inicial
		System.out.print("Introduzca el capital inicial: ");
		double cap_inicial = keyboard.nextDouble();
		
		
		// Tipo interes anual
		System.out.print("Introduzca el tipo de interes anual: ");
		double interes_anual = keyboard.nextDouble();
		
		
		// Numero de años
		System.out.print("Introduzca el numero de años: ");
		double num_anos = keyboard.nextDouble();
		
		
		double potencia = Math.pow(1 + interes_anual / 100, num_anos);
		
		// Calculo
		double cap_final = cap_inicial * potencia;
		

		
		System.out.println("El capital final es: " + cap_final);
		
	}
}