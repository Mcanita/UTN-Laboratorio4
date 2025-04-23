package ejercicio1;

public class Empleado {
	
	private int id;
	private String nombre;
	private int edad;
	
	static int cont = 1000;
	
	public static int devuelveProximoId()
	{
		return cont+1;
	}
	
	//constructores
	public Empleado()
	{
		cont++;
		this.id = cont;
		this.nombre = "sin nombre";
		this.edad = 99;
	}
	
	public Empleado(String nombre, int edad)
	{
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
    //get y set 
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado id: " + id + ", nombre: " + nombre + ", edad: " + edad ;
	}
	
	
	
	
	

}
