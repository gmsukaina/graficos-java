package ejercicio23;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Temporizador {
	public static void main(String[] args) {
		
	Dame_hora oyente = new Dame_hora();
		
	Timer mi_temporizador=new Timer(5000,oyente);	
		
	mi_temporizador.start();
	
	JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
	System.exit(0);
	}
  }
