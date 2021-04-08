package Tienda;

public class Tienda {

	double acamisa=0;
	double apantalon=0;
	double bcamisa=0;
	double bpantalon=0;
	int a=0;
	public double getAcamisa() {
		return acamisa;
	}
	public void setAcamisa(double acamisa) {
		this.acamisa = acamisa;
	}
	public double getApantalon() {
		return apantalon;
	}
	public void setApantalon(double apantalon) {
		this.apantalon = apantalon;
	}
	public double getBcamisa() {
		return bcamisa;
	}
	public void setBcamisa(double bcamisa) {
		this.bcamisa = bcamisa;
	}
	public double getBpantalon() {
		return bpantalon;
	}
	public void setBpantalon(double bpantalon) {
		this.bpantalon = bpantalon;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public void añadircamisa() {
		acamisa += getBcamisa();
		}
	public void añadirpantalon( ) {
		apantalon += getBpantalon();
	}
	public void quitarcamisa() {
		acamisa -= getBcamisa();
		}
	public void quitarpantalon( ) {
		apantalon -= getBpantalon();
	}
	
	public void clientes() {
		int clientes=0;
		int  clientecamisa= (int) Math.floor(acamisa);
		if(clientecamisa < 5) {
			System.out.println("Tenemos" + acamisa + " camisas ." +  "Es necesario hacer un pedido de camisas");
		 }
		
		else if(clientecamisa > 5 && clientecamisa < 10) {
			System.out.println("Tenemos" + acamisa + " camisas ." + "Proximamente será necesario hacer un pedido de camisas ");
		}
		else if(clientecamisa > 10) {
			System.out.println("Tenemos" + acamisa + " camisas ." +  "De momento no es necesario hacer pedido de camisas ");
		}
	}
	public void clientes2() {
		int  clientepantalon= (int) Math.floor(apantalon);
		if(clientepantalon < 5) {
			System.out.println("Tenemos" + apantalon + " pantalones ." +  "Es necesario hacer un pedido de pantalones");
		 }
		
		else if(clientepantalon > 5 && clientepantalon < 10) {
			System.out.println("Tenemos" + apantalon + " pantalones ." + "Proximamente será necesario hacer un pedido de pantalones ");
		}
		else if(clientepantalon > 10) {
			System.out.println("Tenemos" + apantalon + " pantalones ." +  "De momento no es necesario hacer pedido de pantalones ");
		}
	}
	
}
