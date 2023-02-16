/**
 * Ejercicio 09 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 25/12/2022
 */

/*
 * Escribe un método que se llame encriptar() que reciba un texto y una clave.
 * Devuelve el texto encriptado en otra cadena. El cifrado debe hacerse
 * aplicando XOR entre cada letra del texto y una letra de la clave, cuando se
 * terminan las letras de la clave vuelve a la primera. Prueba el método pedido
 * desde main(). 
 * Utiliza la longitud de la clave, clave.length(). Para mapear
 * cada carácter del texto a encriptar con un carácter de la clave, calcula el
 * módulo indice % clave.length(). Se puede realizar la operación XOR binaria
 * entre caracteres convirtiéndolos en números de tipo short.
 */	

public class Ejercicio09 {
	public static void main(String args[]) {

		String cadena = "Hola soy Miguel, y me gusta la programacion";
		String clave = "hola_mundo";
		
		String encriptado = encriptar(cadena,clave);
		System.out.println(encriptado);
	
	} // Cierre MAIN
	
	public static String encriptar(String cadena, String clave) {
		
		char[] result = new char[cadena.length()];
		
		for(int i = 0; i < cadena.length()-1; i++) {
			char cadena_cifrar = cadena.charAt(i);
			char clave_cifrar = clave.charAt(i % clave.length());
			
			// La siguente linea es la qe realiza el cifrado XOR como tal y lo almacena en variable char de tipo
			// array para luego convertirlo a string pasando por su clave el result y asi extrear correctamente el 
			// texto cifrado y mostrarlo. Usando el metodo .toString() tan solo nos devuelve la posicion de memoria
			
			// Lo de (char) segun internet es lo que se denomina como castear, donde el resultado de 
			// cadena_cifrar ^ clave_cifrar, tendremos que "castearla" para que devuelva un caracter, en lugar de un entero,
			// ya que el calculo que se hace entre cadena_cifrar ^ clave_cifrar devolveria un entero
			// Una vez hecho lo anterior se almacena en el array.
			result[i] = (char) (cadena_cifrar ^ clave_cifrar);
		}
		
		cadena = new String(result);
		return cadena;
	} // cierre encriptar()
}