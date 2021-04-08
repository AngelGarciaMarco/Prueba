package Tienda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TiendaMain {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		Tienda r1 = new Tienda();
		double acamisa=0;
		double apantalon=0;
		double bcamisa=0;
		double bpantalon=0;
		int clientes=0;
		int cliente2=0;
		int a=0;
		
		do {
		
		try {
			
			System.out.println("Que desea hacer");
			System.out.println("1)Añadir camisas");
			System.out.println("2)Añadir pantalones");
			System.out.println("3)Vender camisas");
			System.out.println("4)Vender pantalon");
			System.out.println("5)Comprobar stock de camisas");
			System.out.println("6)Comprobar stock de pantalones");
			a=entrada.nextInt();
			
		
		switch(a) {
		case 1:
		System.out.println("Tenemos " + acamisa + " camisas en el almacen");
		System.out.println("¿Cuantas camisas quieres añadir?");
		r1.setBcamisa(entrada.nextDouble());
		r1.añadircamisa();
		System.out.println("Tenemos " + r1.getAcamisa() + " camisas en el almacen");
		r1.getAcamisa();
		
		break;
		
		case 2:
		System.out.println("Tenemos " + apantalon + " pantalones en el almacen");
		System.out.println("¿Cuantos pantalones quieres añadir?");
		r1.setBpantalon(entrada.nextDouble());
		r1.añadirpantalon();
		System.out.println("Tenemos " + r1.getApantalon() + " pantalones en el almacen");
		
		break;
		
		case 3:
		System.out.println("Cuantas camisas se han vendido");
		r1.setBcamisa(entrada.nextDouble());
		r1.quitarcamisa();
		System.out.println("Tenemos " + r1.getAcamisa() + " camisas en el almacen");
		
		break;
		
		case 4:
		System.out.println("Cuantos pantalones se han vendido");
		r1.setBpantalon(entrada.nextDouble());
		r1.quitarpantalon();
		System.out.println("Tenemos " + r1.getApantalon() + " pantalones en el almacen");
		break;
		
		case 5:
		r1.clientes();
		
		break;
		case 6:
			r1.clientes2();
			break;
		default:
			System.out.println("Error");
			break;
		}
		
		}catch(InputMismatchException e) {
			entrada.nextLine();System.out.println("No esta permitido poner letras");
		}
		
		}while(a!=6);
		

	}

}
