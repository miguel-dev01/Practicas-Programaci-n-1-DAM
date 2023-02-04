/**
 * Ejercicio 13 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*
  Escribe un programa que calcule las soluciones de una ecuación de 
  segundo grado de la forma ax2 + bx + c = 0.
*/
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String args[]) {
	Scanner teclado = new Scanner(System.in);
	
	double a, b, c;
	
	
	System.out.print("Indique valor de A: ");
	a = teclado.nextDouble();

	System.out.print("Indique valor de B: ");
	b = teclado.nextDouble();
	
	System.out.print("Indique valor de C: ");
	c = teclado.nextDouble();
	
	if(a == 0) {
		System.out.println("\n0 no es valido en valor de A. Vuelva a intentarlo"); return;
	}
	
	String mostrar_discriminante = evaluarDiscriminante(a, b, c);
	System.out.println(mostrar_discriminante);
	
	teclado.close();
	} // Cierre de clase Main
	
	public static String evaluarDiscriminante(double a, double b, double c) {
		
		String result;
		double x1, x2;
		
		x1 = (- (b) - Math.sqrt(Math.pow(b, 2) -4 * a * c ))/ 2 * a;

		result = "\nEl valor de la ecuacion de segundo grado para x1 es: " + x1;

		x2 = (- (b) - Math.sqrt(Math.pow(b, 2) -4 * a * c))/ 2 * a;
		
		result = "\nEl valor de la ecuacion de segundo grado para x2 es: " + x2;
		
		return result;
	
	} // Cierre metodo evaluarDiscriminante()
}