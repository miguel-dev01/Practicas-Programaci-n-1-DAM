/**
 * Ejercicio 05 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 24/12/2022
 */

/*
 * Escribe un m�todo que se llame PasarMay�sculaSubCadena() que recibe un texto
 * etiquetado y devuelve otra cadena en la que se han cambiado a may�sculas
 * todos los caracteres en el texto entre las etiquetas <mayus></mayus> Las
 * etiquetas no se pueden anidar y deben ser limpiadas del texto resultante.
 * Ejemplo:
 * 
 * �Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos
 * <mayus>nada</mayus> qu� hacer"
 * 
 * Dar�a: �Estamos viviendo en un SUBMARINO AMARILLO. No tenemos NADA qu� hacer�
 * 
 * Prueba el m�todo pedido desde main(). Se recomienda utilizar expresiones
 * regulares o IndexOf() para abrir y cerrar la etiqueta. Una vez calculado el
 * �ndice de inicio y final del texto afectado por una etiqueta se extrae, se
 * pasa a may�scula se reemplaza toda la subcadena <mayus>texto</mayus>.
 */

public class Ejercicio05 {
	public static void main(String args[]) {

		String cadena = "Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qu� hacer";
		
		
		String Mayus = PasarMay�sculaSubCadena(cadena);
		System.out.println(Mayus);
		
	} // Cierre MAIN
	
	public static String PasarMay�sculaSubCadena(String cadena) {
		
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
	} // cierre PasarMay�sculaSubCadena()
}