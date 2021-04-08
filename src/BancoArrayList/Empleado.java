package BancoArrayList;

import java.util.Scanner;

public class Empleado {

	private String nombre;
	private String apellido;
	private int sucursal;
	private int fecha;
	
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
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	public Empleado (String n, String ap, int su, int f) {
	this.nombre=n;
	this.apellido=ap;
	this.sucursal=su;
	this.fecha=f;
}
	
	
}