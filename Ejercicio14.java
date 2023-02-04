/**
 * Ejercicio 14 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 07/01/2023
 */

/*
 * Escribe un método que se llame indiceAlfabetico() que recibe una palabra como
 * texto. Devuelve un array (vector) de números conteniendo la posición que le
 * corresponde a cada letra de la palabra recibida según el alfabeto español.
 * Prueba el método pedido desde main(). Se puede resolver con un vector de char
 * que contenga todos las letras ordenadas del alfabeto español y dos bucles for
 * anidados (uno para las letras de la palabra y otro para el array del
 * alfabeto). Tambien se pueden utilizar las propiedades de los sistemas de
 * codificación ASCII o unicode.
 */

public class Ejercicio14 {
	public static void main(String args[]) {
		
		
		String palabra = "miguel";
		// Indicamos a continuacion que el string palabra se convierta a un array de char, y dicho array de char
		// lo pasaremos como parametro a indiceAlfabetico para que este compruebe si las letras del char estan
		// contenidas en el array de alfabeto y asi sacar su posicion.
		// Se hace asi ya que no se puede comparar un string con un char o viceversa. Deben ser del mismo tipo
		// de dato
		char[] palabra_vector = palabra.toCharArray();
		
		int[] vector_indice = indiceAlfabetico(palabra_vector);
		
		for(int i = 0; i < vector_indice.length; i++) {
			System.out.println("La letra " + palabra_vector[i] + " tiene la posicion Nº --> " + vector_indice[i]);
		}
		
	
	} // Cierre MAIN
	
	public static int[] indiceAlfabetico (char[] texto) {
		
		char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[] result = new int[texto.length];
		
		for(int i = 0; i < texto.length; i++) {
			
			for(int j = 0; j < alfabeto.length; j++) {
				
				if(alfabeto[j] == texto[i]) {
					
					result[i] = j;
					// Cuando se cumpla la condicion el bucle 'J' deje de dar vueltas.
					break;
				}
				
			}
		}
		
		return result;
	} // Cierre metodo indiceAlfabetico
}