/**
 * Ejercicio 06 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 21/12/2022
 */

/*
 * Escribe un método que se llame contarIntConsecutivos() que recibe un vector
 * de enteros. Devuelve cuantos valores -entre sus elementos- están ordenados.
 * Si todos los elementos son diferentes devuelve 0. Por ejemplo: {3, 5, 3, 4, 5, 5, 4} devolvería 3. 
 * Prueba el método pedido desde main(). Recorriendo los
 * datos de izquierda a derecha, empezando por el segundo elemento hay que
 * comprobar si es secuencia del anterior. Se puede utilizar un contador
 * iniciado en 1 que se incrementa al comprobarse que un elemento es consecutivo
 * -en orden- con el anterior. Cada vez que se inicia nueva secuencia hay que
 * guardar el valor del contador en una variable auxiliar con el máximo
 * alcanzado.
 */

public class Ejercicio06 {
	public static void main(String args[]) {
	
		int[] vector = {3, 5, 3, 4, 5, 5, 4};
		
		// int[] vector = { 3, 5, 3, 4, 5, 5, 4, 5, 4, 8, 9, 4, 1, 3, 1, 2 };
		
		System.out.println("Total de valores ordenados: " + contarIntConsecutivos(vector));
		
	} // Cierre MAIN
	
	public static int contarIntConsecutivos(int[] vector) {
	
		int contador = 1;
		
		for (int i = 0; i < vector.length - 1; i++) {

			if (vector[i] + 1 == vector[i + 1]) {
				contador++;
			}
		}

		if (vector[vector.length - 1] - 1 == vector[vector.length - 2]) {
			contador = contador + 1;
		}
		
		return contador;
	} // Cierre contarIntConsecutivos
}