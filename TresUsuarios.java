/**
 * Miguel Sanchez Garcia - 25/09/2022
 * 
 * 
 * TresUsuarios
 * 
  Escribe un programa simple Java 
  que incorpore las sentencias necesarias para leer los datos de tres personas 
  (nombre, apellidos, nif y dirección postal) desde el teclado, los guarde y los muestre, en pantalla; 
  se deben mostrar en orden inverso, primero los datos de la última persona.
 **/
import java.util.Scanner;


public class TresUsuarios {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		// Primer Usuario
		String nombre1, apellidos1, nif1, direccion1;
		
		System.out.println("PRIMERA PERSONA");
		
		System.out.print("Introduzca su nombre: ");
		nombre1 = teclado.nextLine();
		
		System.out.print("Introduzca sus apellidos: ");
		apellidos1 = teclado.nextLine();
		
		System.out.print("Introduzca su NIF: ");
		nif1 = teclado.nextLine();
		
		System.out.print("Introduzca su direccion: ");
		direccion1 = teclado.nextLine();
		
		
		// Segundo Usuario
		
		String nombre2, apellidos2, nif2, direccion2;
		
		System.out.println("SEGUNDA PERSONA");
		
		System.out.print("Introduzca su nombre: ");
		nombre2 = teclado.nextLine();
		
		System.out.print("Introduzca sus apellidos: ");
		apellidos2 = teclado.nextLine();
		
		System.out.print("Introduzca su NIF: ");
		nif2 = teclado.nextLine();
		
		System.out.print("Introduzca su direccion: ");
		direccion2 = teclado.nextLine();
		
		
		// Tercer Usuario
		String nombre3, apellidos3, nif3, direccion3;
		
		System.out.println("TERCERA PERSONA");
		
		System.out.print("Introduzca su nombre: ");
		nombre3 = teclado.nextLine();
		
		System.out.print("Introduzca sus apellidos: ");
		apellidos3 = teclado.nextLine();
		
		System.out.print("Introduzca su NIF: ");
		nif3 = teclado.nextLine();
		
		System.out.print("Introduzca su direccion: ");
		direccion3 = teclado.nextLine();
		
		
		System.out.println("-------------RESULTADOS-------------");
		
		// Segun el ejercicio debemos mostrar los datos de la ultima persona. Por tanto mostraremos dichos datos por consola.
		System.out.println("\n" + "Datos de la Tercera Persona");
		System.out.println("Nombre: " + nombre3 + "\n" + "Apellidos: " + apellidos3 + "\n" + "NIF: " + nif3 + "\n" + "Direccion: " + direccion3);
		
		
		
		System.out.println("\n" + "Datos de la Segunda Persona");
		System.out.println("Nombre: " + nombre2 + "\n" + "Apellidos: " + apellidos2 + "\n" + "NIF: " + nif2 + "\n" + "Direccion: " + direccion2);
		
		
		
		System.out.println("\n" + "Datos de la Primera Persona");
		System.out.println("Nombre: " + nombre1 + "\n" + "Apellidos: " + apellidos1 + "\n" + "NIF: " + nif1 + "\n" + "Direccion: " + direccion1);
		
		System.out.print("FIN DEL PROGRAMA");
		
		teclado.close();
	}	
}