import java.util.Scanner;
import java.util.InputMismatchException;
public class Practica2a {

	public static void main(String[] args) {
    
		Scanner s=new Scanner(System.in);

		boolean bo=false;

		int a=0;
		int b=0;
		int e=0; 
		int r=0;

		double t=0;
		double l=0;
		double m=0;
		double n=0;
		double f=0;

		double pi=3.14;
		
		
		while(!bo) {
			try{

			System.out.println("1. Figuras geométricas");

			System.out.println("2. Operaciones matemáticas");

			a=s.nextInt();
			
			switch(a) {

			case 1:
				System.out.println("1. Cuadrado");

				System.out.println("2. Triángulo");

				System.out.println("3. Círculo");

				a=s.nextInt();

					switch(a) {

					case 1:

						System.out.println("1. Cálculo del área");

						System.out.println("2. Cálculo del perímetro");

						a=s.nextInt();

							switch(a) {

							case 1:

								System.out.println("Introduzca la medida de un lado");

								n=s.nextDouble();

								f=n*n;

								System.out.println("El área del cuadrado es: "+f);

								System.out.println("¿Desea salir del programa?");

								System.out.println("1. SI");

								System.out.println("2. NO");

								a=s.nextInt();

								switch(a){

								case 1:

									bo=true;

									break;

								case 2:

									break;

								}

								break;

							case 2:

								System.out.println("Introduzca la medida de un lado");

								n=s.nextDouble();

								f=n*4;

								System.out.println("El perímetro del cuadrado es: "+f);

								System.out.println("¿Desea salir del programa?");

								System.out.println("1. SI");

								System.out.println("2. NO");

								a=s.nextInt();

								switch(a){

								case 1:

									bo=true;

									break;

								case 2:

									break;

								}

								break;

							default:

								System.out.println("Sólo números del 1 al 2"+"\n");

								break;

							}

						break;

					case 2:

						System.out.println("1. Cálculo del área");

						System.out.println("2. Cálculo del perímetro");

						a=s.nextInt();

						switch(a) {

						case 1:

							System.out.println("Introduzca la medida de la base");

							l=s.nextDouble();

							System.out.println("Introduzca la medida de la altura");

							m=s.nextDouble();

							f=(l*m)/2;

							System.out.println("El área del triángulo es: "+f);

							System.out.println("¿Desea salir del programa?");

							System.out.println("1. SI");

							System.out.println("2. NO");

							a=s.nextInt();

							switch(a){

							case 1:

								bo=true;

								break;

							case 2:

								break;

							}

							break;

						case 2:

							System.out.println("Introduzca la medida de un lado");

							l=s.nextDouble();

							System.out.println("Introduzca la medida de otro lado");

							m=s.nextDouble();

							System.out.println("Introduzca la medida de otro lado");

							n=s.nextDouble();

							f=l+n+m;

							System.out.println("El perímetro del triángulo es: "+f);

							System.out.println("¿Desea salir del programa?");

							System.out.println("1. SI");

							System.out.println("2. NO");

							a=s.nextInt();

							switch(a){

							case 1:

								bo=true;

								break;

							case 2:

								break;

							}

							break;

						}

					break;

					case 3:

						System.out.println("1) Cálculo del área");

						System.out.println("2) Cálculo del perímetro");

						a=s.nextInt();

						switch(a) {

						case 1:

							System.out.println("Introduzca la medida del radio");

							n=s.nextDouble();

							f=pi*n*n;

							System.out.println("El área del círculo es: "+f+"\n");

							break;

						case 2:

							System.out.println("Introduzca la medida del radio");

							n=s.nextDouble();

							f=2*pi*n;

							System.out.println("El perímetro de la circunferencia es: "+t+"\n");

							break;

						}

						System.out.println("¿Desea salir del programa?");

						System.out.println("1) SI");

						System.out.println("2) NO");

						a=s.nextInt();

						switch(a){

						case 1:

							bo=true;

							break;

						case 2:

							break;

						}

						break;

					default:

						System.out.println("Solo números del 1 al 3");

						break;

					}

				break;

			case 2:

				System.out.println("1) Mayor o menor");

				System.out.println("2) Elevar un número");

				a=s.nextInt();

				switch(a) {

				case 1:

					System.out.println("Introduzca un número");

					l=s.nextDouble();

					System.out.println("Introduzca el siguiente número");

					m=s.nextDouble();

					System.out.println("Introduzca el siguiente número");

					n=s.nextDouble();

					if(l>m && m>n) {

						System.out.println("El orden sería: "+l+">"+m+">"+n+"\n");

					}
					else if(l>n && n>m){
						System.out.println("El orden sería: "+l+">"+n+">"+m+"\n");

					}
					else if(m>l && l>n){

						System.out.println("El orden sería: "+m+">"+l+">"+n+"\n");

					}

					else if(m>n && n>l){

						System.out.println("El orden sería: "+m+">"+n+">"+l+"\n");

					}

					else {

						System.out.println("El orden sería: "+n+">"+m+">"+l+"\n");

					}

					System.out.println("¿Desea salir del programa?");

					System.out.println("1) SI");

					System.out.println("2) NO");

					a=s.nextInt();

					switch(a){

					case 1:

						bo=true;

						break;

					case 2:

						break;

					}

					break;

				case 2:

					System.out.println("Introduzca la base");

					b=s.nextInt();

					System.out.println("Introduzca el exponente");

					e=s.nextInt();

					r=1;

						if(e>=0){

							for(int i=1; i<=e; i++){

								r=r*b;	

							}

							System.out.println("El número "+b+" elevado a "+e+" es: "+r+"\n");

						}

						else {

							System.out.println("Solo números positivos y enteros"+"\n");

						}

					System.out.println("¿Desea salir del programa?");

					System.out.println("1) SI");

					System.out.println("2) NO");

					a=s.nextInt();

					switch(a){

					case 1:

						bo=true;

						break;

					case 2:

						break;

					}

					break;

					}

				break;
				
				
			default:

				System.out.println("Sólo números del 1 al 2");

				break;
			}} catch(Exception e2) {
					System.out.println("Introduce solo un munero");
					s.nextLine();
				}


			

			}

		}

	}


