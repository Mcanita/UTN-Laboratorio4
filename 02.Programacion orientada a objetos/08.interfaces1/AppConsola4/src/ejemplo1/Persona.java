package ejemplo1;

public class Persona {

	private String nombre;
	private String apellido;
	
	
	
	//constructores
	public Persona()
	{
		
	}
	
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	//set y get 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona NOMBRE =" + nombre + ", APELLIDO =" + apellido ;
	}
	
	
}
