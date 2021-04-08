package Herencia;

public class guerrero extends Personaje {
	
	 protected int ataque;

	public guerrero() {
		
		this.ataque = 10;
		 System.out.println("**** Construyendo un Guerrero a las "+ d);
	}
	
	public int movimientoLucha () {
		int numero =(int) (Math.random()* ataque);
		
		
		System.out.println("VALOR DEL ATAQUE " + numero);
		System.out.println("\n********ESPADAZO*********");
		
		return numero;

	}
	
	
	
	
	 
	 

}
