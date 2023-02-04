/**
 * Ejercicio 14
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 15/10/2022
 */

 	
/*
Escribe un programa simple que lea tantos números enteros positivos como se quiera mientras no sea un cero, que terminaría. 
    Cuando termina la entrada, se muestra, como resultado, la suma de todos los números leídos y su media aritmética.
    No hay que guardar los valores individualmente introducidos.
*/

// Libreria de Array(datos almacenados de forma contigua)para guardar en una lista los numeros introducidos, y asi saber la longitud 
// y dicha longitud para dividir entre la suma de todos los numeros y asi obtener la media aritmetica.
import java.util.ArrayList;

// Libreria para poder escribir por consola
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Declaramos el array con su identificador
		ArrayList longitud = new ArrayList();
		
		// Declaramos tipo de variables y sus identificadores
		int numero;
		int suma = 0;
		int promedio;
		boolean guardar;
		
		// Bucle que ejecute lo que se encuentre dentro de 'do'  mientras que en el while el numero introducido sea diferente a 0.
		do {
			
			System.out.print("\nIntroduce numero para calcular la suma y media aritmetica. \nEn caso de introducir 0, el programa termina junto con el resultado : ");
			numero = keyboard.nextInt();
			keyboard.nextLine();

			
			if(numero > 0) {
				// Operacion aritmetica de la suma de los numeros introducidos. Si se cumple la condicion de IF.
				suma += numero;
				
				// Guardamos los numeros en Array para extraer posteriormente su longitud. Y se ejecutara cuando la condicion de IF se cumpla.
				guardar = longitud.add(numero);
			}
			
			
			// Operaciones para calcular el promedio usando la longitud de los numeros introducidos en el array.
			promedio = suma/longitud.size();
			
		}while(numero != 0);
		
		
		// Resultado de la suma por consola.
		System.out.println("\nEl resultado de la suma de numeros que has introducido es: " + suma);
		
		// Mostrar promedio.
		System.out.println("La media de todos los numeros es: " + promedio);
		
		System.out.println("FIN");
		
		/*
		 Nota: Dado que el ejercicio indica "la suma de todos los números leídos y su media aritmética", el '0' 
		 	que se introduce para finalizar el programa tambien se cuenta para realizar la media aritmetica.
		*/
	}
}