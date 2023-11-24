package gráficos;

import java.awt.Frame;

import javax.swing.*;

public class Creando_vantana {
 public static void main(String[] args) {
	
	Mimarco marco1 = new Mimarco();
	 
	marco1.setVisible(true);
	
	marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }
  }
 
 class Mimarco extends JFrame{
	 
	public Mimarco() {
		
	setSize(900,600);
	
	setLocation(500,300);
	
	setTitle("LA VENTANA DE SUKAINA");
	
	 }
   }
