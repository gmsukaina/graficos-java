package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
   int aleatorio = (int)(Math.random()*100);
   int numero = 0;
   
    while(numero!=aleatorio) {
	   System.out.println("Introduzca un numero del 0 al 100");
	   numero = entrada.nextInt();
	   
	   if(aleatorio<numero) {
	   System.out.println("¡Mas bajo!!!");
	   
	   } else if(aleatorio>numero) {
		   System.out.println("¡Mas alto!!!");
		   
	   }  else {
	   System.out.println("Numero correcto,¡Felicidades!");
   
    }
   }
  }
 }

