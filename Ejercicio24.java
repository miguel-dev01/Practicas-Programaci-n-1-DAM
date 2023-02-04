/**
 * Ejercicio 24
 * 
 * MIGUEL SANCHEZ GARCIA - 25/10/2022
 */

 	
/*
  Escribe un programa simple que muestre dos mensajes en secuencia:

     El primero pide que piense un número entre 1 y 10. Espera a que se pulse una tecla.
     El segundo muestra un número generado aleatoriamente entre 1 y 10. 
     El usuario puede ver si la suposición fue correcta.

    Opcionalmente se puede utilizar dos cuadros de diálogo. 
    La siguiente sentencia genera y usa un cuadro de diálogo que muestra un número entre 1 y 10:

		JOptionPane.showMessageDialog(null,"El número es " +  (1 + (int)(Math.random() * 10)));

*/

//import java.util.Scanner;

// Importamos la libreria de mensaje
import javax.swing.JOptionPane;

public class Ejercicio24 {
	public static void main(String[] args) {
		//Scanner keyboard = new Scanner(System.in);
		int numero, num_aleatorio;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Indica un numero del 1 al 10: "));
		
		// Restricciones del programa
		if(numero >= 11) {
			JOptionPane.showMessageDialog(null,"Numero no valido. No se pueden introducir numeros mayores a 10","MENSAJE DE ERROR",0); return;
		}else if(numero == 0) {
			JOptionPane.showMessageDialog(null,"El 0 no es valido.","MENSAJE DE ERROR",0); return;
		}else if(numero < 0) {
			JOptionPane.showMessageDialog(null,"Los numeros negativos no son validos.","MENSAJE DE ERROR",0); return;
		}
		
		
		// Programa Numero Aleatorio
		num_aleatorio = (int)(Math.random() * 10 + 1);
		JOptionPane.showMessageDialog(null,"El número aleatorio es: " + num_aleatorio);
		
		if(numero == num_aleatorio) {
			JOptionPane.showMessageDialog(null,"Has acertado!! \nEl numero que has introducido coincide con el numero aleatorio del programa.");
		}else {
			JOptionPane.showMessageDialog(null,"No has acertado. Tu numero no coincide con el del programa.");
		}
		
	}
}