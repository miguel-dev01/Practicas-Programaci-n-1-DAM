/**
 * Ejercicio 13 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 28/12/2022
 */

/*
 * Escribe un método que se llame maxima3() que recibe una matriz rectangular de
 * tamaño (n,m) con datos. Devuelve una una submatriz de tamaño (3,3), cuyos
 * valores sumen el valor máximo dentro de la matriz recibida. Modifica el
 * ejemplo de submatriz máxima del capitulo 7. Arrays de los apuntes.
 */

public class Ejercicio13 {
	public static void main(String args[]) {
		
		int[][] matriz = {{5,7,4,5,1},
						  {2,3,4,2,3},
						  {7,8,9,5,6},
						  {7,3,4,1,9}
						};
		
		
		int[][] matriz3x3 = maxima3(matriz);
		
		for(int i = 0; i < matriz3x3.length; i++) {
			for(int j = 0; j < matriz3x3.length; j++) {
				
				System.out.print(matriz3x3[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
	} // Cierre MAIN
	
	public static int[][] maxima3(int[][] matriz) {
		
		int[][] result = new int[3][3];
		
		
		int sumaMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < matriz.length - 2; i++) {
			for(int j = 0; j < matriz[0].length - 2; j++) {
				
				int suma = matriz[i][j] + 
						matriz[i][j+1] + 
						matriz[i][j+2] +
						matriz[i+1][j] + 
						matriz[i+1][j+1] + 
						matriz[i+1][j+2] +
						matriz[i+2][j] +
						matriz[i+2][j+1] +
						matriz[i+2][j+2];
				
				if (suma > sumaMax) {
					sumaMax = suma;

					result[0][0] = matriz[i][j];
					result[0][1] = matriz[i][j+1];
					result[0][2] = matriz[i][j+2];
					result[1][0] = matriz[i+1][j];
					result[1][1] = matriz[i+1][j+1];
					result[1][2] = matriz[i+1][j+2];
					result[2][0] = matriz[i+2][j];
					result[2][1] = matriz[i+2][j+1];
					result[2][2] = matriz[i+2][j+2];
					
				}
				
			}
		}
		
		
		return result;
	} // Cierra maxima3
	
}