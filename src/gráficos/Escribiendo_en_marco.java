package gráficos;

import javax.swing.*;
import java.awt.*;

public class Escribiendo_en_marco {
public static void main(String[] args) {
	
   MarcoConTexto mimarco = new MarcoConTexto();
   
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }
  }

  class MarcoConTexto extends JFrame{
	  
	 public MarcoConTexto() {
		 
	setVisible(true);
	
	setSize(900,600);
	
	setLocation(600,200);
	
	setTitle("¡Primer texto!!!");
	
	Lamina mi_lamina = new Lamina();
	
	add(mi_lamina);
		 
	  } 
   }
  
  class Lamina extends JPanel{
	  
	public void paintComponent(Graphics g){
		
	 super.paintComponent(g);
		
	g.drawString("Estoy aprendiendo Swing",100,100);	
		
	 }  
   }
