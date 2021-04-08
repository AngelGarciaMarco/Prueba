package Examen_Trimestre2;

import java.lang.reflect.Array;
import java.util.*;

public class Examen_coche{
	 String matricula;
	 String dia;
	 int dni;
	
	Examen_coche(String matricula, String dia, int DNI){
		this.matricula = matricula;
		this.dia = dia;
		this.dni = DNI;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public String getDia() {
		return dia;
	}
	public int getDni() {
		return dni;
	}
	public void setMatricula(String Matricula) {
		matricula=Matricula;
	}
	public void setDia(String Dia) {
		dia=Dia;
	}
	public void setDNI(int Dni) {
		dni=Dni;
	}
	
	
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0;
		int c=0;
		String matricula="";
		 String dia="";
		 int dni=0;
		
		System.out.println("Dime el número de coches");
		a=s.nextInt();
		s.nextLine();
		
		Examen_coche array1[] = new Examen_coche[a];
		
		for (int i=0; i<array1.length; i++) {
			System.out.println("Dime la matricula del coche");
			matricula =s.nextLine();
			System.out.println("Dime el dia de la semana en el que ingresó el coche");
			dia =s.nextLine();
			System.out.println("Dime tu Dni");
			String dn=s.nextLine();
			dni=Integer.parseInt(dn);
			
			array1[i] = new Examen_coche(matricula, dia, dni);
		}
		
		for (int i=0; i<array1.length; i++) {
			System.out.println(array1[i].getMatricula() + array1[i].getDia() + array1[i].getDni());
		}
		
		
		System.out.println("1)Vehiculos en deposito");
		System.out.println("2)Veniculos en deposito en un dia concreto");
		System.out.println("3)Datos de un vehiculo del déposito");
		System.out.println("4)Matriculas que empiecen por una letra concreta");
		System.out.println("5)Finalizar");
		c = s.nextInt();
		
		switch(c) {
		
		case 1:
			System.out.println("El numero de vehiculos del deposito son : " + a);
			break;
		case 2:
			String n="";
			System.out.println("Dime el dia");
			n=s.nextLine();
			n=s.nextLine();
			
			int [] array1n = new int [array1.length];
			
			
			for (int i=0; i<array1.length; i++) {
				
				if(array1[i].getDia().equalsIgnoreCase(n)) {
				;
				
				array1n[i] = array1[i].getDni();
				}
				
			}
			Arrays.sort(array1n); 
			for (int i=0; i<array1n.length; i++) {
				System.out.println("Los vehiculos que se depositaron ese dia son " + array1n[i]);
				
				
				
			}
			
			
			break;
		case 3:
			String matri="";
			System.out.println("Dime la matricula del coche");
			matri=s.nextLine();
			matri=s.nextLine();
			
			for (int i=0; i<array1.length; i++) {
				if(array1[i].getMatricula().equalsIgnoreCase(matri)) {
					;
					System.out.println("Los datos son " + array1[i].getDni() + " " + array1[i].getDia());
					}
			}
			
			break;
			
		}
		
		
	}







}
