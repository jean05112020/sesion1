package com.mitocode.ejercicio5.interfaces.funcionales;
@FunctionalInterface /*esto garantiza q va funcioar para una expresion lambda y exige un unico metodo publico
abstracto*/
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
