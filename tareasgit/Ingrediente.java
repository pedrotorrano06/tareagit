package tareasgit;

public class Ingrediente {
	private float cantidad;
	private String unidad;
	private String nombre;
	
	public Ingrediente(){
		
	}
	
	public Ingrediente(float cantidad, String unidad, String nombre) {
		this.cantidad = cantidad;
		this.nombre = nombre;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
	
	public String toString(){
		return(cantidad + " " + unidad + " de " + nombre);
	}
	
	public static void main(String[] args){
		Ingrediente i = new Ingrediente(3,"Kg","tomates");
		String prueba = new String();
		prueba =i.toString();
		System.out.print(prueba);
		
	}

}
