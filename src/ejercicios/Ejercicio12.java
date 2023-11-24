package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
 public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	String cadenaTexto = "" , substraccion = "";
	int desde = 0 , hasta = 0 , numCaracteres = 0 ;
	
	System.out.println("Introduzca  una cadena de texto");
	cadenaTexto = entrada.nextLine();
	
	numCaracteres = cadenaTexto.length();
	
	System.out.println("La cadena de texto posee " + numCaracteres + " caracteres");
	
	System.out.println("Desde que caracter desea obtener la nueva cadena de texto");
	desde = entrada.nextInt();
	
	System.out.println("Hasta que caracter desea obtener la nueva cadena de texto");
	hasta = entrada.nextInt();
	
	substraccion = cadenaTexto.substring ( desde,hasta);
	
	System.out.println("Su nueva cadena de texto es " + cadenaTexto);
  }
 }
