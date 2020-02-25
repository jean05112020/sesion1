package com.mitocode.ejercicio2.lambda;

public class Programa2 {

	public static void main(String[] args) {
		IOperacion op1 = new IOperacion() {
			
			@Override
			public int suma(int n1, int n2) {
				// TODO Auto-generated method stub
				int z = 10;
				return n1+n2+z;
			}
		};
		
		System.out.println("La suma es: " + op1.suma(5, 3));
		
		//con lambda
		IOperacion op2 = (x,y) -> {
			int z = 10;
			return x+y +z;
		};
		System.out.println("La suma es: " + op2.suma(5, 3));
		
		
		//los parentesis van asi no haya parametros
		IOperacionSinParametros op3 = () -> Math.PI; //lambda sin argumentos
		System.out.println("Valor de pi: " + op3.operacion());
	}

}
