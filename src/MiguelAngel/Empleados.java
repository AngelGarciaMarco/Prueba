package MiguelAngel;


public class Empleados {
	private String nonmbre;
	private String apellido1;
	private String apellido2;
	private String sucursal;
	private int fecha=0;
	
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getNonmbre() {
		return nonmbre;
	}
	public void setNonmbre(String nonmbre) {
		this.nonmbre = nonmbre;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	public Empleados (String n,String p1,String p2, String s, int f) {
		// TODO Auto-generated constructor stub
		this.nonmbre=n;
		this.apellido1=p1;
		this.apellido2=p2;
		this.sucursal=s;
		this.fecha=f;
	}
	
	public String datosEmpleados() {
		return "El Empleado se llamma " + nonmbre +" "+apellido1+" "+apellido2+" su sucursal es "+sucursal+" año "+fecha;
	}
}
