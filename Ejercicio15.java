/**
 * Ejercicio 15 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 08/01/2023
 */

/*
 * Escribe un método que se llame buscarNumero() que recibe un vector ordenado
 * de enteros y un valor. Devuelve el índice de la posición de ese valor dentro
 * del array recibido utilizando una búsqueda binaria. Prueba el método pedido
 * desde main(). Consulta el anexo de los apuntes: Anexo 7. Algoritmos de
 * búsqueda y ordenación
 */

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int[] arreglo = { 1, 3, 5, 7, 8, 10, 12 };
		//int[] arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int num = 7;
		
		System.out.print(buscarNumero(arreglo, num));
		
	} // Cierre MAIN
	
	public static String buscarNumero(int[] arreglo, int num) {
		
		String result = "";
		
		for(int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] == num) {
				result = "El numero buscado se encuentra en el array. Se halla en la posicion: " + i;
				break;
			}else {
				result = "El numero buscado NO esta en el array.";
			}
		}
		
		return result;
	} // Cierre busquedaNumero
}