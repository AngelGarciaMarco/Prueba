package Minumero;

public class Minumero {
	
	double numero=0;
	int multi=0;
	
	Minumero(double Numero, int Multi){
		numero=Numero;
		multi=Multi;
		
	}
	
	public void doble() {
		double doble = (numero * 2);
		System.out.println(doble);
	}
	
	public void triple() {
		double triple = (numero * 3);
		System.out.println(triple);
	}
	
	
	public void cuadra() {
		double cuadra = (numero * 4);
		System.out.println(cuadra);
	}
	
}
