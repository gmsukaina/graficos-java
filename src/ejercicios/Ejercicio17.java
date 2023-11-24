package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio17 {
 public static void main(String[] args) {
	
	 String nombre = "";
	 nombre = JOptionPane.showInputDialog("Introduzca su nombre");
	 
	 String edad = "";
	 edad = JOptionPane.showInputDialog("Introduzca su edad");
	 
	 System.out.println("Hola " + nombre + ",tienes " + edad + " años.");	 
   }
 }
