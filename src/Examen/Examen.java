package Examen;

public class Examen {
	private String opcion1;
	private String opcion2;
	private String opcion3;
	private String opcion4;
	private int numero=0;
	
	public String getOpcion1() {
		return opcion1;
	}
	public void setOpcion1(String opcion1) {
		this.opcion1 = opcion1;
	}
	public String getOpcion2() {
		return opcion2;
	}
	public void setOpcion2(String opcion2) {
		this.opcion2 = opcion2;
	}
	public String getOpcion3() {
		return opcion3;
	}
	public void setOpcion3(String opcion3) {
		this.opcion3 = opcion3;
	}
	public String getOpcion4() {
		return opcion4;
	}
	public void setOpcion4(String opcion4) {
		this.opcion4 = opcion4;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Examen (String o1, String o2, String o3,String o4, int n) {
		this.opcion1=o1;
		this.opcion2=o2;
		this.opcion3=o3;
		this.opcion4=o4;
		this.numero=n;
		
	}
	

}
