package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
 public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
   
	 int contador = 1, filas = 0, columnas = 0;
     
	 System.out.println("Inserte el numero de filas que desee ");
	 filas = entrada.nextInt();
	 
	 System.out.println("Inserte el numero de columnas que desee ");
	 columnas = entrada.nextInt();
	 
	 int numeros [][] = new int [filas][columnas];
	 
	 Random random = new Random();
	 for( int j = 0 ; j <filas; j++ ) {
		 for (int i = 0
				; i <columnas; i++) {
			 numeros [j][i]= contador;
			 contador++;
			 System.out.print("[" + numeros [j][i] + "]" +" ");
		 }
		 System.out.println("");
	
    }
   }
 }