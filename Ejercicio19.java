/**
 * Ejercicio 19
 * 
 * MIGUEL SANCHEZ GARCIA - 23/10/2022
 */

 	
/*
    Escribe un programa simple que pida tres valores reales a, b, c 
    Calcule las soluciones reales x1 y x2 de una ecuación de segundo grado de la forma ax2 + bx + c = 0.
    Las soluciones de la ecuación vienen dadas, de forma general, por:

	x1 = -b / 2a + sqrt(b2 - 4ac) / 2a
	
	x2 = -b / 2a - sqrt(b2 - 4ac) / 2a
	
	    Para algunos valores de a, b, y c se producirá un error debido a que el discriminante:  b2 - 4ac  toma valor negativo, lo que indica que no hay raíces reales sino complejas.
	    Se debe tener en cuenta que:
	
	        Si a = 0 y b = 0 la ecuación es degenerada.
	        Si a = 0 y b ≠ 0 existe una raíz única con valor –c / b.
	        En los demás casos, siendo el discriminante d =  b2 - 4ac
	            Si d >= 0  hay dos raíces reales x1 y x2
	
	x1 = x + y
	
	x2 = x - y
	
	siendo:
	
	x = -b / 2a
	
	y = sqrt(b2 - 4ac) / 2a
	
	            Si d < 0 hay dos raíces complejas x1 y x2
	
	x1 = x + yi
	
	x2 = x - yi
	
	siendo:
	
	x = -b / 2a
	
	y = sqrt(b2 - 4ac) / 2a
	
	i es la unidad imaginaria sqrt(-1)


*/
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double a, b, c, x1, x2;

		System.out.print("dame valor de A: ");
		a = keyboard.nextDouble();

		System.out.print("dame valor de B: ");
		b = keyboard.nextDouble();
		

		System.out.print("dame valor de C: ");
		c = keyboard.nextDouble();
		
		
		
		if(a == 0) {
			System.out.println("\n0 no es valido en valor de A. Vuelva a intentarlo"); return;
		}
		
		x1 = (- (b) - Math.sqrt(Math.pow(b, 2) -4 * a * c ))/ 2 * a;

		System.out.println("El valor de la ecuacion de segundo grado para x1 es: " + x1);

		x2 = (- (b) - Math.sqrt(Math.pow(b, 2) -4 * a * c))/ 2 * a;
		
		System.out.println("El valor de la ecuacion de segundo grado para x2 es: " + x2);

	}
}