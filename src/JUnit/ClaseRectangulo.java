package JUnit;

public class ClaseRectangulo {
	double base=0;
	double altura=0;
	
		ClaseRectangulo(double base, double altura){
			this.base = base;
			this.altura = altura;
		}

		public double getBase() {
			return base;
		}

		public void setBase(double base) {
			this.base = base;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		double calcuraArea() {
			double area = 0;
			if (altura==0) {
				throw new ArithmeticException("No es posible qu ela altura sea 0");
			}else {
				area = base * altura;
			}
			return area;
		}
		
		double calculaPerimetro() {
			double perimetro = 2 *(base + altura);
			return perimetro;
		}

	

}
