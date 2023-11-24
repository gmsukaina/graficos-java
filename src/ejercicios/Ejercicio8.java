package ejercicios;

public class Ejercicio8 {
 public static void main(String[] args) {
	double horas = 1200;
	double salarioHora = 6.5;
	double impuestos = 25;
	
	double dineroBruto = horas * salarioHora;
	
	double dineroNeto = dineroBruto - ( dineroBruto * impuestos / 100 );
			
	System.out.println("Aqui tienes tu dinero neto : " + dineroNeto);
			
}
}
