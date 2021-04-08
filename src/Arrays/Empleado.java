package Arrays;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private int sucursal;
	private int a�o;
	
	public Empleado()
	{
		nombre="";
		apellido="";
		sucursal=0;
		a�o=0;
	}
	public Empleado(String n, String p, int s, int ao)
	{
		nombre=n;
		apellido=p;
		sucursal=s;
		a�o=ao;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getSucursal() {
		return sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
}
