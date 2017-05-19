package tareasgit;

import java.util.ArrayList;

public class Receta {
	private String nombre;
	private ArrayList<Ingrediente> ingredientes;
	private String preparacion;
	
	public Receta(){
		
	}
	
	public Receta(String nombre, ArrayList<Ingrediente> ingredientes, String preparacion) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}
	
	
	
}
