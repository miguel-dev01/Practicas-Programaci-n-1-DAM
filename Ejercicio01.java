/**
 * Ejercicio 01 - Practica 4
 * 
 * MIGUEL SANCHEZ GARCIA - 19/12/2022
 */

/*
 * Escribe un programa simple que utilice un array (vector) de 10 elementos de
 * números enteros e inicialice cada elemento con el valor 7 en cada elemento.
 * Los elementos del vector se pueden mostrar en la pantalla utilizando un bucle
 * for. Se recomienda utilizar todos los modos de inicialización conocidos para
 * un vector int[]. 
 */

public class Ejercicio01 {
	public static void main(String args[]) {
		
		int[] arreglo = new int[10];
		
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i] = 7;
			System.out.print(arreglo[i]);
			while(i < arreglo.length-1) {
				System.out.print(",");
				break;
			}
		}
		
		
	}
}