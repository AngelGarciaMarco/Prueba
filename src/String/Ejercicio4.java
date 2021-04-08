package String;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char car= ' ';
		String uno= " ";
		String dos= " ";
		String cad = " ";
		
		
		
		System.out.println("Introduce una frase");
		cad = s.nextLine();
		cad =cad.toLowerCase();
		
		System.out.println("Dime una letra del texto anterior");
		uno =s.nextLine();
		
		System.out.println("Dime otra letra del texto");
		dos =s.nextLine();
		cad = cad.replace(uno, dos);
		
				System.out.println(cad);
			

	}

}
