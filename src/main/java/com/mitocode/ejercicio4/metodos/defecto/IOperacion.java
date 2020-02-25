package com.mitocode.ejercicio4.metodos.defecto;

public interface IOperacion {
	int suma(int x,int y); 
	
	//mtodos default
	default void metodoDefecto(){
		System.out.println("Metodo defecto sin parametros");
	}
	
	default void metodoDefectoParametros(String operacion){
		System.out.println("Metodo defecto sin parametros" + operacion);
	}
	
	default double valorPI() {
		return Math.PI;
	}

	default int resta(int x,int y) {
		return x-y;
	}
}
