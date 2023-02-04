/**
 * Ejercicio 16
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 18/10/2022
 */

 	
/*

    Escribe un programa simple que, en un bucle continuo, pida un número con varios decimales, los que quiera el usuario.
    Después pregunta a cuantos decimales se quiere redondear.
    Seguidamente muestra el resultado redondeado, teniendo en cuenta que no hay que cortar, hay que redondear.
    Debe haber algún medio de terminar el bucle continuo de entrada de datos.
    Puede resolverse utilizando el método Math.rint(…) que redondea al entero mayor o 
    igual que corresponde al número double recibido como argumento.
    Un ejemplo sería:

	Número leído: 23.23456

	Decimales: 3

	Valor mostrado: 23.235  

	Calculado con algo parecido a: Math.rint(23.23456*1000)/1000

	Observa que 1000 es 103. Se pide que se calcule con un bucle.

    Documenta el programa con comentarios aclaratorios adicionales si se considera necesario.

*/

// Libreria con sentencias y metodos de calculos matematicos en Java.
import java.lang.Math;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// 23,23456 x 10elevado3 = 23456,56 / 10elevado3 = 23,235
		
		
		
		// Pregunta numero con decimales
		System.out.print("Introduce numeros con decimales. Puedes introducir tantos decimales como quieras: ");
		double decimal = keyboard.nextDouble();
		keyboard.nextLine();
		
		
		// A cuantos decimales se quiere redondear
		System.out.print("A cuantos decimales quieres redondear: ");
		double redondeado = keyboard.nextDouble();
		
		
		// Realizamos potencia
		double potencia = Math.pow(10, redondeado);
	
		
		// Realizamos el redondeo
		double result = Math.rint(decimal*potencia)/potencia;
		
		
		// Mostramos el resultado redondeado
		System.out.println("\nResultado redondeado: " + result);		
		
		
		
	}
}