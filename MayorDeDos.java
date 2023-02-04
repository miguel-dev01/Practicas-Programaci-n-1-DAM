/**
 * MayorDeDos.java - Ejercicio 7
 * 
	Escribe un programa simple Java, 
	basado en Saludos.java, que lea dos números y que escriba el mayor de los dos.	
 * 
 * Miguel Sanchez Garcia - 25/09/2022
 */

import java.util.Scanner;

public class MayorDeDos{
	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
		
			// Pedimos el primer numero
			System.out.print("Introduzca el primer numero: ");
			int dato1 = keyboard.nextInt();
		
			// Pedimos el segundo numero
			System.out.print("Introduzca el segundo numero: ");
			int dato2 = keyboard.nextInt();
		
			// Creamos las condiciones para indicar que numero es mayor o menor.
			if(dato1 > dato2) {
				System.out.print(Integer.toString(dato1) + " " + "Es mayor que " + " " + Integer.toString(dato2));
			}else if (dato1 < dato2){
				System.out.print(Integer.toString(dato1) + " " + "Es menor que " + " " + Integer.toString(dato2));
			}else {
				System.out.print("Los numeros introducidos son iguales");
			}
			
			keyboard.close();
	}
}