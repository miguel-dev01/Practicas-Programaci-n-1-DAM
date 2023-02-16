/**
 * Ejercicio 08 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 25/12/2022
 */

/* 
 * Escribe un método que se llame separarURL() que recibe una cadena de
 * caracteres de una URL y devuelva un array de tres String conteniendo el
 * protocolo, el servidor y el recurso de la URL recibida. Ejemplo:
 * 
 * Proporcionando:
 * 
 * http://www.devbg.org/forum/index.php
 * 
 * El resultado es:
 * 
 * resultado[0] : "http"
 * 
 * resultado[1]: "www.devbg.org"
 * 
 * resultado[2]: "/forum/index.php"
 * 
 * Prueba el método pedido desde main(). Utiliza expresiones regulares o busca
 * los respectivos separadores: dos barras diagonales para poner fin protocolo y
 * una barra diagonal como separador entre el servidor y el recurso.
 */	

public class Ejercicio08 {
	public static void main(String args[]) {

		//String url = "http://www.devbg.org/forum/index.php";
		String url = "https://moodle.iescierva.net/mod/page/view.php?id=47185";
		
		String[] resultado = separarURL(url);
		
		System.out.println("Protocolo: " + resultado[0]);
		System.out.println("Servidor Web: " + resultado[1]);
		System.out.println("Ruta del recurso: " + resultado[2]);
		
	} // Cierre MAIN
	
	public static String[] separarURL(String url) {
		
		int limite_protocolo = url.indexOf("://");
		String protocolo = url.substring(0, limite_protocolo);
		
		int inicio_server = limite_protocolo + 3;
		int fin_server = url.indexOf("/",inicio_server);
		String servidor = url.substring(inicio_server, fin_server);
		
		String recurso = url.substring(fin_server);
		
		String[] result = {protocolo,servidor,recurso};
				
		return result;
	} // cierre separarURL()

}