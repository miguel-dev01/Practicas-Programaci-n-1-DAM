/**
 * Ejercicio 01 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 22/12/2022
 */

/*
 * Escribe un m�todo que se llame invertirTexto() que recibe una cadena de
 * caracteres cualquiera y la devuelve invertida. Por ejemplo:
 * 
 * "Introducci�n" -> "n�iccudortnI"
 * 
 * Prueba el m�todo pedido desde main(). Se recomienda utilizar internamente un
 * StringBuilder y un bucle do-while
 */

public class Ejercicio01 {
	public static void main(String args[]) {
	
		String cadena = "Introducci�n";
		String result = invertirTexto(cadena);
		
		System.out.println(result);
		
	} // Cierre MAIN
	
	public static String invertirTexto(String cadena) {
		
		StringBuilder invertirCad = new StringBuilder(cadena);
		
		String result = invertirCad.reverse().toString();
		
		
		return cadena + ", invertido es --> " + result;
	} // cierre invertirTexto()
	
}