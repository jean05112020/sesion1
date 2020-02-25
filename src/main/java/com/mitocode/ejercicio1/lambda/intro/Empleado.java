package com.mitocode.ejercicio1.lambda.intro;

public class Empleado {
	private String nombre;
	private Double sueldo;
	private int edad;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, Double sueldo, int edad) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", edad=" + edad + "]";
	}

	
	
}
