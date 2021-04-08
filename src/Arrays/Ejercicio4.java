package Arrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String nombre;
		String matriz[][] = new String [2][3];
		
		for (int i=0; i < matriz.length; i++) {
	        for (int j=0; j < matriz[i].length; j++) {
	        	System.out.println("Dime los nombres");
	        	nombre = s.nextLine();
	        	matriz [i][j] = nombre;
	            System.out.print(matriz[i][j]+"\t");
	            
				
	        }
	        System.out.println("");
	    }
		

	}

}
