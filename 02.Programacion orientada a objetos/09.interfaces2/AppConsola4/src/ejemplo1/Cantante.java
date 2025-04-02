package ejemplo1;

public class Cantante extends Persona implements ICantar{

	private boolean estudios;

	
	//constructores
	public Cantante()
	{
		
	}
	
	public Cantante(String nombre, String apellido, boolean estudios) {
		super(nombre, apellido);
		this.estudios = estudios;
	}
	
	
	//interface
	public void cantar() {
		System.out.println("LALALA......LALALA");
	}
	
	
	//set get
	public boolean getEstudios() {
		return estudios;
	}

	public void setEstudios(boolean estudios) {
		this.estudios = estudios;
	}

	@Override
	public String toString() {
		return "Cantante ESTUDIOS =" + estudios + super.toString();
	}
	
	
	
	
	
	
	
}
