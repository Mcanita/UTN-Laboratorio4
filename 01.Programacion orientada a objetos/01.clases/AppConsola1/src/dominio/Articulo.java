package dominio;

public class Articulo {
	
	//atributos
	
	private int id;
	private String nombre;
	
	//constructores
	
	public Articulo()
	{
		id = 0;
		nombre = " sin nombre ";
	}
	
	public Articulo (String nombre, int id)
	{
		this.id = id;
		this.nombre = nombre;
	}
	
	// getters y setters
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

	@Override
	public String toString() {
		return "Articulo ID=" + id + ", NOMBRE=" + nombre;
	}
	
	
	//método toString()
	
	
	
	

}
