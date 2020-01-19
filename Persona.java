package com.mitocode.java8mito;

public class Persona {
	
	int id;	
	String nombre;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(int id, String nombre) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nombre=nombre;
	}

}
