package Practica2;

import java.util.InputMismatchException;
import java.util.Scanner;

import Restaurante.Restaurante;

public class Practica2Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Practica2 r1 = new Practica2();
		int a=0;
		int b=0;
		int e=0; 
		int c=0;
		
		double t=0;
		double l=0;
		double m=0;
		double n=0;
		double f=0;
		double ba=0;
		double al=0;
		double l1=0;
		double l2=0;
		double l3=0;
		double r=0;

		double pi=3.14;
		
		
		
		System.out.println("1.Figuras geomatricas");
		System.out.println("2.Operaciones matematicas");
		a=s.nextInt();
		
		switch(a) {
		case 1:
		System.out.println("1.Cuadrado");
		System.out.println("2.Triangulo");
		System.out.println("3.Circulo");
		b=s.nextInt();
		switch(b){
				case 1:
				System.out.println("Elige una opción");
				System.out.println("1.Calculo de area");
				System.out.println("2.Calculo del perimetro");
				c=s.nextInt();
					switch(c) {
					case 1:
						System.out.println("Introduce la medida del lado");
						r1.setL(s.nextDouble());
						r1.areacuadrado();
						break;
					case 2:
						System.out.println("Introduce la medida del lado");
						r1.setL(s.nextDouble());
						r1.pcuadrado();
						break;
						}
						break;
				case 2:
					System.out.println("Elige una opción");
					System.out.println("1.Calculo de area");
					System.out.println("2.Calculo del perimetro");
					c=s.nextInt();
					
					switch(c){
					case 1:
						System.out.println("Introduce la medida de la base");
						r1.setBa(s.nextDouble());
						System.out.println("Introduce la medida de la altura");
						r1.setAl(s.nextDouble());
						r1.areacuadrado();
						break;
					case 2:
						System.out.println("Introduce la medida de el lado");
						r1.setL1(s.nextDouble());
						System.out.println("Introduce la medida de otro lado");
						r1.setL2(s.nextDouble());
						System.out.println("Introduce la medida de otro lado");
						r1.setL3(s.nextDouble());
						r1.pcuadrado();
						break;
					
						}
					break;
						
						
					case 3:
						System.out.println("Elige una opcion");
						System.out.println("1.Calculo de area");
						System.out.println("2.Calculo del perimetro");
						c=s.nextInt();
							switch(c) {
							case 1:
								System.out.println("Introduce la medida del radio");
								r1.setR(s.nextDouble());
								r1.areaciruclo();
								break;
							case 2:
								System.out.println("Introduce la medida del radio");
								r1.setR(s.nextDouble());
								r1.pcirculo();
							break;
						}
					break;
				
				}
		
		
		break;
		
		case 2:
			System.out.println("1.Mayor o menor");
			System.out.println("2. Elevar un número");
			a=s.nextInt();
			switch(a) {
				case 1:
				
				System.out.println("Introduzca un número");
	
				l=s.nextDouble();
	
				System.out.println("Introduzca el siguiente número");
	
				m=s.nextDouble();
	
				System.out.println("Introduzca el siguiente número");
	
				n=s.nextDouble();
				r1.mayormenor();
				break;
				
				case 2:
					System.out.println("Introduzca la base");

					b=s.nextInt();

					System.out.println("Introduzca el exponente");

					e=s.nextInt();
					r1.elevar();
					
					break;
				}

		
	
				

			break;
		
		
		}
		
		
	
	}

}
