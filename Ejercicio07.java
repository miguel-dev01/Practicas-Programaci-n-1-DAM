/**
 * Ejercicio 07 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 24/12/2022
 */

/*
 * Escribe un método que se llame buscarInt() que recibe un vector de enteros y
 * un valor a buscar dentro del vector. Devuelve el índice de la primera
 * ocurrencia dentro del vector proporcionado. Por ejemplo: {3, 2, 3, 4, 7, 2, 4} 
 * si se busca 4 devolvería 3. Prueba el método pedido desde main(). Hay que
 * recorrer el vector secuencialmente y si se encuentra hay que terminar sin
 * llegar al final del recorrido.
 */
import java.util.Arrays;

public class Ejercicio07 {
	public static void main(String args[]) {
	
		int[] vector = {3, 2, 3, 4, 7, 2, 4, 10, 11, 10};
		int valor = 10;
		// Este metodo busca un valor dentro del array, si no lo encuentra devuelve un numero negativo.
		int si_existe = Arrays.binarySearch(vector, valor);
		
		if(si_existe < 0) {
			System.err.println("El valor introducido no es valido o no se encuentra en el array");
			return;
		} 
		
		System.out.println("Posicion en el array del primer " + valor + " encontrado es: "+ buscarInt(vector, valor));
		
	} // Cierre MAIN
	
	public static int buscarInt(int[] vector, int valor) {
		
		int position = 0;
		
		for(int i = 0; i < vector.length; i++) {
			
			// Este if devuelve la posicion del primer valor encontrado en el array
			if(vector[i] == valor) {
				position = i;
				break;
			}
		}
		
		return position;
	} // Cierre buscarInt
}