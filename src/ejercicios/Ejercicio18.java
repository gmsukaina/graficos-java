package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	int numero = 0, lado = 0,areaCuadrado=0;
	int base = 0, altura= 0 , areaRectangulo=0;
	int base2 = 0, altura2= 0, areaTriangulo =0;
	
	
	System.out.println("¿De que figura desea obtener el area? : 1: cuadrado  2: rectangulo  3: triangulo");
	numero = entrada.nextInt();
	
	switch(numero) {
	case 1 :
	 System.out.println("Introduzca la medida del lado del cuadrado");
	 lado = entrada.nextInt();
	 areaCuadrado=lado*lado;
	 
	 System.out.println("El area del cuadrado es "+ areaCuadrado);
	  break;
	  
	case 2 :
		 System.out.println("Introduzca la medida de la base del rectangulo");
		 base = entrada.nextInt();
		 
		 System.out.println("Introduzca la altura del rectangulo");
		 altura= entrada.nextInt();
		 
		 areaRectangulo= base*altura;
		 
		 System.out.println("El area del triangulo es "+ areaRectangulo);
		 
		  break;
		  
	case 3 :
		System.out.println("Introduzca la medida de la base del triangulo");
		 base2 = entrada.nextInt();
		 
		 System.out.println("Introduzca la medida de la altura del triangulo");
		 altura2 = entrada.nextInt();
		 
		 areaTriangulo= base2*altura2/2;
		 
		 System.out.println("El area del cuadrado es "+ areaTriangulo);
		  break;
		  
		  
		  
       }
     }
   }
