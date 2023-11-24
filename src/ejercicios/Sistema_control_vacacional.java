package ejercicios;

import java.util.Scanner;

public class Sistema_control_vacacional {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String nombre = "";
   int clave = 0 , antiguedad = 0 ;
	
	System.out.println("Bienvenidos al sistema vacacional de cocacola company");
	System.out.println("¿Cual es tu nombre?");
   nombre = entrada.nextLine();
   
   System.out.println("¿Cuantos años de servicio tiene usted? ");
   antiguedad = entrada.nextInt();
   
   System.out.println("¿Cual es la clave de su departamento?");
   clave = entrada.nextInt();
   
   if( clave ==1 && antiguedad == 1 ){
	   System.out.println( nombre + " tiene derecho a 6 dias de vacaciones" );
	   
   }else if( clave ==1 && antiguedad >= 1 && antiguedad <= 6){
	   System.out.println( nombre + " tiene derecho a 14 dias de vacaciones" );
	   
   }else if( clave ==1 && antiguedad == 7 ){
	   System.out.println( nombre + " tiene derecho a 20 dias de vacaciones" );
	   
   }else if( clave ==2 && antiguedad == 1 ){
	   System.out.println( nombre + " tiene derecho a 7 dias de vacaciones" );
	   
   }else if( clave ==2 && antiguedad >=2 && antiguedad <=6 ){
	   System.out.println( nombre + " tiene derecho a 15 dias de vacaciones" );
	   
   }else if( clave ==2 && antiguedad == 7 ){
	   System.out.println( nombre + " tiene derecho a 22 dias de vacaciones" );
   
   }else if( clave ==3 && antiguedad == 1 ) {
	   System.out.println( nombre + " tiene derecho a 10 dias de vacaciones" );
   
   }else if( clave ==3 && antiguedad >=2 && antiguedad <= 6 ) {
	   System.out.println( nombre + " tiene derecho a 20 dias de vacaciones" );
   
   }else if( clave ==3 && antiguedad == 7 ) {
	   System.out.println( nombre + " tiene derecho a 30 dias de vacaciones" );
	   
   }else if( clave ==1 && antiguedad  >=8 ) {
	   System.out.println( nombre + " aun no tiene derecho a vacaciones" );
   
   }else if( clave == 2 && antiguedad >= 8 ) {
	   System.out.println( nombre + " aun no tiene derecho a vacaciones" );
   
   }else System.out.println( nombre + " aun no tiene derecho a vacaciones" );
 }	
}
