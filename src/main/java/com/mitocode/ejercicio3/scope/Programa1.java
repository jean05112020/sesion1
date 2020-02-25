package com.mitocode.ejercicio3.scope;

public class Programa1 {
	int entero;
	double decimal;
	float flotante;
	String cadena;
	boolean estado;
	
	
	public void variablesGlobales() {
		System.out.println("int = " + entero);
		System.out.println("double = " + decimal);
		System.out.println("float = " + flotante);
		System.out.println("String = " + cadena);
		System.out.println("boolean = " + estado);
		
	}
	
	//variables locales necesitan ser inicializados
	public void VariablesLocales() {
		double decimal2 = 10.5;
		int entero2=10;
		System.out.println("int = " + entero2);
		System.out.println("int = " + decimal2);
		
	}
	public static void main(String[] args) {
		Programa1 p = new Programa1();
		p.variablesGlobales();
	}
}
