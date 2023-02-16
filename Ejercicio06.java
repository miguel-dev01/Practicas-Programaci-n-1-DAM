/**
 * Ejercicio 06 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 24/12/2022
 */

/*
 * Escribe un m�todo que se llame padRight() que recibe una cadena de
 * caracteres, un car�cter y un n�mero. Devuelve una cadena formateada con el
 * texto recibido completado por la derecha con el car�cter proporcionado hasta
 * la longitud indicada con el n�mero. Ejemplo:
 * 
 * padRight("Introducci�n", '*', 20);
 * 
 * produce: "Introducci�n********"
 * 
 * Prueba el m�todo pedido desde main(). Se recomienda utilizar StringBuilder.
 */

public class Ejercicio06 {
	public static void main(String args[]) {

		String cadena = "Introducci�n";
		char caracter = '*';
		int numero = 8;
		
		String result = padRight(cadena, caracter, numero);
		System.out.println(result);
		
	} // Cierre MAIN
		
	public static String padRight(String cadena, char caracter, int numero) {
		
		StringBuilder result = new StringBuilder(cadena);
		int i = 0;
		
		while(i < numero) {
			result = result.append(caracter);
			i++;
		}
		
		return result.toString();
	} // cierre padRight()
}