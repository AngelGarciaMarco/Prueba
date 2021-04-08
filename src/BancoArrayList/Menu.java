package BancoArrayList;

import java.util.*;

public class Menu {
	static private List<Empleado>numero;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;
		String n;
		String ap;
		int su=0;
		int f=0;
		int o=0;
		
		System.out.println("Cuantos empleados tenemos");
		a = s.nextInt();
		
		
		numero = new ArrayList<>(5);
		
		for (int i=0; i<a ; i++) {
			System.out.println("Nombre");
			n=s.nextLine();
			n=s.nextLine();
			System.out.println("Apellido");
			ap=s.nextLine();
			System.out.println("sucursal");
			su=s.nextInt();
			System.out.println("fecha");
			f=s.nextInt();
			
		numero.add(new Empleado(n, ap, su, f));
			
		}
		
		do {
			System.out.println("1)Sacar por pantalla todos los empleados de una de las sucursales ");
			System.out.println("2)Sacar por pantalla a qué sucursal pertenece un empleado");
			System.out.println("3)Sacar por pantalla cuántos empleados hay con el mismo primer apellido");
			System.out.println("4)Sacar por pantalla cuántos empleados hay en total en el Banco.");
			System.out.println("5)Saca por pantalla todos los empleados del centro ordenados alfabéticamente.");
			o = s.nextInt();
			
			
			switch(o) {
			case 1:
				int sucur=0;
				System.out.println("Dime la sucursal que quieres sacar");
				sucur=s.nextInt();
				for (Empleado e:numero) {
					if(e.getSucursal()==sucur) {
						System.out.println("Los empleados de la surucursal " + sucur + "son : " + e.getNombre());
					}
				}
				
				
				break;
			case 2:
				String n1;
				
				System.out.println("Dime el nombre del empleado");
				n1=s.nextLine();
				s.nextLine();
				
				for (Empleado e:numero) {
					if(e.getNombre().equalsIgnoreCase(n1)) {
						System.out.println(e.getNombre() + " es de la sucursal" + e.getSucursal());
					}
					
				}
				
				break;
			case 3:
				String ap1;
				int pa=0;
				System.out.println("Dime el apellido del empleado");
				ap1 =s.nextLine();
				s.nextLine();
				for (Empleado e:numero) {
					if(e.getApellido().equalsIgnoreCase(ap1)) {
						pa++;
						System.out.println("El numero de empleados con el mismo apellido es :" + pa);
					}
				}
				break;
			case 4:
				System.out.println("Numero de empleados total es " + numero.size());
				break;
			case 5:
				int re=0;
				re = numero.size();
				String [] Empleados=new String[re];
				int con=0;
				
				for (Empleado e:numero) {
					Empleados[con] = e.getNombre();
					con++;
					
				}
				Arrays.sort(Empleados);
				for (int i = 0; i<Empleados.length;i++) {
					System.out.println(Empleados[i]);
				}
				
				break;
			case 6:
				System.out.println("Hasta luego");
				break;
			}
		}while(o!=6);

		
	}

}
