package gráficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.*;


public class Trabajando_colores {

	public static void main(String[] args) {
		
		MarcoConColores mimarco = new MarcoConColores();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
 }
 
 class MarcoConColores extends JFrame{
	 
	public MarcoConColores() {
		
	setTitle("Prueba con colores");
	
	setSize(1000,750);
	
	LaminaConColor milamina = new LaminaConColor();
	
	add(milamina);
		
	 }
 }
  
 class LaminaConColor extends JPanel{
	 
	 public void paintComponent(Graphics g){
		 
	 super.paintComponent(g);
	 
	 Graphics2D g2 = (Graphics2D) g;
	 
	 Rectangle2D rectangulo = new Rectangle2D.Double(100,65,700,400);
	 
	 g2.setColor(new Color(253,222,238));
	 
	 g2.fill(rectangulo);
	   
      Ellipse2D elipse = new Ellipse2D.Double();
      
      elipse.setFrame(rectangulo);
     
      g2.setColor(new Color(179,226,221));
      
      g2.fill(elipse);
      
    }
  }