/**
 * Ejercicio 13 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 26/01/2023
 */

/*
 * Escribe un método que se llame fechaValida() que recibe tres valores
 * numéricos correspondiente al día, mes y año. Devuelve el valor true si la
 * fecha es válida y false en caso de que la fecha no sea válida. El método debe
 * tener en cuenta los meses de 28, 30 y 31 días, además de los febreros de 29
 * días de los años bisiestos.
 */
	/*
	 * NOTA: Si hubiera alguna sospecha de que el codigo de este ejercicio lo he obtenido mediante alguna herramienta
	 * de IA o algo por el estilo, muestro las fuentes (URLs) de paginas didacticas de programacion
	 * en las que me he ayudado para realizar este ejercicio, y sin el apoyo de ninguna herramienta:
	 * https://lineadecodigo.com/java/dias-del-mes-en-java/
	 * https://masqueprogramar.wordpress.com/2017/01/04/numero-de-dias-en-un-mes/
	 * https://www.discoduroderoer.es/obtener-los-numeros-de-dias-de-un-mes-en-java/
	 * De primeras puede parecer que el codigo ha sido obtenido mediante alguna de las herramientas que hablo.
	 */

public class Ejercicio13 {
	public static void main(String args[]) {
		
		int day = 29;
		int month = 2;
		int year = 2020;
		
		boolean result = fechaValida(day,month,year);
		System.out.println((result) ? "Fecha Valida OK":"Fecha Valida NO OK");
		
	} // Cierre MAIN
	
	public static boolean fechaValida(int nDay, int nMonth, int nYear) {
		
		// Validar año
		String regex_anio = "^(?:(?:19|20)\\d{2})$";
		String anio = String.valueOf(nYear);
		if(anio.matches(regex_anio) != true) {
			return false;
		}
		
		// Validar que los dias y meses estan en un rango de numeros correctos
		if(nDay < 1 || nMonth > 12) {
			return false;
		}
		
		// Validar los dias con respecto a cada mes, y si es bisiesto o no...
		switch (nMonth) {
		  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			  if(nDay > 31/*dias*/) {
				  return false;
			  }
		    break;
		  case 4: case 6: case 9: case 11:
			  if(nDay > 30/*dias*/) {
				  return false;
			  }
		    break;
		  case 2:
			  if(nDay >= 30) {
				  return false;
			  }
			  
			  if(nDay == 29/*dia del mes de febrero de un año bisiesto*/) {
	              if((nYear % 4 == 0 && nYear % 100 != 0) || nYear % 400 == 0){
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
	} // cierre fechaValida()

}