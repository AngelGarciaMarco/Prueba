package String;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String uno= " ";
		String dos= " ";
		String cad = " ";
		String cero=" ";
		int espa=0;
		
		
		System.out.println("Introduce tu nombre por pantalla");
		cad = s.nextLine();
		espa=cad.indexOf(' ');
		
		cero = cad.substring(0, espa);
		cad=cad.substring(espa+1);
		espa=cad.indexOf(' ');
		uno = cad.substring(0 ,espa);
		dos = cad.substring(espa);
		
		
		System.out.println("Apelldido 1: " + uno);
		System.out.println("Apellido 2 :" + dos);
		System.out.println("Nombre : " + cero);
				
		
	}

}
