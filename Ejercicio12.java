/**
 * Ejercicio 12 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 25/12/2022
 */

/*Escribe un método que se llame fechaHoraActual() devuelva una cadena 
 *con la fecha y hora actual en formato dd/mm/aaaa hh:mm:ss.
 *El método debe llamarse cada 1 segundo para mostrar por pantalla 
 *el resultado simulando el funcionamiento de un reloj.
 *Prueba el método pedido desde main().
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class Ejercicio12 {
	public static void main(String args[]) {
		
		while (true) {
			System.out.println(fechaHoraActual());
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}	
		
	
	} // Cierre MAIN
	
	public static String fechaHoraActual() {
		String result = "";
		
		SimpleDateFormat fechaActual = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		result = fechaActual.format(new Date());

		return result;
	
	} // cierre fechaHoraActual()
}