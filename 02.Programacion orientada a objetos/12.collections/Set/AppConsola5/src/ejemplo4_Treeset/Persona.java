package ejemplo4_Treeset;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String apellido;
	private int dni;
	
	//constructor
	public Persona()
	{
		
	}
	public Persona (String nombre, String apellido, int dni)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Persona Nombre = " + nombre + ", Apellido = " + apellido + ", dni = " + dni ;
	}
		
		
	public int compareTo(Persona o) {
		//ordenamiento por dni mayor/menor			
		if(o.dni == this.dni)
		{
			return 0;
		}
		if(o.dni < this.dni) 
		{
			return -1;
		}
	     	return 1;
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
