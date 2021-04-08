package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 0;
		String ad;
		int posi= -1;
		int o = 0;
			
			System.out.println("Cuantos alumnos hay en clase?");
			a = s.nextInt();
			String nombre;
			String[] Alumnos = new String [a];
			s.nextLine();
				for (int b = 0; b < a; b++) {
					System.out.println("Dime el nombre de los alumnos");
					nombre = s.nextLine().toUpperCase();
					Alumnos[b] = nombre;
				}
				do {
					System.out.println("1)Sacar por pantallas los alumnos que empiecen por la letra A");
					System.out.println("2)Dime un número de alumno y yo muestro el alumno");
					System.out.println("3)Dime un nombre de alumno y muestro el número de alumno");
					System.out.println("4)Sacar por pantalla los nombres de los alumnos alfabeticamente");
					System.out.println("5)Finalizar");
					o = s.nextInt();
					
					switch(o) {
					case 1:
						for (int p = 0; p < Alumnos.length; p++) {
							String x1 = String.valueOf(Alumnos[p]);
							char xx1 = x1.toUpperCase().charAt(0);
							char xx2 = 'A';
							if (xx1 == xx2) {
								System.out.println("Los alumnos que empizan por A son : " + Alumnos[p]);
							}
						}
						break;
					case 2:

							System.out.println("Dime el número de alumno");
							a = s.nextInt();
							System.out.println("Su nombre es : " + Alumnos[a - 1]);
							
						
						break;
					case 3 :
							System.out.println("Dime el nombre del alumno");
							
							ad = s.nextLine().toUpperCase();

							for (int i = 0; i < Alumnos.length; i++) {

								if (Alumnos[i].toUpperCase().equals(ad)) {
									posi = i;
								}
							}
							if (posi == -1) {
								System.out.println("No se a encotrado el nombre");
							} else {
								posi += 1;
								System.out.println("El numero del alumno es: " + posi);
							}
						
						break;
					case 4:
						Arrays.sort(Alumnos);
				        for (int i=0; i<Alumnos.length; i++) {
				            System.out.print(Alumnos[i] + ", ");
				        }
						
						break;
					}
				}while (o !=5);
		
		

				
	}
}
