package String;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String hora= " ";
		int puntos=0;
		String horas=" ";
		String minutos=" ";
		
		System.out.println("Introduce la hora por pantalla");
		hora = s.nextLine();
		puntos=hora.indexOf(':');
		
		horas = hora.substring(0, puntos++);
		minutos = hora.substring(puntos);
		
		int hora1=Integer.parseInt(horas.trim());
		int minuto=Integer.parseInt(minutos.trim());
		
		hora1 = hora1*60;
		minuto = hora1 + minuto;
		minuto = 1440 - minuto;
		
		System.out.println(minuto);

	}

}
