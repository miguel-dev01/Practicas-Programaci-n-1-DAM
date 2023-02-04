/**
 * Ejercicio 11 - Practica 3
 * 
 * MIGUEL SANCHEZ GARCIA - 02/11/2022
 */


/*

    Escribe un método que se llame banner() que muestra tus iniciales en la pantalla.
    Cada inicial se compone sobre una celda en pantalla de 7x7, como en el siguiente ejemplo:

       H     H   TTTTTTT     AAA

       H     H      T       A   A

       H     H      T      A     A

       HHHHHHH      T      A     A

       H     H      T      AAAAAAA     

       H     H      T      A     A

       H     H      T      A     A
*/

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);

	banner();
	
	keyboard.close();
	} // Cierre metodo main
	
	public static void banner() {
		System.out.println
		("                                                  \n"
		+ "       MM   MM      S S S        G G G G           \r\n"
		+ ""
		+ "       M M M M      S     S    G         G           \r\n"
		+ ""
		+ "       M  M  M       S        G                       \r\n"
		+ ""
		+ "       M     M        S       G         GGG         \r\n"
		+ ""
		+ "       M     M   S     S      G          G          \r\n"
		+ ""
		+ "       M     M    S      S    G         G          \r\n"
		+ ""
		+ "       M     M      S S S       G G G G				\r\n"
		);
		
		
	} // Cierre metodo banner.
}