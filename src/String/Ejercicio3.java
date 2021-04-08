package String;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String cad1="contra";
		String cad2="";
		
		System.out.println("Introduce la contraseña por pantalla");
		cad2 = sc.nextLine();
		
		if(cad1.equals(cad2)) {
			System.out.println("Enhorabuena");
		}else {
			System.out.println("Introduce la contraseña por pantalla, te quedan 2 intentos");
			cad2 = sc.nextLine();
			if(cad1.equals(cad2)) {
				System.out.println("Enhorabuena");
			}else {
				System.out.println("Introduce la contraseña por pantalla, te quedan 1 intento");
				cad2 = sc.nextLine();
				if(cad1.equals(cad2)) {
					System.out.println("Enhorabuena");
				}else {
					System.out.println("Usuario bloqueado");
			
		}

	}
}
}
}