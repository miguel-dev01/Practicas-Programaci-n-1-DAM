/**
 * Ejercicio 19 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 18/01/2023
 */

/*
    Escribe un método que se llame ordenarMergeSort() 
    que recibe un vector de enteros para ordenarlos 
    por el algoritmo MergeSort . Devuelve 1 si ha ordenado, 
    0 si ya estaba ordenado y un valor negativo si no se ha podido ordenar.
*/

public class Ejercicio19 {
	public static void main(String args[]) {

		int[] matriz = {5,9,4,2,1,8,6,3,7};
		//int[] matriz = {1,2,3,4,5,6,7,8,9};
		//int[] matriz = {1,2,4,3,5,6,7,8,9};
		
		int izq = 0;
		int der = matriz.length - 1;
	    
		int matrizOrdenada = ordenarMergeSort(matriz, izq, der);
		
		if(matrizOrdenada == 1) {
			System.out.println(matrizOrdenada + " --> Se ha ordenado");
		} else if(matrizOrdenada == 0) {
			System.out.println(matrizOrdenada + " --> Ya esta ordenado");
		} else {
			System.err.println("Algo ha salido mal");
		}
		
	} // Cierre MAIN
	
	public static int ordenarMergeSort(int[] matriz, int izq, int der) {
		boolean Ordenado = true;
		
		for(int i = 0; i < matriz.length - 1; i++) {
			if(matriz[i] > matriz[i+1]) {
				Ordenado = false;
			}
		}
		
		if(!Ordenado) {
			if (izq < der) {
		        int medio = (izq + der) / 2;
		        ordenarMergeSort(matriz, izq, medio);
		        ordenarMergeSort(matriz, medio + 1, der);
		        merge(matriz, izq, medio, der);
		    }
			return 1;
		}
		
		if(Ordenado) {
			return 0;
		}else {
			return -1;
		}

	} // cierre mergesort()
	
	public static void merge(int[] matriz, int izq, int medio, int der) {
		
	    int[] temp = new int[matriz.length];
	    int i = izq;
	    int j = medio + 1;
	    int k = izq;
	
		while (i <= medio && j <= der) {
			if (matriz[i] <= matriz[j]) {
				temp[k] = matriz[i];
				i = i + 1;
			} else {
				temp[k] = matriz[j];
				j = j + 1;
			}
			k = k + 1;
		}
	
		while(i <= medio) {
			temp[k] = matriz[i];
			i = i + 1;
			k = k + 1;
		}
		
		while(j <= der) {
			temp[k] = matriz[j];
			j = j + 1;
			k = k + 1;
		}
		
		for(int x = izq; x <= der; x++) {
			matriz[x] = temp[x];
		}
		
	} // Cierre ordenarMergeSort()

}