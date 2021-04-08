package Herencia;

  
 public class GuerreroFuerte extends guerrero {
	
	
	public GuerreroFuerte() {
		
		 System.out.println("**** Construyendo un Guerrero Fuerte a las "+ d);
	}

	public int movimientoLucha () {
		int numero =(int) ((Math.random()* ataque) + 5);
		
		
		System.out.println("VALOR DEL ATAQUE " + numero);
		System.out.println("\n********ESPADAZO Fuerte*********");
		
		return numero;
		
	

	}
}



