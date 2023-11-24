package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int numeroPosiciones = 0 ;
	
	System.out.println(" Ingrese el numero de posiciones que desee  ");
	numeroPosiciones = entrada.nextInt();
	
	int[] numeros = new int [numeroPosiciones];
	
	Random random = new Random();
	
	for (int i = 0 ; i<numeros.length; i++) {
		numeros[i] = random.nextInt(50+1);
	}
	
	for( int numero : numeros) {
		System.out.println(numero);
	}
}
}
