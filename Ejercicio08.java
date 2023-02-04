/**
 * Ejercicio 08 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 24/12/2022
 */

/*
 * Escribe un método que se llame yaOrdenadoInt() que recibe un vector de
 * enteros. Devuelve true si está ordenado. Por ejemplo: {3, 2, 3, 4, 7, 2, 4}
 * devolvería false. Prueba el método pedido desde main(). Hay que recorrer el
 * vector secuencialmente comprobando por parejas y si se encuentra un par de
 * elementos desordenados hay que terminar sin llegar al final del recorrido.
 */

public class Ejercicio08 {
	public static void main(String args[]) {
	
		int[] vector = {3, 2, 3, 4, 7, 2, 4};
		
		
		System.out.println(yaOrdenadoInt(vector));
		if(yaOrdenadoInt(vector) == true) {
			System.out.println("El array esta ordenado.");
		} else {
			System.out.println("El array esta desordenado.");
		}
		
		
	} // Cierre MAIN
	
	public static boolean yaOrdenadoInt(int[] vector) {
		
		boolean result = true;
		
		for(int i = 0; i < vector.length - 1; i++) {
			
			if (vector[i] >= vector[i + 1]) {
				result = false;
				break;
			}
			
		}
		
		return result;
	} // Cierre metodo yaOrdenadoInt
	
}