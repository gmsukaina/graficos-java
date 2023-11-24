package ejercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String clave="sukaina";
		String clave2="";
		
		while(clave.equals(clave2)==false) {
				
		clave2 =JOptionPane.showInputDialog("Introduza la contraseña");
		
		if(clave.equals(clave2)==false) {
		System.out.println("Contraseña incorrecta");
		
		
	}else {
		System.out.println("Contraseña correcta , acceso permitido");
     } 
   }
  }  
}
