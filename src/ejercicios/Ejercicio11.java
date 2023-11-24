package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	String nombre = "";
	
	System.out.println("Hola, por favor, insetre su nombre ");
	nombre = entrada.nextLine();
	
	if ( nombre.equals ("sukaina") ) {
		System.out.println("Eres guapa, inteligente, ... ¡Sigue asi!!");
		
    }else if ( nombre.equals ("abdullah") ) {
		System.out.println("Eres muy inteligente, pero deberias utilizar menos abduzcan");
	
     }else if ( nombre.equals ("abu") ) {
		System.out.println("Eres feo, pero serias menos feo si fueras mas inteligente");
		
  }else
	  System.out.println("No se quien es usted");
  }
  }