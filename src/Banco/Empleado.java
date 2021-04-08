package Banco;

import java.util.Scanner;
import java.util.Arrays;

public class Empleado {
		static String nombre;
		static String apellido;
		static int sucursal;
		static int año;
		
		Empleado(String nombre, String apellido, int sucursal, int año){}
	
		public String getNombre() {
			return nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public int getSucursal() {
			return sucursal;
		}
		public void setNombre(String Nombre) {
			nombre=Nombre;
		}
		public void setApellido(String Apellido) {
			apellido=Apellido;
		}
		public void setSucursal(int Sucursal) {
			sucursal=Sucursal;
		}
		
		private static int ss() {
			int s1;
			return s1=sucursal;
		}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0;
		int c=0;
		int s1=0;
		
		System.out.println("Dime el número de empleados");
		a=s.nextInt();
		s.nextLine();
		
		Empleado array[]= new Empleado[a];
		
		for (int i=0; i<array.length; i++) {
			
			System.out.println("Dime el nombre del empleado");
			nombre=s.nextLine();
			System.out.println("Dime el apellido del empleado");
			apellido=s.nextLine();
			System.out.println("Dime el número de sucursal en la que trabaja el empleado");
			String suc=s.nextLine();
			sucursal=Integer.parseInt(suc);
			System.out.println("Dime el año en el que empezó en la empresa");
			String year=s.nextLine();
			año=Integer.parseInt(year);
			
			array[i] = new Empleado(nombre, apellido, sucursal, año);
		}
		
	
			
			System.out.println("1)Sacar por pantalla todos los empleados de una de las sucursales");
			System.out.println("2)Sacar por pantalla a qué sucursal pertenece un empleado");
			System.out.println("3)Sacar por pantalla cuántos empleados hay con el mismo primer apellido");
			System.out.println("4)Sacar por pantalla cuántos empleados hay en total en el Banco.");
			System.out.println("5)Saca por pantalla todos los empleados del centro ordenados alfabéticamente.");
			System.out.println("6)Finalizar");
			c = s.nextInt();
			
			switch(c) {
			
			case 1:
				
				System.out.println("Dime el número de sucursal");
				s1=s.nextInt();
				
				for (int i=0; i<array.length; i++) {
					
					int ss=ss();
					if(array[i].getSucursal()==ss) {
						System.out.println(array[i].getNombre()+ " " + array[i].getApellido());
					}
					
				}
				
				break;
				
			case 2:
					String n="";
					System.out.println("Dime le nombre del empleado");
					n=s.nextLine();
					
					
					for (int i=0; i<array.length; i++) {
						if(array[i].getNombre().equalsIgnoreCase(n));
						System.out.println("La sucursal en la que trabaja es : " + array[i].getSucursal());
					}
						
				break;
				
			case 3:
				
				String ape="";
				System.out.println("Dime el apellido de el Empleado");
				ape=s.nextLine();
				
				int posi=0;
				
				for (int i=0; i<array.length; i++) {
					if(array[i].getApellido().equalsIgnoreCase(ape)) {
						posi++;
					}
				}
					System.out.println("El nº de Empleados con el apellido " + ape + "son : " + posi);
				
				break;
				
			case 4:
				System.out.println("El Nº de empleados es " +a);
				break;
				
			case 5:
				Arrays.sort(array);
				
				for (int i=0; i<array.length; i++) {
					
					System.out.println(array[i]+ " ");
				}
				
				break;
			default:
				System.out.println("Adios");
				break;
				
			}
		

	}

}
