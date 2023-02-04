/**
 * Ejercicio 23
 * 
 * MIGUEL SANCHEZ GARCIA - 23/10/2022
 */

 	
/*
    Escribe un programa simple que calcule el valor de un tÃ©rmino determinado de la sucesiÃ³n de Fibonacci.
    La sucesiÃ³n infinita de nÃºmeros naturales de Fibonacci es: 

    0,1,1,2,3,5,8,13,21,34,55,89,144,233,377â€¦

    La sucesiÃ³n comienza con los nÃºmeros 0 y 1, y a partir de estos, â€œcada tÃ©rmino es la suma de los dos anterioresâ€�, es la relaciÃ³n de recurrencia que la define.
    Para hacer el programa hay que tener en cuenta que:

      Se debe pedir el nÃºmero del tÃ©rmino para calcular su valor. 
      El primer tÃ©rmino, n=0; vale  0, para n=4, vale 3. SÃ³lo debe admitir nÃºmeros positivos, y cero
      
      Para cualquier tÃ©rmino de la sucesiÃ³n, se determina sumando los dos tÃ©rminos anteriores. 
      Por ejemplo para n=5 el valor serÃ­a el valor del tÃ©rmino n=4 mÃ¡s el tÃ©rmino n=3.
      
      Se debe mostrar el valor del tÃ©rmino correspondiente, no toda la serie hasta ese tÃ©rmino.
*/

import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce un numero limite para la sucesion de Fibonacci: ");
		int pregunta = keyboard.nextInt();

		int numero1 = 1;
		int numero2 = 0;
		
		if(pregunta == 0) {
			System.out.println("0"); return;
		}else if(pregunta < 0) {
			System.out.println("\nLos numeros negativos no estan admitidos."); return;
		}
		
		System.out.println("0");
		System.out.println("1");
		for(int i = 0; i <= pregunta; i++) {
			int suma = numero1 + numero2;
				numero2 = numero1;
				numero1 = suma;
				
			System.out.println(suma);
			
			keyboard.close();
		} // Cierre de FOR

	} // Cierre de la clase MAIN
}