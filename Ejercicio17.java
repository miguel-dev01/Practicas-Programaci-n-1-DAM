/**
 * Ejercicio 17 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 10/01/2023
 */

/*
 * Escribe un método que se llame ordenarBaraja() que recibe un vector de
 * enteros para ordenarlos por el método de la baraja . Devuelve 1 si ha
 * ordenado, 0 si ya estaba ordenado y un valor negativo si no se ha podido
 * ordenar. Prueba el método pedido desde main(). Consulta el anexo de los
 * apuntes: Anexo 7. Algoritmos de búsqueda y ordenación
 */

public class Ejercicio17 {
	public static void main(String args[]) {

		int[] vector = {5,9,4,2,1,8,6,3,7};
		
		//int[] vector = {3,2,4,1,2};
		
		//int[] vector = {1,2,3,4,5,6,7,8,9};
	
		//int[] vector = {1,2,4,3,5,6,7,8,9};
		
		//System.out.print(ordenarBaraja(vector));
		
		System.out.println(ordenarBaraja(vector));
		
	} // Cierre MAIN
	
	public static int ordenarBaraja(int[] vector) {
		boolean ordenado = true;
		
		for(int i = 0; i < vector.length - 1; i++) {
			if(vector[i] > vector[i + 1]) {
				ordenado = false;
			}
		}
		
		if(ordenado == false) {
			for(int i = 1; i < vector.length; i++) {
				
				int aux = vector[i];
				int j = i - 1;
				
				while(j >= 0 && aux < vector[j]) {
					vector[j + 1] = vector[j];
					j = j - 1;
				}
				
				vector[j + 1] = aux;
			}
			
			return 1;
		}
		
		if(ordenado) {
			return 0;
		} else {
			return -1;
		}
		
	} // Cierre metodo ordenarBaraja

}