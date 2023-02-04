/**
 * Ejercicio 12 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 27/12/2022
 */

/*
 * Escribe cuatro métodos que se llamen secuenciaNaturalIntA(),
 * secuenciaNaturalIntB(), secuenciaNaturalIntC() y secuenciaNaturalIntD(). Cada
 * método recibe respectivamente un valor que representa el lado de una matriz
 * cuadrada de tamaño N; deben rellenar el corespondiente array según los
 * patrones del gráfico adjunto. Devuelven respectivamente la matriz generada.
 * La secuencia natural es 1, 2, 3 ... N. Para un tamaño de 4x4 serían:
 * 
 * recorridosmatriz.jpg
 * 
 * Prueba los métodos pedido desde main(). Hay que utilizar dos bucles anidados
 * y manipular los índices de manera que las secuencias de ejecución produzcan
 * los patrones de distribución indicados. Para el caso d) se puede aplicar la
 * siguiente estrategia: A partir de la posición [0][0] hay que bajar N veces. A
 * continuación, se pasa a la derecha N-1 veces, luego sube N-1 veces, luego a
 * la izquierda N-2 veces, luego hacia abajo N-2 veces, etc. Cada vez que se
 * mueve un paso se produce un número de la secuencia natural 1, 2, 3, ..., NxN.
 */

public class Ejercicio12 {
	public static void main(String args[]) {
		
		int longitud = 4;
		int[][] matrizA = secuenciaNaturalIntA(longitud);

		
		// Metodo que imprime por pantalla el resultado de los arrays
		mostrarArrays(matrizA);
		
	} // Cierre MAIN
	
	public static int[][] secuenciaNaturalIntA(int longitud) {
		
		int[][] arreglo = new int[longitud][longitud];
		
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				arreglo[i][j] = i + (j * longitud) + 1;
				
			}
		}
				
		
		return arreglo;
	} // Cierre secuenciaNaturalIntA()
	
	
	public static int[][] secuenciaNaturalIntB(int longitud) {
		
		int[][] arreglo = new int[longitud][longitud];
		
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				arreglo[i][j] = i + (j * longitud) + 1;
			}
		}
				
		
		return arreglo;
	} // Cierre secuenciaNaturalIntB()
	
	
	public static int[][]  secuenciaNaturalIntC(int longitud) {
		
		int[][] arreglo = new int[longitud][longitud];
		
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				arreglo[i][j] = i + (j * longitud) + 1;
			}
		}
				
		return arreglo;
	} // Cierre secuenciaNaturalIntC()
	
	public static int[][]  secuenciaNaturalIntD(int longitud) {
		
		int[][] arreglo = new int[longitud][longitud];
		
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				arreglo[i][j] = i + (j * longitud) + 1;
			}
		}
				
		return arreglo;
	} // Cierre secuenciaNaturalIntD()
	
	
	public static void mostrarArrays(int[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
	} // Cierre mostrarArrays()
	

}