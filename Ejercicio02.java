/**
 * Ejercicio 02 - Practica 5
 * 
 * @MIGUEL SANCHEZ GARCIA - 23/12/2022
 */

/*
 * Escribe un método que se llame parentesisCorrectos() que recibe una cadena
 * de texto que contiene una expresión aritmética en la que hay que comprobar
 * que los paréntesis están bien emparejados. Devuelve verdadero o falso.
 * Ejemplo:
 * 
 * Expresión: ((a + b) / 5-d)
 * Daría: true
 * 
 * Expresión: )(a + b))
 * Daría: false
 * 
 * Prueba el método pedido desde main(). Utiliza un contador para los
 * paréntesis: Cuando se abre un paréntesis incrementa un contador, cuando se
 * cierra se decrementa. Al final el contador debe valer 0; en cualquier otro
 * caso la expresión es incorrecta.
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