package dominio;

public class Animal {
	
	private String nombre;
	
	//constructores
	
	public Animal() {
		nombre = "sin nombre";
	}
	
	public Animal (String nombre)
	{
		this.nombre = nombre;
	}
	
	//get y set 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Es un animal, su nombre es : " + nombre;
	}
	
	//metodo toString
	
	

}
