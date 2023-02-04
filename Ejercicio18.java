/**
 * Ejercicio 18 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 11/01/2023
 */

/*
 * Escribe un método que se llame buscarBinariaRec() que recibe un vector
 * ordenado de enteros y un valor. Devuelve el índice de la posición de ese
 * valor dentro del array recibido utilizando una búsqueda binaria recursiva.
 * Prueba el método pedido desde main(). Consulta el anexo de los apuntes: Anexo
 * 7. Algoritmos de búsqueda y ordenación
 */
import java.util.Arrays;

public class Ejercicio18 {
	public static void main(String args[]) {

		int[] matriz = {1,2,3,4,5,6,7,8,9};
		int valor = 5;
		int inferior = 0;
		int superior = matriz.length;
		
		int si_existe = Arrays.binarySearch(matriz, valor);
		if(si_existe < 0) {
			System.err.println("El valor introducido no es valido o no se encuentra en el array");
			return;
		} 
		
		int result = buscarBinariaRec(matriz, valor, inferior, superior);
		System.out.println("La posicion para el valor " + valor + " se encuentra en la posicion: " + result + " del array.");
		
	} // Cierre MAIN
	
	public static int buscarBinariaRec(int[] matriz, int valor, int inf, int sup) {
		
		int med = (inf + sup) / 2;
		
		if(inf > sup) {
			return -1;
		}
		
		if(valor == matriz[med]) {
			return med;
		}
		
		if(valor < matriz[med]) {
			return buscarBinariaRec(matriz,valor,inf,med-1);
		} 
		
		if(valor > matriz[med]) {
			return buscarBinariaRec(matriz,valor,med+1,sup);
		}
		
		return -1;
	} // Cierre buscarBinariaRec()

}