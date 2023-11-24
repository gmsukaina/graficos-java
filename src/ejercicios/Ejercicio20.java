package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
 public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	double radio = 0, resultado=0;
	
	System.out.println("Para obtener el área del círculo introduzca su radio");
	radio = entrada.nextInt();
	 resultado = (Math.PI*(radio * 2));

	System.out.println("El área del círculo es " + resultado);
	
	
	
	
      }
    }
