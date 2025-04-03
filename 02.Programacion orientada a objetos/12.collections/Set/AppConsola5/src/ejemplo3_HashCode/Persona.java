package ejemplo3_HashCode;

import java.util.Objects;
	
	public class Persona {

		private String nombre;
		private String apellido;
		private String dni;
		
		//constructor
		public Persona()
		{
			
		}
		public Persona (String nombre, String apellido, String dni)
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
		
		/*public int hashCode()
		{
			int result = 1;
			result += ((apellido == null)? 0 : apellido.hashCode());
			result += ((dni == null)? 0 :dni.hashCode());
			result += ((nombre == null)? 0 : nombre.hashCode());
			return result;
		}*/

		

}
