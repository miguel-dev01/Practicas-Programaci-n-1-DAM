/**
	Miguel Sanchez Garcia - 25/09/2022 - Ejercicio 10
	
	Escribe un programa simple Java que lea tres números y escriba el mayor de los tres.
	
	MayorDeTres
**/
import java.util.Scanner;

public class MayorDeTres {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un primer numero: ");
		int num1 = keyboard.nextInt();
		
		System.out.print("Introduce un segundo numero: ");
		int num2 = keyboard.nextInt();
		
		System.out.print("Introduce un tercer numero: ");
		int num3 = keyboard.nextInt();
		
		System.out.println("\n" + "-------RESULTADO-------");
		
		if(num1 > num2 && num1 > num3) {
			System.out.print("El primer numero introducido es el mayor " + "--> " + num1);
		}else if(num2 > num3){
			System.out.print("El segundo numero introducido es el mayor " + "--> " + num2);
		}else if(num3 > num1 ) {
			System.out.print("El tercer numero introducido es el mayor " + "--> " + num3);
		}else {
			System.out.print("No pueden introducirse numeros iguales. Por tanto, no valido.");
		}
		
		keyboard.close();
	}
}