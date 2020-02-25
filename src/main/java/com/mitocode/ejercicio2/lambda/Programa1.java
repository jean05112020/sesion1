package com.mitocode.ejercicio2.lambda;

public class Programa1 {
	public static void main(String[] args) {
		IOperacion o1 = new IOperacion() {
			@Override
			public int suma(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1 + n2;
			}

//			@Override
//			public int resta(int n1, int n2) {
//				// TODO Auto-generated method stub
//				return n1-n2;
//			}
		};
		System.out.println("Suma es :" + o1.suma(5, 3));
		//System.out.println("Resta es :" + o1.resta(5, 3));
		
		
		//usando lambdaIOperacion
		IOperacion o2 = (x,y) -> x + y;			
		IOperacion o3 = (x,y) -> x-y;
		System.out.println("el resultado es: " + o2.suma(5, 3));
		//Lo ideal seria cambiar el nombre al metodo
		System.out.println("El resultado es :" + o3.suma(5, 3));
		
	}

	
}
