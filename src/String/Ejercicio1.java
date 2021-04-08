package String;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int cantidadVocales = 0;
		char car = ' ';
		String cad = " ";
		
		System.out.println("Introduce una palabra o frase");
		cad = sc.nextLine();
		
		for (int i = 0; i < cad.length(); i++) {
			
			car = cad.charAt(i);
			
			if(car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
				cantidadVocales++;
			}
		}
			System.out.println("La cantidad de vocales es : " + cantidadVocales);
	}

}
