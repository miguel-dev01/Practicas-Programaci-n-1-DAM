/**
 * Ejercicio 01 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 22/12/2022
 */

/*
 * Escribe un método que se llame invertirTexto() que recibe una cadena de
 * caracteres cualquiera y la devuelve invertida. Por ejemplo:
 * 
 * "Introducción" -> "nóiccudortnI"
 * 
 * Prueba el método pedido desde main(). Se recomienda utilizar internamente un
 * StringBuilder y un bucle do-while
 */

public class Ejercicio01 {
	public static void main(String args[]) {
	
		String cadena = "Introducción";
		String result = invertirTexto(cadena);
		
		System.out.println(result);
		
	} // Cierre MAIN
	
	public static String invertirTexto(String cadena) {
		
		StringBuilder invertirCad = new StringBuilder(cadena);
		
		String result = invertirCad.reverse().toString();
		
		
		return cadena + ", invertido es --> " + result;
	} // cierre invertirTexto()
	
}