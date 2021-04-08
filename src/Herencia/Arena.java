package Herencia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arena {
	public static void lucha(guerrero g, Mago m,  int danoValor, Integer danoReferencia) {
		int danomago=m.movimientoLucha();
		int danoguerrero=g.movimientoLucha();
		  g.setVida( g.getVida() - danomago); 
		  m.setVida( m.getVida() - danoguerrero);
		  danoValor=(danomago + danoguerrero);
		  danoReferencia=danoValor;
		}
	public static void lucha(GuerreroFuerte gf, Mago m,  int danoValor, Integer danoReferencia) {
		int danomago=m.movimientoLucha();
		int danoguerrero=gf.movimientoLucha();
		  gf.setVida( gf.getVida() - danomago); 
		  m.setVida( m.getVida() - danoguerrero);
		  danoValor=(danomago + danoguerrero);
		  danoReferencia=danoValor;
		}

	public static void main(String[] args) {
		
		 int danoValor=0;
		 Integer danoReferencia=0;
		 Scanner s=new Scanner(System.in);
		 int a=0;
		 
		final GuerreroFuerte gf= new GuerreroFuerte();
		System.out.println("La vida del guerrero fuerte : " + gf.getVida());
		System.out.println("\n");
		
		final guerrero g = new guerrero();
		System.out.println("La vida del guerrero es : " + g.getVida());
	
		System.out.println("\n");
		final Mago m = new Mago();
		System.out.println("La vida del mago es : " + m.getVida());
		
		System.out.println("\n");
		
		do {
		try {
		System.out.println("Quien quieres que luchen, escribe un número del 1 al 4");
		System.out.println("1)Guerrero vs Mago");
		System.out.println("2)Guerrero Fuerte vs Mago");
		System.out.println("3)Guerrero Flojo vs Mago");
		System.out.println("4)Acaba el programa");
		a=s.nextInt();
		
		if(a==1&&m.getVida()>=0&&g.getVida()>=0) {
			lucha(g, m, danoValor, danoReferencia);
			
			System.out.println("la vida del guerrero es : " + g.getVida());
			System.out.println("la vida del mago es : " + m.getVida());
			System.out.println("DañoValor : " + danoValor);
			System.out.println("DañoReferencia : " + danoReferencia);
		}
		else if(a==2&&m.getVida()>=0&&gf.getVida()>=0) {
			lucha(gf, m, danoValor, danoReferencia);
			
			System.out.println("la vida del guerrero fuerte es : " + gf.getVida());
			System.out.println("la vida del mago es : " + m.getVida());
			System.out.println("DañoValor : " + danoValor);
			System.out.println("DañoReferencia : " + danoReferencia);
		}
		else if(a==3) {
			guerrero guerreroflojo = (guerrero) gf;
			
			lucha(guerreroflojo, m, danoValor, danoReferencia);
			
			System.out.println("la vida del guerrero flojo es : " + guerreroflojo.getVida());
			System.out.println("la vida del mago es : " + m.getVida());
			
			
		}
		else if(a==1||a==2||a==3&&m.getVida()<=0) {
			System.out.println("Ha muerto el mago");
			System.out.println("No puedes jugar");
		a = 4;
			
		}
		else if(a==4) {
			System.out.println("El juego ha acabado");
		}
		
		}catch(InputMismatchException e) {
			s.nextLine();System.out.println("No esta permitido poner letras");
		}
		
		}while(a!=4);
	}

	

}
