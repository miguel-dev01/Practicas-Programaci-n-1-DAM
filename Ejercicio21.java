/**
 * Ejercicio 21 - Practica 4
 * 
 * @MIGUEL SANCHEZ GARCIA - 20/01/2023
 */

/*
 * Escribe un método que se llame obtenerPrimos() que recibe el límite superior
 * de todos los números primos que se quieren obtener. Devuelve un ArrayList con
 * los números obtenidos. Buscar información en Internet para "Criba de Eratóstenes"
 */
import java.util.ArrayList;

public class Ejercicio21 {
	public static void main(String args[]) {
		
		int limite = 20;
		
		ArrayList<Integer> primos = obtenerPrimos(limite);
		
		for(int i = 0; i < primos.size(); i++) {
			System.out.println(primos.get(i));
		}
		
	} // Cierre MAIN
	
	public static ArrayList<Integer> obtenerPrimos(int limit) {
		
		// Se declaran dos arrays, uno contrendra todos los numeros desde el 1 hasta el limite, 
		// y el otro array de primos contrendra los numeros primos que iremos eliminando de nums
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> primos = new ArrayList<Integer>();
		
		// Introducimos todos los numeros del 2 al limit en el array nums. Los numeros 0 y 1 no son necesarios
		// ya que se sabe que no son primos
		for(int i = 2; i <= limit; i++) {
			nums.add(i);
		}
		
		// Dentro del bucle while tendremos la variable primo que obtendra el elemento de la posicion 0 del array nums
		// y sera añadido al array primos. Asimismo el siguiente bucle for empezara a iterar por el numero de
		// primo y de ahi hasta el limite, dicho bucle incrementara el numero actual de i + primo, hasta llegar al limit.
		// Por ultimo, segun las vueltas que haya dado este bucle for habra eliminado el valor actual de i en el array
		// nums tantas veces como vueltas haya dado. Y vuelta a empezar en el while hasta que la longitud del array
		// nums sea menor que 0
		while(nums.size() > 0) {
			int primo = nums.get(0);
			primos.add(primo);
			
			for(int i = primo; i <= limit; i+=primo) {
				nums.remove((Integer) i);
			
			}
		}
		
		return primos;
	} // cierre obtenerPrimos()

}

