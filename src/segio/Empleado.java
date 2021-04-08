package segio;
import java.util.Scanner;
import java.util.Arrays;


public  class Empleado {
	static String nombre;
	static String apellido;
	static int sucursal;
	static int año;
	
	Empleado(String nombre, String apellido, int sucursal, int año){
	}
	
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
	
	private static int sucursales(){
		int sucursal1;
		return sucursal1=sucursal;
	}
	

	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		int n=0, opcion=0, sucursal1=0;
		String nombre1, apellido1;
		
		
		System.out.println("Indique el número de empleados:");
		n=reader.nextInt();
		reader.nextLine();
		
		Empleado arrayEmpleados[]=new Empleado[n];
		
		
		for(int i=0; i<arrayEmpleados.length; i++) {
			
			
			System.out.println("Indique el nombre:");
			nombre=reader.nextLine();
			
			
			System.out.println("Indique el apellido:");
			apellido=reader.nextLine();
		
			System.out.println("Indique la sucursal:");
			String sucurs=reader.nextLine();
			sucursal=Integer.parseInt(sucurs);
			
			System.out.println("Indique los años que lleva en la empresa:");
			String anno=reader.nextLine();
			año=Integer.parseInt(anno);
			
			arrayEmpleados[i]=new Empleado(nombre, apellido, sucursal, año);
		}
		reader.nextLine();
		
		System.out.println("Seleccione una de las opciones:");
		System.out.println("1)Seleccione una sucursal para sacar a todos sus empleados:");
		System.out.println("2)Introduzca un nombre para saber su sucursal:");
		System.out.println("3)Indique un apellido para saberlos empleados con ese apellido:");
		System.out.println("4)Empleados totales del banco:");
		System.out.println("5)Empleados del centro ordenados alfabéticamente:");
		System.out.println("6)Cerrar Programa:");
		opcion=reader.nextInt();
		reader.nextLine();
		
		if(opcion<=5) {
		switch(opcion) {
		
			case 1:
			
			
			System.out.println("Indique la sucursal:");
			sucursal1=reader.nextInt();
			
			for(int i=0; i<arrayEmpleados.length; i++) {
				
				int sucursales = sucursales();
				if(arrayEmpleados[i].getSucursal()==sucursales) {
					
					System.out.println(arrayEmpleados[i].getNombre()+" "+arrayEmpleados[i].getApellido()+" ");
				}
			}
			break;
			
			case 2:
				
				System.out.println("Indique el nombre del Empleado:");
				nombre1=reader.nextLine();
				
				System.out.println("Indique el apellido del Empleado:");
				apellido1=reader.nextLine();
				
				for(int i=0; i<arrayEmpleados.length; i++) {
					
					if(arrayEmpleados[i].getNombre().equalsIgnoreCase(nombre1)&&arrayEmpleados[i].getApellido().equalsIgnoreCase(apellido1)) {
						
						System.out.println("La sucursal de el empleados es: "+arrayEmpleados[i].getSucursal()+" ");
					}
				}
			
				
			break;
			
			case 3:
				
				System.out.println("Indique el apellido del Empleado:");
				apellido1=reader.nextLine();
				
				int posicion=0;
				
				for(int i=0; i<arrayEmpleados.length; i++) {
					
					if(arrayEmpleados[i].getApellido().equalsIgnoreCase(apellido1)) {
						
						posicion++;
						
					}
				}
				
				System.out.println("El Nª de Empleados  con el apellido "+ apellido1 +" son: "+posicion);
				
			break;
			
			case 4:
				
				System.out.println("El Nº de empleados es "+n);
			break;
				
			case 5:
				Arrays.sort(arrayEmpleados);
				
				for(int i=0; i<arrayEmpleados.length;i++){
					
					System.out.println(arrayEmpleados[i]+" ");
				}
			break;
		}
		
		}
		else {
			System.out.println("Gracias por usar este programa. ");
		}
	}
}
