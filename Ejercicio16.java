/**
 * Ejercicio 16 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 09/01/2023
 */

/*
 * Escribe un método que se llame ordenarBurbuja() que recibe un vector de
 * enteros para ordenarlos por el método de la burbuja . Devuelve 1 si ha
 * ordenado, 0 si ya estaba ordenado y un valor negativo si no se ha podido
 * ordenar. Prueba el método pedido desde main(). Consulta el anexo de los
 * apuntes: Anexo 7. Algoritmos de búsqueda y ordenación
 */

public class Ejercicio16 {
	public static void main(String args[]) {
		// Array desordenado
		//int[] vector = {5,9,4,2,1,8,6,3,7};
		
		// Array ordenado
		int[] vector = {1,2,3,4,5,6,7,8,9};
		
		// Array con solo dos numeros desordenados
		//int[] vector = {1,2,4,3,5,6,7,8,9};
		
		int vectorOrdenado = ordenarBurbuja(vector);
		
		if(vectorOrdenado == 1) {
			System.out.println(vectorOrdenado + " --> Se ha ordenado");
		} else if(vectorOrdenado == 0) {
			System.out.println(vectorOrdenado + " --> Ya esta ordenado");
		} else {
			System.err.println("Algo ha salido mal");
		}
		
		
	} // Cierre MAIN
	
	public static int ordenarBurbuja(int[] vector) {
		boolean result = true;
		
		// Primero entra a este bucle y se hace la condicion 
		// que comprueba que esta ordenado, si no lo esta, la variable result con la que
		// inicializamos en true, pasara a ser false.
		for (int x = 0; x < vector.length - 1; x++) {
			if(vector[x] > vector[x + 1]) {
				result = false;
				break;
			}
		}
		
		// Si la variable anterior termina dando false, se cumplira la siguiente condicion y se ejecutara el bucle
		// que ordenada el array pasado por parametro mediente ordenacion de burbuja.
		// Una vez se haya ordenado, este metodo retornara 1.
		if(result == false) {
			for (int i = 0; i < vector.length; i++) {
				for (int j = 0; j < vector.length; j++) {
	
					if (vector[j] > vector[i]) {
						int aux = vector[i];
						vector[i] = vector[j];
						vector[j] = aux;
					}
	
				}
				
			} // Cierre bucle i
			return 1;
		}
		
		// Si la condicion del bucle X no se cumple, significa que el array esta ordenado, y por tanto no se entrara
		// al bucle siguiente que lo ordenaria, result sigue siendo por tanto true desde un principio, por lo que
		// en la siguiente condicion si result es true se retornara 0.
		if (result) {
			return 0;
		} else {
			return -1;
		}
	
		
	} // cierre Metodo ordenarBurbuja

}