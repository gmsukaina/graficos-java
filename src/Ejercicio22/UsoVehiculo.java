package Ejercicio22;


import javax.swing.JOptionPane;

public class UsoVehiculo {
public static void main(String[] args) {
	
	Coche coche = new Coche();
	
	System.out.println("Su coche ...");
	
	coche.establece_color(JOptionPane.showInputDialog
	("Introduzca el color del coche"));
	
	System.out.println( coche.dime_color());
	
	coche.dime_datos();
	
	System.out.println( coche.dime_datos());
	
	coche.establece_asientos(JOptionPane.showInputDialog
	("¿El coche tiene asientos de cuero?"));
	
	System.out.println( coche.dime_asientos());
	
	coche.establece_climatizador(JOptionPane.showInputDialog
	("¿El coche tiene climatizador?"));
	
	System.out.println( coche.dime_climatizador());
	
	System.out.println( coche.dime_peso_coche());
	
	System.out.println( "El precio del coche es : " +
	coche.coche_precio() + "$.");
	
	System.out.println("");
	
	System.out.println("Su furgoneta...");
	
	 Furgoneta furgoneta = new Furgoneta(7,580);
	 
	 furgoneta.establece_color(JOptionPane.showInputDialog
				("Introduzca el color de la furgoneta"));
	
	 furgoneta.dime_datos();
		
		System.out.println( furgoneta.dime_datos());
	 
		furgoneta.establece_asientos(JOptionPane.showInputDialog
				("¿La furgoneta tiene asientos de cuero?"));
				
				System.out.println( furgoneta.dime_asientos());
				
				furgoneta.establece_climatizador(JOptionPane.showInputDialog
				("¿La furgoneta tiene climatizador?"));
				
				System.out.println( furgoneta.dime_climatizador());
				
				System.out.println( furgoneta.dime_peso_coche());
				
				System.out.println( "El precio de la furgoneta es : " +
						furgoneta.coche_precio() + "$.");
				
	 
  }
 }




