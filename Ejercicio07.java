/**
 * Ejercicio 07 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 24/12/2022
 */

/*
 * Escribe un m�todo que se llame reemplazaPalabras() que recibe una cadena con
 * un texto y otra con una serie de t�rminos separados por comas que deben ser
 * sustituidos por asteriscos. Devuelve el texto con el correspondiente cambio.
 * Ejemplo:
 * 
 * Con el texto:
 * 
 * �Oracle ha anunciado hoy su nueva generaci�n de compilador Java hoy. Utiliza
 * analizador avanzado y optimizador especial para la JVM de Oracle�
 * 
 * T�rminos: �JVM,Java,Oracle�
 * 
 * Produce:
 * 
 * �****** ha anunciado hoy su nueva generaci�n de compilador ****. Utiliza
 * analizador avanzado y optimizador especial para la *** de ******�
 * 
 * Prueba el m�todo pedido desde main(). Se recomienda utilizar StringBuilder y
 * el m�todo split() de String para separar cada t�rmino a rastrear. Al
 * encontrar una palabra a sustituir por asteriscos se deben respetar la
 * longitud de cada t�rmino .
 */

public class Ejercicio07 {
	public static void main(String args[]) {

		String terminos = "JVM,Java,Oracle";
		String texto = "Oracle ha anunciado hoy su nueva generaci�n de compilador Java hoy. Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
		
		String reemplazo = reemplazaPalabras(texto,terminos);		
		System.out.println(reemplazo);
		
	} // Cierre MAIN
	
	public static String reemplazaPalabras(String cadena, String terminos) {
		
		String[] termino = terminos.split(",");
		String asteriscos = "";
		int j = 0;
		
		for (int i = 0; i < termino.length; i++) {
			
			while(j < termino[i].length()) {
				asteriscos += "*";
				j++;
			}
			
			cadena = cadena.replace(termino[i], asteriscos);
		}
		
		return cadena;
	} // cierre reemplazaPalabras
}