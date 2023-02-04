/**
 * Ejercicio 10 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 26/12/2022
 */

/*
 * Escribe un método que se llame buscarSecuenciaInt() que recibe dos vectores
 * de enteros, el segundo es una secuencia de valores a buscar en el primer
 * vector. Devuelve el índice donde empieza la primera ocurrencia de la
 * secuencia buscada. Por ejemplo: {4, 3, 1, 4, 2, 5, 8} y {4, 2, 5} devolvería
 * 3. Prueba el método pedido desde main(). Hay que recorrer el vector
 * secuencialmente comprobando coincidencia con el primer elemento de la
 * secuencia buscada. Después hay que comprobarla completamente con otro bucle.
 * Si hay coincidencia completa termina sin llegar al final del recorrido.
 */

public class Ejercicio10 {
	public static void main(String args[]) {
	
		int[] vector1 = {4, 3, 1, 4, 2, 5, 8};
		int[] vector2 = {4, 2, 5};
		
		System.out.println("Indice de la primera ocurrencia: " + buscarSecuenciaInt(vector1, vector2));
		
	} // Cierre MAIN
	
	public static int buscarSecuenciaInt (int[] vector1, int[] vector2) {
		
		int result = 0;
		
		for (int i = 0; i < vector1.length-1; i++) {
			
			if(vector2[0] == vector1[i] && vector2[1] == vector1[i+1] && vector2[2] == vector1[i+2]) {
				result = i;
				break;
			}
			
		}		
				
			
		return result;
	} // Cierre buscarSecuenciaInt
}