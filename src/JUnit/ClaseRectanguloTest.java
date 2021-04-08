package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClaseRectanguloTest {
	private ClaseRectangulo prueba;


	@Test
	void testCalcuraArea() {
		System.out.println("Calculo de area");
		prueba = new ClaseRectangulo(6,5);
		double resultadoArea = prueba.calcuraArea();
		double esperado = 30;
		if(resultadoArea==esperado) {
			System.out.println("Ha ido bien");
		}else {
			System.out.println("Ha ido mal");
		}
		
		
	}

	@Test
	void testCalculaPerimetro() {
		System.out.println("Calculo de perimetro");
		prueba = new ClaseRectangulo(6,5);
		double resultadoPerimetro = prueba.calculaPerimetro();
		double esperado = 22;
		assertEquals(esperado, resultadoPerimetro);
	}

}
