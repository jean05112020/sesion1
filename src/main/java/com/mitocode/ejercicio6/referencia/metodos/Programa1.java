package com.mitocode.ejercicio6.referencia.metodos;

public class Programa1 {

	public static void referenciaMetodosStatic() {
		System.out.println("metodo static");
	}
	
	
	public static void main(String[] args) {
		
		IOperacion op1 = () -> {
			int x=5;
			int y=3;
			System.out.println("Hola: " + (x +y)); 
			
		};
		
		op1.imprimir();
		
		//referencia a un metodo estatico
		IOperacion op2 = () -> Programa1.referenciaMetodosStatic();
		op2.imprimir();
		//simplificado
		IOperacion op3 = Programa1::referenciaMetodosStatic;
		op3.imprimir();

	}

}
