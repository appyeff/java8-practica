package com.mitocode.java8mito;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnotacionesApp {
	
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Lenguajes{
		Lenguaje[] value() default {};
	}
	
	@Repeatable(value = Lenguajes.class)
	public @interface Lenguaje{
		String value();
	}
	
	// 1.7
//	@Lenguajes({
//		@Lenguaje("Java"),
//		@Lenguaje("Python")
//	})
	
	// 1.8
	@Lenguaje("Java")
	@Lenguaje("Python")
	public interface LenguajeProgramacion{
		
	}

	public static void main(String[] args) {
		
		Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
		System.out.println("Se tiene "+ lenguajeArray.length + " anotaciones de lenguaje");
		
		Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
		for(Lenguaje elemento : len.value()) {
			System.out.println(elemento.value());
		}
	}

}
