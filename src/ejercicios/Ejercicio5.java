package ejercicios;

import java.util.Scanner;

public class Ejercicio5{
	public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in);
  int numero = 0;
  int numero2 = 0;
    System.out.println("Hola, bienvenido al programa Sukaina,por favor inserte un 1 o 2");
   numero = entrada.nextInt();
 
   if(numero==1) {
	System.out.println("Elija un numero de estos; 1, 3, 5");
	
   }else if(numero >=3) {
	   System.out.println("he dicho 1 o 2");
	
	numero2 = entrada.nextInt();
    } else 
    	System.out.println("Elija un numero de estos: 2, 4, 6");
   numero2 = entrada.nextInt();
   
   if(numero2 == 1) {
	   System.out.println("eres guapo");
	   
   }else  if(numero2 == 2) {
	   System.out.println("eres feo");
	   
   } else if(numero2 == 3) {
	   System.out.println("eres inteligente");
	   
    }else  if(numero2 == 4) {
 	   System.out.println("eres imbecil");
 	   
    }else  if(numero2 == 5) {
 	   System.out.println("eres calvo");
 	   
    }else  if(numero2 == 1) {
 	   System.out.println("eres hermoso");
     
}
}
}