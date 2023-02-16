/**
 * Ejercicio 10 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 25/12/2022
 */

/*
 * Escribe un método que se llame fechaActual() devuelva una cadena con la fecha
 * actual en formato dd/mm/aaaa. Prueba el método pedido desde main().
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ejercicio10 {
	public static void main(String args[]) {

		System.out.println("La fecha actual es: " + fechaActual());
		
	
	} // Cierre MAIN
	
	public static String fechaActual() {
		
		SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
		String result = fecha.format(new Date());
		
		return result;
	} // cierre fechaActual()
	
}