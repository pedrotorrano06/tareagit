package tareasgit;

public class Ingrediente {
	private String cantidad;
	private String nombre;
	
	public Ingrediente(){
		
	}
	
	public Ingrediente(String cantidad, String nombre) {
		this.cantidad = cantidad;
		this.nombre = nombre;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
