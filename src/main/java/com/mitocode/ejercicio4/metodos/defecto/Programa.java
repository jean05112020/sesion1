package com.mitocode.ejercicio4.metodos.defecto;

public class Programa {
	public static void main(String[] args) {
		IOperacion op = (x,y) -> x+y;
		System.out.println("La suma es " + op.suma(5, 3));
		
		System.out.println("Valor pi: " + op.valorPI());
		op.metodoDefectoParametros("sumar");
		
		System.out.println("Resta con metodo default : " + op.resta(5, 3));
	}
}
