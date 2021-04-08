package MiguelAngel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Menu {
	static final private Scanner sc = new Scanner(System.in);
	static private char opcion;
	static private List<Empleados> sucursales;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sucursales = new ArrayList<>(10);
		Scanner sc = new Scanner(System.in);
		String n;
		String p1;
		String p2;
		String s;
		String encontrado = "";
		int f = 0;
		int f1 = 0;
		int opcion = 0;
		int v = 0;
		int nt = 1;
		int nf = 0;
		int np = 0;
		int t = 1;
		int x = 0;

		/** 
		 * @param Instanciamos el objeto Calendar en fecha obtenemos el año
		 * 
		 */
		Calendar fecha = new GregorianCalendar();

		int anno = fecha.get(Calendar.YEAR);
		do {
			try {
				System.out.println("Numero sucursal");
				v = sc.nextInt();
				s = sc.nextLine();
				
				for (int i = 0; i < v; i++) {

					System.out.println("\nEscribe nombre completo del " + t + "º empleado de "+v+"\n");
					///****************Nombre********************///
					System.out.println("Escribe primero nombre");
					n = sc.nextLine().toLowerCase();
					String primeraLetra = n.substring(0, 1);
					String restofrase = n.substring(1, n.length());
					primeraLetra = primeraLetra.toUpperCase();
					n = primeraLetra + restofrase;
					///****************1 Apellido********************///
					System.out.println("Escribe primero apellidos");
					p1 = sc.nextLine().toLowerCase();
					String primeraLetraP1 = p1.substring(0, 1);
					String restofraseP1 = p1.substring(1, p1.length());
					primeraLetraP1 = primeraLetraP1.toUpperCase();
					p1 = primeraLetraP1 + restofraseP1;
					///****************2 Apellido********************///
					System.out.println("Escribe segundo apellidos");
					p2 = sc.nextLine().toLowerCase();
					String primeraLetraP2 = p2.substring(0, 1);
					String restofraseP2 = p2.substring(1, p2.length());
					primeraLetraP2 = primeraLetraP2.toUpperCase();
					p2 = primeraLetraP2 + restofraseP2;
					
					System.out.println("Escribe sucursal a la que pertenece el empleado");
					s = sc.nextLine();
					do {
						try {
							nf = 0;
							System.out.println("Escribe a�o de incorporaci�n a la empresa");

							f = sc.nextInt();
							if ((f >= 1970) && (f <= anno)) {
								f1 = f;
								nf++;
							} else {
								System.out.println("fecha incorrecta");
							}
						} catch (java.util.InputMismatchException e) {
							System.out.println("Error fallo de fecha no se puede poner letra " + e.toString());
							sc.nextLine();
						}
					} while (nf != 1);
					sucursales.add(new Empleados(n, p1, p2, s, f1));
					s = sc.nextLine();
					t++;
				}
				int ia=0;
				do {
					System.out.println(
							"\n1)Sacar por pantalla todos los empleados de una de las sucursales (la que elija el usuario)."
									+ "\n2)Sacar por pantalla a que sucursal pertenece un empleado (el que elija el usuario)."
									+ "\n3)Sacar por pantalla cuantos empleados hay con el mismo primer apellido (el que elija el usuario)."
									+ "\n4)Sacar por pantalla cuantos empleados hay en total en el Banco."
									+ "\n5)Saca por pantalla todos los empleados del centro ordenados alfabeticamente."
									+ "\n6) Finalizar" + "\nElige una opcion");
					opcion = sc.nextInt();
					s = sc.nextLine();
					switch (opcion) {
					case 1:
						
						System.out.println("Escribe sucursal a la que quiere sacar ");
						s = sc.nextLine();
						for (Empleados e:sucursales) {
							if(e.getSucursal().equalsIgnoreCase(s)){
								encontrado +=e.getNonmbre()+" , ";
							}else if (ia== sucursales.size()){
								System.out.println("No encontrado la sucursal " + s);
							}
							ia++;
							
						}
						System.out.println("Las secursales " + s+" son: "+ encontrado);
						break;
					case 2:
						System.out.println("Escribe el nombre del empleado");
						s = sc.nextLine();
						for (Empleados e:sucursales) {
							if(e.getNonmbre().equalsIgnoreCase(s)){
								System.out.println(e.getNonmbre() + " pertenece a la sucursal "
										+ e.getSucursal());
							}else if (ia== sucursales.size()){
								System.out.println("No encontrado la sucursal " + s);
							}
							ia++;
							
						}
						
						break;
					case 3:
						System.out.println("Escribe el 1 apellidos del empleado");
						s = sc.nextLine();
						for (Empleados e:sucursales) {
							if(e.getApellido1().equalsIgnoreCase(s)){
								np++;
							}else if (ia== sucursales.size()){
								System.out.println("No encontrado la sucursal " + s);
							}
							ia++;
							
						}
						System.out.println("El numero de empleado del mismo apellido es " + np);
						break;
					case 4:
						System.out.println("Numero de empleado total es  " + sucursales.size());
						break;
					case 5:
						v = sucursales.size();
						String[] EmpreadosN= new String[v];
						int sa=0;
						for (Empleados e:sucursales) {
							
							EmpreadosN[sa] = e.getNonmbre();
							sa++;
						}
						Arrays.sort(EmpreadosN); 
		
						for (int i = 0; i < EmpreadosN.length; i++) {
							System.out.print(EmpreadosN[i] + ", ");
						}
						break;
					case 6:
						break;
					default:
						System.out.println("Opcion Invalida");
					}
				} while (opcion != 6);
				x = 1;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Error fallo de sucursal no se puede poner letra " + e.toString());
				sc.nextLine();
			}
		} while (x != 1);
	}

}
