package tareasgit;

import java.util.ArrayList;

public class Receta {
	private String nombre;
	private ArrayList<String> preparacion;
	private ArrayList<Ingrediente> ingredientes;
	private int personas = 4;
	String autor;

	public Receta(){
		
	}
	
	public Receta(String nombre, ArrayList<Ingrediente> ingredientes, ArrayList<String> preparacion) {

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

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}
	
	
	
	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void addIngrediente(Ingrediente ingrediente){
		this.ingredientes.add(ingrediente);
		
	}
	
	public void addPreparacion(String preparacion){
		this.preparacion.add(preparacion);
	}
	
	public String toString(){
		return("Receta " + nombre.toUpperCase() + "\n" + listarIngredientes() + "\n" + pasosPreparacion());
	}
	
	public String listarIngredientes(){
		String resultado ="";
		for(int i=0;i<ingredientes.size();i++)
			resultado = resultado + ingredientes.toString() + "\n";
		return("Ingredientes :" + resultado);
	}
	
	public String pasosPreparacion(){
		String resultado ="";
		for(int i=0;i<preparacion.size();i++)
			resultado = resultado + "Paso" + (i+1) + " : " + preparacion.get(i) + "\n";
		return("Preparación :" + resultado);
	}
	
	public static void main(String[] args){
		Ingrediente i1 = new Ingrediente(2, "kg", "patatas");
		Ingrediente i2 = new Ingrediente(1, "docena", "huevos");
		
		Receta r = new Receta();
		
		r.setNombre("Patatas fritas y huevos");
		
		r.addIngrediente(i1);
		r.addIngrediente(i2);
		
		String pasos = r.pasosPreparacion();
		r.addPreparacion(pasos);

		System.out.print(r.toString());
		
	}
	
	
}
