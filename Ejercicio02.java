/**
 * Ejercicio 02 - Practica 4
 * 
 * MIGUEL SANCHEZ GARCIA - 19/12/2022
 */

/*
 * Escribe un programa simple que utilice un array (vector) de 20 elementos de
 * n�meros enteros e inicialice cada elemento con un valor igual al �ndice
 * correspondiente del elemento, multiplicado por 5. Los elementos del vector se
 * pueden mostrar en la pantalla utilizando un bucle�for. Se recomienda utilizar
 * todos los modos de inicializaci�n conocidos para un vector�int[].�
 */

public class Ejercicio02 {
	public static void main(String args[]) {
	
		int[] arreglo = new int[20];
		int contador = 0;
		
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i] = i*5;
			System.out.println(arreglo[i]);
			contador++;
		}
		
		System.out.println("\n"+"--"+contador+"--");
	} // Cierre main
}