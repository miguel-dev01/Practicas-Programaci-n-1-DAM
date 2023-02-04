/**
 * Ejercicio 05 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*
Escribe un programa para calcular los salarios semanales de empleados 
a los que se les paga 15 euros por hora hasta el limite de las 35 horas. 
Cada hora por encima de 35 se considerará extra y se paga a 22 €.

El programa pide las horas del trabajador, realiza el calculo, 
muestra el resultado y vuelve a pedir otro si se quiere seguir. 
El salario que se le debe pagar se calcula utilizando un método especializado llamado calcularSalario().
El método  calcularSalario() recibe las horas como parámetro y devuelve el sueldo que corresponde.
*/

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String question = "a";
		int number_hours = 0;
		
		while (true) {
			
			// Realizamos la pregunta de un numero, la cual sera el numero total de horas, y que sera parametro del metodo calcularSalario
			System.out.println("---------------------------------------");
			System.out.print("Indique el numero de horas trabajadas: ");
			number_hours = keyboard.nextInt();
			keyboard.nextLine();
			
			// Realizamos una condicion restrictiva para que no se introduzcan ni numeros negativos ni el 0.
			if(number_hours <= 0) {
				System.out.println("\nNo se pueden introducir numeros negativos ni el 0."); 
				break;
			}
			
			// Guardamos el metodo calcularSalario con el parametro igual a la pregunta y lo mostramos
			String mostrar_metodo = calcularSalario(number_hours);
			System.out.println(mostrar_metodo);
			
			// Preguntamos al usuario si quiere continuar introduciendo numeros
			System.out.print("\nDesea continuar(S/N): ");
			question = keyboard.nextLine();
			
			// Creamos condiciones restrictivas para que solo se puedan introducir S o N. Y en caso de estas, se continuara o se terminara el programa en cada caso...
			if (question.equalsIgnoreCase("s")) {
				continue;
			} else if (question.equalsIgnoreCase("n")) {
				System.out.println("\nPrograma finalizado.");
				break;
			}else {
				System.out.println("\nNo se puede introducir otra letra diferente de S o N.");
				break;
			}

		} // Cierre bucle While
		
	} // Cierre de clase Main
	
	public static String calcularSalario(int value) {
		Scanner keyboard = new Scanner(System.in);
		
		String result = "";
		float hora_base = 15;
		float hora_extra = 22;
		//String question = "a";
		
		if (value <= 35) {
			hora_base = hora_base * value;

			result += "\nHas trabajado " + value + " horas de tu jornada. No ha habido horas extra.";
			result += "\nSueldo a recibir al final de la semana: " + hora_base + " euros.";

		}

		if (value > 35) {
			hora_base = hora_base * 35;

			int resta = value - 35;

			hora_extra = resta * hora_extra + hora_base;

			result += "\nHas realizado " + resta + " horas extra. Mas las 35 horas de la jornada.";
			result += "\nSueldo a recibir al final de la semana: " + hora_extra + " euros.";

		}
		
		return result;
	} // Cierre metodo calcularSalario
}