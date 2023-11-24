package ejercicio23;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Dame_hora implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
	Date ahora = new Date();	
	
	System.out.println("Te pongo la hora cada 5 segundos:" + ahora);
		
	Toolkit.getDefaultToolkit().beep();
	
	 }
   }
