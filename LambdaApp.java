package com.mitocode.java8mito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaApp 
{
	
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("mitoCode");
		lista.add("Code");
		lista.add("Mito");
		
		// JDK < 1
//		Collections.sort(lista, new Comparator<String>() {
//
//			@Override
//			public int compare(String arg0, String arg1) {
//				// TODO Auto-generated method stub
//				return arg0.compareTo(arg1);
//			}
//			
//		});
		
		// Lambda
		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
		
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	public void calcular() {
//		Operacion operacion = new Operacion() {
//			
//			@Override
//			public double calcularPromedio(double n1, double n2) {
//				return (n1 + n2) / 2;
//			}
//		};
		
//		System.out.println(operacion.calcularPromedio(2, 3));
		
		// Lambda
		Operacion operacion = (double x, double y) -> (x+y)/2;
		System.out.println(operacion.calcularPromedio(2, 3));
	}
	
    public static void main( String[] args )
    {
        LambdaApp app = new LambdaApp();
//        app.ordenar();
        app.calcular();
    }
}
