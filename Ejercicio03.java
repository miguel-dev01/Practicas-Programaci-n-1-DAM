/**,
 * Ejercicio 03 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 19/12/2022
 */

/*
 * Escribe un método que se llame frecuenciaNumero() que recibe un vector de
 * enteros y un número. Devuelve la frecuencia entre los elementos del vector
 * del número recibido. Prueba el método pedido desde main().
 */

public class Ejercicio03 {
	public static void main(String args[]) {
	
		int[] array = {1,4,4,6,2,3,7,9,5,5,4,8,4,5,6,7,3,1,3,5,7,4,3,6,7,8,2,0,1,4,5,5,4,6,9,5,2,2,5,4,6,7,9,8};
		int numero = 1;
		
		System.out.println("El numero "+ numero + " aparece: " +  frecuenciaNumero(array, numero) + " veces.");
		
	} // Cierre main
	
	public static int frecuenciaNumero(int[] arreglo, int numerico) {
		
		int contador = 0;
		
		for(int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == numerico) {
				contador++;
			}
		}
		
		return contador;
	} // Cierre frecuenciaNumero
}