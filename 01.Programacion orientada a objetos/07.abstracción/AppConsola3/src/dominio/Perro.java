package dominio;

public class Perro extends Animal {
	
	private String raza;
	
	//constructor
	
	public Perro()
	{
		super();
		raza = "sin raza";
	}
	
	public Perro(String nombre, String raza)
	{
		super(nombre);
		this.raza = raza;
	}

	
	
	//get set
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Es un Perro, su nombre es: "+ getNombre() + " y su raza es :" + raza;
	}

	@Override
	public String habiidades() {
		
		return  " los perros pueden localizar y separar olores";
	}
	
	

}
