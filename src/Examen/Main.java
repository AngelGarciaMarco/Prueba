package Examen;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String o1;
		String o2;
		String o3;
		String o4;
		int n;
		int a =0;
		int op=0;

		
		System.out.println("Número de dias que quieres almacenar");
		a=s.nextInt();
		s.nextLine();
		
		Examen array1[] = new Examen[a];
		
		for (int i=0; i<array1.length; i++) {
			System.out.println("Dia de la semana ");
			o1 =s.nextLine();
			System.out.println("Primer plato");
			o2 =s.nextLine();
			System.out.println("Segundo plato");
			o3 =s.nextLine();
			System.out.println("Postres");
			o4 =s.nextLine();
			System.out.println("Número de comensales");
			String dn=s.nextLine();
			n=Integer.parseInt(dn);
			
			array1[i] = new Examen(o1, o2, o3,o4, n);
		}
		for (int i=0; i<array1.length; i++) {
			System.out.println("Dia de la semana: " + array1[i].getOpcion1() + " Primer plato: " + array1[i].getOpcion2() + "  Sgundo plato: " + array1[i].getOpcion3() +" Postre: " + array1[i].getOpcion4() + " Número de comensales : " + array1[i].getNumero());
		}
		
		
		do {
			
		
		System.out.println("1)Dia con mas comensales");
		System.out.println("2)Número total de comensales en toda la semana");
		System.out.println("3)Postres de la semana ordenados alfabeticamente");
		System.out.println("4)Datos de un dia concreto");
		System.out.println("5)Finalizar");
		op = s.nextInt();
		
		switch(op) {
		case 1:
		
			break;
		case 2:
			
			int [] array1n = new int [array1.length];
			
			
			
			for (int i=0; i<array1.length; i++) {
				
				array1n[i] = array1[i].getNumero();
				}
			
			for (int i=0; i<array1n.length; i++) {
				 
					System.out.println(array1n[i]);
			}
			
			break;
		case 3:
			String [] postres = new String [array1.length];
			
			for (int i=0; i<array1.length; i++) {
				
				postres[i] = array1[i].getOpcion4();
			}
			
			Arrays.sort(postres);
			for (int i=0; i<postres.length; i++) {
				System.out.println("Los postres ordenados son : ");
				System.out.println(postres[i]);
				
			}
			
			break;
		case 4:
			String dia="";
			System.out.println("Dime un dia de la semana");
			dia = s.nextLine();
			dia = s.nextLine();
			
			for (int i=0; i<array1.length; i++) {
				
				if(array1[i].getOpcion1().equalsIgnoreCase(dia)) {
					System.out.println("Dia de la semana: " + array1[i].getOpcion1() + " Primer plato: " + array1[i].getOpcion2() + "  Sgundo plato: " + array1[i].getOpcion3() +" Postre: " + array1[i].getOpcion4() + " Número de comensales: " + array1[i].getNumero());
				}
				;
			}
			break;
		case 5:
			System.out.println("Hasta pronto");
			break;
			
				
		
	}
	}while(op!=5);

	}
}
