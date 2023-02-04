/**
 * MayorDeDos.java - Ejercicio 8
 * 
	Escribe un programa simple Java, basado en Saludos.java, que lea un número e indique si es par o no.	
 * 
 * Miguel Sanchez Garcia - 25/09/2022
 */


import java.util.Scanner;

public class ParImpar{
	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
		
			System.out.println("Introduzca el primer numero: ");
			int dato = keyboard.nextInt();
		
			if(dato % 2 == 0) {
				System.out.println(Integer.toString(dato) + " " + "es par.");
			}else {
				System.out.println(Integer.toString(dato) + " " + "es impar.");
			}
			
			keyboard.close();
	}
}