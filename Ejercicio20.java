/**
 * Ejercicio 20 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 26/11/2022
 */

/*
 Escribe un método que se llame bannerLetra() que recibe un carácter como parámetro y 
 devuelve una cadena de caracteres con el texto, 
 formateado sobre una matriz de 7x7, de la letra correspondiente al carácter recibido.
    Por ejemplo si se introduce la H, la cadena devuelta, al imprimirla, daría:

       H     H

       H     H

       H     H

       HHHHHHH

       H     H     

       H     H

       H     H

   Opcionalmente se pueden utilizar métodos adicionales especializados en generar cada letra. 
   Estos métodos devuelven un texto formateado adecuadamente según el diseño elegido.
   A fin de hacer menos extenso el ejercicio, no es necesario hacer todas las letras del abecedario; 
   con cuatro o cinco letras es suficiente. 
   En el caso de mostrar varias letras, se presentarán en vertical; a fin de hacer más sencillo el ejercicio.
   Sólo se admiten letras en mayúsculas.

*/


import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Solo se admiten letras mayusculas.");
		System.out.print("\nIndique una letra mayuscula: ");
		String letra = keyboard.nextLine();
		
		System.out.print("\n"+bannerLetra(letra));
		
		keyboard.close();
	} // Cierre metodo main
	
	public static String bannerLetra(String letter) {
		
		String matriz[] = {"            A   \r\n"
				+ "\r\n"
				+ "          A   A     \r\n"
				+ "\r\n"
				+ "         A     A      \r\n"
				+ "\r\n"
				+ "        A       A     \r\n"
				+ "\r\n"
				+ "       A AAAAAAA A     \r\n"
				+ "\r\n"
				+ "      A           A     \r\n"
				+ "\r\n"
				+ "     A             A       ",
				
				"     B   B   B   B    \r\n"
			+ "\r\n"
			+ "     B            B     \r\n"
			+ "\r\n"
			+ "     B           B      \r\n"
			+ "\r\n"
			+ "     B B  B  B  B       \r\n"
			+ "\r\n"
			+ "     B           B     \r\n"
			+ "\r\n"
			+ "     B            B     \r\n"
			+ "\r\n"
			+ "     B   B   B   B         ",
			
			"           C   C   C   C  C    \r\n"
					+ "\r\n"
					+ "       C                \r\n"
					+ "\r\n"
					+ "      C                 \r\n"
					+ "\r\n"
					+ "     C              \r\n"
					+ "\r\n"
					+ "      C                \r\n"
					+ "\r\n"
					+ "        C             \r\n"
					+ "\r\n"
					+ "          C   C   C   C   C       ",
					
					"     D   D   D  D    \r\n"
					
							+ "\r\n"
							+ "     D            D     \r\n"
							+ "\r\n"
							+ "     D              D      \r\n"
							+ "\r\n"
							+ "     D              D       \r\n"
							+ "\r\n"
							+ "     D              D     \r\n"
							+ "\r\n"
							+ "     D            D     \r\n"
							+ "\r\n"
							+ "     D   D   D  D         "
		};
		
		String result = "";		
			
		switch (letter) {
		case "A":
			result += matriz[0];
			break;
		case "B":
			result += matriz[1];
			break;
		case "C":
			result += matriz[2];
			break;
		case "D":
			result += matriz[3];
			break;
		}

		return result;
		
	} // Cierre metodo bannerLetra

}