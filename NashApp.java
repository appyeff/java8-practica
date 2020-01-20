package com.mitocode.java8mito;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashApp {
	
	// atributos
	private ScriptEngineManager m;
	private ScriptEngine e;
	private Invocable invocador;
	
	public NashApp() {
		m = new ScriptEngineManager();
		e = m.getEngineByName("nashorn");
		invocador = (Invocable)e;
	}
	
	public void llamarFunciones() throws Exception {
//		e.eval("print('JS desde Java')");
		e.eval(new FileReader("src/main/java/com/mitocode/java8mito/archivo.js"));
		
		double rpta = (double) invocador.invokeFunction("calcular", 2, 3);
		System.out.println(rpta);
	}
	
	public void implementarInterfaz() throws Exception {
		e.eval(new FileReader("src/main/java/com/mitocode/java8mito/archivo.js"));
		Object implementacion = e.get("hiloImpl"); 
		Runnable r = invocador.getInterface(implementacion, Runnable.class);
		
		Thread th1 = new Thread(r);
		th1.start();
		
		Thread th2 = new Thread(r);
		th2.start();
	}

	public static void main(String[] args) throws Exception {
		NashApp app = new NashApp();
//		app.llamarFunciones();
		app.implementarInterfaz();
	}

}
