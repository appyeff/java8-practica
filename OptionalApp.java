package com.mitocode.java8mito;

import java.util.Optional;

public class OptionalApp {
	
	public void probar(String valor) {
//		System.out.println(valor.contains("mito"));
		
		try {
			Optional op = Optional.empty();
			op.get();
			
		}catch(Exception e) {
			System.out.println("No hay elementos");
		}
	}
	
	public void orElse(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		String x = op.orElse("Predeterminado");
		System.out.println(x);
	}
	
	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);
	}
	
	// si el valor esta inicializado
	public void isPresent(String valor) { 
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}

	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
//		app.probar("Mito");
//		app.orElse("Mito");
//		app.orElseThrow("Mito");
		app.isPresent("Mito");
	}

}