package Arrays;

import java.util.Scanner;

public class EjercicioBanco {


	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String nombre="";
		String apellido="";
		int sucursal=0;
		int año=0;
		int b = 0;
		int c = 0;
		
		
		System.out.println("Dime cuantos empleados hay");
		b = s.nextInt();
		Empleado a[] = new Empleado[b];
		s.nextLine();
		for (int i = 0; i < b; i++) {
			System.out.println("Dime el nombre de el empleado");
			nombre = s.nextLine();
			System.out.println("Dime el apellido de el empleado");
			apellido = s.nextLine();
			System.out.println("Dime la sucursal que trabaja");
			sucursal = s.nextInt();
			System.out.println("Dime el año en el que comenzó");
			año = s.nextInt();
			s.nextLine();
			a[i] = new Empleado(nombre, apellido, sucursal, año);
			
			
			
		}
		do {
			System.out.println("1)Sacar por pantalla todos los empleados de una de las sucursales");
			System.out.println("2)Sacar por pantalla a qué sucursal pertenece un empleado");
			System.out.println("3)Sacar por pantalla cuántos empleados hay con el mismo primer apellido");
			System.out.println("4)Sacar por pantalla cuántos empleados hay en total en el Banco.");
			System.out.println("5)Saca por pantalla todos los empleados del centro ordenados alfabéticamente.");
			System.out.println("6)Finalizar");
			c = s.nextInt();
			
			switch(c) {
			
			case 1:
				for (int i = 0; i < b; i++) {
				int d =0;
				System.out.println("Dime la sucursal que quieres sacar todos sus empleados");
				d = s.nextInt();
				System.out.println(a[i].getSucursal() + a[i].getNombre());
				break;
				}
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			
			}
			
		}while(c !=6);

	}

}
