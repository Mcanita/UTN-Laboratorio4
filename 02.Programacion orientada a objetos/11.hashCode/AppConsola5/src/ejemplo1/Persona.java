package ejemplo1;

import java.util.Objects;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	
	//constructor
	public Persona()
	{
		
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Persona Nombre = " + nombre + ", Apellido = " + apellido + ", dni = " + dni ;
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}
	
	
	
	
}
