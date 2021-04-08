package Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int a = 0;
		double c = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Dime el tamaño de la red");
		a = s.nextInt();
		double[] b = new double [a];
		for (int d = 0; d < a; d++) {
			System.out.println("Dime un numero decimal");
			b[d]= s.nextDouble();
		}
			double ma = b[0];
			for (int d = 0; d < b.length; d++) {
				if(b[d] > ma) {
					ma = b[d];
				}
				System.out.println("Los numeros decimales de la red son " + b[d]);
			
			}
			System.out.println("El numero mayor de la red es " + ma);
		}
		
		
			
		
	
}



