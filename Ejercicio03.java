/**
 * Ejercicio 03 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 23/12/2022
 */

/*
 * Escribe un método que se llame obtenerNumeroVecesSubCadena() que recibe dos
 * cadenas y devuelve el número de veces que la segunda cadena está contenida en
 * el texto de la primera. Se debe utilizar un algoritmo propio. Ejemplo:
 * 
 * Si se busca la subcadena "en" en el texto:
 * 
 * “Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el
 * interior del submarino se está muy apretado. Así que estamos leyendo todo el
 * día. Vamos a salir en 5 días".
 * 
 * Daría: 5
 * 
 * Prueba el método pedido desde main(). Se recomienda probar el texto del
 * ejemplo y utilizar un bucle de búsqueda que utilice la versión adecuada de
 * indexOf() con un contador.
 */

public class Ejercicio03 {
	public static void main(String args[]) {

		String cadena1 = "Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el\r\n"
				+ "interior del submarino se está muy apretado. Así que estamos leyendo todo el\r\n"
				+ "día. Vamos a salir en 5 días.";
		String cadena2 = "en";
	
		int totalVecesSubCadena = obtenerNumeroVecesSubCadena(cadena1, cadena2);
		System.out.println("La cadena "+ cadena2 + " \nSe repite un total de: " + totalVecesSubCadena + " veces.");
		
	} // Cierre MAIN
	
	public static int obtenerNumeroVecesSubCadena(String cadena, String buscar) {
		
		int contador = 0;
		int i = 0;
		
		while(i < cadena.length() - 1) {
			
			if(cadena.substring(i, i + buscar.length()).equals(buscar)) {
				contador++;
			}
			
			i++;
		}
		
		return contador;
	} // cierre obtenerNumeroVecesSubCadena()
	
}