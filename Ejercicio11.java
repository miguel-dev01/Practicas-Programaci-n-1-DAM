/**
 * Ejercicio 11 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 25/12/2022
 */

/*
//Escribe un método que se llame horaActual() devuelva una cadena con la hora actual en formato hh:mm:ss. 
//Prueba el método pedido desde main().
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ejercicio11 {
	public static void main(String args[]) {

		System.out.println("La hora actual es: " + horaActual());
		
	
	} // Cierre MAIN
	
	public static String horaActual() {
		
		SimpleDateFormat hora = new SimpleDateFormat("hh:mm:ss a");
		String result = hora.format(new Date());
		
		return result;
	} // cierre horaActual()
	
}