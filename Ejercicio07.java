/**
 * Ejercicio 7
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * MIGUEL SANCHEZ GARCIA - 06/10/2022
 */

 	
/*
  Escribe un programa simple que muestre en tres líneas separadas tu nombre completo, 
  calle, ciudad, país y código postal.
*/

public class Ejercicio07 {
	public static void main(String[] args) {
		
		String nombre = "Miguel";
		String calle = "Calle Olvido";
		String ciudad = "Murcia";
		String pais = "Espana";
		int CP = 30001;
		
		System.out.print(nombre + "\n" + calle + " | " + ciudad + " | " + pais + "\n" + CP);
		
		System.out.println("\n ----------- OTRA SOLUCION PARA ESTE EJERCICIO -----------");
		
		// Otra forma de solucionar el ejercicio
		System.out.println("Nombre: " + nombre);
		System.out.println("Calle, Ciudad y Pais: " + calle + "|" + ciudad + "|" + pais);
		System.out.println("Codigo Postal: " + CP);
	}
}