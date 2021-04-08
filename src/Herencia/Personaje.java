package Herencia;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Personaje {
     private int vida;
     Date d = new Date();
     GregorianCalendar c = new GregorianCalendar();
     
    
     
	public Personaje() {
		this.vida = 100;
		 c.setTime(d);
	    
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public abstract int movimientoLucha();
	
	public static void main(String[] args) {
		guerrero hol=new guerrero ();
		Mago hola=new Mago ();
		hol.movimientoLucha();
		hola.movimientoLucha();
	}

	

}
