/**
 * Nombre1.java - Ejercicio 6
 * 
 * Escribe un programa simple Java, 
 * basado en Saludos.java, que pida y visualice el nombre y la edad de dos personas en dos líneas diferentes.
 * 
 * Miguel Sanchez Garcia - 25/09/2022
 */

import java.util.Scanner;

public class Nombre1{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Persona 1
		System.out.println("PERSONA 1");
		
		// Indicamos al programa que active teclado por consola para introducir el nombre.
		System.out.print("Introduzca su nombre: ");
		String person1 = keyboard.nextLine();
		
		// Realizamos lo mismo para que el usuario pueda introducir su edad.
		System.out.print("Introduzca su edad: ");
		String age1 = keyboard.nextLine();
		
		// Persona 2
		System.out.println("PERSONA 2");
		
		System.out.print("Introduzca su nombre: ");
		String person2 = keyboard.nextLine();
		
		System.out.print("Introduzca su edad: ");
		String age2 = keyboard.nextLine();
		
		System.out.println("\n" + "Resultados: ");
		
		// Mostramos los datos por consola.
		System.out.println("Nombre: " + person1 + " | " + "Edad: " + age1);
		System.out.println("Nombre: " + person2 + " | " + "Edad: " + age2);
		
		keyboard.close();
	}
}