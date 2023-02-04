/**
 * Ejercicio 09 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 25/12/2022
 */

/*
 * Escribe un m�todo que se llame masFrecuenteInt() que recibe un vector de
 * enteros. Devuelve el valor del elemento m�s frecuente, si hay coincidencia
 * devolver�a el primero de ellos. Por ejemplo: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} 
 * devolver�a 4 Prueba el m�todo pedido desde main(). Una forma ser�a
 * recorrer el vector anidar un bucle que averig�e la frecuencia del valor de
 * cada elemento, utilizando un par de variables auxiliares para retener la
 * frecuencia m�xima y el valor asociado.
 */

public class Ejercicio09 {
	public static void main(String args[]) {
	
		//int[] vector = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
		int[] vector = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 };
		
		System.out.println("El valor del array que mas veces se repite es el: " + masFrecuenteInt(vector));
		
	} // Cierre MAIN
	
	public static int masFrecuenteInt(int[] vector) {
		
		int mayor = 0;
		int valorAsociado = 0;
		
		for(int i = 0; i < vector.length; i++) {
			int frecuenciaMaxima = 0;
			for(int j = 0; j < vector.length; j++) {
				
				if(vector[i] == vector[j]) {
					frecuenciaMaxima++;
				}
				
				if(frecuenciaMaxima > mayor) {
					valorAsociado = vector[i];
					mayor = frecuenciaMaxima;
					
				}
				
			}
			
		}
		
		return valorAsociado;
	} // Cierre metodo masFrecuenteInt
}