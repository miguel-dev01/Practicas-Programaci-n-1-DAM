/**
 * Ejercicio 18 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 16/11/2022
 */


/*
  Escribe un método llamado tipoTriangulo() que recibe tres valores como parámetros, comprueba si forman un triangulo.
  Hay que tener en cuenta que:
     Devuelve el nombre del tipo de triángulo que formarían 
     (isósceles, equilátero, escaleno) o la palabra ERROR.
     
     Para comprobar si forman un triangulo se utiliza el método esTriangulo().
     
     El método esTriangulo() comprueba si tres valores recibidos 
     como argumentos formarían un triangulo. Devuelve true o false.
     
    Prueba exhaustivamente los métodos pedidos desde main().
*/

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Introduce primer numero: ");
	double num1 = keyboard.nextDouble();
	
	
	System.out.print("Introduce segundo numero: ");
	double num2 = keyboard.nextDouble();
	
	
	System.out.print("Introduce tercer numero: ");
	double num3 = keyboard.nextDouble();
	
	String mostrarFuncionTriangulo = esTriangulo(num1, num2, num3);
	System.out.print(mostrarFuncionTriangulo);
	
	boolean mostrarValidoTriangulo = esValidoTriangulo(num1, num2, num3);
	System.out.print("\n" + mostrarValidoTriangulo);
	
	keyboard.close();
	} // Cierre metodo main
	
	public static boolean esValidoTriangulo(double num1, double num2, double num3) {
		if(num1 <= 0 || num2 <= 0 || num3 <= 0 || num3 > num1 || num3 > num2) {
			return false;
		}
		
		return true;
		
	} // Cierre metodo esValidoTriangulo
	
	public static String esTriangulo(double num1, double num2, double num3) {
		String result = "";
		
		if(num1 == num2 && num1 == num3 && num2 == num3) {
			result = "\nTriangulo Equilatero";
			
		}else if(num1 == num2 || num2 == num3) {
			result = "\nTriangulo Isosceles";
			
		}else if(num1 != num2 && num1 != num3 && num2 != num3) {
			result = "\nTriangulo Escaleno";
			
		}else {
			result = "\nERROR!";
		}
		
		return result;
	} // Cierre metodo esTriangulo()
}