package com.mitocode.ejercicio1.lambda.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa2 {
	public static void main(String[] args) {
		List<Empleado> lista = new ArrayList<>();

		Empleado e1 = new Empleado("dany", 1950.0, 25);
		Empleado e2 = new Empleado("Jean", 2000.0, 28);

		Empleado e3 = new Empleado("Mirella", 1850.0, 27);

		lista.add(e1);
		lista.add(e2);
		lista.add(e3);

		
		//el comparator define el comportamiento del orden
		Comparator<Empleado> comparatorNombre = new Comparator<Empleado>() {
			
			@Override
			public int compare(Empleado o1, Empleado o2) {
				// TODO Auto-generated method stub
				return o1.getNombre().compareTo(o2.getNombre());
			}
		};		

		// comparator por edad
		Comparator<Empleado> comparatorEdad = new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				if (o1.getEdad() > o2.getEdad()) {
					return 1;
				} else if (o1.getEdad() < o2.getEdad()) {
					return -1;
				} else {
					return 0;
				}

			}
		};

//		Comparator<Empleado> comparatorSueldo = new Comparator<Empleado>() {
//
//			@Override
//			public int compare(Empleado o1, Empleado o2) {
//				if (o1.getSueldo() > o2.getSueldo()){
//					return 1;
//				} else if (o1.getSueldo() < o2.getSueldo()) {
//					return -1;
//				} else {
//					return 0;
//				}
//
//			}
//		};
//
//		Collections.sort(lista, comparatorSueldo);
//		System.out.println("\nLista de empleados ordenada");
//		for (Empleado empleado : lista) {
//			System.out.println(empleado);
//		}
//		
//		lista.sort(comparatorSueldo);
//		System.out.println("\nLista.sort de empleados ordenada");
//		for (Empleado empleado : lista) {
//			System.out.println(empleado);
//		}
		
		//crear el comparator dentro del sort
		//Clase anonima interna
//		lista.sort(new Comparator<Empleado>() {
//
//			@Override
//			public int compare(Empleado o1, Empleado o2) {
//				// TODO Auto-generated method stub
//				return  o1.getNombre().compareTo(o2.getNombre());
//			}
//		});
		
		
		//EXPRESION LAMBDA
		//reemplazar por : -> 
		//ordenar por nombre
		lista.sort((Empleado o1, Empleado o2) 
				-> o1.getNombre().compareTo(o2.getNombre()));
		
		//ordenar por edad con lambda
		lista.sort((Empleado o1, Empleado o2) 
				->{ 
					if (o1.getSueldo() < o2.getSueldo()){
						return 1;
					} else if (o1.getSueldo() > o2.getSueldo()) {
						return -1;
					} else {
						return 0;
					} });
		
		
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}
	}
}
