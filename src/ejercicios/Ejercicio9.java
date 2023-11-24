package ejercicios;

import java.util.Scanner;

  public class Ejercicio9 {
  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	String nombre = "";
	String nombreDos = "";
	
	System.out.println("Hola,introduzca un nombre");
	nombre = entrada.nextLine();
	
	System.out.println("Introduzca otro nombre (puede ser el mismo) ");
	nombreDos = entrada.nextLine();
	
	if (nombre.equals (nombreDos)) {
		System.out.println("Los nombres son iguales");
		
	}else 
		System.out.println(nombre + " y " + nombreDos + " no es lo mismo");
		
	  }
	}
  
  
  
  

