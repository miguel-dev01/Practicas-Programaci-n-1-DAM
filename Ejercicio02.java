/**
 * Ejercicio 02 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 23/12/2022
 */

/*
 * Escribe un m�todo que se llame parentesisCorrectos() que recibe una cadena
 * de texto que contiene una expresi�n aritm�tica en la que hay que comprobar
 * que los par�ntesis est�n bien emparejados. Devuelve verdadero o falso.
 * Ejemplo:
 * 
 * Expresi�n: ((a + b) / 5-d)
 * Dar�a: true
 * 
 * Expresi�n: )(a + b))
 * Dar�a: false
 * 
 * Prueba el m�todo pedido desde main(). Utiliza un contador para los
 * par�ntesis: Cuando se abre un par�ntesis incrementa un contador, cuando se
 * cierra se decrementa. Al final el contador debe valer 0; en cualquier otro
 * caso la expresi�n es incorrecta.
 */

public class Ejercicio02 {
	public static void main(String args[]) {

		//String expresion = "((a + b) / 5-d)";
		String expresion = ")(a + b))";
		
		boolean result = parentesisCorrectos(expresion);
		System.out.println(result);
		
	} // Cierre MAIN
	
	public static boolean parentesisCorrectos(String expresion) {
		int contador = 0;
	    boolean result = false;
	    int i = 0;
	  
	    while(i < expresion.length()) {
	    	char paren = expresion.charAt(i);
	    	
		    if(paren == '('){
		    	contador++;
		   	}
		    
		    if(paren == ')'){
		    	contador--;
		    }
		    
		    i++;
	    }
		    
	   	if(contador == 0){
	    	result = true;
	    }else{
	    	result = false;
	    }
		
		return result;
	} // cierre parentesisCorrectos()
}