package Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int base = 50;
		int[ ] numeros = new int [base];
		int b = 1;
		System.out.println("multiplos de 10");
		for(int i=0; i<base ; i++){
			
		
			numeros[i]=b;
			b++;
					}
			
		
		for(int i=1;i<51 ; i++){
		if(i%10==0) {
			System.out.println(numeros[i-1]);
		}else {
			
		}
			
				}
		
	}

	}
