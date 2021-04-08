package Restaurante;
/**
 * @author :Angel Garcia
 * @version : 10.0
 **/

public class Restaurante {
	double apapa=0;
	double achoco=0;
	double bpapa=0;
	double bchoco=0;
	double clientes=0;
	int a=0;
	
	
	
	//Declaracion de todos los getter y setters necesarios 
	public double getClientes() {
		return clientes;
	}
	public void setClientes(double clientes) {
		this.clientes = clientes;
	}
	public double getApapa() {
		return apapa;
	}
	public void setApapa(double apapa) {
		this.apapa = apapa;
	}
	public double getAchoco() {
		return achoco;
	}
	public void setAchoco(double achoco) {
		this.achoco = achoco;
	}
	public double getBpapa() {
		return bpapa;
	}
	public void setBpapa(double bpapa) {
		this.bpapa = bpapa;
	}
	public double getBchoco() {
		return bchoco;
	}
	public void setBchoco(double bchoco) {
		this.bchoco = bchoco;
	}
	public void setClientes(int clientes) {
		this.clientes = clientes;
	}
	//metodo añadir papas lo que hace es que las papas que te has puesto antes las suma a las que habia en el almacen
	public void añadirpapas() {
		apapa += getBpapa();
		}
	//metodo añadirchocos es igual que el metodo añadir papas
	public void añadirchoco( ) {
		achoco += getBchoco();
	}
	//metodo quitarpapas es un metodo que resta las que habia en el almacen menos las que se han puesto malas
	public void quitarpapas() {
		apapa -= getBpapa();
		}
	//metodo quitarchocos es igual que quitarpapas
	public void quitarchoco( ) {
		achoco -= getBchoco();
	}
	
	
	/**
	 * metodo clientes
	 * declaro clientes
	 * paso a entero el valor de choco
	 * paso a entero el valor de papas
	 * si tengo mas papas que chocos
	 * los clientes papas los multiplico por 4 para saber a cuantos clientes puedo atender
	 * muestro la cantidad de clientes que puede atender
	 */
	public void clientes() {
		int clientes=0;
		int  clientechocos= (int) Math.floor(achoco);
		int  clientepapas= (int) Math.floor(apapa);
		if(clientepapas > clientechocos) {
			clientes=clientepapas * 4; 
			System.out.println(clientes + " Clientes");
		 }
		
		/**
		 * la otra decision es si papas es menor o igual que chocos
		 * lo clientes de choco los multiplico por 4 para sacar el numero de clientes 
		 * muestro la cantidad de clientes que puedo atender con los chocos
		 */
		else if(clientepapas <= clientechocos) {
			clientes=clientechocos * 4;//
			System.out.println(clientes + "Clientes");
		}
	}/**
	*Acaba
	*/
	
}
