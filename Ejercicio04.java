/**
 * Ejercicio 04 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 23/12/2022
 */

/*
 * Escribe un m�todo que se llame obtenerNumeroVecesSubCadena2() que recibe dos
 * cadenas y devuelva el n�mero de veces que la segunda cadena est� contenida en
 * el texto de la primera sin distinguir may�sculas .
 * 
 * Si se busca la subcadena "en" en el texto:
 * 
 * �Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el
 * interior del submarino se est� muy apretado. As� que estamos leyendo todo el
 * d�a. Vamos a salir en 5 d�as"
 * 
 * Dar�a: 6 Prueba el m�todo pedido desde main(). Se recomienda probar el texto
 * del ejemplo y utilizar un bucle de b�squeda que utilice la versi�n adecuada
 * de indexOf() con un contador.
 */

public class Ejercicio04 {
	public static void main(String args[]) {

		String cadena1 = "Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el\r\n"
				+ "interior del submarino se est� muy apretado. As� que estamos leyendo todo el\r\n"
				+ "d�a. Vamos a salir en 5 d�as.";
		String cadena2 = "en";
		
		int totalVecesSubCadena2 = obtenerNumeroVecesSubCadena2(cadena1, cadena2);
		System.out.println("La cadena "+ cadena2 + " \nSe repite un total de: " + totalVecesSubCadena2 + " veces.");
		
	} // Cierre MAIN
	
	public static int obtenerNumeroVecesSubCadena2(String cadena, String buscar) {
		
		int contador = 0;
		int i = 0;
		
		while(i < cadena.length() - 1) {
			
			if(cadena.substring(i, i + buscar.length()).equalsIgnoreCase(buscar)) {
				contador++;
			}
			
			i++;
		}
		
		return contador;
	} // cierre obtenerNumeroVecesSubCadena()
}