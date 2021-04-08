package Herencia;

public class Mago extends Personaje {

	int Magia=0;
	
	public Mago() {
		this.Magia = 10;
		 System.out.println("**** Construyendo un Mago a las "+ d);
		 super.setVida(super.getVida() + 10 );
	}
	
	public int movimientoLucha () {
		int numero =(int) (Math.random()* Magia);
		
		
		System.out.println("VALOR DEL ATAQUE " + numero);
		System.out.println("\n********Magia*********");
	
		return numero;
	}

}
