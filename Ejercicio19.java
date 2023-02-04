/**
 * Ejercicio 19 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 19/11/2022
 */


/*
  Escribe un método llamado contarCaracteresPalabrasLineas() que reciba un texto como parámetro y devuelva 
  como resultado un código que codifique, de alguna manera, la siguiente información:
      El número de caracteres.
      El número de palabras.
      El número de líneas.
    El diseño y estructura del código es libre a condición de que sirva para el fin requerido. 
    A modo de sugerencia se puede utilizar un String con el formato: cccc-pppp-llll. Para el texto de ejemplo: 
    
    "Hoy es   lunes\n y mañana \tmartes" produciría el código: "0023-0006-0002"
    
    Se supone que una palabra está separada de otra por uno o más espacios en blanco, 
    caracteres de tabulación o caracteres de nueva línea.
    Prueba el método pedido desde main() utilizando un método llamado interpretarCodigo() 
    para mostrar el resultado del método anterior.
    El método interpretarCodigo() recibe dos argumentos: un código producido por 
    contarCaracteresPalabrasLineas() y un número que indica qué información se quiere extraer:
    
        1 para el total de caracteres
        2 para el total de palabras
        3 para el total de líneas

 */
import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		//System.out.print("Indique un texto para saber su longitud de caracteres, palabras o lineas: ");
		//String texto = keyboard.nextLine();
		
		String texto = "Hoy es	lunes\n y mañana \tmartes";
		
		System.out.print("Elija cualquiera de la siguientes opciones --> \n"
				+ "        1 - para el total de caracteres.\r\n"
				+ "        2 - para el total de palabras.\r\n"
				+ "        3 - para el total de lineas.");
		
		System.out.print("\n\nIndique un numero: ");
		int pedido = keyboard.nextInt();
		
		// Pequeña Restriccion
		if(pedido <= 0 || pedido >= 4) {
			System.out.println("\nNumero no Valido.\nDebes introducir los numeros indicados en la parte superior; (1, 2, 3)");
		}
		
		// Llamamos al metodo que nos devolvera, segun el numero que hayamos introducido (1,2,3) el numero de lineas,
		// caracteres y palabras segun cada caso del numero introducido. Dicho metodo interpretarCodigo
		// llamara a su vez a contarCaracteresPalabrasLineas()...
		interpretarCodigo(texto, pedido);
		
		
		keyboard.close();
	} // Cierre metodo main
	
	public static void interpretarCodigo(String texto, int pedido) {
		
		// Instanciamos al metodo de generar el codigo segun caracteres palabras y lineas, y le pasamos la cadena 'texto'
		// Cuando instanciamos o llamamos a dicho metodo de la siguiente forma; estaremos invocando su resultado 
		// por tanto dicho resultado lo guardaremos en una variable de tipo array de enteros y la mostraremos posteriormente
		int[] codigo = contarCaracteresPalabrasLineas(texto);
		
		switch (pedido) {
			case 1:
				System.out.print("\nTotal de caracteres: " + codigo[0]);
				break;
			case 2:
				System.out.print("\nTotal de palabras: " + codigo[1]);
				break;
			case 3:
				System.out.print("\nTotal de lineas: " + codigo[2]);
				break;
		} // Cierre switch
		
	} // Cierre metodo interpretarCodigo
	
	public static int[] contarCaracteresPalabrasLineas(String texto) {
		
		int caracter = 0;
		int palabra = 0;
		int linea = 0;
		
		// Contar Caracteres
		// Bucles para contar Caracteres
		for(int i = 0; i < texto.length(); i++) {
			for(char a = 'a'; a <= 'z'; a++) {
				if (texto.charAt(i) == a) {
					caracter++;
				}
				
			} // Cierre bucle Char letras minusculas (a)
			
			for(char A = 'A'; A <= 'Z'; A++) {
				if (texto.charAt(i) == A) {
					caracter++;
				}
			} // Cierre bucle Char letras mayusculas (A)
		} // Cierre bucle I
		
		// Contar Palabras
		String[] arreglo = texto.split("\\s+");
		// Se ha usado una expresion regular que divide entre espacios en blanco. Y posteriormente se muestra -
		/// la longitud de lo que se ha divido en el array. Y eso nos da las palabra que tenemos en el String.
		palabra = arreglo.length;
		
		
		// Contar lineas
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == '\n') {
				linea++;
			}
		}
		
		int[] result = {caracter, palabra, linea};
		return result;
		//return String.valueOf("Caracteres: " + caracter + "\nPalabras: " + palabra + "\nLineas: " + linea);
		
	} // Cierre metodo contarCaracteresPalabrasLineas
	
}