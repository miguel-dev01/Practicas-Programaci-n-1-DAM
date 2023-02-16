/**
 * Ejercicio 05 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 24/12/2022
 */

/*
 * Escribe un método que se llame PasarMayúsculaSubCadena() que recibe un texto
 * etiquetado y devuelve otra cadena en la que se han cambiado a mayúsculas
 * todos los caracteres en el texto entre las etiquetas <mayus></mayus> Las
 * etiquetas no se pueden anidar y deben ser limpiadas del texto resultante.
 * Ejemplo:
 * 
 * “Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos
 * <mayus>nada</mayus> qué hacer"
 * 
 * Daría: “Estamos viviendo en un SUBMARINO AMARILLO. No tenemos NADA qué hacer”
 * 
 * Prueba el método pedido desde main(). Se recomienda utilizar expresiones
 * regulares o IndexOf() para abrir y cerrar la etiqueta. Una vez calculado el
 * índice de inicio y final del texto afectado por una etiqueta se extrae, se
 * pasa a mayúscula se reemplaza toda la subcadena <mayus>texto</mayus>.
 */

public class Ejercicio05 {
	public static void main(String args[]) {

		String cadena = "Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer";
		
		
		String Mayus = PasarMayúsculaSubCadena(cadena);
		System.out.println(Mayus);
		
	} // Cierre MAIN
	
	public static String PasarMayúsculaSubCadena(String cadena) {
		
		int inicio = cadena.indexOf("<mayus>");
		int fin = 0;
	
		while(inicio != -1) {
			fin = cadena.indexOf("</mayus>", inicio);
			
			if(fin != -1) {
			
				String entreEtiqueta = cadena.substring(inicio + "<mayus>".length(), fin);
				String aMayuscula = entreEtiqueta.toUpperCase();
				
				cadena = cadena.replaceAll("<mayus>" + entreEtiqueta + "</mayus>", "<mayus>" + aMayuscula + "</mayus>");
						
				inicio = cadena.indexOf("<mayus>", inicio + "<mayus>".length() + entreEtiqueta.length() + "</mayus>".length());
			}
		}
		
		
		String result = cadena.replace("<mayus>", "").replace("</mayus>","");
		
		return result;
	} // cierre PasarMayúsculaSubCadena()
}