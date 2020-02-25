package com.mitocode.ejercicio3.scope;

public class Programa2 {
	
	
	public void variablesLocales() {
		//variable local por defecto se envia como final
		int z=10;
		
		IOperacion op1 =new IOperacion() {
			@Override
			public int sumar(int x, int y) {
				// TODO Auto-generated method stub
				 //z=20;
				return x+y+z;
			}
		};
		
		System.out.println("Clase anonima : " + op1.sumar(5, 3));
		//con lambda
		IOperacion op2 = (x,y) -> {
			//z=20;
			return x+y + z;
		};
		
		System.out.println("Clase anonima : " + op2.sumar(5, 3));
	}
	
	public static void main(String[] args) {
		Programa2 p = new Programa2();
		p.variablesLocales();
	}
}
