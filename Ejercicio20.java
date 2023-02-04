/**
 * Ejercicio 20 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 19/01/2023
 */

/*
 * Escribe un método que se llame ordenarQuickSort() que recibe un vector de
 * enteros para ordenarlos por el método QuickSort . Devuelve 1 si ha ordenado,
 * 0 si ya estaba ordenado y un valor negativo si no se ha podido ordenar.
 * Prueba el método pedido desde main(). Consulta el anexo de los apuntes: Anexo
 * 7. Algoritmos de búsqueda y ordenación
 */


public class Ejercicio20 {
	public static void main(String args[]) {
		
		//int[] matriz = {11,5,9,4,2,1,8,6,3,7};
		int[] matriz = {1,2,3,4,5,6,7,8,9};
		
		int izq = 0;
		int der = matriz.length-1;
		
		int result = ordenarQuickSort(matriz,izq,der);
		
		if(result == 1) {
			System.out.println(result + "--> Se ha ordenado");
		} else if(result == 0) {
			System.out.println(result + "--> Ya esta ordenado");
		} else {
			System.err.println("Algo ha salido mal");
		}
		
	} // Cierre MAIN
	
	public static int ordenarQuickSort(int[] matriz, int izq, int der) {
		boolean ordenado = true;
		
		int pivot = (izq + der) / 2;
		int i = izq;
		int j = der;
		int aux;
		
		for(int x = 0; x < matriz.length - 1; x++) {
			if(matriz[x] > matriz[x + 1]) {
				ordenado = false;
				break;
			}
		}
		
		if(ordenado == false) {
			do {
				while(matriz[i] < matriz[pivot]) {
					i = i + 1;
				}
				
				while(matriz[j] > matriz[pivot]) {
					j = j - 1;
				}
				
				if(i <= j) {
					aux = matriz[i];
					matriz[i] = matriz[j];
					matriz[j] = aux;
					i = i + 1;
					j = j - 1;
				}
			
			}while(i <= j);
			
			if(izq < j) {
				ordenarQuickSort(matriz, izq, j+1);
			}
				
			if(i < der) {
				ordenarQuickSort(matriz, i-1, der);
			}
			
			return 1;
		}
		
		if(ordenado) {
			return 0;
		}else {
			return -1;
		}
		
	} // Cierre ordenarQuickSort()

}