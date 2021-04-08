package Peso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PesoMain {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double kilos= 0;
		int elec=0;
		
		do {
		System.out.println("Introduce un peso en kilos");
		try {
		kilos=entrada.nextDouble();
		
		Peso r1 = new Peso(kilos, elec);
		System.out.println("A que lo quieres pasar");
		System.out.println("1)Libras");
		System.out.println("2)Lingotes");
		System.out.println("3)Onzas");
		System.out.println("4)Peniques");
		System.out.println("5)Gramos");
		System.out.println("6)Quintales");
		System.out.println("7)Finalizar");
		
		elec=entrada.nextInt();
		
		r1.operaciones(elec);
		}catch(InputMismatchException e) {
			entrada.nextLine();System.out.println("No esta permitido poner letras");
		}
	}while(elec!=7);
	}

}
