package gráficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Prueba_dibujo {
public static void main(String[] args) {

	MarcoConDibujos mimarco = new MarcoConDibujos(); 
	
	mimarco.setVisible(true);
	
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
    }
  }
 class MarcoConDibujos extends JFrame{
	 
	public MarcoConDibujos() {
		
	setTitle("Prueba de dibujo");
	
	setSize(1000,750);
	
	LaminaConFiguras milamina = new LaminaConFiguras();
	
	add(milamina);
		
	}
  }
 
 class LaminaConFiguras extends JPanel{
	 
	public void paintComponent(Graphics g) {
	
	super.paintComponent(g);
	
	   Graphics2D g2 = (Graphics2D) g;
	   
	   Rectangle2D rectangulo = new Rectangle2D.Double(100,65,700,400);
	   
	   g2.draw(rectangulo);
	    
	   Ellipse2D elipse = new Ellipse2D.Double();
	   
	   elipse.setFrame(rectangulo);
	   
	   g2.draw(elipse);
	   
	   g2.draw(new Line2D.Double(100,65,800,460));
	   
	  
	   
	  } 
    }

 
 
  