/**
 * Ejercicio 04 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 19/12/2022
 */

/*
 * Escribe un método que se llame vectoresIntIguales() que recibe dos vectores
 * de enteros. Devuelve true si son iguales. Dos vectores son iguales si tienen
 * la misma longitud y los valores, elemento a elemento, son iguales. La segunda
 * condición se puede comprobar con un bucle.
 */

public class Ejercicio04 {
	public static void main(String args[]) {
	
		int[] vector1 = {1,2,3,4,5};
		int[] vector2 = {1,2,3,4,5};
		
		System.out.println(vectoresIntIguales(vector1, vector2));
		
	} // Cierre MAIN
	
	public static boolean vectoresIntIguales(int[] vector1, int[] vector2) {
		
		boolean result = false;
		
		if(vector1.length != vector2.length) {
			result = false;
		} else {
			for(int i = 0; i < vector1.length ; i++) {
				if(vector1[i] == vector2[i]) {
					result = true;
				}else {
					result = false;
					break;
				}
			}
		}
		
		return result;
	}
}