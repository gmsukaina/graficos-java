package ejercicio23;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date; 
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador2 {
 public static void main(String[] args) {
	 
	 Reloj mireloj = new Reloj();
	 
	 mireloj.en_marcha(3000,true);
	 
	 JOptionPane.showMessageDialog(null,"Pulsa Aceptar para terminar");
	 
	 System.exit(0);
	
    }
  }
  
  class Reloj {

	  
	  public void en_marcha( int intervalo, final boolean sonido) {
		  
	class Dame_hora2 implements ActionListener{
		 
		public void actionPerformed(ActionEvent evento) {
			
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 3 segundos");
		
		if (sonido) {
		Toolkit.getDefaultToolkit().beep();
		 }
		}
		
	}
		  
	 ActionListener oyente = new Dame_hora2();
	 
	 Timer mitemporizador = new Timer(intervalo,oyente);
	 
	 mitemporizador.start();
		  
	  }
	  
  }