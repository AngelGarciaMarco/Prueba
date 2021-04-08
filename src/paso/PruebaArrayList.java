package paso;


import java.util.*;

public class PruebaArrayList {
	
	private int prueba;
	
	public PruebaArrayList(int prueba) {
		this.prueba=prueba;
	}

	public PruebaArrayList() {
		this.prueba=0;
	}

	public int getPrueba() {
		return prueba;
	}

	public void setPrueba(int prueba) {
		this.prueba = prueba;
	}
		
	public static int  añadirArray (ArrayList<PruebaArrayList> array, int i){
		array.add(new PruebaArrayList(i));
		i++;
		return i;
	}
}
