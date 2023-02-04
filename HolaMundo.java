/**
  HolaMundo.java - Ejercicio 1
  Programa simple que muestra un mensaje la consola del sistema.
  MSG - 22/09/2022
  
  Miguel Sanchez Garcia
**/

public class HolaMundo {
	public static void main(String[] args) {	
		System.out.println("Hola mundo...");  //Muestra mensaje 
		
		String nombre_programa = "HolaMundo.java"; 
		
		String nombre_autor = "Miguel Sanchez";
		
		String version = "JavaSE-11";
		
		System.out.println("Nombre del programa: " + nombre_programa);
		
		System.out.println("Nombre del autor: " + nombre_autor);
		
		System.out.println("Version de Java: " + version);
		
		
		// El siguiente "System.out.print" es otra manera de mostrar tambien los resultados.
		//System.out.println(nombre_programa + "\n" + nombre_autor + "\n" + version);
	}
}

/*
En el programa proporcionado aparecen varios elementos del lenguaje; 
indica qué es y qué representa cada uno de ellos explicándolo con tus palabras.

	Haz una clasificación de lo que aparece en el programa según sean palabras 
	reservadas de Java, sentencias, identificadores, datos, delimitadores, etc.
	
		Lo primero que nos encontramos es un comentario, sera un texto o informacion que para
		el programa no se ejecutara, sera ignorado.
		Despues tenemos la clase, que ha de nombrarse obligatoriamente igual que el nombre del
		fichero. "public class" quiere decir que se esta declarando la clase. Las llaves "{" 
		indican al compilador donde comienza el bloque que se tendra que ejecutar.
		
		Pasamos al encabezado del método "main", toda clase tiene que tener un metodo inicial,
		sera el metodo que se ejecutara primero. Aunque no es una palabra reservada, no puede
		usarse otro nombre.
		
		Una vez aqui, pasariamos a indicarle instrucciones al programa o programar que es lo que
		queremos que realice dentro de dicho metodo principal. En el caso de este programa JAVA, lo
		que tiene indicado es que muestre por consola mediante la sentencia "System.out.println" un
		'Hola Mundo' y cuando lo haya mostrado creara una linea abajo, esto ultimo se debe al 
		printLN.
	
	Averigua por qué aparecen las líneas desplazadas unas con respecto a otras y 
	algunas palabras se escriben con mayúscula en su letra inicial.
		
		Posteriormente cerramos con llaves y dejamos tabulaciones entre clase, metodo y sentencias
		para tenerlo lo mas organizado posible y ordenado. A efectos del programa o de compilacion
		se ejecutara de la misma manera si todas las lineas estuvieran, siempre cuando esten las 
		llaves de apertura y cierra de la clase y el metodo.
		
	Pon en minúscula el nombre de la clase y ejecuta el programa. ¿Qué ocurre?
	
		Nos muestra que la clase no ha sido definida igual que el nombre de su archivo que la
		contiene.
*/


/*
En el programa escribe en main() una nueva sentencia que muestre por pantalla el 
nombre del programa, su versión y nombre del autor.
    
    
    Documenta el programa con comentarios aclaratorios adicionales.

		Declaramos con tipo de dato String, que es cadena de texto, las tres sentencias
		que nos pide el ejercicio. Y posteriormente creamos la instancia para mostrar por pantalla.

*/