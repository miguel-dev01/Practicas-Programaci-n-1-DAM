/**
 * Saludos.java
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * Miguel Sanchez Garcia - 22/09/2022
 */

import java.util.Scanner;

public class Saludos{
	public static void main(String[] args) {
		/*
		   teclado es un canal de entrada por teclado a través de un Scanner.
		   Necesita importar el paquete java.util
		*/
		Scanner teclado = new Scanner(System.in);

		int numOrden;			// Variable numérica.
		//String nombre = "";		// Variable de texto. 

		// Configura y muestra mensajes de bienvenida.
		numOrden = 1 ;
		System.out.println("Hola,");
		System.out.print("Soy un modesto ");
		System.out.print("programa de ordenador...\n");
		System.out.println("Bienvenido al Curso.\t" + "Este es el saludo nº " + numOrden);
		numOrden++;
		System.out.println("Bienvenido a Java.\t" + "Este es el saludo nº " + numOrden);
		System.out.println("\nFin programa...");
		
		teclado.close();
	}
}

/*
EJERCICIO 2
Abre el archivo; estudia su estructura.
Estudia e intenta anticipar cuál será el comportamiento del programa cuando se ejecute.
Ejecuta el programa.
Documenta el programa con comentarios aclaratorios personales.


	En terminos generales lo que hara este programa es mostrar una serie de cadena de texto
	concatenadas junto con una variable numerica (int) que se autoincrementa cada vez que aparece
	instanciada dentro del "System.out.print" 
	
	Aunque se ha importado el modulo para poder recoger datos por consola mediante teclado, no
	ha sido definida ninguna variable para que se ejecute la escritura de teclado por consola.
	
	Tambien ha sido definida una variable tipo String llamada nombre pero en ningun momento es
	instanciada en el programa, aunque de todas formas, dicha cadena de texto esta vacia
	
	Se hace declarar una variable de tipo entero o "int", y despues le asigna el valor 1. 
	Ahora llega una serie de muestras por la consola, junto con printLN en algunos de estos separados
	con "\t" dentro de estos. y los concatenamos con otra cadena de texto. 
	
	En medio de estas sentencias para mostrar por consola llamamos a la variable num0rden y le
	decimos que sea igual a esta mas la anterior, por lo que el numero que tenia anteriormente
	se le sumara uno, mas el que ya tenia.

*/