package Ejercicio22;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean climatizador,asientos_cuero;
	


 public Coche() {
	 ruedas = 4;
	 largo = 2000;
	 ancho = 300;
	 motor = 1600;
	 peso_plataforma = 500;
	 
     }
    
    public String dime_datos() {
    	
    return "La plataforma del vehículo tiene " + ruedas + " ruedas."+
    " Mide " + largo/1000 + " metros con un ancho de " + ancho +
    " cm" + " con un motor de " + motor + " y un peso de "+
    peso_plataforma + " kg.";
  
     
     }
    
    public void establece_color(String color_coche) {
    	color = color_coche;
    }
       
    public String dime_color() {
    	return " Es de color " + color + ".";
    }
    
    public void establece_asientos(String asientos_cuero) {
    	
     if (asientos_cuero.equalsIgnoreCase("si")) {
      this.asientos_cuero=true;
      
     }else {
      this.asientos_cuero=false;
      
      
       }
     }
    
    public String dime_asientos() {
    	
    	if (asientos_cuero==true) {
    	return "El vehículo tiene asientos de cuero.";
    	
    	}else {
    	return "El vehículo tiene asientos de serie.";
    	}
      }
    
     public  void establece_climatizador(String climatizador) {
    	 if (climatizador.equalsIgnoreCase("si")) {
    	      this.climatizador=true;
    	      
    	     }else {
    	      this.asientos_cuero=false;
    	      
       } 
     }
     
     public String dime_climatizador() {
      if (climatizador==true) {
    	 return "El vehículo incorpora climatizador."; 
      }else {
    	 return "El vehículo incorpora aire acondicionado.";
      }
     }
     
     public String dime_peso_coche() {
    	 int peso_carroceria = 1000;
    	 peso_total = peso_total + peso_carroceria;
    		 
    	 if (asientos_cuero==true) {
    		peso_total = peso_total + 50;
    	 }
    	 
    	 if (climatizador==true) {
    		 peso_total = peso_total + 20;
    	 }
    	 
    	 return "El peso total del vehículo es " + 
    	 peso_total + "kg.";
    	 
    	 }
      public int coche_precio() {
    	  int precio_final = 10000;
    	  
    	  if (asientos_cuero==true) {
    		precio_final+=2000;  
    	  }
    	  
    	  if (climatizador==true) {
      		precio_final+=1500;
      }
     return precio_final;
     }
   }
    
     
     
     
      
    
     