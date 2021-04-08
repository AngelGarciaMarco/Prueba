package Minumero;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MinumueroMain {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double numero=0;
		int multi=0;
		do {
		System.out.println("Dime el número con el que quieres operar");
		try {
		numero=entrada.nextDouble();
		
		System.out.println("Y que quieres hacer con el");
		System.out.println("1) El doble");
		System.out.println("2) El triple");
		System.out.println("3) El cuadruple");
		System.out.println("4) Finalizar");
		
		multi=entrada.nextInt(); 
		
		
		Minumero r1 = new Minumero(numero, multi);
		switch(multi) {
		case 1:
			r1.doble();
			break;
		case 2:
			r1.triple();
			break;
		case 3:
			r1.cuadra();
			break;
		case 4:
			System.out.println("Finalizar");
			break;
			default:
				System.out.println("Error");
				break;
		
		}
		}catch(InputMismatchException e) { 
			entrada.nextLine();System.out.println("No esta permitido poner letras");
		}
	}while(multi!=4);

		
	}

	
}
