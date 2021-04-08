package Peso;

public class Peso {
	
	double kilos= 0;
	int elec=0;
	

	public double getKilos() {
		return kilos;
	}



	public void setKilos(double kilos) {
		this.kilos = kilos;
	}



	public int getElec() {
		return elec;
	}



	public void setElec(int elec) {
		this.elec = elec;
	}

	Peso(double Kilos, int Elec){
		kilos=Kilos;
		elec=Elec;
	}
	
	public void operaciones(int operacion) {
	if(operacion==1){
		double libras = (getKilos() * 2.20462);
		System.out.println(libras);
	}
	else if(operacion==2) {
		double lingotes = (getKilos() * 14.59);
		System.out.println(lingotes);
	}
	else if(operacion==3){
		double onzas = (getKilos() * 35.274);
		System.out.println(onzas);
	}
	else if(operacion==4){
		double peniques = (getKilos() * 645.16);
		System.out.println(peniques);
	}
	else if(operacion==5){
		double gramos = (getKilos() * 1000);
		System.out.println(gramos);
	}
	else if(operacion==6){
		double quintales = (getKilos() / 43.3);
		System.out.println(quintales);
	}
	else if(operacion==7){
		System.out.println("Adios");
	}
	else {
		System.out.println("Opción errónea");
	}
	}
}
