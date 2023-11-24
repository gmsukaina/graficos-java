package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	int numUno = 0 , numDos = 0 , resultado = 0 ;
	
	
	System.out.println("por favor, introduzca un numero");
	numUno = entrada.nextInt();
	
	System.out.println("por favor, introduzca otro numero");
	numDos = entrada.nextInt();
	
	System.out.println("Introduzca 1 si quiere que sea suma, 2 si quiere que sea resta, 3 si quiere que sea multiplicacion y 4 si quiere que sea division");
	 
	int parametro = entrada.nextInt();
	
	 switch (parametro){
	 
	 case 1 :
		 resultado = numUno + numDos ;
		 System.out.println("El resultado de la suma es : " + resultado );
	 break;
	 
	 case 2 :
		 	resultado = numUno - numDos ;
		 	System.out.println("El resultado de la resta es : " + resultado );
	 break;
	 
	 case 3 :resultado = 
		numUno * numDos ;
	 	System.out.println("El resultado de la multiplicacion es : " + resultado );
	 break;
	 
	 case 4 :
		 resultado = numUno / numDos ;
		 System.out.println("El resultado de la division es : " + resultado );
	 break;
	 
	 default: 
		 System.out.println("Error, esta opcion no existe, por favor no diga mas estupideces");
	 break;
	 }
   }
 }
