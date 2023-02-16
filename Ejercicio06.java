/**
 * Ejercicio 06 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 24/12/2022
 */

/*
 * Escribe un método que se llame padRight() que recibe una cadena de
 * caracteres, un carácter y un número. Devuelve una cadena formateada con el
 * texto recibido completado por la derecha con el carácter proporcionado hasta
 * la longitud indicada con el número. Ejemplo:
 * 
 * padRight("Introducción", '*', 20);
 * 
 * produce: "Introducción********"
 * 
 * Prueba el método pedido desde main(). Se recomienda utilizar StringBuilder.
 */

public class Ejercicio06 {
	public static void main(String args[]) {

		String cadena = "Introducción";
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