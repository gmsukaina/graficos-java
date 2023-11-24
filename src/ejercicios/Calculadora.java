package ejercicios;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in);
  String nombre = "";
  int numUno = 0 , numDos = 0 , resultado = 0 ;

    System.out.println("¿Cual es tu nombre?");
  nombre = entrada.nextLine();

    System.out.println("Dame el primer valor para tu suma");
  numUno = entrada.nextInt();

    System.out.println("Dame el segundo valor para tu suma");
  numDos = entrada.nextInt();
  resultado= numUno + numDos ;

    System.out.println("Hola " + nombre + " el resultado de tu suma es : " + resultado );
   }
 }
