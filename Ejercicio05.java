/**
 * Ejercicio 05 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 21/12/2022
 */

/*
 * Escribe un método que se llame compararVectoresChar() que recibe dos vectores
 * de caracteres. Devuelve 0 si son iguales, 1 si el primero es mayor y -1 si el
 * primero es menos. Prueba el método pedido desde main(). El orden alfabético
 * de vectores de caracteres requiere la comparación uno a uno de sus
 * caracteres, comenzando desde el extremo izquierdo. El orden alfabético
 * corresponde al orden numérico creciente del código del carácter.
 */

public class Ejercicio05 {
	public static void main(String args[]) {
	
		char[] arreglo1 = {'a','b','c','d','e'};
		char[] arreglo2 = {'a','b','c','d','e'};
		
		//System.out.println(compararVectoresChar(arreglo1, arreglo2));
		
		// Condicion para mostrar que vector es mayor o menos que el otro
		int resultado = compararVectoresChar(arreglo1, arreglo2);
		if(resultado == 1) {
			System.out.println("El primer vector es mayor que el segundo.");
		} else if(resultado == -1) {
			System.out.println("El segundo vector es mayor que el primero.");
		}else if (resultado == 0) {
			System.out.println("El primer y segundo vector son iguales.");
		}
		
	} // Cierre MAIN
	
	public static int compararVectoresChar(char[] arreglo1, char[] arreglo2) {
		int result = 10;
		
		if(arreglo1.length != arreglo2.length) {
			result = 2;
		}else {
			for(int i = 0; i < arreglo1.length; i++) {
				if(arreglo1[i] > arreglo2[i]) {
					result = 1;
					break;
				}
				
				if (arreglo1[i] < arreglo2[i]) {
					result = -1;
					break;
				}
				
				if (arreglo1[i] == arreglo2[i]) {
					result = 0;
				}
			}
		}
		
		return result;
	} // Cierre compararVectoresChar
}