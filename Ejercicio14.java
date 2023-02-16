/**
 * Ejercicio 14 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 16/02/2023
 */

/*
 * Escribe un método que se llame fechaValida() que recibe un texto
 * correspondiente a una fecha en formato dd/mm/aaaa . Devuelve el valor true si
 * la fecha es válida y false en caso de que la fecha no sea válida. El método
 * debe tener en cuenta los meses de 28, 30 y 31 días, además de los febreros de
 * 29 días de los años bisiestos. Prueba el método pedido desde main().
 */


public class Ejercicio14 {
	public static void main(String args[]) {
		
		String fecha = "15/10/2001";
		//String fecha = "29/02/2021";
		
		System.out.println(fechaValida(fecha) ? "Fecha Valida OK":"Fecha Valida NO OK");
		
	} // Cierre MAIN
	
	public static boolean fechaValida(String fecha) {
		
		int dia = Integer.parseInt(fecha.substring(0, 2));
		int mes = Integer.parseInt(fecha.substring(3, 5));
		String anio = fecha.substring(6);
		
		// Validar año
		String regex_anio = "^(?:(?:19|20)\\d{2})$";
		
		if(anio.matches(regex_anio) != true) {
			return false;
		}
		
		int anio_vale = Integer.parseInt(anio);
		
		// Validar que los dias y meses estan en un rango de numeros correctos
		if(dia < 1 || mes > 12) {
			return false;
		}
		
		// Validar los dias con respecto a cada mes, y si es bisiesto o no...
		switch (mes) {
		  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			  if(dia > 31/*dias*/) {
				  return false;
			  }
		    break;
		  case 4: case 6: case 9: case 11:
			  if(dia > 30/*dias*/) {
				  return false;
			  }
		    break;
		  case 2:
			  if(dia >= 30) {
				  return false;
			  }
			  
			  if(dia == 29/*dia del mes de febrero de un año bisiesto*/) {
	              if((anio_vale % 4 == 0 && anio_vale % 100 != 0) || anio_vale % 400 == 0){
	                  return true;
	              } else {
	            	  return false;
	              }
			  } else { // Este ultimo else hace refencia al dia 28 de un año NO bisiesto.
            	  return true;
              }
		    //break;
		  default:
			  return true;
		}
		
		return true;
	    
	} // cierre metodo fechaValida()
	
}