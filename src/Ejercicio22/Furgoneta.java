package Ejercicio22;

public class Furgoneta extends Coche {

	private int capacidad_carga;
	private int plazas_extras;
	
	public Furgoneta(int plazas_extras, int capacidad_carga	) {
		
	super();
	
	  this.capacidad_carga=capacidad_carga;
	  this.plazas_extras=plazas_extras;
		
	}
		public String dime_datos_furgoneta() {
			return "La capacidad de carga es " + capacidad_carga + " y las plazas son " + 
		plazas_extras ;
		}
		
		
	}
   
